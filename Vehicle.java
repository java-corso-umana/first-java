
abstract class Vehicle {

    protected String name;
    private String model;
    private String color;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract void startEngine();
    // getters and setters ... 
}