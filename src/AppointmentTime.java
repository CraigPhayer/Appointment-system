/**
 * An appointment time.
 */
public class AppointmentTime {
    private int hours;
    private int minutes;

    public AppointmentTime(String line) {
        String[] str = line.split(":");
        this.hours = Integer.parseInt(str[0]);
        this.minutes = Integer.parseInt(str[1]);
    }

    public String toString() {
        return hours + ":" + minutes;
    }



   /*
     Add additional code here 
       */

}