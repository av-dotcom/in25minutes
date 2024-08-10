package com.spring_in.learn_spring;

import com.spring_in.learn_spring.game.GameRunner;
import com.spring_in.learn_spring.game.MarioGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppGamingBasicJava {
    public static void main (String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
