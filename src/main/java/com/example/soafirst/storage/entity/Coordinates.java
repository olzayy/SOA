package com.example.soafirst.storage.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "coordinates", schema = "public")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Coordinates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    @NotNull
    private Float x;

    @Column
    @NotNull
    private Long y;
}
