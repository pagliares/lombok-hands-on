package org.example.hostelapp.model;

import lombok.*;

//@ToString(onlyExplicitlyIncluded = true)

//@AllArgsConstructor
//@RequiredArgsConstructor
//@NoArgsConstructor
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//@ToString()
//@Getter
//@Setter

@Builder
@Data
public class Guest {
    // @ToString.Exclude
    // @ToString.Include
    // @EqualsAndHashCode.Include
    // @NonNull
    private Long id;
    // @Setter(value= AccessLevel.NONE)
    //@ToString.Include
    @EqualsAndHashCode.Include
    private String name;
    private String lastName;
    private String email;
}
