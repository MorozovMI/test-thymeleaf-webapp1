package ru.morozov.testthymeleafwebapp.dao;

import ru.morozov.testthymeleafwebapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
