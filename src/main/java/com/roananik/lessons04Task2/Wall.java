package com.roananik.lessons04Task2;

public class Wall implements Obstacle {
    private final String winInfo = "named member %s overcame the obstacle %s high: %d\n";
    private final String lossInfo = "named member %s could not overcome " +
            "the obstacle %s high: %d His jump amounted to: %d\n";


    private final int height;


    private final String wallName = "WALL";


    private void humanOvercomes(Human human) {
        if (height <= human.getJumpHeight()) {

            human.jump();
            human.setDisqualify(true);
            System.out.printf(winInfo, human.getHumanName(), wallName, height);
        } else {
            human.jump();
            human.setDisqualify(false);
            System.out.printf(lossInfo, human.getHumanName(), wallName, height, human.getJumpHeight());
        }
    }

    private void catOvercomes(Cat cat) {
        if (height <= cat.getJumpHeight()) {
            cat.jump();
            cat.setDisqualify(true);
            System.out.printf(winInfo, cat.getCatName(), wallName, height);
        } else {
            cat.jump();
            cat.setDisqualify(false);
            System.out.printf(lossInfo, cat.getCatName(), wallName, height, cat.getJumpHeight());
        }
    }

    private void robotOvercomes(Robot robot) {
        //лучше использовать sting Format
        //исправить
        if (height <= robot.getJumpHeight()) {
            robot.jump();
            robot.setDisqualify(true);
            System.out.printf(winInfo, robot.getRobotName(), wallName, height);
        } else {
            robot.jump();
            robot.setDisqualify(false);
            System.out.printf(lossInfo, robot.getRobotName(), wallName, height, robot.getJumpHeight());
        }
    }


    @Override
    public boolean overcome(Participant participant) {

        if (participant.isDisqualification()) {
            if (participant instanceof Human) {
                humanOvercomes((Human) participant);
                return true;
            } else if (participant instanceof Cat) {
                catOvercomes((Cat) participant);
                return true;

            } else if (participant instanceof Robot) {
                robotOvercomes((Robot) participant);
                return true;

            }

        }


        return false;

    }

    public Wall(int height) {
        this.height = height;
    }
}
