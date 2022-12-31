package me.tonoy.learnspringboot;

public class GameRunner {
    private final GameConsole gameConsole;

    public GameRunner(GameConsole gameConsole) {
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
