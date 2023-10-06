package creationals.builders.backpackbuilders

import item.equipment.backpack.Backpack

abstract class BackpackBuilder
{
    abstract var slots: Int
    abstract var backpackSlots: Int
    abstract var weight: Int

    fun build(): Backpack {
        return Backpack(slots, backpackSlots, weight)
    }
}