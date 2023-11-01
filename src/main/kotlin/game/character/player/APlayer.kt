package game.character.player

import game.character.ICharacter
import game.inventory.PlayerInventory
import game.item.equipment.armor.Armor
import game.item.equipment.weapon.AWeapon
import game.item.equipment.backpack.Backpack
import patterns.structurals.bridge.InventoryManager

abstract class APlayer
    (
        var armor: Armor,
        var backpack: Backpack,
        var weapon: AWeapon,
        var inventoryManager: InventoryManager
    ): ICharacter
{
    override var healthPoints: Int = 200
    abstract var playerName: String

    var attackPower: Int = 0
    var magicDefense: Int = 0
    var physicalDefense: Int = 0

    init {
        inventoryManager.equipArmor(armor)
        inventoryManager.equipWeapon(weapon)
        inventoryManager.equipBackpack(backpack)

        this.attackPower += this.inventoryManager.getWeapon()!!.attackDamage
        this.magicDefense += this.inventoryManager.getArmor()!!.magicDefence
        this.physicalDefense += this.inventoryManager.getArmor()!!.physicalDefence
    }

    fun equipArmor (armor: Armor) {
        this.magicDefense -= this.inventoryManager.getArmor()!!.magicDefence
        this.physicalDefense -= this.inventoryManager.getArmor()!!.physicalDefence
        this.inventoryManager.equipArmor(armor)
        this.magicDefense += this.inventoryManager.getArmor()!!.magicDefence
        this.physicalDefense += this.inventoryManager.getArmor()!!.physicalDefence
    }

    fun equipWeapon (weapon: AWeapon) {
        this.attackPower -= this.inventoryManager.getWeapon()!!.attackDamage
        this.inventoryManager.equipWeapon(weapon)
        this.attackPower += this.inventoryManager.getWeapon()!!.attackDamage

    }

    private fun attackPlayer (target: APlayer) {
        var damage: Int = 0

        if (this.inventoryManager.getWeapon()!!.getWeaponType() == "Physical") {
            damage = this.attackPower - target.physicalDefense
        }
        else if (this.inventoryManager.getWeapon()!!.getWeaponType() == "Magic") {
            damage = this.attackPower - target.magicDefense
        }

        if (damage > 0) {
            target.healthPoints -= damage
        }
    }

    override fun getCharacterType (): String {
        return "Player"
    }

    override fun attack (target: ICharacter) {
        if (target.getCharacterType() == "Player") {
            attackPlayer(target as APlayer)
        }
        else {
            var damage: Int = this.attackPower
            target.healthPoints -= damage
        }

        if (this.inventoryManager.getWeapon()!!.getWeaponType() == "Enchanted Magic" || this.inventoryManager.getWeapon()!!.getWeaponType() == "Enchanted Physical") {
            TODO("Apply status effect to target")
        }
    }

    abstract fun clone(source: APlayer): APlayer
}