package yvettecodes.example.javasystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yvettecodes.example.javasystem.model.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Integer> {
}
