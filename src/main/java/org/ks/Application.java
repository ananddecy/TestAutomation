package org.ks;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.ks.model.DataV1;
import org.ks.model.DataV1.VehAvail;
import org.ks.model.DataV1.VehAvailRSCore;
import org.ks.model.DataV1.VehVendorAvail;
import org.ks.model.DataV1.VendorPruningCategory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {

  private static final String fileName = "SampleAPICallv2.json";

  private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

  public static Map<String, Double> getMinPriceByCarCode(final String fileName) throws Exception {
    DataV1 dataV1 = OBJECT_MAPPER.readValue(Application.class.getClassLoader().getResourceAsStream(fileName), DataV1.class);

    VehAvailRSCore vehAvailRSCore = dataV1.getVehAvailRSCore();
    List<VehVendorAvail> vehVendorAvails = vehAvailRSCore.getVehVendorAvails();

    List<VehAvail> allVehAvails = vehVendorAvails.stream().flatMap(
        vehVendorAvail -> vehVendorAvail.getVehAvails().stream()).collect(Collectors.toList());

    Map<String, List<Double>> groupedByCodes = allVehAvails.stream().collect(
        Collectors.groupingBy(vehAvail ->
                vehAvail.getVehAvailCore().getVehicle().getVehMakeModel().getCode(),
            Collectors.mapping(vehAvail ->
                Double.parseDouble(vehAvail.getVehAvailCore().getTotalCharge().getRateTotalAmount()), Collectors.toList())));

    // Min price by car code
    Map<String, Double> minPriceByCode = new HashMap<>();
    groupedByCodes.forEach((key, value) -> minPriceByCode.put(key, value.stream().mapToDouble(v -> v).min().getAsDouble()));

    minPriceByCode.forEach((key, value) -> System.out.println("For Cary Type: " + key + " Minimum price is " + value));

    return minPriceByCode;
  }

  public static Double getMinPriceAcrossAllCars(final String fileName) throws Exception {
    Map<String, Double> minPriceByCarCode = getMinPriceByCarCode(fileName);

    Double min = Collections.min(minPriceByCarCode.values());
    System.out.println("Min price across all cars is: " + min);

    return min;
  }
  
  public static void sortPriceCorporateCarGroup(final String fileName, final String description) throws Exception{
	  DataV1 dataV1 = OBJECT_MAPPER.readValue(Application.class.getClassLoader().getResourceAsStream(fileName), DataV1.class);
	  VehAvailRSCore vehAvailRSCore = dataV1.getVehAvailRSCore();
	  List<VehVendorAvail> vehVendorAvails = vehAvailRSCore.getVehVendorAvails();
	  
	    // All corporate cars grouped
	    List<VehAvail> corporateCars = vehVendorAvails.stream().filter(vehVendorAvail -> vehVendorAvail.getInfo().gettPA_Extensions().getVendorPruningCategory() != null
	        && vehVendorAvail.getInfo().gettPA_Extensions().getVendorPruningCategory().getDescription().equals(description)).flatMap(
	        vehVendorAvail -> vehVendorAvail.getVehAvails().stream()).collect(Collectors.toList());
	  
	   List<VehAvail> sortedCorporateCars = corporateCars.stream()
		        .sorted(Comparator.comparingDouble(v -> Double.parseDouble(v.getVehAvailCore().getTotalCharge().getRateTotalAmount())))
		        .collect(Collectors.toList());

		    sortedCorporateCars.forEach(car -> {
		      System.out.println("Car is " + car.getVehAvailCore().getVehicle().getCode() + " and price is: " + car.getVehAvailCore().getTotalCharge().getRateTotalAmount());
		    });
	
  }

	/*
	 * public static void main(String[] args) throws Exception { String fileName =
	 * "SampleAPICallv2.json";
	 * 
	 * ObjectMapper objectMapper = new ObjectMapper();
	 * 
	 * DataV1 dataV1 =
	 * objectMapper.readValue(Application.class.getClassLoader().getResourceAsStream
	 * (fileName), DataV1.class);
	 * 
	 * VehAvailRSCore vehAvailRSCore = dataV1.getVehAvailRSCore();
	 * List<VehVendorAvail> vehVendorAvails = vehAvailRSCore.getVehVendorAvails();
	 * 
	 * List<VehAvail> allVehAvails = vehVendorAvails.stream().flatMap(
	 * vehVendorAvail ->
	 * vehVendorAvail.getVehAvails().stream()).collect(Collectors.toList());
	 * 
	 * Map<String, List<Double>> groupedByCodes = allVehAvails.stream().collect(
	 * Collectors.groupingBy(vehAvail ->
	 * vehAvail.getVehAvailCore().getVehicle().getVehMakeModel().getCode(),
	 * Collectors.mapping(vehAvail ->
	 * Double.parseDouble(vehAvail.getVehAvailCore().getTotalCharge().
	 * getRateTotalAmount()), Collectors.toList())));
	 * 
	 * //groupedByCodes.forEach((key, value) -> System.out.println("Key is " + key +
	 * " Prices are " + value));
	 * 
	 * // Min price by car code Map<String, Double> minPriceByCode = new
	 * HashMap<>(); groupedByCodes.forEach((key, value) -> minPriceByCode.put(key,
	 * value.stream().mapToDouble(v -> v).min().getAsDouble()));
	 * 
	 * minPriceByCode.forEach((key, value) -> System.out.println("Key is " + key +
	 * " Min price is " + value));
	 * 
	 * // Cheapest overall price for all cars
	 * 
	 * Double min = Collections.min(minPriceByCode.values());
	 * System.out.println("Min price across all cars is: " + min);
	 * 
	 * //----------------Second test --------------- List<VendorPruningCategory>
	 * collect = vehVendorAvails.stream().map( vehVendorAvail ->
	 * vehVendorAvail.getInfo().gettPA_Extensions()
	 * .getVendorPruningCategory()).collect(Collectors.toList());
	 * 
	 * collect.forEach(v -> System.out.println(v.getDescription()));
	 * 
	 * // All corporate cars grouped List<VehAvail> corporateCars =
	 * vehVendorAvails.stream().filter(vehVendorAvail ->
	 * vehVendorAvail.getInfo().gettPA_Extensions().getVendorPruningCategory() !=
	 * null &&
	 * vehVendorAvail.getInfo().gettPA_Extensions().getVendorPruningCategory().
	 * getDescription().equals("CORPORATE")).flatMap( vehVendorAvail ->
	 * vehVendorAvail.getVehAvails().stream()).collect(Collectors.toList());
	 * 
	 * corporateCars.forEach(car -> { System.out.println("Car is " +
	 * car.getVehAvailCore().getVehicle().getCode() + " and price is: " +
	 * car.getVehAvailCore().getTotalCharge().getRateTotalAmount()); });
	 * 
	 * System.out.println("-------------------------------------");
	 * 
	 * // All corporate cars sorted List<VehAvail> sortedCorporateCars =
	 * corporateCars.stream() .sorted(Comparator.comparingDouble(v ->
	 * Double.parseDouble(v.getVehAvailCore().getTotalCharge().getRateTotalAmount())
	 * )) .collect(Collectors.toList());
	 * 
	 * sortedCorporateCars.forEach(car -> { System.out.println("Car is " +
	 * car.getVehAvailCore().getVehicle().getCode() + " and price is: " +
	 * car.getVehAvailCore().getTotalCharge().getRateTotalAmount()); });
	 * 
	 * 
	 * //System.out.println(dataV1); }
	 */
}
