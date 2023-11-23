package game.equipment

import game.crew.Crew
import game.tank.ITank

class Repair (
    var tankHealth: Float,
    maxCooldown: Int,
    cost: Int
): Equipment (maxCooldown, cost) {
    override fun applyEffect(crews: List<Crew>?, tank: ITank?) {
        if (tank != null) {
            tank.health += tankHealth
            if (tank.health > tank.maxHealth) {
                tank.health = tank.maxHealth
            }
        }
    }
}