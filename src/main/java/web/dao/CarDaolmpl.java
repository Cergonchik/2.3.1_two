package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class CarDaolmpl implements CarDao {
    private List<Car> carList = new ArrayList<>();

    public CarDaolmpl() {
        carList.add(new Car("BMW", "3", 2000));
        carList.add(new Car("BMW", "5", 2001));
        carList.add(new Car("Opel", "Astra", 2002));
        carList.add(new Car("Porsche", "911", 2004));
        carList.add(new Car("Mercedes", "s600", 2005));
    }

    @Override
    public List<Car> getCarsCount(int count) {
        List<Car> carListCount;
        if (count > 0 && count < 5) {
            carListCount = carList.stream().limit(count).toList();
        } else {
            return carList;
        }
        return carListCount;
    }

}
