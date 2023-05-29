package agregacija_primjer4;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        FleetVehicles flt = new FleetVehicles();
        // Kreirajte tri objekta klase Vehicles korištenjem pripadnog konstruktora
        Vehicle v1 = new Vehicle("BMW", "X5", 1, "ZG-1234-AB", "2015");
        Vehicle v2 = new Vehicle("Audi", "A4", 2, "ZG-4321-BA", "2016");
        Vehicle v3 = new Vehicle("Mercedes", "C", 3, "ZG-1111-CC", "2017");
        ArrayList<Vehicle> vhl1 = new ArrayList<>();
        // Kreirajte nova tri objekta klase Vehicles korištenjem pripadnog konstruktora --> ti objekti idu u novu listu
        Vehicle v4 = new Vehicle("VW", "Golf", 4, "ZG-2222-DD", "2018");
        Vehicle v5 = new Vehicle("VW", "Passat", 5, "ZG-3333-EE", "2019");
        Vehicle v6 = new Vehicle("VW", "Polo", 6, "ZG-4444-FF", "2020");
        ArrayList<Vehicle> vhl2 = new ArrayList<>();

        // Dodajte prva tri objekta klase Vehicles u listu vhl1
        vhl1.add(v1);
        vhl1.add(v2);
        vhl1.add(v3);

        // Postavite ta vozila u vozni park tvrtke
        flt.setVehList(vhl1);

        // Izlistaje sva vozila u voznom parku tvrtke
        System.out.println("///////////////// First listing /////////////////");
        for (Vehicle v : flt.getVehicles()) {
            System.out.println(v);
        }

        System.out.println(); // dodano samo za prazni red

        // Dodajte druga tri objekta klase Vehicles u drugu listu
        vhl2.add(v4);
        vhl2.add(v5);
        vhl2.add(v6);

        // Postavite ta vozila u vozni park tvrtke
        flt.setVehList(vhl2);

        System.out.println("///////////////// Snd listing /////////////////");

        // Izlistajte sada sva vozila u voznom parku tvrtke
        for (Vehicle v : flt.getVehicles()) {
            System.out.println(v);
        }


    }

}
