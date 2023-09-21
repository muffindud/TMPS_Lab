package item.equipment.armor

import item.equipment.Equipment

abstract class Armor: Equipment() {
    open var physicalDefence: Int = 0
    open var magicDefence: Int = 0
    override var slots: Int = 4
    override var weight: Int = 10
}