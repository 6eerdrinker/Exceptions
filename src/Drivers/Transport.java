package Drivers;


public class Transport <T extends Drivers >{
    public String typeTransport;

    public Transport(String typeTransport) {
        ValidationUtils.validOrDefault(typeTransport,
                "default");
    }

    public void controlled(T drivers) {

        System.out.println("Водитель " + drivers.getFullName() +
                ", имеет категорию: " + drivers.getTypeCategory() +
                 ", управляет " + drivers.getRightDriveClassAuto() + ", учавствовует в заезде, и "
        + drivers.start());

        System.out.println("Водитель " + drivers.getFullName() + " " + drivers.stop() + ". ");
        System.out.println("Водитель " + drivers.getFullName() + " " + drivers.refuelTheCar() + ". ");
        System.out.println("***************************************************************************" +
                "************************************************************");
    }

    public String getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(String typeTransport) {
        this.typeTransport = typeTransport;
    }
}
