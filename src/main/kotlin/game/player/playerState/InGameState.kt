package game.player.playerState

import game.player.Player

object InGameState: PlayerState() {
    override fun receiveMessage(message: String, sender: Player, receiver: Player) {
        TODO("Print to in-game chat")
        TODO("Notify the sender that the receiver is in a game")
    }

    override fun receiveInvitation(sender: Player, receiver: Player) {
        TODO("Print to in-game chat")
        TODO("Notify the player that they are in a game")
    }
}