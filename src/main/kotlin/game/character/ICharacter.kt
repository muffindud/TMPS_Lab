package game.character

interface ICharacter
{
    var healthPoints: Int
    var xPosition: Int
    var yPosition: Int

    fun attack(target: ICharacter)
    fun getCharacterType(): String
}