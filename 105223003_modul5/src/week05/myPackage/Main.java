package week05.myPackage;

import week05.enkapsulasi.Car;

public class Main {
    public static void main(String[] args)  {
        MyClass.sayHello();

        Car myCar = new Car();
        System.out.println(myCar.kapasitas);
        // System.out.println(myCar.merk);
    }
}
