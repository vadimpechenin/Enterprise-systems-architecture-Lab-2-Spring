package com.example.wokers_machines_l2.repository;

import com.example.wokers_machines_l2.entity.Machine;
import org.springframework.data.jpa.repository.JpaRepository;

//import java.util.List;

public interface MachineRepository extends JpaRepository<Machine, Long> {
    //List<Machine> findAllByName(String type);


}
