import java.util.Scanner;

abstract class Vehicle {

    protected String name;
    private String model;
    private String color;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract void startEngine();
    // getters and setters ... 

    // Chiede le info all'utente riguardo gli attributi specifici e li salva nelle variabili
    public void fillInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("NOME: ");
        this.name = sc.nextLine();
        System.out.print("MODELLO: ");
        this.model = sc.nextLine();
        System.out.print("COLORE: ");
        this.color = sc.nextLine();
    }

    @Override
    public String toString() {
        return "\nNOME: " + this.name + "\n"; 
                // this.model != null ? ("MODELLO: " + this.model + "\n") : "";
                // "COLORE: " + this.color + "\n";
    }


}