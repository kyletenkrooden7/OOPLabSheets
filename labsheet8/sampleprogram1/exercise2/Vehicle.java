package labsheet8.sampleprogram1.exercise2;

public class Vehicle {
    private double price;
    private double length;
    private double height;
    private double weight;
    private String manufacturer;
    private String model;

    public Vehicle()
    {
        setPrice(price);
        setLength(length);
        setHeight(height);
        setWeight(weight);
        setManufacturer(manufacturer);
        setModel(model);
    }

    public Vehicle(double price, double length, double height, double weight,String manufacturer, String model) {
        setPrice(price);
        setLength(length);
        setHeight(height);
        setWeight(weight);
        setManufacturer(manufacturer);
        setModel(model);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String toString() {
        String str= "Price: " + getPrice()
                + "\nLength: " + getLength() +
                "\nHeight: " + getHeight() +
                "\nWeight: " + getWeight() +
                "\nManufacturer: ";
        if(manufacturer==null)
            str+="No manufacturer specified";
        else
            str+=getManufacturer();

                str+= "\nModel: ";

        if(model == null)
          str+="No model specified";

        else
            str+= getModel();

        return str;
    }
}
