package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.dao.CarDao;

import java.util.List;

@Component
public class CarServiselmpl implements CarService {
    private final CarDao carDao;
    @Autowired
    public CarServiselmpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCarsCount(count);
    }
}
