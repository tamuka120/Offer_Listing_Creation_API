package package_offers;



import java.text.SimpleDateFormat;
import java.util.Date;

public class ManageTime implements Time {

	@Override
	public String getTime() {
		Date time = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH.mm");
		String  holder = sdf.format(time);
		return holder;
	}

	@Override
	public void updateValidity(String t, double m) {
		// TODO Auto-generated method stub
		Date ctime = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH.mm");
		String  holder = sdf.format(ctime);
		
		
		double time = Double.valueOf(t); // stored time
		double holder2 = Double.valueOf(holder); //current time
		double exp_time = time + m;
		
		
	
		if (holder2 == exp_time || holder2 > exp_time) {
			Offer.Offer_List.get(0).setOffer_Available(false);
		}

	}

}
