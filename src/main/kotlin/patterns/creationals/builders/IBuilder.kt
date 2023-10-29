package patterns.creationals.builders

import game.item.IItem

interface IBuilder {
    var weight: Int

    fun build(): IItem
}