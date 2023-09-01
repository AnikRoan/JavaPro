package com.roananik.lessons04Task2;

public class Human implements Participant {
    private final int jumpHeight;
    private final int distanceLimit;
    private final String humanName;

    private boolean disqualify = true;


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
        System.out.println(humanName + " Human starts to RUN...\uD83C\uDFC3");
    }

    @Override
    public void jump() {
        System.out.println(humanName + " Human starts to JUMP^^^\uD83E\uDD38");

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
