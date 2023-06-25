public class Main {
    public static void main(String[] args) {
        car car=new car("car1");
        car car2=new car("car2");
        Truck truck = new Truck("truck1");
        Truck truck2= new Truck("truck2");
        Bicycle bicycle=new Bicycle("bicycle1");
        Bicycle bicycle2=new Bicycle("bicycle2");

        Transport [] transports={
                car,
                car2,
                truck,
                truck2,
                bicycle,
                bicycle2,
        };
        for (Transport t : transports){
            t.service();
            System.out.println("----------");
        }
    }
}