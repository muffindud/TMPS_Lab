package item.equipment.backpack

import item.equipment.Equipment

abstract class Backpack: Equipment ()
{
    var backpackSlots: Int = 10
    override var weight: Int = 10
    override var slots: Int = 4
}