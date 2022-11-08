package Transport;



public class Main {
        public static void main(String[] args) {

                System.out.println("Легковые автомобили: ");
                Car lada = new Car("Лада", "Granta", 1.7f,
                        5, 7, 203, CarBodyType.HATCHBACK);
                Car audi = new Car("Ауди", "A8 50 L TDI quattro", 3.0f,
                        8, 6, 267, null);
                Car bmw = new Car("BMW", "Z8", 3.0f,
                        7, 4, 288, CarBodyType.CROSSOVER);
                Car kia = new Car("KIA", "Sportage 4-го поколения", 2.0f,
                        6, 10, 198, CarBodyType.CROSSOVER);
                Car.printInfo(lada);
                lada.printCarBodyType();
                System.out.println("*******************************************");
                Car.printInfo(audi);
                audi.printCarBodyType();
                System.out.println("*******************************************");
                Car.printInfo(bmw);
                bmw.printCarBodyType();
                System.out.println("*******************************************");
                Car.printInfo(kia);
                kia.printCarBodyType();

                lada.Start();
                lada.Finish();
                System.out.println();

                System.out.println("Грузовые автомобили: ");
                Truck kamaz = new Truck("КАМАЗ", "4326", 10.85f,
                        15, 22, 180, TruckOfLoadingCapacity.N1);
                Truck man = new Truck("MAN", "TGS 33.480 6x6", 12.4f,
                        18, 28, 178, null);
                Truck scania = new Truck("Scania", "S500 4×2 Highline", 16.0f,
                        16, 23, 200, TruckOfLoadingCapacity.N2);
                Truck hino = new Truck("HINO", "700SS", 12.9f,
                        20, 20, 188, TruckOfLoadingCapacity.N3);

                Truck.printInfo(kamaz);
                kamaz.printCarBodyType();
                System.out.println("*******************************************");
                Truck.printInfo(man);
                man.printCarBodyType();
                System.out.println("*******************************************");
                Truck.printInfo(scania);
                scania.printCarBodyType();
                System.out.println("*******************************************");
                Truck.printInfo(hino);
                hino.printCarBodyType();

                kamaz.Start();
                kamaz.Finish();
                System.out.println();

                System.out.println("Автобусы: ");
                Bus paz = new Bus("ПАЗ", "3205", 4.670f,
                        20, 16, 168, TypeBusCapacity.SMALL);
                Bus daewoo = new Bus("Daewoo", "BS-106", 11.051f,
                        13, 12, 202, null);
                Bus gaz = new Bus("Газ", "32215", 2.9f,
                        10, 15, 190, TypeBusCapacity.PARTICULARE_SMALL);

                Bus isuzu = new Bus("Isuzu", "Citibus", 4.6f,
                        16, 17, 180, TypeBusCapacity.LARGE);

                Bus.printInfo(paz);
                paz.printCarBodyType();
                System.out.println("*******************************************");
                Bus.printInfo(daewoo);
                daewoo.printCarBodyType();
                System.out.println("*******************************************");
                Bus.printInfo(gaz);
                gaz.printCarBodyType();
                System.out.println("*******************************************");
                Bus.printInfo(isuzu);
                isuzu.printCarBodyType();

                paz.Start();
                paz.Finish();
                System.out.println();
                autoDiagnostics(lada, audi, bmw, kia,
                        kamaz, man, scania, hino,
                        paz, daewoo, gaz, isuzu);
        }

        private static void autoDiagnostics(Transport... transports) {
                for (Transport transport : transports) {
                        autoDiagnosticsTransport(transport);

                }
        }

        private static void autoDiagnosticsTransport(Transport transport) {
                try {
                        if (!transport.autoDiagnostics()) {
                                throw new RuntimeException("Автомобиль " + transport.getBrand() + " "
                                        + transport.getModel() + " диагностику не прошел.");
                        }
                } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                }
        }
}

