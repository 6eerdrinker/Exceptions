package Transport;

public class Truck extends Transport {
    private TruckOfLoadingCapacity truckOfLoadingCapacity;
    public Truck(String brand, String model, float engineVolume, int pitStop,
                 int bestLapTime, int maxSpeed, TruckOfLoadingCapacity truckOfLoadingCapacity) {
        super(brand, model, engineVolume, pitStop, bestLapTime, maxSpeed);
        this.truckOfLoadingCapacity = truckOfLoadingCapacity;
    }

    public TruckOfLoadingCapacity getTruckOfLoadingCapacity() {
        return truckOfLoadingCapacity;
    }

    public void setTruckOfLoadingCapacity(TruckOfLoadingCapacity truckOfLoadingCapacity) {
        this.truckOfLoadingCapacity = truckOfLoadingCapacity;
    }

    @Override
    public void printCarBodyType() {
        if (truckOfLoadingCapacity == null){
            System.out.println("Данных по грузоподъемности недостаточно.");}
        else {
            String from = truckOfLoadingCapacity.getFrom() == 0 ? " " : "от " + truckOfLoadingCapacity.getFrom() + " ";
            String to = truckOfLoadingCapacity.getTo() == 0 ?  " " : "до " + truckOfLoadingCapacity.getTo();
            System.out.println("Грузоподъемность автомобиля " + from + to + " т.");
        }
    }

    @Override
    public boolean autoDiagnostics() {
        return Math.random() > 0.75;
    }

    @Override
    public void Start() {
        super.Start();
        System.out.println("Грузовой автомобиль начинает движение рывком.");
    }

    @Override
    public void Finish() {
        super.Finish();
        System.out.println("Грузовой автомобиль финиширует в облаке пыли.");
    }


    public static void printInfo(Truck truck) {
        System.out.println("Автомобиль: " + truck.getBrand() + ", модель: "
                + truck.getModel() + ". Объем двигателя: " + truck.getEngineVolume() + " куб.см. "  +
                truck.pitStop() + " минут. " + truck.bestLapTime() + " мин. " + truck.maxSpeed() + " км/ч.");
    }
}
