package week03.packageF.main;

import week03.packageF.pk1.Car1;
import week03.packageF.pk2.Car2;

public class Main {
    public static void main(String[] args) {
//        week03.packageF.pk1.Car1 car1 = new week03.packageF.pk1.Car1();
//        week03.packageF.pk2.Car2 car2 = new week03.packageF.pk2.Car2();
//
//        car1.horn();
//        car2.horn();

        // import
        Car1 car1 = new Car1();
        Car2 car2 = new Car2();

        car1.horn();
        car2.horn();

    }
}
