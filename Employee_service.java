package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class Employee_service {
    @Autowired

    private EmployeeRepo repo;

    public List<Employee> listAll() {
        return repo.findAll();
    }

    public void Save(Employee employee) {
        repo.save(employee);
    }

    public Employee get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }

}
