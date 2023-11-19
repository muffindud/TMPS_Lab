package game.tank.heavyTank

import game.tank.ITank

class HeavyTank(
    override var name: String,
    override var tier: Int,
    override var nextTank: ITank?,
    override var health: Float,
    override var damage: Float
) : ITank {
    override fun takeDamage(damage: Float) {
        health -= damage * 0.9f
    }

    override fun shoot(target: ITank) {
        target.takeDamage(damage * 0.9f)
    }
}