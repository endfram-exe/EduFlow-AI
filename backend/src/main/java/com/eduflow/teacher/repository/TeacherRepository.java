package com.eduflow.teacher.repository;

import com.eduflow.teacher.domain.Teacher;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, UUID> {
}
