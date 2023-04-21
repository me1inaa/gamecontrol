package edu.guilford;

public class GameState {
    //use an enum for a game state with initializing, running, paused, and game over states

    public enum State {
        INITIALIZING, RUNNING, PAUSED, GAME_OVER
    }
    //**enum is a collection of public static final values**
    //behind the scenes, each of these has an assciated integer value, the ordinal 
    //the first value is 0, the second is 1, etc.
    
    // declare a method of type State to hold the current game state 
    private State currentState;

    // declare some other variables to hold the current score, the current level
    private int currentScore;
    private int currentLevel;

    // declare a constructor to initialize the game state to INITIALIZING
    public GameState() {
        currentState = State.INITIALIZING;
        // State.INITIALIZING is the INITIALIZING value of the enum State 
        currentScore = 0;
        currentLevel = 1;
    }

    // constructor to set all the value to use defined values 
    public GameState(State currentState, int currentScore, int currentLevel) {
        this.currentState = currentState;
        this.currentScore = currentScore;
        this.currentLevel = currentLevel;
    }

    //declare a method to get the current game state
    public State getCurrentState() {
        return currentState;
    }

    //declare a method to set the current game state
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    //declare a method to get the current score
    public int getCurrentScore() {
        return currentScore;
    }

    //declare a method to set the current score
    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    //declare a method to get the current level
    public int getCurrentLevel() {
        return currentLevel;
    }

    //declare a method to set the current level
    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    //provides methods to start, resume, pause, and end the game
    public void startGame() {
        currentState = State.INITIALIZING;
        // currentState is a variable of type State and can have only one of the four values in the enum
        // currentState = 1; does not work because currentState is not an int; its a State variable 
    }

    public void resumeGame() {
        currentState = State.RUNNING;
    }

    public void pauseGame() {
        currentState = State.PAUSED;
    }

    public void endGame() {
        currentState = State.GAME_OVER;
    }
    
    // write a getBanner method that uses a switch statement to generate a benner based on the value of currentState
    public String getBanner() {
        String banner = "";
        switch (currentState) {
            case INITIALIZING:
                banner = "Initializing...";
                break;
            case RUNNING:
                banner = "Running...";
                break;
            case PAUSED:
                banner = "Paused...";
                break;
            case GAME_OVER:
                banner = "Game Over!";
                break;
        }
        return banner;
    }
}
