package game.item.equipment.armor

import game.item.equipment.AEquipment

class Armor(var physicalDefence: Int, var magicDefence: Int, override var weight: Int): AEquipment()
{
    override var slots: Int = 4
}