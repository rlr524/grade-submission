package com.emiyaconsulting.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {
    @GetMapping("/grades")
    public String getGrades(Model model) {
        Grade madisonEnglish = new Grade("Madison", "English", "A-");
        model.addAttribute("madisonEnglish", madisonEnglish);

        Grade oliviaMath = new Grade("Olivia", "Math", "C");
        model.addAttribute("olivaMath", oliviaMath);
        return "grades";
    }
}
