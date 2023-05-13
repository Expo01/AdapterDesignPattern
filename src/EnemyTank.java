
import java.util.Random;

public class EnemyTank implements EnemyAttacker{ //implements all methods from the interface. In this case, all functions
    // of a tank match the interface functions

    Random generator = new Random(); //unnecessary for pattern. point is just to make the methods do something

    public void fireWeapon() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Tank Does " + attackDamage + " Damage");
    }

    public void driveForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Tank moves " + movement + " spaces");
    }

    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank");
    }

}