package package_offers;

import java.util.List;
import java.util.ArrayList;



public class Offer {
	public static ArrayList<OfferBean> Offer_List = new ArrayList<OfferBean>();
	static ManageTime time = new ManageTime();


	//view all offers
	public List<OfferBean> GetAllOffers(){ // 
		if (Offer_List.size() == 0) {
			return null;
		}else {
		MyBackgroudMethod thread = new MyBackgroudMethod();
        thread.setDaemon(true);
        thread.start();
		return Offer_List;
		}
	}
	
	//create offer using url request
	public List<OfferBean> CreateOffer(String name, String description,String currency,double price,double exp_limit){
		OfferBean offerHolder = new OfferBean(name,description, currency, price, exp_limit, time.getTime() , true); 
		Offer_List.add(offerHolder);
        return null;
	}
	
	//delete offer by index of creation
	public List<OfferBean> DeleteOffer(int index){
        if(Offer_List.size() == 0) {
        	return null;
        }else {
			Offer_List.remove(index);
			return null;
        }
	}
	
	public static class MyBackgroudMethod extends Thread { //allow the continuous update of the offer availability
        @Override
        public void run() {
            while (true) {
                time.updateValidity(Offer.Offer_List.get(0).getTime_Created(),Offer.Offer_List.get(0).getMins_Available());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
	
}// Class
