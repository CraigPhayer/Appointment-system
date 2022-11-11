/**
   An appointment date.
*/
public class AppointmentDate
{  
   private int year;
   private int month;
   private int day;

   public AppointmentDate(String line) {
      String[] str = line.split("/");
      this.day = Integer.parseInt(str[0]);
      this.month = Integer.parseInt(str[1]);
      this.year = Integer.parseInt(str[2]);
   }

   public String toString(){
      return day + "/" + month + "/" + year;
   }

   public int getDay() {
      return day;
   }


   public boolean equals(AppointmentDate date){
      return day == date.getDay();
   }

   /*
   Add additional code here
   */
}