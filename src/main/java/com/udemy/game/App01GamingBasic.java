package com.udemy.game;

public class App01GamingBasic {

    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var game = new SuperContraGame();
        var pacmanGame = new PacmanGame();
        var gameRunner = new GameRunner(pacmanGame);

        gameRunner.run();
    }
}
