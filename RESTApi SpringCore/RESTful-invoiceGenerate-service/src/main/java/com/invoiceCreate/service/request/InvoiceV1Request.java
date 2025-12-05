package com.invoiceCreate.service.request;

public class InvoiceV1Request {
	 private int orderId;
	 private double stateVat;
	 private double centralVat;
	 
	 
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getStateVat() {
		return stateVat;
	}
	public void setStateVat(double stateVat) {
		this.stateVat = stateVat;
	}
	public double getCentralVat() {
		return centralVat;
	}
	public void setCentralVat(double centralVat) {
		this.centralVat = centralVat;
	}
	 
	 
}
