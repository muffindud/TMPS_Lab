package creationalclasses

import creationals.builders.armorbuilders.*
import creationals.builders.backpackbuilders.*
import creationals.builders.weaponbuilder.*
import creationals.builders.weaponbuilder.magicweapons.*
import creationals.builders.weaponbuilder.physicalweapons.*

class Builders
{
    companion object {
        private val instance: Builders? = null

    }

    fun getInstance(): Builders {
        return instance ?: Builders()
    }

    val basicArmorBuilder: ArmorBuilder = BasicArmorBuilder()
    val uncommonArmorBuilder: ArmorBuilder = UncommonArmorBuilder()
    val basicBackpackBuilder: BackpackBuilder = BasicBackpackBuilder()
    val uncommonBackpackBuilder: BackpackBuilder = UncommonBackpackBuilder()
    val basicSwordBuilder: WeaponBuilder = BasicSwordBuilder()
    val uncommonSwordBuilder: WeaponBuilder = UncommonSwordBuilder()
    val basicCatalystBuilder: WeaponBuilder = BasicCatalystBuilder()
    val uncommonCatalystBuilder: WeaponBuilder = UncommonCatalystBuilder()
}