package package_offers;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;



public class OfferServices_Test {
	String name = "Table"; // Test Data
	String description = "Sturdy";
	String currency = "Pounds";
	double price = 1.99;
	double time_valid = 0.01;

	@Test
	public void testGetOfferView() {
		OfferServices offerServices = new OfferServices();  //Offer Service Object
		offerServices.CreateOffer(name, description, currency, price, time_valid); //Create Mock Offer
		List<OfferBean> result = offerServices.getOfferView(); // Put Over View into Result
		assertNotNull(result); // Check if view is null
	}

	@Test
	public void testCreateOffer() {
		OfferServices offerServices = new OfferServices();
		offerServices.CreateOffer(name, description, currency, price, time_valid);
		String expected = description;
		String result = Offer.Offer_List.get(0).getDescription();
		assertEquals(expected, result);
	}

	@Test
	public void testDeleteOffer() {
		OfferServices offerServices = new OfferServices();
		offerServices.CreateOffer(name, description, currency, price, time_valid);
		offerServices.DeleteOffer(0);
		assertEquals(0, Offer.Offer_List.size());
	}

}
