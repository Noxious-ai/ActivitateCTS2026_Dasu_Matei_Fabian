package ro.ase.cts.main;

import ro.ase.cts.clase.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = Hotel.getInstance("Intercontinental", 50, 10);
        hotel.rezeraCamera();
        hotel.rezeraCamera();
        hotel.afiseazaDetaliiHotel();

        Hotel hotel2 = Hotel.getInstance("Continental", 10, 5);
        hotel2.rezeraCamera();
        hotel2.rezeraCamera();

        hotel2.afiseazaDetaliiHotel();
    }
}