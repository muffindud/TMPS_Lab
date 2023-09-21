import gamemanager.GameManager

fun main()
{
    val game: GameManager = GameManager()

    game.startGame()

    while (!game.endGame)
    {
        game.updateGame()
    }
}