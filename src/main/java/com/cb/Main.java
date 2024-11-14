package com.cb;

import com.cb.services.Scoreboard;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scoreboard scoreboard = new Scoreboard();
        scoreboard.startMatch("ClassA", "ClassB");
        scoreboard.startMatch("ClassC", "ClassD");
        scoreboard.startMatch("ClassE", "ClassF");
        scoreboard.startMatch("ClassG", "ClassH");
        scoreboard.startMatch("ClassI", "ClassJ");

        scoreboard.updateScore("ClassA", "ClassB", 0, 5);
        scoreboard.updateScore("ClassC", "ClassD", 10, 2);
        scoreboard.updateScore("ClassE", "ClassF", 2, 2);
        scoreboard.updateScore("ClassG", "ClassH", 6, 6);
        scoreboard.updateScore("ClassI", "ClassJ", 3, 1);

        List<String> summary = scoreboard.getSummary();
        System.out.println(summary);
    }
}