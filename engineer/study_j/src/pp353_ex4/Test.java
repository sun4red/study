package pp353_ex4;

abstract class Vehicle {
    private String name;

    abstract public String getName(String val);

    public String getName() {
        return "Vehicle name : " + name;
    }

    public void setName(String val) {
        name = val;
    }
}

class Car extends Vehicle {
    private String name;

    public Car(String val) {
        setName(val);
    }

    public String getName(String val) {
        return "Car name : " + val;
    }

    public String getName(byte val[]) {
        return "Car name : " + val;
    }
}


public class Test {
    public static void main(String[] args) {
        Vehicle obj = new Car("Spark");
        System.out.print(obj.getName());
    }
}
