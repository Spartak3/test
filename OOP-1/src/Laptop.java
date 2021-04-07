public class Laptop {
    private String mark;
    private String type;
    private int coreCount=2;
    private int batteryCapacity;
    private String osName;
    private int price;

    public void isGoodProduct()
    {
        if(this.coreCount>=6&&this.price<=2500)
        {
            System.out.println("Yes!, This is a good product");
        }
        else{
            System.out.println("This isn't  such a good product");

        }
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

    public int getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(int coreCount) {
        if(coreCount>=2&&coreCount<=12) {
            this.coreCount = coreCount;
        }
        else
        {
            System.out.println("Laptop can't have "+coreCount+" cores");

        }
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        if(osName=="Windows"||osName=="Macos"||osName=="Linux"){
            this.osName = osName;
        }
        else {
            System.out.println("Laptop can't have "+osName+" OS");
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
