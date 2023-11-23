package game.tank.mediumTank

import game.tank.ITank

class MediumTank(
    override var name: String,
    override var tier: Int,
    override var nextTank: ITank?,
    override var health: Float,
    override var maxHealth: Float,
    override var damage: Float
) : ITank {
    override fun takeDamage(damage: Float) {
        health -= damage
    }

    override fun shoot(target: ITank) {
        target.takeDamage(damage)
    }
}