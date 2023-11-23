package game.player

import game.playerProfile.PlayerProfile

import game.tank.ITank
import game.crew.Crew
import game.equipment.Equipment
import game.player.playerState.PlayerState
import serverAPI.Server
import game.player.playerState.*
import gameManager.EventManager

class Player(
    profile: PlayerProfile,
    server: Server,
    var playerState: PlayerState,
    var eventManager: EventManager
) {

    class PlayerGarage (var playerData: String) {
        var tanks: List<ITank> = listOf()

        init {
            // Get the tanks from playerData and add them to the list
        }
    }

    class PlayerBarracks (var playerData: String) {
        var crews: List<Crew> = listOf()

        init {
            // Get the crews from playerData and add them to the list
        }
    }

    class PlayerEquipment (var playerData: String) {
        var equipments: HashMap<Equipment, Int> = hashMapOf()

        init {
            // Get the equipments from playerData and add them to the list
        }
    }

    init {
        val playerData = server.getPlayerData(profile.playerId)

        val garage = PlayerGarage(playerData)
        val barracks = PlayerBarracks(playerData)
        val equipment = PlayerEquipment(playerData)
    }

    fun changeState(newState: PlayerState) {
        this.playerState = newState
        when (newState) {
            is ActiveState -> {
                eventManager.addListener(player=this, eventType="message")
                eventManager.addListener(player=this, eventType="invitation")
            }

            is AwayState -> {
                eventManager.removeListener(player=this, eventType="message")
                eventManager.removeListener(player=this, eventType="invitation")
            }

            is InGameState -> {
                eventManager.addListener(player=this, eventType="message")
                eventManager.removeListener(player=this, eventType="invitation")
            }
        }
    }

    fun receiveMessage(message: String, sender: Player) {
        playerState.receiveMessage(message=message, sender=sender, receiver=this)
    }

    fun sendMessage(message: String, receiver: Player) {
        playerState.sendMessage(message=message, sender=this, receiver=receiver)
    }

    fun receiveInvitation(sender: Player) {
        playerState.receiveInvitation(sender=sender, receiver=this)
    }

    fun sendInvitation(receiver: Player) {
        playerState.sendInvitation(sender=this, receiver=receiver)
    }
}