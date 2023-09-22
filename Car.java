import java.util.Scanner;

class Car extends Vehicle {
    private String plate;
    private int nWheels;

    @Override
    public void startEngine() {
        System.out.println("Giro la chiave dell'auto: " + this.name);
    }

    // richiama la versione del padre e aggiunge la compilazione delle proprie variabili
    @Override
    public void fillInfo() {
        super.fillInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("TARGA: ");
        this.plate = sc.nextLine();
        System.out.print("NUMERO RUOTE: ");
        this.nWheels = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() +
                "TARGA: " + this.plate + "\n" +
                "NUMERO RUOTE: " + this.nWheels + "\n";
    }
}