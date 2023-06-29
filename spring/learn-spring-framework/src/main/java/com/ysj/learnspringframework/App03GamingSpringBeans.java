package com.ysj.learnspringframework;

import com.ysj.learnspringframework.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {

            context.getBean(Gamingconsole.class).up();
            context.getBean(GameRunner.class).run();
        }

        //var gameRunner = new GameRunner(pacManGame);
        //gameRunner.run();
    }
}
