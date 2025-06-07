package com.andi.controller;
import com.andi.model.Gender;
import com.andi.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MentorController {
    @RequestMapping("/mentors")
    public String showMentors(Model model){
        Mentor m1 = new Mentor("Mike", "Smith", 48, Gender.MALE);
        Mentor m2 = new Mentor("Tom", "Hanks", 65, Gender.MALE);
        Mentor m3 = new Mentor("Ammy", "Bryan", 25, Gender.FEMALE);
        List<Mentor> mentors = Arrays.asList(m1, m2, m3);
        model.addAttribute("mentors", mentors);
        return "mentor/mentor-list";
    }
}
