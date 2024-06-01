package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "security")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "security_id", nullable = false)
    private Long securityId;

    @Column(name = "name", nullable = false)
    private String name;

   @Column(name = "purchaseDate", nullable = false)
   private String purchaseDate;

    @Column(name = "purchasePrice", nullable = false)
    private Double purchasePrice;

    @Column(name = "quantity", nullable = false)
    private Double quantity;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false, unique = true)
    private Set<Client> client;

}
