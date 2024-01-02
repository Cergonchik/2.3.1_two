package web.model;

public class Car {

    private String model;
    private String series;
    private int carYear;

    public Car(String model, String series, int carYear) {
        this.model = model;
        this.series = series;
        this.carYear = carYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }
}
