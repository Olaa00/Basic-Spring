package com.ola.springapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CarApi {

    private CarManager carManager;

    @Autowired
    public CarApi (CarManager carManager){
        this.carManager = carManager;
    }

    @GetMapping("/say")
     public String main(@RequestParam String name){
        return "Hello " + name;

}
    @GetMapping("/hello")
    public String tellMe(){
        return "hello";

    }
    @GetMapping ("/all")
    public List<Car> getCars(){
        return carManager.getCarList();
    }
    @PostMapping("/add")
    public boolean addCar(@RequestBody  Car car){
        return carManager.addCar(car);
    }
}
