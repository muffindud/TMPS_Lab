package item.equipment.armor

import item.equipment.AEquipment

class Armor(var physicalDefence: Int, var magicDefence: Int, override var weight: Int): AEquipment()
{
    override var slots: Int = 4
}