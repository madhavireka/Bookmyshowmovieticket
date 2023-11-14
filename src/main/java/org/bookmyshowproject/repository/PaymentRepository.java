package org.bookmyshowproject.repository;

import org.bookmyshowproject.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	public Payment findById(int id);

}
