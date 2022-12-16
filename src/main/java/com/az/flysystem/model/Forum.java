package com.az.flysystem.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.NoSuchElementException;
@Entity(name = "forum")
@Table(name = "forum",uniqueConstraints = {@UniqueConstraint(columnNames = "cancelKey")})
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Forum {


    @Id
    @GeneratedValue
    private Long id;
    private String fromWhere;
    private String whereTo;
    private int comeDate;
    private int comeBackDate;
    private int cancelKey;


}
