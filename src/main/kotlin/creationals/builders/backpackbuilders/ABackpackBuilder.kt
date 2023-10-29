package creationals.builders.backpackbuilders

import creationals.builders.IBuilder
import item.equipment.backpack.Backpack

abstract class ABackpackBuilder: IBuilder
{
    abstract var slots: Int
    abstract var backpackSlots: Int

    override fun build(): Backpack {
        return Backpack(slots, backpackSlots, weight)
    }
}