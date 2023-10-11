package creationals.factories

import character.npc.monster.*

class MonsterFactory
{
    companion object
    {
        private val instance: MonsterFactory? = null
    }

    fun getInstance(): MonsterFactory
    {
        return instance ?: MonsterFactory()
    }

    fun createGoblin(x: Int = 0, y: Int = 0): Monster = Monster(10, x, y, "Goblin")

    fun createOrc(x: Int = 0, y: Int = 0): Monster = Monster(20, x, y, "Orc")

    fun createTroll(x: Int = 0, y: Int = 0): Monster = Monster(30, x, y, "Troll")
}