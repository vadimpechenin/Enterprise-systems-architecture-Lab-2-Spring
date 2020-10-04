package com.example.wokers_machines_l2.service;

import com.example.wokers_machines_l2.entity.Machine;
import com.example.wokers_machines_l2.repository.MachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Objects;

@Service
public class MachineService {
    @Autowired
    private final MachineRepository machineRepository;

    public MachineService(MachineRepository machineRepository){
        this.machineRepository = machineRepository;
    }

    public void createMachine(Machine machine){
        machineRepository.save(machine);
    }
}
