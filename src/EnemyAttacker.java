// This is the Target Interface : This is what the client
// expects to work with. It is the adapters job to make new 
// classes compatible with this one even though these methods
// may not fit exactly the function of the new class

public interface EnemyAttacker {

    public void fireWeapon();
    public void driveForward();
    public void assignDriver(String driverName);

}