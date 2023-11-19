package game.player.playerState

import game.player.Player

object AwayState: PlayerState() {
    override fun receiveMessage(message: String, sender: Player, receiver: Player) {
        TODO("Print to in-menu chat")
        TODO("Notify the sender that the receiver is away")
    }

    override fun receiveInvitation(sender: Player, receiver: Player) {
        TODO("Print to in-menu chat")
        TODO("Notify the player that they are away")
    }
}