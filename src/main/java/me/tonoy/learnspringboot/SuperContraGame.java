package me.tonoy.learnspringboot;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GameConsole {
    @Override
    public void up() {
        System.out.println(SuperContraGame.class + " UP");
    }

    @Override
    public void down() {
        System.out.println(SuperContraGame.class + " DOWN");
    }

    @Override
    public void left() {
        System.out.println(SuperContraGame.class + " LEFT");
    }

    @Override
    public void right() {
        System.out.println(SuperContraGame.class + " RIGHT");
    }
}
