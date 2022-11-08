package Drivers;

public class DriverB extends Drivers{

    private int stage;

    public DriverB(String fullName, String typeCategory, String rightDriveClassAuto, int stage) {
        super(fullName, typeCategory, rightDriveClassAuto);
     if (stage <= 0) {
            System.out.println("default");
        } else {
            this.stage = stage;
        }
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }
}


