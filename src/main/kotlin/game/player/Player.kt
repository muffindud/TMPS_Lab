package game.player

import game.playerProfile.PlayerProfile

import game.tank.ITank
import game.crew.Crew
import game.equipment.IEquipment
import game.player.playerState.PlayerState
import serverAPI.Server

class Player(
    profile: PlayerProfile,
    server: Server,
    playerState: PlayerState
) {
    var playerState: PlayerState = playerState

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
        var equipments: HashMap<IEquipment, Int> = hashMapOf()

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
        TODO("Remove from player from listeners in observer pattern")
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