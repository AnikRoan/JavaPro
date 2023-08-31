package com.roananik.lessons04Task2;

public class Treadmill implements Obstacle {
    private final int length;
    private String treadmillName = "Treadmill";

    public String getTreadmillName() {
        return treadmillName;
    }

    public int getLength() {
        return length;
    }

    private void humanOvercome(Human human) {
        if (length <= human.getDistanceLimit()) {
            human.run();
            human.setDisqualify(true);
            System.out.println(human.getHumanName() + " Jumped over an obstacle");
        } else {
            human.run();
            human.setDisqualify(false);
            System.out.println(human.getHumanName() + " dropped out. Filed to overcome the obstacle. JUMP HEIGHT: "
                    + (length - human.getDistanceLimit()));
        }
    }

    private void catOvercome(Cat cat) {
        if (length <= cat.getDistanceLimit()) {
            cat.run();
            cat.setDisqualify(true);
            System.out.println(cat.getCatName() + " Jumped over an obstacle");
        } else {
            cat.run();
            cat.setDisqualify(false);
            System.out.println(cat.getCatName() + " dropped out. Filed to overcome the obstacle. JUMP HEIGHT: "
                    + (length - cat.getDistanceLimit()));
        }
    }

    private void robotOvercome(Robot robot) {
        if (length <= robot.getDistanceLimit()) {
            robot.run();
            robot.setDisqualify(true);
            System.out.println(robot.getRobotName() + " Jumped over an obstacle");
        } else {
            robot.run();
            robot.setDisqualify(false);
            System.out.println(robot.getRobotName() + " dropped out. Filed to overcome the obstacle. JUMP HEIGHT: "
                    + (length - robot.getDistanceLimit()));
        }
    }


    @Override
    public boolean overcome(Participant participant) {
        if (participant.isDisqualification()) {
            if (participant instanceof Human) {
                humanOvercome((Human) participant);
                return true;
            } else if (participant instanceof Cat) {
                catOvercome((Cat) participant);
                return true;

            } else if (participant instanceof Robot) {
                robotOvercome((Robot) participant);
                return true;

            }

        }


        return false;
    }

    public Treadmill(int length) {
        this.length = length;
    }
}
