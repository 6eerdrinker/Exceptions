package Transport;



public class Car extends Transport {
    private CarBodyType carBodyType;

    public Car(String brand, String model, float engineVolume, int pitStop,
               int bestLapTime, int maxSpeed, CarBodyType carBodyType) {
        super(brand, model, engineVolume, pitStop, bestLapTime, maxSpeed);
        this.carBodyType = carBodyType;
    }

    public CarBodyType getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(CarBodyType carBodyType) {
        this.carBodyType = carBodyType;
    }

    @Override
    public void printCarBodyType() {
        if (carBodyType == null){
            System.out.println("Данных по типу кузова недостаточно.");}
        else {
            System.out.println("Тип кузова автомобиля  - " + carBodyType + ".");
        }
    }

    @Override
    public boolean autoDiagnostics() {
        return Math.random() > 0.7;
    }

    @Override
    public void Start() {
        super.Start();
        System.out.println("Легковой автомобиль начинает движение резко.");
    }

    @Override
    public void Finish() {
        super.Finish();
        System.out.println("Легковой автомобиль красиво финиширует.");
    }

    public static void printInfo(Car car) {
        System.out.println("Автомобиль: " + car.getBrand() + ", модель: "
                + car.getModel() + ". Объем двигателя: " + car.getEngineVolume() + " куб.см. " +
                car.pitStop() + " минут. " + car.bestLapTime() + " мин. " + car.maxSpeed() + " км/ч.");
    }
}

//    public enum CarBodyType {
//        CBT_SEDAN, CBT_HETCHBAK, CBT_CUPE, CBT_UBIVERS,
//        CBT_JEEP, CBT_KROSS, CBT_PICAP, CBT_KUNG, CBT_VEN,
//    }

//    private static final String CBT_SEDAN = "Седан";
//    private static final String CBT_HETCHBAK = "Хетчбек";
//    private static final String CBT_CUPE = "Купе";
//    private static final String CBT_UBIVERS = "Универсал";
//    private static final String CBT_JEEP = "Внедорожник";
//    private static final String CBT_KROSS = "Кроссовер";
//    private static final String CBT_PICAP = "Пикап";
//    private static final String CBT_KUNG = "Фургон";
//    private static final String CBT_VEN = "Минивэн";


//    public static final String[] CAR_BODY_TYPE = {CBT_SEDAN, CBT_HETCHBAK, CBT_CUPE, CBT_UBIVERS,
//            CBT_JEEP, CBT_KROSS, CBT_PICAP, CBT_KUNG, CBT_VEN};
//public String[] getCarBodyType() {
//    String[] bodyTypes = new String[CarBodyType.values().length];
//    for (int i = 0; i < bodyTypes.length; i++) {
//        bodyTypes[i] = CarBodyType.values()[i].name();
//    }
//    return bodyTypes;
//}