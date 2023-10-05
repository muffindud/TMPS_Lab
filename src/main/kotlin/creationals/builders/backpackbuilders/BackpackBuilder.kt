package creationals.builders.backpackbuilders

import item.equipment.backpack.Backpack

interface BackpackBuilder {
    var slots: Int
    var backpackSlots: Int
    var weight: Int

    fun build(): Backpack
}