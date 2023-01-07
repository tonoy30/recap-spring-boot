package me.tonoy.learnspringboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private final GameConsole gameConsole;

    public GameRunner(@Qualifier("PacmanGameQualifier") GameConsole gameConsole) {
        this.gameConsole = gameConsole;
    }

    public void run() {
        System.out.println("Running Game:" + gameConsole);
        gameConsole.up();
        gameConsole.down();
        gameConsole.left();
        gameConsole.right();
    }
}
