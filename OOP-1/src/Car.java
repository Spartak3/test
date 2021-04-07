public class Car {
    private String mark;
    private String type;
    private String color;
    private int passengerCount=2;
    private int engineHoursPower=50;
    private int maxSpeed=20;
    private boolean isJapanCar;


    public void sayAbouteThisCar()
    {
        System.out.printf("Car mark is: %s, car type is: %s, car color is: %s, car passenger count is: %d, " +
                        "car engine power is: %d hrs-powwer, car speed is : %d km/h, car is from Japan:- %b",
                this.mark,this.type,this.color,this.passengerCount,this.engineHoursPower,
                this.maxSpeed,this.isJapanCar);
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if(passengerCount>=2) {
            this.passengerCount = passengerCount;
        }
        else
        {
            System.out.println("Passenger count can't be "+passengerCount);
        }
    }

    public int getEngineHoursPower() {
        return engineHoursPower;
    }

    public void setEngineHoursPower(int engineHoursPower) {
        if(engineHoursPower>=50) {
            this.engineHoursPower = engineHoursPower;
        }
        else
        {
            System.out.println("Hours power can't be "+engineHoursPower);

        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed>=20&&maxSpeed<=700) {
            this.maxSpeed = maxSpeed;
        }
        else
        {
            System.out.println("Max speed can't be "+maxSpeed);
        }
    }

    public boolean isJapanCar() {
        return isJapanCar;
    }

    public void setJapanCar(boolean japanCar) {
        isJapanCar = japanCar;
    }
}
