package Transport;

public class Bus extends Transport {

    private TypeBusCapacity typeBusCapacity;
    public Bus(String brand, String model, float engineVolume, int pitStop,
               int bestLapTime, int maxSpeed, TypeBusCapacity typeBusCapacity) {
        super(brand, model, engineVolume, pitStop, bestLapTime, maxSpeed);
        this.typeBusCapacity = typeBusCapacity;
    }

    @Override
    public boolean autoDiagnostics() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не нуждается.");
        return true;
    }

    public TypeBusCapacity getTypeBusCapacity() {
        return typeBusCapacity;
    }

    public void setTypeBusCapacity(TypeBusCapacity typeBusCapacity) {
        this.typeBusCapacity = typeBusCapacity;
    }

    @Override
    public void printCarBodyType() {
        if (typeBusCapacity == null){
            System.out.println("Данных по пассажировместимости недостаточно.");}
        else {
            String from = typeBusCapacity.getFrom() == 0 ? " " : "от " + typeBusCapacity.getFrom() + " ";
            String to = typeBusCapacity.getTo() == 0 ?  " " : "до " + typeBusCapacity.getTo();
            System.out.println("Пассажировместимость автобуса " + from + to + " чел.");
        }
    }

    @Override
    public void Start() {
        super.Start();
        System.out.println("Автобус начинает движение плавно.");

    }

    @Override
    public void Finish() {
        super.Finish();
        System.out.println("Автобус финиширует плавно.");

    }

    public static void printInfo(Bus bus) {
        System.out.println("Автомобиль: " + bus.getBrand() + ", модель: "
                + bus.getModel() + ". Объем двигателя: " + bus.getEngineVolume() + " куб.см. " +
                bus.pitStop() + " минут. " + bus.bestLapTime() + " мин. " + bus.maxSpeed() + " км/ч.");
    }
}
