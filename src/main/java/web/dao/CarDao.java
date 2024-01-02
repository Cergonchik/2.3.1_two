package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public interface CarDao {
    public List<Car> showCarsCount(int count);
}
