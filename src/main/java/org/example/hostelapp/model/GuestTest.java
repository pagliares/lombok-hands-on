package org.example.hostelapp.model;

public class GuestTest {
    public static void main(String[] args) {

        Guest guestBuilder = Guest.builder()
                .id(5L)
                .name("Alice")
                .lastName("Giffoni")
                .email("alice@wonderland.com")
                .build();

        System.out.println(guestBuilder);


//        Guest guest = new Guest();
//        guest.setId(1L);
//        guest.setName("Tom");
//        guest.setLastName("Sawyer");
//        guest.setEmail("sawyer@twain.com");

//        Guest guest2 = new Guest();
//        guest2.setId(1L);
//        guest2.setName("Huckleberry");
//        guest2.setLastName("Sawyer");
//        guest2.setEmail("sawyer@twain.com");

//        System.out.println(guest.equals(guest2));
    }
}
