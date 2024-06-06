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

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long userId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDateTime;

    @NotNull
    @NotBlank
    private String createdUser;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDateTime;

    private String lastModifiedUser;

    @NotNull
    @NotBlank
    private Long userContactNumber;

    @NotNull
    @NotBlank
    private String userEmail;

    @NotNull
    @NotBlank
    private String userFirstName;

    @NotNull
    @NotBlank
    private String userLastName;

    @NotNull
    @NotBlank
    private String userName;
/* 
    @OneToMany(mappedBy="user")
	private List<UserRole> userRoles;


public UserRole addUserRole(UserRole userRole) {
		getUserRoles().add(userRole);
		userRole.setUser(this);

		return userRole;
	}

	public UserRole removeUserRole(UserRole userRole) {
		getUserRoles().remove(userRole);
		userRole.setUser(null);

		return userRole;
	}

*/
}
