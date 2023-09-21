import gamemanager.GameManager

fun main()
{
    var game: GameManager = GameManager()

    game.startGame()

    while (!game.endGame)
    {
        game.updateGame()
    }
}