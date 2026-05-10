import java.text.SimpleDateFormat;
import java.util.Date;
public class Main{
        public static void main(String[] args){
        Date todaysdate = new Date();
        SimpleDateFormat FormattedDate = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("This is a normal java app that shows current Date: " +FormattedDate.format(todaysdate));
    }
}
