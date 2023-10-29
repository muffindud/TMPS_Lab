package patterns.creationals.builders.backpackbuilders

import patterns.creationals.builders.IBuilder
import game.item.equipment.backpack.Backpack

abstract class ABackpackBuilder: IBuilder
{
    abstract var slots: Int
    abstract var backpackSlots: Int

    override fun build(): Backpack {
        return Backpack(slots, backpackSlots, weight)
    }
}