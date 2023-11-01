package patterns.structurals.bridge

import game.inventory.PlayerInventory
import game.item.IItem
import game.item.equipment.AEquipment
import game.item.equipment.armor.Armor
import game.item.equipment.backpack.Backpack
import game.item.equipment.weapon.AWeapon

object InventoryManager {
    var playerInventory: PlayerInventory = PlayerInventory()

    fun getInventoryContent (): MutableMap<IItem, Int> {
        return this.playerInventory.items
    }

    fun getOccupiedSlots(): Int {
        var occupiedSlots: Int = 0

        for (item in this.playerInventory.items) {
            occupiedSlots += item.key.slots
        }

        return occupiedSlots
    }

    fun getTotalWeight(): Int {
        var totalWeight: Int = 0

        for (item in this.playerInventory.items) {
            totalWeight += item.key.weight * item.value
        }

        if (this.playerInventory.armor != null) {
            totalWeight += this.playerInventory.armor!!.weight
        }

        if (this.playerInventory.weapon != null) {
            totalWeight += this.playerInventory.weapon!!.weight
        }

        return totalWeight
    }

    fun getItemCount (item: IItem): Int {
        return this.playerInventory.items[item] ?: 0
    }

    fun removeItem (item: IItem, count: Int = 1) {
        if (getItemCount(item) > count) {
            this.playerInventory.items[item] = this.playerInventory.items[item]!! - count
            println("Removed $count x $item")
        } else if (getItemCount(item) == count) {
            this.playerInventory.items.remove(item)
            println("Removed $count x $item")
        } else {
           println("Not enough items")
        }
    }

    fun addItem (item: IItem, count: Int = 1) {
        if (this.playerInventory.backpack == null) {
            println("No backpack equipped")
        } else if (item !in this.playerInventory.items.keys && this.playerInventory.backpack!!.backpackSlots < count) {
            println("Not enough space in backpack")
        } else {
            if (this.playerInventory.items.containsKey(item)) {
                this.playerInventory.items[item] = this.playerInventory.items[item]!! + count
                println("Equipped $count x $item")
            } else {
                this.playerInventory.items[item] = count
                println("Equipped $count x $item")
            }
        }
    }

    fun equipBackpack(backpack: Backpack) {
        this.playerInventory.backpack = backpack
        println("Equipped backpack")
    }

    fun equipArmor(armor: Armor) {
        this.playerInventory.armor = armor
        println("Equipped armor with ${armor.magicDefence} magic defense and ${armor.physicalDefence} physical defense")
    }

    fun getArmor(): Armor? {
        return this.playerInventory.armor
    }

    fun equipWeapon(weapon: AWeapon) {
        this.playerInventory.weapon = weapon
        println("Equipped weapon with ${weapon.attackDamage} attack damage")
    }

    fun getWeapon(): AWeapon? {
        return this.playerInventory.weapon
    }
}