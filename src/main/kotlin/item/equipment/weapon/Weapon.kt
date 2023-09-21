package item.equipment.weapon

import item.equipment.Equipment

abstract class Weapon: Equipment() {
    open var attackDamage: Int = 0
    override val slots: Int = 1
    override val weight: Int = 1
}