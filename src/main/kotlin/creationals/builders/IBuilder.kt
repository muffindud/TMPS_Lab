package creationals.builders

import item.IItem

interface IBuilder {
    var weight: Int

    fun build(): IItem
}