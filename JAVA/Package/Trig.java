package Package;

public class Trig {
    private int angle;

    public Trig(int angle) {
        this.angle = angle;
    }

    public double getSine() {
        return Math.sin(Math.toRadians(angle));
    }

    public double getCosine() {
        return Math.cos(Math.toRadians(angle));
    }

    public double getTangent() {
        return Math.tan(Math.toRadians(angle));
    }

    public double getSecant() {
        return 1 / getCosine();
    }

    public double getCosecant() {
        return 1 / getSine();
    }

    public double getCotangent() {
        return 1 / getTangent();
    }
}
