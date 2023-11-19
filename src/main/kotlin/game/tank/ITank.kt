package game.tank

interface ITank {
    var name: String
    var tier: Int
    var nextTank: ITank?
    var health: Float
    var damage: Float

    fun takeDamage(damage: Float)

    fun shoot(target: ITank)
}