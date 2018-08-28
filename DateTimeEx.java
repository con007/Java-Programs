import java.time.*;
import java.time.temporal.*;
public class DateTimeEx{
	public static void main(String ar[]){
		LocalDate today=LocalDate.now();
		LocalDate bday=LocalDate.of(1995,12,30);
		LocalDate rdate=LocalDate.of(2018,7,17);
		Period p=Period.between(bday,today);
		System.out.println("Age is");
		System.out.println("years: "+p.getYears());
		System.out.println("Months: "+p.getMonths());
		System.out.println("Days: "+p.getDays());
		long delay=ChronoUnit.DAYS.between(rdate,today);
		System.out.println("Delay in Days: "+delay);
		// LocalDate Id=LocalDate.now();
		// System.out.println(Id);
		// MonthDay md=MonthDay.now();
		// System.out.println(md);
		// YearMonth ym=YearMonth.now();
		// System.out.println(ym);
		// int y=2018,m=12,d=30;
		// Id=LocalDate.of(y,m,d);
		// System.out.println(Id);
		// LocalDateTime ldt=LocalDateTime.now();
		// System.out.println(ldt);
		// System.out.println("Month="+ldt.getMonth());
		// System.out.println("Year="+ldt.getYear());
		// System.out.println("Day="+ldt.getDayOfMonth());
	}
}