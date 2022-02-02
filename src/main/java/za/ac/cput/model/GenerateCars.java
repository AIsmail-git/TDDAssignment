package za.ac.cput.model;

import za.ac.cput.entity.Car;
import java.util.ArrayList;

public class GenerateCars {
    private Car car;
    private ArrayList<Car> carList;

    public GenerateCars() {
        this.car = null;
    }

    public GenerateCars(Car car) {
        this.car = car;
    }

    public boolean addCar(Car car){
        this.car = new Car(car.getNumberPlate(),car.getModelName(),
                car.getModelYear(), car.getPrice());
        return this.car != null;
    }
}
