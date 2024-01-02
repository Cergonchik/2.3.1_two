package web.servise;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
@Component
public interface CarService {
    public List<Car> getCars(int count);
}
