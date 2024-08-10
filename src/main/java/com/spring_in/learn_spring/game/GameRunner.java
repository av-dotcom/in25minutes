package com.spring_in.learn_spring.game;

public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
