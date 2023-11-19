package gameManager

import game.player.Player

object EventManager {
    var listeners: HashMap<String, Player> = HashMap()

    fun addListener(player: Player, eventType: String) {
        if (listeners.containsKey(eventType)) {
            listeners[eventType] = player
        }
    }

    fun removeListener(player: Player, eventType: String) {
        if (listeners.containsKey(eventType)) {
            listeners.remove(eventType)
        }
    }

    fun notifyListeners(eventType: String, sender: Player, message: String = "") {
        if (eventType == "message") {
            listeners[eventType]?.receiveMessage(message=message, sender=sender)
        }
        else if (eventType == "invitation") {
            listeners[eventType]?.receiveInvitation(sender=sender)
        }
    }
}