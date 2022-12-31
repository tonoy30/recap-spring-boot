package me.tonoy.learnspringboot;

public interface GameConsole {
    default void up() {
        System.out.println("UP");
    }

    void down();

    void left();

    void right();
}
