package by.task18_1;
/**Создать класс авто. Поля: id, марка, пробег, год выпуска,
 * максимальная скорость, цена.*/
public class Car {
    private int id;
    private String brand;
    private int mileage;
    private int year ;
    private int max_speed;
    private Double price;

    public Car(int id, String brand, int mileage, int year, int max_speed, Double price) {
        this.id = id;
        this.brand = brand;
        this.mileage = mileage;
        this.year = year;
        this.max_speed = max_speed;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", mileage=" + mileage +
                ", year=" + year +
                ", max_speed=" + max_speed +
                ", price=" + price +
                '}';
    }
}
