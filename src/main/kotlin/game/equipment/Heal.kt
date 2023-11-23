package game.equipment

import game.crew.Crew
import game.tank.ITank

class Heal (
    var crewHealth: Float,
    maxCooldown: Int,
    cost: Int
): Equipment(maxCooldown, cost) {
    override fun applyEffect(crews: List<Crew>?, tank: ITank?) {
        crews?.forEach {
            it.health += crewHealth
            if (it.health > it.maxHealth) {
                it.health = it.maxHealth
            }
        }
    }
}