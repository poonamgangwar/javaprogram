import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

    class Car {
        int speed;
        String name;
        int power;

        // CONSTRUCTOR
        public Car(int speed, String name, int power) {
            this.speed = speed;
            this.name = name;
            this.power = power;
        }

        @Override
        public String toString() {
            return "Car [speed=" + speed + ", name=" + name + ", power=" + power + "]";
        }
    }


