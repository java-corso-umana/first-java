
class Motorcycle extends Vehicle {
    private String injection;

    public Motorcycle(String name) {
        super(name);
    }

    // OVERLOADING
    public Motorcycle() {
        this("NOME DEFAULT");
    }

    // OVERRIDING
    @Override
    public void startEngine() {
        System.out.println("Giro la chiave della moto: " + this.name);
    }

    // OVERLOADING
    public void startEngine(int time) {
        System.out.println("Aspetto" + time + " secondi prima di girare la chiave della moto: " + this.name);
    }
}