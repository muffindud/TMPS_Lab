package creationalClasses

import creationals.builders.armorbuilders.*
import creationals.builders.backpackbuilders.*
import creationals.builders.weaponbuilder.*
import creationals.builders.weaponbuilder.magicweapons.*
import creationals.builders.weaponbuilder.physicalweapons.*

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