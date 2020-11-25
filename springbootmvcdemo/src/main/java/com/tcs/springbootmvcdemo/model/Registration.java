package com.tcs.springbootmvcdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.annotations.BatchSize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Registration {
	@Id
	@Column(length =20 )
	@Size(max=20, min =3 ,message = "first name is not valid")
	private String firstName;

	@Size(max=20, min =3 ,message = "last name is not valid")
	private String lastName;

	@Size(max=20, min =3 ,message = "address is not valid")
	private String address;

	@Size(max=20, min =3 ,message = "emailId is not valid")
	private String emailId;

}