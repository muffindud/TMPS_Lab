package game.tank.lightTank

import game.tank.ITank

class LightTank(
    override var name: String,
    override var tier: Int,
    override var nextTank: ITank?,
    override var health: Float,
    override var maxHealth: Float,
    override var damage: Float
) : ITank {
    override fun takeDamage(damage: Float) {
        health -= damage * 1.1f
    }

    override fun shoot(target: ITank) {
        target.takeDamage(damage * 1.1f)
    }
}