package com.ola.springapi;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
@Controller
@Repository
@RestController


@Component
public class CarManager {
    private List<Car> carList;

    public CarManager() {
        this.carList = new ArrayList<>();
        carList.add(new Car("Passat", "VW"));
        carList.add(new Car("Tusson", "Hyundai"));
    }

    public CarManager(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> getCarList() {
        return carList;
    }
    public boolean addCar(Car car){
        return carList.add(car);

    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
