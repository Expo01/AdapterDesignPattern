// The Adapter must provide an alternative action for 
// the the methods that need to be used because
// EnemyAttacker was implemented.

// This adapter does this by containing an object
// of the same type as the Adaptee (EnemyRobot)
// All calls to EnemyAttacker methods are sent
// instead to methods used by EnemyRobot

public class EnemyRobotAdapter implements EnemyAttacker{ // implements the EnemyAttacker interface, just like EnemyTank
    EnemyRobot theRobot; //field for the adaptee object

    public EnemyRobotAdapter(EnemyRobot newRobot){ //constructor that takes the adaptee
        theRobot = newRobot;
    }

    public void fireWeapon() { //interface methods call instance methods on the adaptee
        theRobot.smashWithHands();
    }

    public void driveForward() {
        theRobot.walkForward();
    }

    public void assignDriver(String driverName) {
        theRobot.reactToHuman(driverName);
    }


}