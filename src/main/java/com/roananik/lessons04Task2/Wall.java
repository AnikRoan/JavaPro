package com.roananik.lessons04Task2;

public class Wall implements Obstacle {

    private final int height;

    private final String wallName = " OBSTACLE Wall";

    public String getWallName() {
        return wallName;
    }

//    public int getHeight() {
//        return height;
//    }

    private void humanOvercome(Human human) {
        if (height <= human.getJumpHeight()) {
            human.jump();
            human.setDisqualify(true);
            System.out.println(human.getHumanName() + " Jumped over an obstacle");
        } else {
            human.jump();
            human.setDisqualify(false);
            System.out.println(human.getHumanName() + " dropped out. Filed to overcome the obstacle. JUMP HEIGHT: "
                    + (height - human.getJumpHeight()));
        }
    }
    private void catOvercome(Cat cat) {
        if (height <= cat.getJumpHeight()) {
            cat.jump();
            cat.setDisqualify(true);
            System.out.println(cat.getCatName() + " Jumped over an obstacle");
        } else {
            cat.jump();
            cat.setDisqualify(false);
            System.out.println(cat.getCatName() + " dropped out. Filed to overcome the obstacle. JUMP HEIGHT: "
                    + (height - cat.getJumpHeight()));
        }
    }
    private void robotOvercome(Robot robot) {
        if (height <= robot.getJumpHeight()) {
            robot.jump();
            robot.setDisqualify(true);
            System.out.println(robot.getRobotName() + " Jumped over an obstacle");
        } else {
            robot.jump();
            robot.setDisqualify(false);
            System.out.println(robot.getRobotName() + " dropped out. Filed to overcome the obstacle. JUMP HEIGHT: "
                    + (height - robot.getJumpHeight()));
        }
    }






    @Override
    public boolean overcome(Participant participant) {
        //переписать метод разбить его на мелкие методы для кажджого участника
        if(participant.isDisqualification()){
            if(participant instanceof Human){
                humanOvercome((Human) participant);
                return true;
            }else if(participant instanceof Cat){
                catOvercome((Cat) participant);
                return true;

            }else if(participant instanceof  Robot){
                robotOvercome((Robot) participant);
                return true;

            }

        }


        return false;

    }

    public Wall(int height) {
        this.height = height;
    }
}
