package game.player.playerState

import game.player.Player

abstract class PlayerState {
    abstract fun receiveMessage(message: String, sender: Player, receiver: Player)
    abstract fun receiveInvitation(sender: Player, receiver: Player)

    fun sendMessage(message: String, sender: Player, receiver: Player) {
        receiver.receiveMessage(message=message, sender=sender)
    }
    fun sendInvitation(sender: Player, receiver: Player) {
        receiver.receiveInvitation(sender=sender)
    }
}