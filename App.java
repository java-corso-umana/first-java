import java.util.*;

class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Vehicle a = new Car();
        // Vehicle b = new Motorcycle();

        Vehicle x;

        System.out.print("Seleziona il tipo di veicolo: C per car, M per moto: ");
        String option = sc.nextLine();
        System.out.print("NOME VEICOLO: ");
        String name = sc.nextLine();
        if(option.equals("C")){
            System.out.print("TARGA: ");
            String plate = sc.nextLine();
            x = new Car(name, plate);
        }
        else {
            x = new Motorcycle();
        }
        System.out.print(x);
        // x.fillInfo();

        // System.out.print("Accendo il motore del veicolo x \n");
        // x.startEngine();

        // Vehicle[] vehicles = {
        //     new Car(),
        //     new Motorcycle(),
        //     new Car() 
        // };

        // for (int i = 0; i < vehicles.length; i++) {
        //     vehicles[i].startEngine();
        // }

        // a.setName("batmobile");
        // b.setName("moto1");

        // a.startEngine();
        // b.startEngine();
    }

}