package com.felipeParada.InventoryTLT.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long userId;

    @NotNull
    @NotBlank
    private String userName;

    @NotNull
    @NotBlank
    private String userFirstName;

    @NotNull
    @NotBlank
    private String userLastName;

    @NotNull
    @NotBlank
    private String userEmail;

    @NotNull
    @NotBlank
    private Long userContactNumber;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    private String createdUser;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    private String updatedUser;

    


/* 
    @OneToMany(mappedBy="user")
	private List<UserRole> userRoles;

*/
}
