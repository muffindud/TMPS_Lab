package game.player

import game.playerProfile.PlayerProfile

import game.tank.ITank
import game.crew.Crew
import game.equipment.IEquipment

abstract class Player(
    var profile: PlayerProfile
) {
    class PlayerGarage {
        var tanks: List<ITank> = listOf()

        init {

        }
    }

    class PlayerBarracks {
        var crews: List<Crew> = listOf()

        init {

        }
    }

    class PlayerEquipment {
        var equipments: HashMap<IEquipment, Int> = hashMapOf()

        init {

        }
    }
}