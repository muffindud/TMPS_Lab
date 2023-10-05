package character.player

import character.Character
import item.equipment.armor.Armor
import item.equipment.backpack.Backpack
import item.equipment.weapon.MagicWeapon
import item.equipment.weapon.Weapon

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