package game.player.playerState

import game.player.Player

object ActiveState: PlayerState() {
    override fun receiveMessage(message: String, sender: Player, receiver: Player) {
        TODO("Print to in-menu chat")
    }

    override fun receiveInvitation(sender: Player, receiver: Player) {
        TODO("Print to in-menu chat")
    }
}