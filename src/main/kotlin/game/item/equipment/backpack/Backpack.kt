package game.item.equipment.backpack

import game.item.IItem
import game.item.equipment.AEquipment

class Backpack(override var slots: Int, var backpackSlots: Int, override var weight: Int): AEquipment ()
