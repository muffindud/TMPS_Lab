package creationals.builders.backpackbuilders

import item.equipment.backpack.Backpack

class BasicBackpackBuilder: BackpackBuilder {
    override var slots: Int = 10
    override var backpackSlots: Int = 10
    override var weight: Int = 10

    override fun build(): Backpack {
        return Backpack(slots, backpackSlots, weight)
    }
}