package com.nxzgroup.intern.repository;

import java.util.List;
import com.nxzgroup.intern.model.Student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByFirstName(String firstName);

}