package Drivers;

public class DriversMain {


    public static void main(String[] args) {

        DriverB driverB = new DriverB("Иванов Иван Иванович", "водитель категории 'B'",
                "Легковой автомобиль",35 );
        DriverC driverC = new DriverC("Петров Владимир Сергеевич", "водитель категории 'C'",
                "Грузовой автомобиль", 15);
        DriverD driverD = new DriverD("Ситов Александр Юрьевич", "водитель категории 'D'",
                "Автобус",28 );


        driverB.setFullName("Иванов Иван Иванович");
        driverB.setTypeCategory("B");
        driverB.setRightDriveClassAuto("легковым автомобилем");
        driverB.setStage(35);
        System.out.println("***************************************************************************" +
                "************************************************************");


        driverC.setFullName("Петров Владимир Сергеевич");
        driverC.setTypeCategory("C");
        driverC.setRightDriveClassAuto("грузовым автомобилем");
        driverC.setStage(15);


        driverD.setFullName("Ситов Александр Юрьевич");
        driverD.setTypeCategory("D");
        driverD.setRightDriveClassAuto("автобусом");
        driverD.setStage(28);


        Transport<DriverB> car = new Transport("легковой автомобиль");
        car.controlled(driverB);

        Transport<DriverC> truck = new Transport("грузовой автомобиль");
        truck.controlled(driverC);

        Transport<DriverD> bus = new Transport("автобус");
        bus.controlled(driverD);

    }

}
