package patterns.generative.builder.withdirector;

public class Car {
    private String body;
    private String paint;
    private String chassis;
    private  String interior;

    public Car() {
    }

    public Car(String chassis, String body, String paint, String interior) {
        this.body = body;
        this.paint = paint;
        this.chassis = chassis;
        this.interior = interior;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPaint() {
        return paint;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public boolean doQualityCheck() {
        return (chassis != null && !chassis.trim().isEmpty()) && (body != null && !body.trim().isEmpty())
                && (paint != null && !paint.trim().isEmpty()) && (interior != null && !interior.trim().isEmpty());
    }

    @Override
    public String toString() {
        // StringBuilder class also uses Builder Design Pattern with implementation of java.lang.Appendable interface
        StringBuilder builder = new StringBuilder();
        builder.append("Car [chassis=").append(chassis).append(", body=").append(body).append(", paint=").append(paint);
        return builder.toString();
    }
}
