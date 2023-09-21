package item.equipment.armor

import item.equipment.Equipment

abstract class Armor: Equipment() {
    open val physicalDefence: Int = 0
    open val magicDefence: Int = 0
    override val slots: Int = 4
    override val weight: Int = 10
}