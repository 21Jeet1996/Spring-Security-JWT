package com.parentChild.mapping.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

/*@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor*/
@Entity
public class Order {

	@Id
	private String orderId;

	private String productName;

	private String productQuntity;

	private String productType;

	private double productPrice;

	@OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "adress_Id", referencedColumnName = "adressId")
	public Address address;

	public Order() {
		/// super();
		// TODO Auto-generated constructor stub
	}

	public Order(String orderId, String productName, String productQuntity, String productType,
			double productPrice, Address address) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.productQuntity = productQuntity;
		this.productType = productType;
		this.productPrice = productPrice;
		this.address = address;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductQuntity() {
		return productQuntity;
	}

	public void setProductQuntity(String productQuntity) {
		this.productQuntity = productQuntity;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
