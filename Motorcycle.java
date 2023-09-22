
class Motorcycle extends Vehicle {
    private String injection;

    @Override
    public void startEngine() {
        System.out.println("Giro la chiave della moto: " + this.name);
    }
}