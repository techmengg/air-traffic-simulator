public class Airplane {
    private static int numPlayers = 0;
    private String callSign;
    private double distance;
    private int bearing;
    private int altitude;

    public Airplane() {
        this.callSign = "P" + (++numPlayers);
        this.distance = 0.0;
        this.bearing = 0;
        this.altitude = 0;
    }

    public Airplane(String callSign, double distance, int bearing, int altitude) {
        this.callSign = callSign;
        this.distance = distance;
        this.bearing = bearing;
        this.altitude = altitude;
    }

    public String getCallSign() {
        return callSign;
    }

    public double getDistance() {
        return distance;
    }

    public int getBearing() {
        return bearing;
    }

    public int getAltitude() {
        return altitude;
    }

    public double distTo(Airplane other) {
        // Implement distance calculation between two airplanes
        return Math.sqrt(Math.pow(this.distance - other.distance, 2));
    }

    public void move(double distance, int bearing) {
        // Implement airplane movement
        // This method should update the airplane's distance and bearing
    }

    public void gainAlt() {
        // Implement altitude increase
        // This method should increase the airplane's altitude
    }

    public void loseAlt() {
        // Implement altitude decrease
        // This method should decrease the airplane's altitude
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "callSign='" + callSign + '\'' +
                ", distance=" + distance +
                ", bearing=" + bearing +
                ", altitude=" + altitude +
                '}';
    }
    public int getAlt() {
        return altitude;
    }

}



