package com.ysj.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ysj.learnspringframework.game")
public class GamingAppLauncherApplication {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {

            context.getBean(Gamingconsole.class).up();
            context.getBean(GameRunner.class).run();
        }

        //var gameRunner = new GameRunner(pacManGame);
        //gameRunner.run();
    }
}
