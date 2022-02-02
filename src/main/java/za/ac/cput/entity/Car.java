package za.ac.cput.entity;

/**
 * Kurtney Clyde Jantjies (218138105)
 */

public class Car {
    private int numberPlate;
    private String modelName;
    private int modelYear;
    private double price;

    public Car() {
        this.numberPlate = 0;
        this.modelName = "";
        this.modelYear = 0;
        this.price = 0.0;
    }

    public Car(String modelName, int modelYear, double price) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.price = price;
    }

    public Car(int numberPlate, String modelName, int modelYear, double price) {
        this.numberPlate = numberPlate;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.price = price;
    }

    public int getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(int numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car = " +
                "Number Plate: "  + numberPlate +
                "\tModel Name: " + modelName  +
                "\tModel Year: " + modelYear +
                "\tPrice: " + price ;
    }
}
