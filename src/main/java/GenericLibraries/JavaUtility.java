package GenericLibraries;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int generateRandomNumber(int limit) {
		Random random=new Random();
		return random.nextInt();
	}
	public String getCurrentTime() {
		Date data=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yyyy_hh_mm_sss");
		return sdf.format(data);
	}

}
