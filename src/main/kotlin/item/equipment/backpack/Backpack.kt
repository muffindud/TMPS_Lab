package item.equipment.backpack

import item.Item
import item.equipment.Equipment

class Backpack(override var slots: Int, var backpackSlots: Int, override var weight: Int): Equipment ()
{
    var items: MutableList<Item> = mutableListOf()
    var occupiedSlots: Int = 0

    fun addItem(item: Item) {
        if (occupiedSlots + item.slots <= slots) {
            items.add(item)
            occupiedSlots += item.slots
            // TODO: Remove item from world
        }
        else {
            println("Not enough space in backpack")
        }
    }

    fun removeItem(item: Item) {
        items.remove(item)
        occupiedSlots -= item.slots
        item.drop()
    }
}