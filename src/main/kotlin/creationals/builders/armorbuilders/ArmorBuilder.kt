package creationals.builders.armorbuilders
import item.equipment.armor.Armor


interface ArmorBuilder {
    var physicalDefence: Int
    var magicDefence: Int
    var weight: Int

    fun build(): Armor
}