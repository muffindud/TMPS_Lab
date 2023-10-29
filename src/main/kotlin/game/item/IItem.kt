package game.item

interface IItem
{
    var slots: Int
    var weight: Int

    fun drop()
}