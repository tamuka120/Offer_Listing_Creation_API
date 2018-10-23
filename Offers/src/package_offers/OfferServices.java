package package_offers;


//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.MalformedURLException;
//import java.net.URL;
import java.util.*;
import javax.ws.rs.Produces;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;

import javax.ws.rs.GET;
//import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;



//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.URL;
//import java.net.URLConnection;
//import java.nio.charset.Charset;

@Path("/")
public class OfferServices {
	Offer offer = new Offer(); // Create object for Offer Class
	
	
	//Queries
	@GET                 	               //Reads Resources
	@Path("/view")
	@Produces(MediaType.APPLICATION_JSON)
	public List<OfferBean> getOfferView (){ //constructor to return all offers to view
		return offer.GetAllOffers();
		}
	
	@POST            		              //Post Resource
	@Path("/create/{name}/{description}/{currency}/{price}/{exp_limit}")
	@Consumes(MediaType.APPLICATION_JSON)
	public List<OfferBean> CreateOffer(@PathParam("name") String name, @PathParam("description")  String description, @PathParam("currency")  String currency,@PathParam("price")  double price,@PathParam("exp_limit")  double exp_limit){ 
		return offer.CreateOffer(name,description,currency,price,exp_limit);
		}
	
	@DELETE            		              //Delete Resource
	@Path("/delete/{index}")
	@Consumes(MediaType.APPLICATION_JSON)
	public List<OfferBean> DeleteOffer(@PathParam("index")int index){ 
		return offer.DeleteOffer(index);
		}

}
