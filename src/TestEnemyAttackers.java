public class TestEnemyAttackers{

    public static void main(String[] args){

        EnemyTank rx7Tank = new EnemyTank(); // object created that perfectly fits the interface
        EnemyRobot fredTheRobot = new EnemyRobot(); // this is the adaptee
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot); // adapter object that takes the adaptee
        // for its constructor


        System.out.println("The Enemy Tank"); //demonstrates function of interface naturally
        rx7Tank.assignDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();
        System.out.println(); //spacing only

        System.out.println("The Robot"); //calls the local methods of the adaptee class
        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();
        System.out.println();



        System.out.println("The Robot with Adapter"); // calls local methods of the adaptee via the adapter object & interface
        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();


    }

}