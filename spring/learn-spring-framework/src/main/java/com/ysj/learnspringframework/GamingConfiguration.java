package com.ysj.learnspringframework;

import com.ysj.learnspringframework.game.GameRunner;
import com.ysj.learnspringframework.game.Gamingconsole;
import com.ysj.learnspringframework.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public Gamingconsole game() {
        var game = new PacManGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(Gamingconsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
