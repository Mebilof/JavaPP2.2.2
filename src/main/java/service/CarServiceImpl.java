package service;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    private static final List<Car> myCars;

    static{
        myCars =  new ArrayList<>();
        myCars.add(new Car("Michael Scott","Silver Sebring", 2004));
        myCars.add(new Car("Dwight Schrute", "Trans Am", 1987));
        myCars.add(new Car("Jim Halpert", "Silver Saab", 2005));
        myCars.add(new Car("Pam Beesly", "Toyota Yaris", 1999));
        myCars.add(new Car("Ryan Howard", "Honda Civic", 1979));
    }

    @Override
    public List<Car> getCars(int num) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < Math.min(num, myCars.size()); i++) {
            carList.add((Car) myCars.get(i));
        }
        return carList;
    }
}
