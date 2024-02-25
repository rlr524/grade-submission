package com.emiyaconsulting.gradesubmission.grade;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {
    /**
     * @param model representing the Grade model
     * @return a string containing the name of the template that is rendered
     */
    @GetMapping("/grades")
    public String getGrades(Model model) {
        Grade madiGrade = new Grade("Madison", "English", "A-");
        model.addAttribute("madigrade", madiGrade);
        Grade liviGrade = new Grade("Olivia", "Math", "B-");
        model.addAttribute("livigrade", liviGrade);
        Grade madiGradeBiology = new Grade(
                "Madison is getting a spanking", "Biology", "A");
        model.addAttribute("madigradebio", madiGradeBiology);
        Grade madiGradePhysics = new Grade("Madison", "Physics", "B");
        model.addAttribute("madigradephysics", madiGradePhysics);
        return "grades";
    }
}
