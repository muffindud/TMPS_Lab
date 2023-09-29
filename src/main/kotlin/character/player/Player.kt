package character.player

import character.Character
import item.equipment.armor.Armor
import item.equipment.armor.armors.*
import item.equipment.weapon.Weapon
import item.equipment.backpack.Backpack
import item.equipment.backpack.backpacks.*

abstract class Player
    (
        var armor: Armor,
        var backpack: Backpack,
        var weapon: Weapon
    ): Character
{
    override var healthPoints: Int = 200
    abstract var playerName: String

    var attackPower: Int = 0
    var magicDefense: Int = 0
    var physicalDefense: Int = 0

    init {
        this.attackPower += this.weapon.attackDamage
        this.magicDefense += this.armor.magicDefence
        this.physicalDefense += this.armor.physicalDefence
    }

    fun equipArmor (armor: Armor) {
        this.magicDefense -= this.armor.magicDefence
        this.physicalDefense -= this.armor.physicalDefence
        this.armor.drop()
        this.armor = armor
        this.magicDefense += this.armor.magicDefence
        this.physicalDefense += this.armor.physicalDefence
    }

    fun equipWeapon (weapon: Weapon) {
        this.attackPower -= this.weapon.attackDamage
        this.weapon.drop()
        this.weapon = weapon
        this.attackPower += this.weapon.attackDamage

    }

    private fun attackPlayer (target: Player) {
        var damage: Int = 0

        if (this.weapon.getWeaponType() == "Physical") {
            damage = this.attackPower - target.physicalDefense
        }
        else if (this.weapon.getWeaponType() == "Magic") {
            damage = this.attackPower - target.magicDefense
        }

        if (damage > 0) {
            target.healthPoints -= damage
        }
    }

    override fun getCharacterType (): String {
        return "Player"
    }

    override fun attack (target: Character) {
        if (target.getCharacterType() == "Player") {
            attackPlayer(target as Player)
        }
        else {
            var damage: Int = this.attackPower
        }
    }
}