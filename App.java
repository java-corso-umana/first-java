import java.util.*;

class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Vehicle a = new Car();
        // Vehicle b = new Motorcycle();

        Vehicle x;

        System.out.print("Seleziona il tipo di veicolo: C per car, M per moto: ");
        String option = sc.nextLine();
        System.out.print("Scegli un nome per il tuo veicolo: ");
        String name = sc.nextLine();
        if(option.equals("C")){
            x = new Car();
        }
        else {
            x = new Motorcycle();
        }
        x.setName(name);

        System.out.print("Accendo il motore del veicolo x \n");
        x.startEngine();

        Vehicle[] vehicles = {
            new Car(),
            new Motorcycle(),
            new Car() 
        };

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].startEngine();
        }

        // a.setName("batmobile");
        // b.setName("moto1");

        // a.startEngine();
        // b.startEngine();
    }

}