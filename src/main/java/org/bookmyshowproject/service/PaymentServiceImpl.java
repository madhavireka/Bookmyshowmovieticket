package org.bookmyshowproject.service;

import org.bookmyshowproject.model.Payment;
import org.bookmyshowproject.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	public PaymentRepository paymentserviceRepository;

	@Override
	public Payment addPayment(Payment payment) {

		return paymentserviceRepository.saveAndFlush(payment);
	}

	@Override
	public int getId(int id) {
		// TODO Auto-generated method stub
		return id;
	}

	// @Override
	/*
	 * public String getPaymentMethod(String paymentMethod) {
	 * 
	 * return
	 * paymentserviceRepository.findByPaymentMethod(paymentMethod).getPaymentMethod(
	 * ); }
	 */

}
