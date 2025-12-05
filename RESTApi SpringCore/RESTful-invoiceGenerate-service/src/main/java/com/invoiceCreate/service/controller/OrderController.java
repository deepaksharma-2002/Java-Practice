package com.invoiceCreate.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invoiceCreate.service.Entity.OrderTable;
import com.invoiceCreate.service.request.InvoiceV1Request;
import com.invoiceCreate.service.request.InvoiceV2Request;
import com.invoiceCreate.service.response.InvoiceResponse;
import com.invoiceCreate.service.services.OrderServie;

@RestController
@RequestMapping("/api")
public class OrderController {
	@Autowired
	OrderServie orderServie;
	
	@PostMapping("/insert")
	public ResponseEntity<String> insertVal(@RequestBody OrderTable orderTable) {
		String response = orderServie.insertData(orderTable);
		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/v1/invoice")
	public ResponseEntity<InvoiceResponse> generatefirst(@RequestBody InvoiceV1Request invoiceV1Request){
		InvoiceResponse response = orderServie.generateInvoivev1(invoiceV1Request);
		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/v2/invoice")
	public ResponseEntity<InvoiceResponse> generatefirsts(@RequestBody InvoiceV2Request invoiceV2Request){
		InvoiceResponse response = orderServie.generateInvoivev2(invoiceV2Request);
		return ResponseEntity.ok(response);
	}
}
