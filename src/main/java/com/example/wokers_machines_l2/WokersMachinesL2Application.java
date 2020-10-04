package com.example.wokers_machines_l2;
// Мысли взяты с https://java-master.com/spring-boot-%D0%BF%D1%80%D0%B8%D0%BC%D0%B5%D1%80-%D1%81-postgres-%D0%B8-jpa/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.wokers_machines_l2.entity.Worker;
import com.example.wokers_machines_l2.entity.Machine;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.wokers_machines_l2.service.MachineService;
import com.example.wokers_machines_l2.service.WorkerService;

@SpringBootApplication
public class WokersMachinesL2Application {

	@Autowired
	private WorkerService workerService;

	public static void main(String[] args) {
		SpringApplication.run(WokersMachinesL2Application.class, args);
	}


}
