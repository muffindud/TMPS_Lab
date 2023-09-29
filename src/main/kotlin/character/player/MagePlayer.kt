package character.player

import character.Character
import item.equipment.armor.Armor
import item.equipment.armor.armors.*
import item.equipment.backpack.Backpack
import item.equipment.weapon.MagicWeapon
import item.equipment.weapon.Weapon
import item.equipment.weapon.magicweapons.*

class MagePlayer
    (
        override var playerName: String,
        override var xPosition: Int,
        override var yPosition: Int,
        armor: Armor,
        backpack: Backpack,
        weapon: MagicWeapon
    ): Player(armor, backpack, weapon)
{

}