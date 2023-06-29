package com.ysj.learnspringframework.game;

public class GameRunner {
    private Gamingconsole game;

    public GameRunner(Gamingconsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("run");
        game.up();
        game.down();
    }
}
