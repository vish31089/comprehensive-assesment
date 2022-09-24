package com.example.patient;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.patient.entity.Patient;

@SpringBootTest
class PatientApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void test_AddDoctor() {
		Patient  doctorEntities = new Patient();
		doctorEntities.setId(2);
		doctorEntities.setName("Sanjay");
		doctorEntities.setVisitedDoctor("Gauri");
		doctorEntities.setDateOfVisit("2006-02-21");
		doctorEntities.setPrescription("Comman Cold");
	}
	

}
