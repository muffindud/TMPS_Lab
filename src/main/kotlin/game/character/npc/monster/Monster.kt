package game.character.npc.monster

import game.character.ICharacter
import game.character.npc.INPC

class Monster(
    override var healthPoints: Int,
    override var xPosition: Int,
    override var yPosition: Int,
    var type: String
): INPC
{
    override fun attack(target: ICharacter) {
        TODO("Not yet implemented")
    }

    override fun getCharacterType(): String = type
}