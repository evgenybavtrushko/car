package by.it_academy.controller;

import by.it_academy.entities.Car;
import by.it_academy.services.ICarService;
import by.it_academy.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    ICarService carService;

    @RequestMapping(value = "/form/{id}", method = RequestMethod.GET)
    public String createOrderForm(@PathVariable("id") Long id, ModelMap map) {
        map.addAttribute("car" ,carService.get(id));
        return "orderForm";
    }

}
