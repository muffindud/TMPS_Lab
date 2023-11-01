package game.inventory

import game.item.IItem
import game.item.equipment.armor.Armor
import game.item.equipment.backpack.Backpack
import game.item.equipment.weapon.AWeapon

class PlayerInventory {
    var items: MutableMap<IItem, Int> = mutableMapOf()
    var armor: Armor? = null
    var weapon: AWeapon? = null
    var backpack: Backpack? = null
}