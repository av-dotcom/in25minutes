package com.spring_in.learn_spring;

import game.GameRunner;
import game.PacmanGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App01GamingBasicJava {
    public static void main (String[] args) {
        //var game = new MarioGame();
        var game = new PacmanGame();
        //var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
