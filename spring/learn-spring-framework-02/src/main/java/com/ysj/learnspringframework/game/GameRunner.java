package com.ysj.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
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
