package com.moviebooking.systemAdmin.multiplex;


import com.moviebooking.systemAdmin.city.City;
import jakarta.persistence.*;
import lombok.*;

import java.util.StringJoiner;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Multiplex {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String name;

    private String address;

    @ManyToOne
    @JoinColumn(name = "cityId")
    private City city;
}
