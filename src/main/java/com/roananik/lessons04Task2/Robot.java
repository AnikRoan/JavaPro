package com.roananik.lessons04Task2;

public class Robot implements Participant {
    private int jumpHeight;
    private int distanceLimit;
    private String robotName;

    private boolean disqualify = true;

    public boolean isDisqualify() {
        return disqualify;
    }

    public void setDisqualify(boolean disqualify) {
        this.disqualify = disqualify;
    }


    public String getRobotName() {
        return robotName;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getDistanceLimit() {
        return distanceLimit;
    }

    @Override
    public void run() {
        System.out.println("Robot RUN...");
    }

    @Override
    public void jump() {
        System.out.println("Robot JUMP^^^");

    }

    @Override
    public boolean isDisqualification() {
        return disqualify;
    }

    public Robot(int jumpHeight, int distanceLimit, String name) {
        this.jumpHeight = jumpHeight;
        this.distanceLimit = distanceLimit;
        this.robotName = name;
    }
}
