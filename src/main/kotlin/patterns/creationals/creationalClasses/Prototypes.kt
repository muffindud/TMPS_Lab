package patterns.creationals.creationalClasses

import game.character.player.*
import game.item.equipment.weapon.MagicWeapon
import game.item.equipment.weapon.PhysicalWeapon
import patterns.structurals.bridge.InventoryManager

class Prototypes
{
    companion object {
        private val instance: Prototypes? = null
        fun getInstance(): Prototypes {
            return instance ?: Prototypes()
        }
    }

    val builders: Builders = Builders.getInstance()

    val magePlayerBasicLoadout: MagePlayer = MagePlayer(
        armor = builders.basicArmorBuilder.build(),
        backpack = builders.basicBackpackBuilder.build(),
        weapon = builders.basicCatalystBuilder.build() as MagicWeapon,
        playerName = "",
        xPosition = 0,
        yPosition = 0,
        inventoryManager = InventoryManager
    )
    val magePlayerUncommonLoadout: MagePlayer = MagePlayer(
        armor = builders.uncommonArmorBuilder.build(),
        backpack = builders.uncommonBackpackBuilder.build(),
        weapon = builders.uncommonCatalystBuilder.build() as MagicWeapon,
        playerName = "",
        xPosition = 0,
        yPosition = 0,
        inventoryManager = InventoryManager
    )

    val warriorPlayerBasicLoadout: WarriorPlayer = WarriorPlayer(
        armor = builders.basicArmorBuilder.build(),
        backpack = builders.basicBackpackBuilder.build(),
        weapon = builders.basicSwordBuilder.build() as PhysicalWeapon,
        playerName = "",
        xPosition = 0,
        yPosition = 0,
        inventoryManager = InventoryManager
    )
    val warriorPlayerUncommonLoadout: WarriorPlayer = WarriorPlayer(
        armor = builders.uncommonArmorBuilder.build(),
        backpack = builders.uncommonBackpackBuilder.build(),
        weapon = builders.uncommonSwordBuilder.build() as PhysicalWeapon,
        playerName = "",
        xPosition = 0,
        yPosition = 0,
        inventoryManager = InventoryManager
    )
}