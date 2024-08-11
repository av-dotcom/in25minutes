package com.spring_in.learn_spring;

import com.spring_in.learn_spring.game.GameRunner;
import com.spring_in.learn_spring.game.PacmanGame;
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
