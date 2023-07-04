package com.projectapp.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.projectapp.project.entity.ProjectEntity;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer> {
    List<ProjectEntity> findByTestidAndGenderAndUnit(Integer testid, String gender, String unit);
}
