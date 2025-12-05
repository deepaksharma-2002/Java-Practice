package com.invoiceCreate.service.request;

public class InvoiceV2Request {
	private int orderId;
    private double gst;
    
    
    
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
    
    
}
