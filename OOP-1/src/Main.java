public class Main {


    public static void main(String[] args) {
        //bubbleSort bellow
        Car car1=new Car();
        car1.setMark("Mercedes-Benz");
        car1.setType("Sport-Car");
        car1.setColor("Red");
        car1.setPassengerCount(2);
        car1.setEngineHoursPower(589);
        car1.setMaxSpeed(320);
        car1.setJapanCar(false);

        car1.sayAbouteThisCar();//print all data

        System.out.println();
        car1.setPassengerCount(-4);//can't be -4
        System.out.println("PaassengerCount is: "+car1.getPassengerCount());

        Laptop laptop=new Laptop();
        laptop.setMark("Apple");
        laptop.setType("Programming-Laptop");
        laptop.setBatteryCapacity(2300);
        laptop.setCoreCount(6);
        laptop.setPrice(2500);
        laptop.setOsName("Macos");

        System.out.printf("Laptop mark is: %s, laptop type is: %s, laptop core count is: %d, " +
                        "laptop battery capacity is: %d , laptop price is : %d$, laptop OS name is: %s",
                laptop.getMark(),laptop.getType(),laptop.getCoreCount(),laptop.getBatteryCapacity(),
                laptop.getPrice(),laptop.getOsName());

        System.out.println();
        laptop.isGoodProduct();//is is good product

        int[] arr=new int[]{9,8,7,6,5,4,3,2,1};
        int count=0,t=0;
        for (int i=0;i<arr.length;i++)
        {
            for (int j = 0; j <arr.length-1-count; j++) {
                    if(arr[j]>arr[j+1])
                    {
                        t=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=t;
                    }
            }
            count++;
        }

        System.out.println("Bubble sort result");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }



    }
}
