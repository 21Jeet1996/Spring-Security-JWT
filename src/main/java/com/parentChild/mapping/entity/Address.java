package com.parentChild.mapping.entity;

import org.hibernate.validator.constraints.NotEmpty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

/*@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor*/
@Entity
public class Address {

	@Id
	private String adressId;

	// @NotNull(message = "Name is mandatory")
	@NotEmpty(message = "addressLine1 is mandatory")
	private String addressLine1;

	@NotEmpty(message = "addressLine2 is mandatory")
	private String addressLine2;

	@NotEmpty(message = "City Name is mandatory")
	private String city;

	@NotEmpty(message = "State Name is mandatory")
	private String state;

	@NotEmpty(message = "Pin is mandatory")
	private String pin;

	// @OneToOne
	// @PrimaryKeyJoinColumn

	@OneToOne(targetEntity = OrderEntity.class)
	private OrderEntity orderEntity;

	public Address() {
		// super();
		// TODO Auto-generated constructor stub
	}

	public Address(String adressId, String addressLine1, String addressLine2, String city, String state, String pin,
			OrderEntity orderEntity) {
		super();
		this.adressId = adressId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.pin = pin;
		this.orderEntity = orderEntity;
	}

	public String getAdressId() {
		return adressId;
	}

	public void setAdressId(String adressId) {
		this.adressId = adressId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public OrderEntity getOrderEntity() {
		return orderEntity;
	}

	public void setOrderEntity(OrderEntity orderEntity) {
		this.orderEntity = orderEntity;
	}

}
