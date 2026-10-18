package ru.kutorov.MySecurity2DbThemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kutorov.MySecurity2DbThemeleaf.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
