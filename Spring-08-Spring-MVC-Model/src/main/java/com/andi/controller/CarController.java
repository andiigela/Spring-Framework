package com.andi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {

    @RequestMapping("/info")
    public String carInfo(@RequestParam String make, @RequestParam Integer year,Model model) {
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        System.out.println(make);
        System.out.println(year);
        return "car/car-info";
    }
    @RequestMapping("/info2")
    public String carInfo2(@RequestParam(defaultValue = "Tesla", required = false) String make,
                           @RequestParam(required = false) Integer year,Model model) {
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        System.out.println(make);
        System.out.println(year);
        return "car/car-info";
    }
    @RequestMapping("/info/{make}/{year}")
    public String getCarInfo(@PathVariable String make,@PathVariable Integer year, Model model) {
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        return "car/car-info";
    }
}
