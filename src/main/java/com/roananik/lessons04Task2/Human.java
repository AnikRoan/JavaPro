package com.roananik.lessons04Task2;

public class Human implements Participant {
    private int jumpHeight;
    private int distanceLimit;
    private String humanName;

    private boolean disqualify = true;

    public boolean isDisqualify() {
        return disqualify;
    }

    public void setDisqualify(boolean disqualify) {
        this.disqualify = disqualify;
    }


    public String getHumanName() {
        return humanName;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getDistanceLimit() {
        return distanceLimit;
    }

    @Override
    public void run() {
        System.out.println("Human RUN...");
    }

    @Override
    public void jump() {
        System.out.println("Human JUMP^^^");

    }

    @Override
    public boolean isDisqualification() {
        return disqualify;
    }

    public Human(int jumpHeight, int distanceLimit, String name) {
        this.jumpHeight = jumpHeight;
        this.distanceLimit = distanceLimit;
        this.humanName = name;
    }
}
