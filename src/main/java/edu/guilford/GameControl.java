package edu.guilford;

/**
 * Hello world!
 *
 */
public class GameControl 
{
    public static void main( String[] args )
    {
        //build a GameState object
        GameState gameState = new GameState();

        //initialize the game, then start it, wait 3 seconds, pause the game, wait 5 seconds,
        //then change state to running, wait 4 more seconds, and end the game. print the banner
        //after each state change
        gameState.startGame();
        System.out.println(gameState.getBanner());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gameState.pauseGame();
        System.out.println(gameState.getBanner());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gameState.resumeGame();
        System.out.println(gameState.getBanner());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gameState.endGame();
        System.out.println(gameState.getBanner());

    }
}
