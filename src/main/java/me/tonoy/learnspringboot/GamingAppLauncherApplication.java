package me.tonoy.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GamingAppLauncherApplication {
    public static void main(String[] args) {
        var context = SpringApplication.run(GamingAppLauncherApplication.class, args);
        context.getBean(GameRunner.class).run();
    }
}
