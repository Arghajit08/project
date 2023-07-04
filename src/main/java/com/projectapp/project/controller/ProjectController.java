package com.projectapp.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import com.projectapp.project.entity.ProjectEntity;
import com.projectapp.project.repository.ProjectRepository;

@RestController
@RequestMapping("/task")
public class ProjectController {

    @Autowired
    private ProjectRepository ProjectRepository;

    @PostMapping("/reportvalidity")
    // @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> searchEntities(@RequestParam("test_id") Integer id,
            @RequestParam("result") Float result, @RequestParam("unit") String unit,
            @RequestParam("gender") String gender, @RequestParam("age") Integer age) {
        List<ProjectEntity> projectdata;
        projectdata = ProjectRepository.findByTestidAndGenderAndUnit(id, gender, unit);
        if (projectdata.size() == 0) {
            return ResponseEntity.badRequest().body("Invalid Report");
        }
        for (int i = 0; i < projectdata.size(); i++) {
            if ((projectdata.get(i).getAgefrom() <= age) && (projectdata.get(i).getAgeto() >= age)) {
                if (result > projectdata.get(i).getMaxresults()) {
                    return ResponseEntity.ok().body("High" + "->(" + projectdata.get(i).getName() + ")");
                }
                if (result < projectdata.get(i).getMinresults()) {
                    return ResponseEntity.ok().body("Low" + "->(" + projectdata.get(i).getName() + ")");
                }
                return ResponseEntity.ok().body("Normal" + "->(" + projectdata.get(i).getName() + ")");
            }
        }

        return ResponseEntity.badRequest().body("Age Not In Range");
        // return null;
    }
}
