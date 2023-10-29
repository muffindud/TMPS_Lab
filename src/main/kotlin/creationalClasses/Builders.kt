package creationalClasses

import patterns.creationals.builders.armorbuilders.*
import patterns.creationals.builders.backpackbuilders.*
import patterns.creationals.builders.weaponbuilder.*
import patterns.creationals.builders.weaponbuilder.magicweapons.*
import patterns.creationals.builders.weaponbuilder.physicalweapons.*

class Builders
{
    companion object {
        private val instance: Builders? = null

        fun getInstance(): Builders {
            return instance ?: Builders()
        }
    }

    val basicArmorBuilder: AArmorBuilder = BasicArmorBuilder()
    val uncommonArmorBuilder: AArmorBuilder = UncommonArmorBuilder()
    val basicBackpackBuilder: ABackpackBuilder = BasicBackpackBuilder()
    val uncommonBackpackBuilder: ABackpackBuilder = UncommonBackpackBuilder()
    val basicSwordBuilder: IWeaponBuilder = BasicSwordBuilder()
    val uncommonSwordBuilder: IWeaponBuilder = UncommonSwordBuilder()
    val basicCatalystBuilder: IWeaponBuilder = BasicCatalystBuilder()
    val uncommonCatalystBuilder: IWeaponBuilder = UncommonCatalystBuilder()
}