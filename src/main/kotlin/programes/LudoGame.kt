package programes

/**
 * There are two players. if any one has score 100 or above then game will be stopped.
 * */
object LudoGame {

    fun ludoGame(): String {
        var playerOneScore = 0
        var playerTwoScore = 0
        var isPlayerOneTurn: Boolean = true
        while (checkGameStopOrNot(playerOneScore, playerTwoScore)) {
            println("Player One:- $playerOneScore | Player Two:- $playerTwoScore")
            if (isPlayerOneTurn) {
                playerOneScore += generateRandomNumber()
                isPlayerOneTurn = false
            } else {
                playerTwoScore += generateRandomNumber()
                isPlayerOneTurn = true
            }
        }
        return checkWhichPlayerWon(playerOneScore, playerTwoScore)
    }

    /**
     * Generate Random Number Between 0 and 6
     * */
    private fun generateRandomNumber() = (1..6).random()

    /**
     * Check Game is Complete or not
     * */
    private fun checkGameStopOrNot(playerOneScore: Int, playerTwoScore: Int) = (playerOneScore < 100) && (playerTwoScore < 100)


    /**
     * Check Which Player WON
     * */
    private fun checkWhichPlayerWon(playerOneScore: Int, playerTwoScore: Int) = if (playerOneScore >= 100) "Player One WIN \n Player One:- $playerOneScore\n Player Two:- $playerTwoScore" else "Player Two WIN \n Player One:- $playerOneScore\n Player Two:- $playerTwoScore"

}