public class Car {
    private int code;
    private Route fixedRoute;
    private double maxCap;

    public Car(int code, Route fixedRoute, double maxCap) {
        this.code = code;
        this.fixedRoute = fixedRoute;
        this.maxCap = maxCap;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Route getFixedRoute() {
        return fixedRoute;
    }

    public void setFixedRoute(Route fixedRoute) {
        this.fixedRoute = fixedRoute;
    }

    public double getMaxCap() {
        return maxCap;
    }

    public void setMaxCap(double maxCap) {
        this.maxCap = maxCap;
    }
}
