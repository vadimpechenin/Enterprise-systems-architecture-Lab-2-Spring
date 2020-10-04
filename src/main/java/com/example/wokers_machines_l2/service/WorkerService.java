package com.example.wokers_machines_l2.service;

import com.example.wokers_machines_l2.entity.Worker;
import com.example.wokers_machines_l2.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Objects;
import java.util.List;

@Service
public class WorkerService {
    @Autowired
    private final WorkerRepository workerRepository;

    public WorkerService(WorkerRepository workerRepository){
        this.workerRepository = workerRepository;
    }

    public void createWorker(Worker worker) {
        workerRepository.save(worker);
    }

}
