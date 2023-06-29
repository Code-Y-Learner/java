package com.ysj.learnspringframework;

import com.ysj.learnspringframework.game.GameRunner;
import com.ysj.learnspringframework.game.MarioGame;
import com.ysj.learnspringframework.game.PacManGame;
import com.ysj.learnspringframework.game.SuperContraGame;


public class App01GamingBasic {
    public static void main(String[] args) {
        var marioGame = new MarioGame();

        var pacManGame = new PacManGame();

        var superContraGame = new SuperContraGame();

        var gameRunner = new GameRunner(pacManGame);
        gameRunner.run();
    }
}
