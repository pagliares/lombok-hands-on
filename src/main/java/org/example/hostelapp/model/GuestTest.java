package org.example.hostelapp.model;

public class GuestTest {
    public static void main(String[] args) {
        Guest guest = new Guest();
        guest.setId(1L);
        guest.setName("Tom");
        guest.setLastName("Sawyer");
        guest.setEmail("sawyer@twain.com");

        System.out.println(guest);
    }
}
