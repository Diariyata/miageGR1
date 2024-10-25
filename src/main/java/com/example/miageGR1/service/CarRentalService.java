package com.example.miageGR1.service;

import com.example.miageGR1.data.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CarRentalService {

    private List<Car> cars = new ArrayList<>();

    public CarRentalService() {
        cars.add(new Car("11AA22", 1000));
        cars.add(new Car("33CCDD", 3000));
        cars.add(new Car("22BB33", 2000));
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public void rentOrGetBackCar(String plateNumber, boolean rent) throws Exception {
        Iterator<Car> carIterator = cars.iterator();
        Car carFounded = null;
        while(carIterator.hasNext() && (carFounded=carIterator.next()).getPlateNumber().equals(plateNumber)==false){
        }
        if (carFounded != null) { // voiture trouvée
            carFounded.setRented(rent);
        } else {
            throw new Exception("Car does not exist");
        }
    }
}
