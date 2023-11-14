package org.bookmyshowproject.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.bookmyshowproject.model.Payment;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PaymentAspect {
	@Before("execution(* org.bookmyshow.service.PaymentService.addPayment(org.bookmyshow.model.Payment)) && args(payment)")
	public void beforeAddPayment(Payment payment) {
		System.out.println("Payment Method :" + payment.getPaymentMethod());

	}

}
