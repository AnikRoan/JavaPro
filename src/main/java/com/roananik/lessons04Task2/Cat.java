package com.roananik.lessons04Task2;

public class Cat implements Participant {
    private final int jumpHeight;
    private final int distanceLimit;
    private final String catName;

    private boolean disqualify = true;


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
        System.out.println(catName + " Cat starts to RUN...\uD83D\uDC31");

    }


    @Override
    public void jump() {
        System.out.println(catName + " Cat starts to JUMP^^^\uD83D\uDE3B");

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
