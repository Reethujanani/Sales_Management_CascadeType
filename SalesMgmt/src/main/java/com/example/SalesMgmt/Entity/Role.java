package com.example.SalesMgmt.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "role_name")
    private String roleName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id_fk",referencedColumnName = "id")
    private User user;

}
