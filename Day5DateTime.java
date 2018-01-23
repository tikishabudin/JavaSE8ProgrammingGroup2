import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.time.*;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;

public class Day5DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		System.out.println(today);
		
		GregorianCalendar gDate = new GregorianCalendar(1973,5,10);
		Date dob = new Date(gDate.getTimeInMillis());
		
		Locale vietnam = new Locale("ms","MY");
		DateFormat df = SimpleDateFormat.getDateInstance(SimpleDateFormat.FULL, 
				vietnam);
		System.out.println(dob.before(today));
		
		Date beginning = new Date(0-1);
		System.out.println(beginning);
		
		System.out.println("----------------------------------------");
		ZonedDateTime hariIni = ZonedDateTime.now(ZoneId.of("Asia/Ho_Chi_Minh"));
		LocalDateTime dateob = LocalDateTime.of(1973, 5, 10,0,0,0);
		
		
		Instant birthday = dateob.toInstant(ZoneOffset.ofHours(8));
		ZonedDateTime harijadi = ZonedDateTime.of(dateob,ZoneId.of("Asia/Kuala_Lumpur"));
		birthday.toEpochMilli();
		harijadi.toInstant().toEpochMilli();
//		Duration howlog = Duration.of(10,new TemporalUnit() {
//			
//			@Override
//			public boolean isTimeBased() {
//				// TODO Auto-generated method stub
//				return false;
//			}
//			
//			@Override
//			public boolean isDurationEstimated() {
//				// TODO Auto-generated method stub
//				return false;
//			}
//			
//			@Override
//			public boolean isDateBased() {
//				// TODO Auto-generated method stub
//				return false;
//			}
//			
//			@Override
//			public Duration getDuration() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public long between(Temporal temporal1Inclusive, Temporal temporal2Exclusive) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//			@Override
//			public <R extends Temporal> R addTo(R temporal, long amount) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		});
		
		long daysAlive = TimeUnit.MILLISECONDS.toDays(hariIni.toInstant().toEpochMilli() - harijadi.toInstant().toEpochMilli());
		
		System.out.println(daysAlive/365);
		
//		for(String id : ZoneId.getAvailableZoneIds())
//		{
//			System.out.println(id);
//		}
	}

}







