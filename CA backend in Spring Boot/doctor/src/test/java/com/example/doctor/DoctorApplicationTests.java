package com.example.doctor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.doctor.entity.Doctor;
import com.example.doctor.repository.DoctorRepository;

@SpringBootTest
class DoctorApplicationTests {

	@Test
	void contextLoads() { 
		
	}
		@Test
		public void test_AddDoctor() {
			Doctor  doctorEntities = new Doctor();
			doctorEntities.setId(6);
			doctorEntities.setName("Gauri");
			doctorEntities.setGender("Female");
			doctorEntities.setSpecialist("Child");
			doctorEntities.setNumberOfPatients(12);
			doctorEntities.setAge(22);
		
	}
	
	
	

}
