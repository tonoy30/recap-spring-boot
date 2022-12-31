package me.tonoy.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringBootApplication.class, args);
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
