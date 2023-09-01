package com.roananik.lessons04Task2;

public class TreadMill implements Obstacle {
    private final String winInfo = "named member %s overcame the obstacle %s length: %d\n";
    private final String lossInfo = "named member %s could not overcome " +
            "the obstacle %s length: %d He ran: %d\n";
    private final int length;
    private final String treadmillName = "TREAD MILL";


    private void humanOvercomes(Human human) {
        if (length <= human.getDistanceLimit()) {
            human.run();
            human.setDisqualify(true);
            System.out.printf(winInfo, human.getHumanName(), treadmillName, length);
        } else {
            human.run();
            System.out.printf(lossInfo, human.getHumanName(), treadmillName, length, human.getDistanceLimit());
            human.setDisqualify(false);
        }
    }

    private void catOvercomes(Cat cat) {
        if (length <= cat.getDistanceLimit()) {
            cat.run();
            cat.setDisqualify(true);
            System.out.printf(winInfo, cat.getCatName(), treadmillName, length);
        } else {
            cat.run();
            System.out.printf(lossInfo, cat.getCatName(), treadmillName, length, cat.getDistanceLimit());
            cat.setDisqualify(false);
        }
    }

    private void robotOvercomes(Robot robot) {
        if (length <= robot.getDistanceLimit()) {
            robot.run();
            robot.setDisqualify(true);
            System.out.printf(winInfo, robot.getRobotName(), treadmillName, length);
        } else {
            robot.run();
            robot.setDisqualify(false);
            System.out.printf(lossInfo, robot.getRobotName(), treadmillName, length, robot.getDistanceLimit());
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

    public TreadMill(int length) {
        this.length = length;
    }
}
