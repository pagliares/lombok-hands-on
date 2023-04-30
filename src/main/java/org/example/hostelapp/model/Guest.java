package org.example.hostelapp.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Guest {
    private Long id;
    // @Setter(value= AccessLevel.NONE)
    private String name;
    private String lastName;
    private String email;
}
