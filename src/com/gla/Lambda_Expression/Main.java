package com.gla.Lambda_Expression;

import java.util.*;

interface LightAction {
    void execute();
}

public class Main {
    public static void main(String[] args) {
        LightAction motion = () -> System.out.println("Lights ON due to motion");
        LightAction time = () -> System.out.println("Lights dim at night");
        LightAction voice = () -> System.out.println("Lights ON by voice command");

        motion.execute();
        time.execute();
        voice.execute();
    }
}
