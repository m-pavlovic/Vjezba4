package agregacija_primjer4;

import java.util.ArrayList;

public class FleetVehicles {

    private String company;
    private int compID;

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    // Getters and setters

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCompID() {
        return compID;
    }

    public void setCompID(int compID) {
        this.compID = compID;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }


    // Metoda koja kreira i puni listu objekata Vehicle
    public void generateVehicles() {
        ArrayList<Vehicle> vhcls = new ArrayList<>();
        Vehicle v1 = new Vehicle("BMW", "X5", 1, "ZG-1234-AB", "2015");
        Vehicle v2 = new Vehicle("Audi", "A4", 2, "ZG-4321-BA", "2016");
        Vehicle v3 = new Vehicle("Mercedes", "C", 3, "ZG-1111-CC", "2017");
        Vehicle v4 = new Vehicle("VW", "Golf", 4, "ZG-2222-DD", "2018");
        vhcls.add(v1);
        vhcls.add(v2);
        vhcls.add(v3);
        vhcls.add(v4);
    }

    public void setVehList(ArrayList<Vehicle> vhcls) {

        // Ako je this.vehicles prazna kreiraj je iz ulazne liste
        if (this.vehicles.isEmpty()) {
            this.vehicles = vhcls;
        } else {
            // U suprotnom čitaj element po element ulazne liste i dodavaj u postojeću this.vehicles
            for (Vehicle v : vhcls) {
                this.vehicles.add(v);
            }
        }

    }

    // Metoda koja će izlistati cijelu listu dajući info svakog objeka Vehicle u listi


    public void listAllVehicles() {

        // Npr. koristite for each
        for (Vehicle v : this.vehicles) {
            System.out.println("Brand: " + v.getBrandName() + ", Model: " + v.getModel() + ", ID: " + v.getVehID()
                    + ", Registration plate: " + v.getVehRegistrationPlate() + ", Year: " + v.getProdYear());
        }

    }
}