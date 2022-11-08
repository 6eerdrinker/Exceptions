package Transport;

public abstract class Transport implements Competing {
    private String brand;
    private String model;
    public float engineVolume;

    public int pitStop;
    public int bestLapTime;
    public int maxSpeed;

    public Transport(String brand, String model, float engineVolume, int pitStop, int bestLapTime, int maxSpeed) {
        this.brand = ValidationUtils.validOrDefault(brand, "Марка указана не корректно");
        this.model = ValidationUtils.validOrDefault(model, "Модель указана не корректно");
        if (engineVolume == 0) {
            System.out.println("Объем двигателя указан не корректно");
        }else {this.engineVolume = engineVolume;}
        if (pitStop == 0) {
            System.out.println("Данные не указаны");
        }else
        {this.pitStop = pitStop;}
        if (bestLapTime == 0) {
            System.out.println("Данные не указаны");
        }else
        {this.bestLapTime = bestLapTime;}
        if (maxSpeed == 0) {
            System.out.println("Данные не указаны");
        }else
        {this.maxSpeed = maxSpeed;}
    }

    public abstract void printCarBodyType();

    public abstract boolean autoDiagnostics();

    public void Start() {
        System.out.println("Начало движения: ");
    }

    public void Finish() {
        System.out.println("Окончание движения: ");
    }
    @Override
    public String pitStop() {
        return "Скорость тех.обслуживания на Pit Stop: " + getPitStop();
    }

    @Override
    public String bestLapTime() {
        return "Лучшее время прохождения круга: " + getBestLapTime();
    }

    @Override
    public String maxSpeed() {
        return "Максимальная скорость: " + getMaxSpeed();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getPitStop() {
        return pitStop;
    }

    public void setPitStop(int pitStop) {
        this.pitStop = pitStop;
    }

    public int getBestLapTime() {
        return bestLapTime;
    }

    public void setBestLapTime(int bestLapTime) {
        this.bestLapTime = bestLapTime;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
