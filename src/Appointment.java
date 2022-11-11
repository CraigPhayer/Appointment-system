/**
 * An appointment.
 */
public class Appointment {
    private String description;
    private AppointmentDate day;
    private AppointmentTime from;
    private AppointmentTime to;

    public Appointment(String line) {
        String[] str = line.split("\\s");
        this.description = str[0];
        this.day = new AppointmentDate(str[1]);
        this.from = new AppointmentTime(str[2]);
        this.to = new AppointmentTime(str[3]);
    }

    public String format() {
        return "Description: " + description + "\n" +
                "Date: " + day.toString() + "\n" +
                "From: " + from.toString() + "\nTo:   " + to.toString();

    }

    public AppointmentDate getDay() {
        return day;
    }

   /*
      Add additional code here
   */

}
