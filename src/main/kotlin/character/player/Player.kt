package character.player

import character.Character
import item.equipment.armor.Armor
import item.equipment.armor.armors.*
import item.equipment.weapon.Weapon
import item.equipment.backpack.Backpack
import item.equipment.backpack.backpacks.*

abstract class Player (): Character {
    override var healthPoints: Int = 200
    abstract var playerName: String
    var armor: Armor = BasicArmor()
    abstract val weapon: Weapon
    var backpack: Backpack = BasicBackpack()

    private fun attackPlayer (target: Player) {
        var damage: Int = 0

        if (this.weapon.getWeaponType() == "Physical") {
            damage = this.weapon.attackDamage - target.armor.physicalDefence
        }
        else if (this.weapon.getWeaponType() == "Magic") {
            damage = this.weapon.attackDamage - target.armor.magicDefence
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
            var damage: Int = this.weapon.attackDamage
        }
    }
}