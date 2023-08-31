package com.roananik.lessons04Task2;

public class Cat implements Participant {
    private int jumpHeight;
    private int distanceLimit;
    private String catName;

    private boolean disqualify = true;

    public boolean isDisqualify() {
        return disqualify;
    }

    public void setDisqualify(boolean disqualify) {
        this.disqualify = disqualify;
    }


    public String getCatName() {
        return catName;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getDistanceLimit() {
        return distanceLimit;
    }

    @Override
    public void run() {
        System.out.println("Cat RUN...");

    }


    @Override
    public void jump() {
        System.out.println("Cat JUMP^^^");

    }

    @Override
    public boolean isDisqualification() {
        return disqualify;
    }

    public Cat(int jumpHeight, int distanceLimit, String name) {
        this.jumpHeight = jumpHeight;
        this.distanceLimit = distanceLimit;
        this.catName = name;
    }
}
