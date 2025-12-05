package com.invoiceCreate.service.response;

public class InvoiceResponse {
	   private int invoiceId;  
	    private String itemName;
	    private String description;
	    private int quantity;
	    private double totalPrice;
	    
		public InvoiceResponse() {
			super();
			// TODO Auto-generated constructor stub
		}

		public InvoiceResponse(int invoiceId, String itemName, String description, int quantity, double totalPrice) {
			super();
			this.invoiceId = invoiceId;
			this.itemName = itemName;
			this.description = description;
			this.quantity = quantity;
			this.totalPrice = totalPrice;
		}

		public int getInvoiceId() {
			return invoiceId;
		}

		public void setInvoiceId(int invoiceId) {
			this.invoiceId = invoiceId;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public double getTotalPrice() {
			return totalPrice;
		}

		public void setTotalPrice(double totalPrice) {
			this.totalPrice = totalPrice;
		}
		
		
	    
	    
	    
}
