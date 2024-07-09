public class Car {
    private int serialNumber;
    private String brand;
    public Car(int serial, String brand1){
         serialNumber=serial;
         brand=brand1;
     }

    public Car(int serial){
        serialNumber=serial;
        brand="unknown";
    }

    public int getSerialNumber(){
        return serialNumber;
    }

}

/*
first word lowercase second getGameGreat
* Class initialization which you will do with a constructor
* Class represents an object
* so this class is  a car object
* int string double are data types in a similar you can declare a variable to be a car
* int number =new Integer(1);
* Car tesla = new Car(1738407081, "tesla");
* Car honda = new Car(1738407082);
* what is a method
* int teslaSerial= tesla.getSerialNumber();
* */