package com.spring_in.learn_spring;

import com.spring_in.learn_spring.game.GameRunner;
import com.spring_in.learn_spring.game.MarioGame;
import com.spring_in.learn_spring.game.PacmanGame;
import com.spring_in.learn_spring.game.SuperContraGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppGamingBasicJava {
    public static void main (String[] args) {
        //var game = new MarioGame();
        var game = new PacmanGame();
        //var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
