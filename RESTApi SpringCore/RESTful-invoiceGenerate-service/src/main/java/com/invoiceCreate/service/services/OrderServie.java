package com.invoiceCreate.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoiceCreate.service.Entity.OrderTable;
import com.invoiceCreate.service.exception.ProductNotFoundException;
import com.invoiceCreate.service.repository.OrderDao;
import com.invoiceCreate.service.request.InvoiceV1Request;
import com.invoiceCreate.service.request.InvoiceV2Request;
import com.invoiceCreate.service.response.InvoiceResponse;

@Service
public class OrderServie {
	
	@Autowired
	OrderDao orderDao;
	
	public String insertData(OrderTable orderTable) {
		// TODO Auto-generated method stub
		orderDao.insetVal(orderTable);
		return "Insert Successfull!!!!!";
	}

	public InvoiceResponse generateInvoivev1(InvoiceV1Request invoiceV1Request) {
		// TODO Auto-generated method stub
		OrderTable order = orderDao.findBtId(invoiceV1Request.getOrderId());
		
		if (order == null) {
		     throw new ProductNotFoundException("OrderId " + invoiceV1Request.getOrderId() + " not found");
		}
		
		
		double base = order.getAmount();
		double tax = base * (invoiceV1Request.getStateVat() + invoiceV1Request.getCentralVat())/100;
		double total = base + tax;
		return new InvoiceResponse(
									order.getOrderId(),
									order.getName(),
									order.getDescription(),
									order.getQuantity(),
									total
									);
		
		
	}

	public InvoiceResponse generateInvoivev2(InvoiceV2Request req) {
		// TODO Auto-generated method stub
		OrderTable order = orderDao.findBtId(req.getOrderId());
		
//		if(order == null) {
//			return new InvoiceResponse(0, "product Not found","null", 0, 0);
//		}
		
		  if (order == null) {
		        throw new ProductNotFoundException("OrderId " + req.getOrderId() + " not found");
		    }
		
		double base = order.getAmount();
		double tax = base * (req.getGst()/100);
		double total = base + tax;
		
		return new InvoiceResponse(
									order.getOrderId(),
									order.getName(),
									order.getDescription(),
									order.getQuantity(),
									total
									
									);
	}
}	