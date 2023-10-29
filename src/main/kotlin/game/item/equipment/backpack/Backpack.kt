package game.item.equipment.backpack

import game.item.IItem
import game.item.equipment.AEquipment

class Backpack(override var slots: Int, var backpackSlots: Int, override var weight: Int): AEquipment ()
{
    var items: MutableList<IItem> = mutableListOf()
    var occupiedSlots: Int = 0

    fun addItem(item: IItem) {
        if (occupiedSlots + item.slots <= slots) {
            items.add(item)
            occupiedSlots += item.slots
            // TODO: Remove game.item from world
        }
        else {
            println("Not enough space in backpack")
        }
    }

    fun removeItem(item: IItem) {
        items.remove(item)
        occupiedSlots -= item.slots
        item.drop()
    }
}