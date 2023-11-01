package game.character.player

import game.item.equipment.armor.Armor
import game.item.equipment.backpack.Backpack
import game.item.equipment.weapon.MagicWeapon
import game.item.equipment.weapon.AWeapon
import patterns.structurals.bridge.InventoryManager

class MagePlayer(
    override var playerName: String,
    override var xPosition: Int,
    override var yPosition: Int,
    armor: Armor,
    backpack: Backpack,
    weapon: AWeapon,
    inventoryManager: InventoryManager
): APlayer(armor, backpack, weapon, inventoryManager)
{
    override fun clone(source: APlayer): MagePlayer {
        return MagePlayer(
            source.playerName,
            source.xPosition,
            source.yPosition,
            source.armor,
            source.backpack,
            source.weapon as MagicWeapon,
            source.inventoryManager
        )
    }
}