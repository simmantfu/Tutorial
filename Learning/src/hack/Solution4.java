package hack;
import java.util.Calendar;
import java.util.Scanner;

public class Solution4 {

	public static String getDay(String day1, String month2, String year3) {
		Calendar cal = Calendar.getInstance();

		int day=Integer.parseInt(day1);
	    int month=Integer.parseInt(month2);
	    int year=Integer.parseInt(year3);
		
        if(month==1){
            cal.set(year,0,day);
        }else{
            cal.set(year,month-1,day);
        }

        int dow = cal.get(Calendar.DAY_OF_WEEK);

        switch (dow) {
        case 1:
            return "SUNDAY";
        case 2:
            return "MONDAY";
        case 3:
            return "TUESDAY";
        case 4:
            return "WEDNESDAY";
        case 5:
            return "THURSDAY";
        case 6:
            return "FRIDAY";
        case 7:
            return "SATURDAY";
        default:
            System.out.println("Not valid date");
        }

        return null;
    }
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String month = in.next();
	        String day = in.next();
	        String year = in.next();
	        
	        System.out.println(getDay(day, month, year));
	    }
	}