package me.tonoy.learnspringboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacmanGameQualifier")
public class PacmanGame implements GameConsole {
    @Override
    public void up() {
        System.out.println(PacmanGame.class + "-> UP");
    }

    @Override
    public void down() {
        System.out.println(PacmanGame.class + "-> DOWN");
    }

    @Override
    public void left() {
        System.out.println(PacmanGame.class + "-> LEFT");
    }

    @Override
    public void right() {
        System.out.println(PacmanGame.class + "-> RIGHT");
    }
}
