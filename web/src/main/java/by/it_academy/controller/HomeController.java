package by.it_academy.controller;

import by.it_academy.services.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/")
public class HomeController {

    public static final String MAIN = "cars";
    @Autowired
    ICarService carService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getCar(ModelMap map) {
        map.addAttribute("car",carService.getAllActiveCar());
        return MAIN;
    }
}
