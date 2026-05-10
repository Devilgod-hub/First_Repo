import java.text.SimpleDateFormat;
import java.util.Date;
public class Main{
        public static void main(String[] args){
        Date var1 = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

        String date = dateFormat.format(var1);
        String time = timeFormat.format(var1);

        System.out.println("This is a normal java app that shows current Date: " + date);
        System.out.println("This is current Time: " + time);
        }
}
