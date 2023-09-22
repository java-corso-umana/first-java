

class App {

    public static void main(String[] args) {
        System.out.println("Ciao");

        Person x = new Person();
        Person y = new Person();

        x.setName("Andrea");
        y.setName("Mike");

        String a = x.getName();

        System.out.println(a);
    }

}