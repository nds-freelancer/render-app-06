package com.java.App.customer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    public Customer(long l, String string, String string2, String string3) {
		this.customerId = l;
		this.firstName = string;
		this.lastName = string2;
		this.email = string3;
	}

	private Long customerId;

    private String firstName;

    private String lastName;

    private String email;
}
