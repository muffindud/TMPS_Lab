package creationals.builders.armorbuilders

import item.equipment.armor.Armor

class BasicArmorBuilder: ArmorBuilder()
{
    override var physicalDefence: Int = 5
    override var magicDefence: Int = 5
    override var weight: Int = 10
}