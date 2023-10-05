package item.equipment.armor

import item.equipment.Equipment

class Armor(var physicalDefence: Int, var magicDefence: Int, override var weight: Int): Equipment()
{
    override var slots: Int = 4
}