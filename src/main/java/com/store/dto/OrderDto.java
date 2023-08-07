package com.store.dto;

public class OrderDto {

	private Integer orderId;
	private Integer cakeId;
	private Integer number;
	private String cakeName;
	private String customer;
	private String phone;
	private String address;
	private String dateShip;
	private String dateOrder;
	
	private String status;

	
	
	public String getCakeName() {
		return cakeName;
	}
	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getCakeId() {
		return cakeId;
	}
	public void setCakeId(Integer cakeId) {
		this.cakeId = cakeId;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getDateShip() {
		return dateShip;
	}
	public void setDateShip(String dateShip) {
		this.dateShip = dateShip;
	}
	public String getDateOrder() {
		return dateOrder;
	}
	public void setDateOrder(String dateOrder) {
		this.dateOrder = dateOrder;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
}
