package me.tonoy.learnspringboot;

public class SuperMarioGame implements GameConsole {

    @Override
    public void up() {
        System.out.println(SuperMarioGame.class + "UP");
    }

    @Override
    public void down() {
        System.out.println(SuperMarioGame.class + "DOWN");
    }

    @Override
    public void left() {
        System.out.println(SuperMarioGame.class + "LEFT");
    }

    @Override
    public void right() {
        System.out.println(SuperMarioGame.class + "RIGHT");
    }
}
