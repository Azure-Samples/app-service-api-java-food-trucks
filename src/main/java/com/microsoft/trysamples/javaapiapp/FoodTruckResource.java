package com.microsoft.trysamples.javaapiapp;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.*;

/**
 * HelloWorld JaxRS resource.
 */
@Path("/")
@Api
public class FoodTruckResource {

private ArrayList<FoodTruck> list = new ArrayList<FoodTruck>();

	public FoodTruckResource() {
		list.add(new FoodTruck(1, "Pizza Buildana", "San Francisco", 10, true, false, true, false));
		list.add(new FoodTruck(2, "Grab and Dip", "Seattle", 5, false, false, true, true));
        list.add(new FoodTruck(3, "Thai Cart", "Seattle", 17, true, false, false, true));
        list.add(new FoodTruck(4, "Curry and Go", "Redmond", 54, true, false, true, false));
        list.add(new FoodTruck(5, "The big fat pork", "New York", 9, true, false, false, false));
        list.add(new FoodTruck(6, "The French corner", "Chicago", 2, true, true, true, true));
        list.add(new FoodTruck(7, "Mexican Fiesta", "Seattle", 44, true, false, false, false));
	}

  
    @GET
    @Path("foodtrucks/")
    @Produces("application/json")
    @ApiOperation("Retrieves all the food trucks available")
    public ArrayList<FoodTruck> getFoodTrucks(){
        return list;
    }
}
