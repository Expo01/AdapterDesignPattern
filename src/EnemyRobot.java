// This is the Adaptee. The Adapter sends method calls
// the objects in main that are using the EnemyAttacker interface
// but are not quite of the right type and routes those interface method calls
// to the right methods defined in the Adaptee class 'EnemyRobot'

import java.util.Random;

public class EnemyRobot{

    Random generator = new Random(); //again unnecessary. the point is that we have 3 methods that don't fit the
    // three methods of the interface which need to be adapted to the interface

    public void smashWithHands() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Robot Causes " + attackDamage + " Damage With Its Hands");
    }

    public void walkForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Robot Walks Forward " + movement + " spaces");
    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot Tramps on " + driverName);
    }



}
