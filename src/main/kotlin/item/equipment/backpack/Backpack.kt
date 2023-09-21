package item.equipment.backpack

import item.equipment.Equipment

abstract class Backpack: Equipment () {
    val backpackSlots: Int = 10
    override val weight: Int = 10
    override val slots: Int = 4
}