import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Day6Localization 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale current = Locale.getDefault();
		Locale vietnam = new Locale("vi","VN");
		Locale russia = new Locale("ru","RU");
		Locale finland = new Locale("fi","FI");
		
		ZonedDateTime today = ZonedDateTime.now();
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, current);
		System.out.println(df.format(new Date(today.toInstant().toEpochMilli())));
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(vietnam);
		double money = 25.2;
		System.out.println(nf.format(money));
		
		ResourceBundle bundle = ResourceBundle.getBundle("Resources",russia);
		System.out.println(bundle.getString("greeting"));
	}
}





