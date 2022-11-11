import java.util.ArrayList;

/**
 * An appointment calendar.
 */
public class AppointmentCalendar {

    private ArrayList<Appointment> appointments;

    public AppointmentCalendar() {
        appointments = new ArrayList<>();
    }

    public void add(Appointment a) {
        appointments.add(a);
    }

    public ArrayList<Appointment> getAppointmentsForDay(AppointmentDate day) {
        ArrayList<Appointment> list = new ArrayList<>();
        for (Appointment appointment : appointments) {
            if (appointment.getDay().equals(day)) {
                list.add(appointment);
            }
        }
        return list;
    }

    public void cancel(Appointment a) {
        appointments.removeIf(i -> i.equals(a));

        //I had this but Intellij said what I had above could be replaced with Collections.removeIf
      /* for (Appointment i:appointments) {
         if (i.equals(a)){
            appointments.remove(i);
         }
      } */
    }


   /*
      Add additional code here.
   */
}