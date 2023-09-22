
class Car extends Vehicle {
    private String plate;
    private int nWheels;

    @Override
    public void startEngine() {
        System.out.println("Giro la chiave dell'auto: " + this.name);
    }
}