package org.ks.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataV1 {

  @JsonProperty("@xmlns")
  public String xmlns;

  @JsonProperty("@xmlns:xsi")
  public String xmlnsXsi;

  @JsonProperty("@xsi:schemaLocation")
  public String xsiSchemaLocation;
  @JsonProperty("@Version")
  public String version;
  @JsonProperty("@Target")
  public String target;
  @JsonProperty("@PrimaryLangID")
  public String primaryLangID;
  @JsonProperty("@TimeStamp")
  public Date timeStamp;
  @JsonProperty("Success")
  public List<Object> success;
  @JsonProperty("VehAvailRSCore")
  public VehAvailRSCore vehAvailRSCore;

  public String getXmlns() {
    return xmlns;
  }

  public DataV1 setXmlns(String xmlns) {
    this.xmlns = xmlns;
    return this;
  }

  public String getXmlnsXsi() {
    return xmlnsXsi;
  }

  public DataV1 setXmlnsXsi(String xmlnsXsi) {
    this.xmlnsXsi = xmlnsXsi;
    return this;
  }

  public String getXsiSchemaLocation() {
    return xsiSchemaLocation;
  }

  public DataV1 setXsiSchemaLocation(String xsiSchemaLocation) {
    this.xsiSchemaLocation = xsiSchemaLocation;
    return this;
  }

  public String getVersion() {
    return version;
  }

  public DataV1 setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getTarget() {
    return target;
  }

  public DataV1 setTarget(String target) {
    this.target = target;
    return this;
  }

  public String getPrimaryLangID() {
    return primaryLangID;
  }

  public DataV1 setPrimaryLangID(String primaryLangID) {
    this.primaryLangID = primaryLangID;
    return this;
  }

  public Date getTimeStamp() {
    return timeStamp;
  }

  public DataV1 setTimeStamp(Date timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  public List<Object> getSuccess() {
    return success;
  }

  public DataV1 setSuccess(List<Object> success) {
    this.success = success;
    return this;
  }

  public VehAvailRSCore getVehAvailRSCore() {
    return vehAvailRSCore;
  }

  public DataV1 setVehAvailRSCore(VehAvailRSCore vehAvailRSCore) {
    this.vehAvailRSCore = vehAvailRSCore;
    return this;
  }

  public static class PickUpLocation {

    @JsonProperty("@CodeContext")
    public String codeContext;
    @JsonProperty("@LocationCode")
    public String locationCode;
    @JsonProperty("@Name")
    public String name;

    public String getCodeContext() {
      return codeContext;
    }

    public PickUpLocation setCodeContext(String codeContext) {
      this.codeContext = codeContext;
      return this;
    }

    public String getLocationCode() {
      return locationCode;
    }

    public PickUpLocation setLocationCode(String locationCode) {
      this.locationCode = locationCode;
      return this;
    }

    public String getName() {
      return name;
    }

    public PickUpLocation setName(String name) {
      this.name = name;
      return this;
    }
  }

  public static class ReturnLocation {
    @JsonProperty("@CodeContext")
    public String codeContext;
    @JsonProperty("@LocationCode")
    public String locationCode;
    @JsonProperty("@Name")
    public String name;

    public String getCodeContext() {
      return codeContext;
    }

    public ReturnLocation setCodeContext(String codeContext) {
      this.codeContext = codeContext;
      return this;
    }

    public String getLocationCode() {
      return locationCode;
    }

    public ReturnLocation setLocationCode(String locationCode) {
      this.locationCode = locationCode;
      return this;
    }

    public String getName() {
      return name;
    }

    public ReturnLocation setName(String name) {
      this.name = name;
      return this;
    }
  }

  public static class VehRentalCore {
    @JsonProperty("@PickUpDateTime")
    public Date pickUpDateTime;
    @JsonProperty("@ReturnDateTime")
    public Date returnDateTime;
    @JsonProperty("PickUpLocation")
    public PickUpLocation pickUpLocation;
    @JsonProperty("ReturnLocation")
    public ReturnLocation returnLocation;

    public Date getPickUpDateTime() {
      return pickUpDateTime;
    }

    public VehRentalCore setPickUpDateTime(Date pickUpDateTime) {
      this.pickUpDateTime = pickUpDateTime;
      return this;
    }

    public Date getReturnDateTime() {
      return returnDateTime;
    }

    public VehRentalCore setReturnDateTime(Date returnDateTime) {
      this.returnDateTime = returnDateTime;
      return this;
    }

    public PickUpLocation getPickUpLocation() {
      return pickUpLocation;
    }

    public VehRentalCore setPickUpLocation(PickUpLocation pickUpLocation) {
      this.pickUpLocation = pickUpLocation;
      return this;
    }

    public ReturnLocation getReturnLocation() {
      return returnLocation;
    }

    public VehRentalCore setReturnLocation(ReturnLocation returnLocation) {
      this.returnLocation = returnLocation;
      return this;
    }
  }

  public static class Vendor {
    @JsonProperty("@Code")
    public String code;
    @JsonProperty("@CodeContext")
    public String codeContext;
    @JsonProperty("@CompanyShortName")
    public String companyShortName;
    @JsonProperty("@Division")
    public String division;

    public String getCode() {
      return code;
    }

    public Vendor setCode(String code) {
      this.code = code;
      return this;
    }

    public String getCodeContext() {
      return codeContext;
    }

    public Vendor setCodeContext(String codeContext) {
      this.codeContext = codeContext;
      return this;
    }

    public String getCompanyShortName() {
      return companyShortName;
    }

    public Vendor setCompanyShortName(String companyShortName) {
      this.companyShortName = companyShortName;
      return this;
    }

    public String getDivision() {
      return division;
    }

    public Vendor setDivision(String division) {
      this.division = division;
      return this;
    }
  }

  public static class VehType {
    @JsonProperty("@VehicleCategory")
    public String vehicleCategory;
    @JsonProperty("@DoorCount")
    public String doorCount;

    public String getVehicleCategory() {
      return vehicleCategory;
    }

    public VehType setVehicleCategory(String vehicleCategory) {
      this.vehicleCategory = vehicleCategory;
      return this;
    }

    public String getDoorCount() {
      return doorCount;
    }

    public VehType setDoorCount(String doorCount) {
      this.doorCount = doorCount;
      return this;
    }
  }

  public static class VehClass {

    @JsonProperty("@Size")
    public String size;

    public String getSize() {
      return size;
    }

    public VehClass setSize(String size) {
      this.size = size;
      return this;
    }
  }

  public static class VehMakeModel {
    @JsonProperty("@Name")
    public String name;
    @JsonProperty("@Code")
    public String code;

    public String getName() {
      return name;
    }

    public VehMakeModel setName(String name) {
      this.name = name;
      return this;
    }

    public String getCode() {
      return code;
    }

    public VehMakeModel setCode(String code) {
      this.code = code;
      return this;
    }
  }

  public static class VehIdentity {
    @JsonProperty("@VehicleAssetNumber")
    public String vehicleAssetNumber;

    public String getVehicleAssetNumber() {
      return vehicleAssetNumber;
    }

    public VehIdentity setVehicleAssetNumber(String vehicleAssetNumber) {
      this.vehicleAssetNumber = vehicleAssetNumber;
      return this;
    }
  }

  public static class Vehicle {
    @JsonProperty("@AirConditionInd")
    public String airConditionInd;
    @JsonProperty("@TransmissionType")
    public String transmissionType;
    @JsonProperty("@FuelType")
    public String fuelType;
    @JsonProperty("@DriveType")
    public String driveType;
    @JsonProperty("@PassengerQuantity")
    public String passengerQuantity;
    @JsonProperty("@BaggageQuantity")
    public String baggageQuantity;
    @JsonProperty("@Code")
    public String code;
    @JsonProperty("@CodeContext")
    public String codeContext;
    @JsonProperty("VehType")
    public VehType vehType;
    @JsonProperty("VehClass")
    public VehClass vehClass;
    @JsonProperty("VehMakeModel")
    public VehMakeModel vehMakeModel;
    @JsonProperty("PictureURL")
    public String pictureURL;
    @JsonProperty("VehIdentity")
    public VehIdentity vehIdentity;

    public String getAirConditionInd() {
      return airConditionInd;
    }

    public Vehicle setAirConditionInd(String airConditionInd) {
      this.airConditionInd = airConditionInd;
      return this;
    }

    public String getTransmissionType() {
      return transmissionType;
    }

    public Vehicle setTransmissionType(String transmissionType) {
      this.transmissionType = transmissionType;
      return this;
    }

    public String getFuelType() {
      return fuelType;
    }

    public Vehicle setFuelType(String fuelType) {
      this.fuelType = fuelType;
      return this;
    }

    public String getDriveType() {
      return driveType;
    }

    public Vehicle setDriveType(String driveType) {
      this.driveType = driveType;
      return this;
    }

    public String getPassengerQuantity() {
      return passengerQuantity;
    }

    public Vehicle setPassengerQuantity(String passengerQuantity) {
      this.passengerQuantity = passengerQuantity;
      return this;
    }

    public String getBaggageQuantity() {
      return baggageQuantity;
    }

    public Vehicle setBaggageQuantity(String baggageQuantity) {
      this.baggageQuantity = baggageQuantity;
      return this;
    }

    public String getCode() {
      return code;
    }

    public Vehicle setCode(String code) {
      this.code = code;
      return this;
    }

    public String getCodeContext() {
      return codeContext;
    }

    public Vehicle setCodeContext(String codeContext) {
      this.codeContext = codeContext;
      return this;
    }

    public VehType getVehType() {
      return vehType;
    }

    public Vehicle setVehType(VehType vehType) {
      this.vehType = vehType;
      return this;
    }

    public VehClass getVehClass() {
      return vehClass;
    }

    public Vehicle setVehClass(VehClass vehClass) {
      this.vehClass = vehClass;
      return this;
    }

    public VehMakeModel getVehMakeModel() {
      return vehMakeModel;
    }

    public Vehicle setVehMakeModel(VehMakeModel vehMakeModel) {
      this.vehMakeModel = vehMakeModel;
      return this;
    }

    public String getPictureURL() {
      return pictureURL;
    }

    public Vehicle setPictureURL(String pictureURL) {
      this.pictureURL = pictureURL;
      return this;
    }

    public VehIdentity getVehIdentity() {
      return vehIdentity;
    }

    public Vehicle setVehIdentity(VehIdentity vehIdentity) {
      this.vehIdentity = vehIdentity;
      return this;
    }
  }

  public static class VehicleCharge {
    @JsonProperty("@Description")
    public String description;
    @JsonProperty("@TaxInclusive")
    public String taxInclusive;
    @JsonProperty("@IncludedInRate")
    public String includedInRate;
    @JsonProperty("@Purpose")
    public String purpose;

    public String getDescription() {
      return description;
    }

    public VehicleCharge setDescription(String description) {
      this.description = description;
      return this;
    }

    public String getTaxInclusive() {
      return taxInclusive;
    }

    public VehicleCharge setTaxInclusive(String taxInclusive) {
      this.taxInclusive = taxInclusive;
      return this;
    }

    public String getIncludedInRate() {
      return includedInRate;
    }

    public VehicleCharge setIncludedInRate(String includedInRate) {
      this.includedInRate = includedInRate;
      return this;
    }

    public String getPurpose() {
      return purpose;
    }

    public VehicleCharge setPurpose(String purpose) {
      this.purpose = purpose;
      return this;
    }
  }

  public static class RateQualifier {
    @JsonProperty("@RateQualifier")
    public String rateQualifier;

    public String getRateQualifier() {
      return rateQualifier;
    }

    public RateQualifier setRateQualifier(String rateQualifier) {
      this.rateQualifier = rateQualifier;
      return this;
    }
  }

  public static class RentalRate {
    @JsonProperty("VehicleCharges")
    public List<VehicleCharge> vehicleCharges;
    @JsonProperty("RateQualifier")
    public RateQualifier rateQualifier;

    public List<VehicleCharge> getVehicleCharges() {
      return vehicleCharges;
    }

    public RentalRate setVehicleCharges(List<VehicleCharge> vehicleCharges) {
      this.vehicleCharges = vehicleCharges;
      return this;
    }

    public RateQualifier getRateQualifier() {
      return rateQualifier;
    }

    public RentalRate setRateQualifier(RateQualifier rateQualifier) {
      this.rateQualifier = rateQualifier;
      return this;
    }
  }

  public static class TotalCharge {
    @JsonProperty("@RateTotalAmount")
    public String rateTotalAmount;
    @JsonProperty("@EstimatedTotalAmount")
    public String estimatedTotalAmount;
    @JsonProperty("@CurrencyCode")
    public String currencyCode;

    public String getRateTotalAmount() {
      return rateTotalAmount;
    }

    public TotalCharge setRateTotalAmount(String rateTotalAmount) {
      this.rateTotalAmount = rateTotalAmount;
      return this;
    }

    public String getEstimatedTotalAmount() {
      return estimatedTotalAmount;
    }

    public TotalCharge setEstimatedTotalAmount(String estimatedTotalAmount) {
      this.estimatedTotalAmount = estimatedTotalAmount;
      return this;
    }

    public String getCurrencyCode() {
      return currencyCode;
    }

    public TotalCharge setCurrencyCode(String currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }
  }

  public static class Equipment {
    @JsonProperty("@EquipType")
    public String equipType;
    @JsonProperty("Description")
    public String description;

    public String getEquipType() {
      return equipType;
    }

    public Equipment setEquipType(String equipType) {
      this.equipType = equipType;
      return this;
    }

    public String getDescription() {
      return description;
    }

    public Equipment setDescription(String description) {
      this.description = description;
      return this;
    }
  }

  public static class Charge {
    @JsonProperty("@Amount")
    public String amount;
    @JsonProperty("@CurrencyCode")
    public String currencyCode;
    @JsonProperty("@TaxInclusive")
    public String taxInclusive;
    @JsonProperty("@IncludedInRate")
    public String includedInRate;
    @JsonProperty("@Description")
    public String description;

    public String getAmount() {
      return amount;
    }

    public Charge setAmount(String amount) {
      this.amount = amount;
      return this;
    }

    public String getCurrencyCode() {
      return currencyCode;
    }

    public Charge setCurrencyCode(String currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    public String getTaxInclusive() {
      return taxInclusive;
    }

    public Charge setTaxInclusive(String taxInclusive) {
      this.taxInclusive = taxInclusive;
      return this;
    }

    public String getIncludedInRate() {
      return includedInRate;
    }

    public Charge setIncludedInRate(String includedInRate) {
      this.includedInRate = includedInRate;
      return this;
    }

    public String getDescription() {
      return description;
    }

    public Charge setDescription(String description) {
      this.description = description;
      return this;
    }
  }

  public static class PricedEquip {
    @JsonProperty("Equipment")
    public Equipment equipment;
    @JsonProperty("Charge")
    public Charge charge;

    public Equipment getEquipment() {
      return equipment;
    }

    public PricedEquip setEquipment(Equipment equipment) {
      this.equipment = equipment;
      return this;
    }

    public Charge getCharge() {
      return charge;
    }

    public PricedEquip setCharge(Charge charge) {
      this.charge = charge;
      return this;
    }
  }

  public static class Fee {
    @JsonProperty("@Amount")
    public String amount;
    @JsonProperty("@CurrencyCode")
    public String currencyCode;
    @JsonProperty("@Purpose")
    public String purpose;

    public String getAmount() {
      return amount;
    }

    public Fee setAmount(String amount) {
      this.amount = amount;
      return this;
    }

    public String getCurrencyCode() {
      return currencyCode;
    }

    public Fee setCurrencyCode(String currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    public String getPurpose() {
      return purpose;
    }

    public Fee setPurpose(String purpose) {
      this.purpose = purpose;
      return this;
    }
  }

  public static class Reference {
    @JsonProperty("@Type")
    public String type;
    @JsonProperty("@ID")
    public String iD;
    @JsonProperty("@ID_Context")
    public String iDContext;
    @JsonProperty("@DateTime")
    public Date dateTime;
    @JsonProperty("@URL")
    public String uRL;

    public String getType() {
      return type;
    }

    public Reference setType(String type) {
      this.type = type;
      return this;
    }

    public String getiD() {
      return iD;
    }

    public Reference setiD(String iD) {
      this.iD = iD;
      return this;
    }

    public String getiDContext() {
      return iDContext;
    }

    public Reference setiDContext(String iDContext) {
      this.iDContext = iDContext;
      return this;
    }

    public Date getDateTime() {
      return dateTime;
    }

    public Reference setDateTime(Date dateTime) {
      this.dateTime = dateTime;
      return this;
    }

    public String getuRL() {
      return uRL;
    }

    public Reference setuRL(String uRL) {
      this.uRL = uRL;
      return this;
    }
  }

  public static class UpSell {
    @JsonProperty("@Insurance")
    public String insurance;

    public String getInsurance() {
      return insurance;
    }

    public UpSell setInsurance(String insurance) {
      this.insurance = insurance;
      return this;
    }
  }

  public static class DebitCard {
    @JsonProperty("@OnArrival")
    public String onArrival;

    public String getOnArrival() {
      return onArrival;
    }

    public DebitCard setOnArrival(String onArrival) {
      this.onArrival = onArrival;
      return this;
    }
  }

  public static class PPDep {
    @JsonProperty("@Available")
    public String available;
    @JsonProperty("@Keep")
    public String keep;

    public String getAvailable() {
      return available;
    }

    public PPDep setAvailable(String available) {
      this.available = available;
      return this;
    }

    public String getKeep() {
      return keep;
    }

    public PPDep setKeep(String keep) {
      this.keep = keep;
      return this;
    }
  }

  public static class ZeroDeposit {
    @JsonProperty("@Available")
    public String available;

    public String getAvailable() {
      return available;
    }

    public ZeroDeposit setAvailable(String available) {
      this.available = available;
      return this;
    }
  }

  public static class FuelPolicy {
    @JsonProperty("@Type")
    public String type;
    @JsonProperty("@Description")
    public String description;

    public String getType() {
      return type;
    }

    public FuelPolicy setType(String type) {
      this.type = type;
      return this;
    }

    public String getDescription() {
      return description;
    }

    public FuelPolicy setDescription(String description) {
      this.description = description;
      return this;
    }
  }

  public static class Config {
    @JsonProperty("@OrderBy")
    public String orderBy;
    @JsonProperty("@Relevance")
    public String relevance;
    @JsonProperty("@Preferred")
    public String preferred;
    @JsonProperty("@Insurance")
    public String insurance;
    @JsonProperty("@Duration")
    public String duration;
    @JsonProperty("@CC_Info")
    public String cCInfo;
    @JsonProperty("@PhysicalInetAddress")
    public String physicalInetAddress;
    @JsonProperty("@ConsumerAddress")
    public String consumerAddress;
    @JsonProperty("@HotelDelivery")
    public String hotelDelivery;
    @JsonProperty("@BestPrice")
    public String bestPrice;

    public String getOrderBy() {
      return orderBy;
    }

    public Config setOrderBy(String orderBy) {
      this.orderBy = orderBy;
      return this;
    }

    public String getRelevance() {
      return relevance;
    }

    public Config setRelevance(String relevance) {
      this.relevance = relevance;
      return this;
    }

    public String getPreferred() {
      return preferred;
    }

    public Config setPreferred(String preferred) {
      this.preferred = preferred;
      return this;
    }

    public String getInsurance() {
      return insurance;
    }

    public Config setInsurance(String insurance) {
      this.insurance = insurance;
      return this;
    }

    public String getDuration() {
      return duration;
    }

    public Config setDuration(String duration) {
      this.duration = duration;
      return this;
    }

    public String getcCInfo() {
      return cCInfo;
    }

    public Config setcCInfo(String cCInfo) {
      this.cCInfo = cCInfo;
      return this;
    }

    public String getPhysicalInetAddress() {
      return physicalInetAddress;
    }

    public Config setPhysicalInetAddress(String physicalInetAddress) {
      this.physicalInetAddress = physicalInetAddress;
      return this;
    }

    public String getConsumerAddress() {
      return consumerAddress;
    }

    public Config setConsumerAddress(String consumerAddress) {
      this.consumerAddress = consumerAddress;
      return this;
    }

    public String getHotelDelivery() {
      return hotelDelivery;
    }

    public Config setHotelDelivery(String hotelDelivery) {
      this.hotelDelivery = hotelDelivery;
      return this;
    }

    public String getBestPrice() {
      return bestPrice;
    }

    public Config setBestPrice(String bestPrice) {
      this.bestPrice = bestPrice;
      return this;
    }
  }

  public static class OrderBy {
    @JsonProperty("@Index")
    public String index;

    public String getIndex() {
      return index;
    }

    public OrderBy setIndex(String index) {
      this.index = index;
      return this;
    }
  }

  public static class IndexByPrice {
    @JsonProperty("@Key")
    public String key;
    @JsonProperty("@BundleText")
    public String bundleText;
    @JsonProperty("@BundleType")
    public String bundleType;

    public String getKey() {
      return key;
    }

    public IndexByPrice setKey(String key) {
      this.key = key;
      return this;
    }

    public String getBundleText() {
      return bundleText;
    }

    public IndexByPrice setBundleText(String bundleText) {
      this.bundleText = bundleText;
      return this;
    }

    public String getBundleType() {
      return bundleType;
    }

    public IndexByPrice setBundleType(String bundleType) {
      this.bundleType = bundleType;
      return this;
    }
  }

  public static class Indexation {
    @JsonProperty("IndexByPrice")
    public IndexByPrice indexByPrice;

    public IndexByPrice getIndexByPrice() {
      return indexByPrice;
    }

    public Indexation setIndexByPrice(IndexByPrice indexByPrice) {
      this.indexByPrice = indexByPrice;
      return this;
    }
  }

  public static class CCInfo {
    @JsonProperty("@Required")
    public String required;

    public String getRequired() {
      return required;
    }

    public CCInfo setRequired(String required) {
      this.required = required;
      return this;
    }
  }

  public static class Offer {
    @JsonProperty("@Type")
    public String type;
    @JsonProperty("@UIToken")
    public String uIToken;
    @JsonProperty("@ShortText")
    public String shortText;
    @JsonProperty("@Index")
    public String index;
    @JsonProperty("@SEFree")
    public String sEFree;
    @JsonProperty("#text")
    public String text;

    public String getType() {
      return type;
    }

    public Offer setType(String type) {
      this.type = type;
      return this;
    }

    public String getuIToken() {
      return uIToken;
    }

    public Offer setuIToken(String uIToken) {
      this.uIToken = uIToken;
      return this;
    }

    public String getShortText() {
      return shortText;
    }

    public Offer setShortText(String shortText) {
      this.shortText = shortText;
      return this;
    }

    public String getIndex() {
      return index;
    }

    public Offer setIndex(String index) {
      this.index = index;
      return this;
    }

    public String getsEFree() {
      return sEFree;
    }

    public Offer setsEFree(String sEFree) {
      this.sEFree = sEFree;
      return this;
    }

    public String getText() {
      return text;
    }

    public Offer setText(String text) {
      this.text = text;
      return this;
    }
  }

  public static class SpecialOffers {
    @JsonProperty("Offer")
    public Offer offer;

    public Offer getOffer() {
      return offer;
    }

    public SpecialOffers setOffer(Offer offer) {
      this.offer = offer;
      return this;
    }
  }

  public static class Duration {
    @JsonProperty("@Days")
    public String days;

    public String getDays() {
      return days;
    }

    public Duration setDays(String days) {
      this.days = days;
      return this;
    }
  }

  public static class Deposit {
    @JsonProperty("@Amount")
    public String amount;
    @JsonProperty("@CurrencyCode")
    public String currencyCode;
    @JsonProperty("@MinAmount")
    public String minAmount;
    @JsonProperty("@MaxAmount")
    public String maxAmount;

    public String getAmount() {
      return amount;
    }

    public Deposit setAmount(String amount) {
      this.amount = amount;
      return this;
    }

    public String getCurrencyCode() {
      return currencyCode;
    }

    public Deposit setCurrencyCode(String currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    public String getMinAmount() {
      return minAmount;
    }

    public Deposit setMinAmount(String minAmount) {
      this.minAmount = minAmount;
      return this;
    }

    public String getMaxAmount() {
      return maxAmount;
    }

    public Deposit setMaxAmount(String maxAmount) {
      this.maxAmount = maxAmount;
      return this;
    }
  }

  public static class PricedEquipsDisplay {
    @JsonProperty("@EquipType")
    public String equipType;
    @JsonProperty("@Amount")
    public String amount;
    @JsonProperty("@CurrencyCode")
    public String currencyCode;
    @JsonProperty("@RateType")
    public String rateType;

    public String getEquipType() {
      return equipType;
    }

    public PricedEquipsDisplay setEquipType(String equipType) {
      this.equipType = equipType;
      return this;
    }

    public String getAmount() {
      return amount;
    }

    public PricedEquipsDisplay setAmount(String amount) {
      this.amount = amount;
      return this;
    }

    public String getCurrencyCode() {
      return currencyCode;
    }

    public PricedEquipsDisplay setCurrencyCode(String currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    public String getRateType() {
      return rateType;
    }

    public PricedEquipsDisplay setRateType(String rateType) {
      this.rateType = rateType;
      return this;
    }
  }

  public static class FleetGroup {
    @JsonProperty("Vehicle")
    public Vehicle vehicle;

    public Vehicle getVehicle() {
      return vehicle;
    }

    public FleetGroup setVehicle(Vehicle vehicle) {
      this.vehicle = vehicle;
      return this;
    }
  }

  public static class Fleet {
    @JsonProperty("FleetGroup")
    public FleetGroup fleetGroup;

    public FleetGroup getFleetGroup() {
      return fleetGroup;
    }

    public Fleet setFleetGroup(FleetGroup fleetGroup) {
      this.fleetGroup = fleetGroup;
      return this;
    }
  }

  public static class TPAExtensions {
    @JsonProperty("PictureURLHD")
    public String pictureURLHD;
    @JsonProperty("UpSell")
    public UpSell upSell;
    @JsonProperty("DebitCard")
    public DebitCard debitCard;
    @JsonProperty("PPDep")
    public PPDep pPDep;
    @JsonProperty("ZeroDeposit")
    public ZeroDeposit zeroDeposit;
    @JsonProperty("FuelPolicy")
    public FuelPolicy fuelPolicy;
    @JsonProperty("Config")
    public Config config;
    @JsonProperty("OrderBy")
    public OrderBy orderBy;
    @JsonProperty("Indexation")
    public Indexation indexation;
    @JsonProperty("CC_Info")
    public CCInfo cC_Info;
    @JsonProperty("SpecialOffers")
    public SpecialOffers specialOffers;
    @JsonProperty("Duration")
    public Duration duration;
    @JsonProperty("Deposit")
    public Deposit deposit;
    @JsonProperty("PricedEquipsDisplay")
    public List<PricedEquipsDisplay> pricedEquipsDisplay;
    @JsonProperty("Fleet")
    public Fleet fleet;
    @JsonProperty("Fees")
    public List<Fee> fees;
    @JsonProperty("SupplierLocation")
    public SupplierLocation supplierLocation;
    @JsonProperty("SortOrdering")
    public SortOrdering sortOrdering;
    @JsonProperty("VendorPruningCategory")
    public VendorPruningCategory vendorPruningCategory;
    @JsonProperty("VendorPictureURL")
    public VendorPictureURL vendorPictureURL;
    @JsonProperty("VendorPictureSVGURL")
    public VendorPictureSVGURL vendorPictureSVGURL;
    @JsonProperty("CustomerReviews")
    public CustomerReviews customerReviews;
    @JsonProperty("Obfuscation")
    public Obfuscation obfuscation;
    @JsonProperty("Ranking")
    public Ranking ranking;
    @JsonProperty("Features")
    public Features features;
    @JsonProperty("FlightDetails")
    public FlightDetails flightDetails;
    @JsonProperty("TotalVendorOffers")
    public String totalVendorOffers;
    @JsonProperty("BundleOffersAvailable")
    public String bundleOffersAvailable;

    public String getPictureURLHD() {
      return pictureURLHD;
    }

    public TPAExtensions setPictureURLHD(String pictureURLHD) {
      this.pictureURLHD = pictureURLHD;
      return this;
    }

    public UpSell getUpSell() {
      return upSell;
    }

    public TPAExtensions setUpSell(UpSell upSell) {
      this.upSell = upSell;
      return this;
    }

    public DebitCard getDebitCard() {
      return debitCard;
    }

    public TPAExtensions setDebitCard(DebitCard debitCard) {
      this.debitCard = debitCard;
      return this;
    }

    public PPDep getpPDep() {
      return pPDep;
    }

    public TPAExtensions setpPDep(PPDep pPDep) {
      this.pPDep = pPDep;
      return this;
    }

    public ZeroDeposit getZeroDeposit() {
      return zeroDeposit;
    }

    public TPAExtensions setZeroDeposit(ZeroDeposit zeroDeposit) {
      this.zeroDeposit = zeroDeposit;
      return this;
    }

    public FuelPolicy getFuelPolicy() {
      return fuelPolicy;
    }

    public TPAExtensions setFuelPolicy(FuelPolicy fuelPolicy) {
      this.fuelPolicy = fuelPolicy;
      return this;
    }

    public Config getConfig() {
      return config;
    }

    public TPAExtensions setConfig(Config config) {
      this.config = config;
      return this;
    }

    public OrderBy getOrderBy() {
      return orderBy;
    }

    public TPAExtensions setOrderBy(OrderBy orderBy) {
      this.orderBy = orderBy;
      return this;
    }

    public Indexation getIndexation() {
      return indexation;
    }

    public TPAExtensions setIndexation(Indexation indexation) {
      this.indexation = indexation;
      return this;
    }

    public CCInfo getcC_Info() {
      return cC_Info;
    }

    public TPAExtensions setcC_Info(CCInfo cC_Info) {
      this.cC_Info = cC_Info;
      return this;
    }

    public SpecialOffers getSpecialOffers() {
      return specialOffers;
    }

    public TPAExtensions setSpecialOffers(SpecialOffers specialOffers) {
      this.specialOffers = specialOffers;
      return this;
    }

    public Duration getDuration() {
      return duration;
    }

    public TPAExtensions setDuration(Duration duration) {
      this.duration = duration;
      return this;
    }

    public Deposit getDeposit() {
      return deposit;
    }

    public TPAExtensions setDeposit(Deposit deposit) {
      this.deposit = deposit;
      return this;
    }

    public List<PricedEquipsDisplay> getPricedEquipsDisplay() {
      return pricedEquipsDisplay;
    }

    public TPAExtensions setPricedEquipsDisplay(List<PricedEquipsDisplay> pricedEquipsDisplay) {
      this.pricedEquipsDisplay = pricedEquipsDisplay;
      return this;
    }

    public Fleet getFleet() {
      return fleet;
    }

    public TPAExtensions setFleet(Fleet fleet) {
      this.fleet = fleet;
      return this;
    }

    public List<Fee> getFees() {
      return fees;
    }

    public TPAExtensions setFees(List<Fee> fees) {
      this.fees = fees;
      return this;
    }

    public SupplierLocation getSupplierLocation() {
      return supplierLocation;
    }

    public TPAExtensions setSupplierLocation(SupplierLocation supplierLocation) {
      this.supplierLocation = supplierLocation;
      return this;
    }

    public SortOrdering getSortOrdering() {
      return sortOrdering;
    }

    public TPAExtensions setSortOrdering(SortOrdering sortOrdering) {
      this.sortOrdering = sortOrdering;
      return this;
    }

    public VendorPruningCategory getVendorPruningCategory() {
      return vendorPruningCategory;
    }

    public TPAExtensions setVendorPruningCategory(VendorPruningCategory vendorPruningCategory) {
      this.vendorPruningCategory = vendorPruningCategory;
      return this;
    }

    public VendorPictureURL getVendorPictureURL() {
      return vendorPictureURL;
    }

    public TPAExtensions setVendorPictureURL(VendorPictureURL vendorPictureURL) {
      this.vendorPictureURL = vendorPictureURL;
      return this;
    }

    public VendorPictureSVGURL getVendorPictureSVGURL() {
      return vendorPictureSVGURL;
    }

    public TPAExtensions setVendorPictureSVGURL(VendorPictureSVGURL vendorPictureSVGURL) {
      this.vendorPictureSVGURL = vendorPictureSVGURL;
      return this;
    }

    public CustomerReviews getCustomerReviews() {
      return customerReviews;
    }

    public TPAExtensions setCustomerReviews(CustomerReviews customerReviews) {
      this.customerReviews = customerReviews;
      return this;
    }

    public Obfuscation getObfuscation() {
      return obfuscation;
    }

    public TPAExtensions setObfuscation(Obfuscation obfuscation) {
      this.obfuscation = obfuscation;
      return this;
    }

    public Ranking getRanking() {
      return ranking;
    }

    public TPAExtensions setRanking(Ranking ranking) {
      this.ranking = ranking;
      return this;
    }

    public Features getFeatures() {
      return features;
    }

    public TPAExtensions setFeatures(Features features) {
      this.features = features;
      return this;
    }

    public FlightDetails getFlightDetails() {
      return flightDetails;
    }

    public TPAExtensions setFlightDetails(FlightDetails flightDetails) {
      this.flightDetails = flightDetails;
      return this;
    }

    public String getTotalVendorOffers() {
      return totalVendorOffers;
    }

    public TPAExtensions setTotalVendorOffers(String totalVendorOffers) {
      this.totalVendorOffers = totalVendorOffers;
      return this;
    }

    public String getBundleOffersAvailable() {
      return bundleOffersAvailable;
    }

    public TPAExtensions setBundleOffersAvailable(String bundleOffersAvailable) {
      this.bundleOffersAvailable = bundleOffersAvailable;
      return this;
    }
  }

  public static class VehAvailCore {
    @JsonProperty("@Status")
    public String status;
    @JsonProperty("Vehicle")
    public Vehicle vehicle;
    @JsonProperty("RentalRate")
    public RentalRate rentalRate;
    @JsonProperty("TotalCharge")
    public TotalCharge totalCharge;
    @JsonProperty("PricedEquips")
    public List<PricedEquip> pricedEquips;
    @JsonProperty("Fees")
    public List<Fee> fees;
    @JsonProperty("Reference")
    public Reference reference;
    @JsonProperty("TPA_Extensions")
    public TPAExtensions tPA_Extensions;

    public String getStatus() {
      return status;
    }

    public VehAvailCore setStatus(String status) {
      this.status = status;
      return this;
    }

    public Vehicle getVehicle() {
      return vehicle;
    }

    public VehAvailCore setVehicle(Vehicle vehicle) {
      this.vehicle = vehicle;
      return this;
    }

    public RentalRate getRentalRate() {
      return rentalRate;
    }

    public VehAvailCore setRentalRate(RentalRate rentalRate) {
      this.rentalRate = rentalRate;
      return this;
    }

    public TotalCharge getTotalCharge() {
      return totalCharge;
    }

    public VehAvailCore setTotalCharge(TotalCharge totalCharge) {
      this.totalCharge = totalCharge;
      return this;
    }

    public List<PricedEquip> getPricedEquips() {
      return pricedEquips;
    }

    public VehAvailCore setPricedEquips(List<PricedEquip> pricedEquips) {
      this.pricedEquips = pricedEquips;
      return this;
    }

    public List<Fee> getFees() {
      return fees;
    }

    public VehAvailCore setFees(List<Fee> fees) {
      this.fees = fees;
      return this;
    }

    public Reference getReference() {
      return reference;
    }

    public VehAvailCore setReference(Reference reference) {
      this.reference = reference;
      return this;
    }

    public TPAExtensions gettPA_Extensions() {
      return tPA_Extensions;
    }

    public VehAvailCore settPA_Extensions(TPAExtensions tPA_Extensions) {
      this.tPA_Extensions = tPA_Extensions;
      return this;
    }
  }

  public static class Coverage {
    @JsonProperty("@CoverageType")
    public String coverageType;

    public String getCoverageType() {
      return coverageType;
    }

    public Coverage setCoverageType(String coverageType) {
      this.coverageType = coverageType;
      return this;
    }
  }

  public static class Deductible {
    @JsonProperty("@Amount")
    public String amount;
    @JsonProperty("@CurrencyCode")
    public String currencyCode;

    public String getAmount() {
      return amount;
    }

    public Deductible setAmount(String amount) {
      this.amount = amount;
      return this;
    }

    public String getCurrencyCode() {
      return currencyCode;
    }

    public Deductible setCurrencyCode(String currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }
  }

  public static class PricedCoverage {
    @JsonProperty("Coverage")
    public Coverage coverage;
    @JsonProperty("Charge")
    public Charge charge;
    @JsonProperty("Deductible")
    public Deductible deductible;

    public Coverage getCoverage() {
      return coverage;
    }

    public PricedCoverage setCoverage(Coverage coverage) {
      this.coverage = coverage;
      return this;
    }

    public Charge getCharge() {
      return charge;
    }

    public PricedCoverage setCharge(Charge charge) {
      this.charge = charge;
      return this;
    }

    public Deductible getDeductible() {
      return deductible;
    }

    public PricedCoverage setDeductible(Deductible deductible) {
      this.deductible = deductible;
      return this;
    }
  }

  public static class VehAvailInfo {
    @JsonProperty("PricedCoverages")
    public List<PricedCoverage> pricedCoverages;

    public List<PricedCoverage> getPricedCoverages() {
      return pricedCoverages;
    }

    public VehAvailInfo setPricedCoverages(List<PricedCoverage> pricedCoverages) {
      this.pricedCoverages = pricedCoverages;
      return this;
    }
  }

  public static class VehAvail {
    @JsonProperty("VehAvailCore")
    public VehAvailCore vehAvailCore;
    @JsonProperty("VehAvailInfo")
    public VehAvailInfo vehAvailInfo;

    public VehAvailCore getVehAvailCore() {
      return vehAvailCore;
    }

    public VehAvail setVehAvailCore(VehAvailCore vehAvailCore) {
      this.vehAvailCore = vehAvailCore;
      return this;
    }

    public VehAvailInfo getVehAvailInfo() {
      return vehAvailInfo;
    }

    public VehAvail setVehAvailInfo(VehAvailInfo vehAvailInfo) {
      this.vehAvailInfo = vehAvailInfo;
      return this;
    }
  }

  public static class CountryName {
    @JsonProperty("@Code")
    public String code;

    public String getCode() {
      return code;
    }

    public CountryName setCode(String code) {
      this.code = code;
      return this;
    }
  }

  public static class Address {
    @JsonProperty("@Remark")
    public String remark;
    @JsonProperty("AddressLine")
    public String addressLine;
    @JsonProperty("CountryName")
    public CountryName countryName;

    public String getRemark() {
      return remark;
    }

    public Address setRemark(String remark) {
      this.remark = remark;
      return this;
    }

    public String getAddressLine() {
      return addressLine;
    }

    public Address setAddressLine(String addressLine) {
      this.addressLine = addressLine;
      return this;
    }

    public CountryName getCountryName() {
      return countryName;
    }

    public Address setCountryName(CountryName countryName) {
      this.countryName = countryName;
      return this;
    }
  }

  public static class Telephone {
    @JsonProperty("@PhoneNumber")
    public String phoneNumber;

    public String getPhoneNumber() {
      return phoneNumber;
    }

    public Telephone setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }
  }

  public static class VehRentLocInfo {
    @JsonProperty("@Type")
    public String type;

    public String getType() {
      return type;
    }

    public VehRentLocInfo setType(String type) {
      this.type = type;
      return this;
    }
  }

  public static class VehRentLocInfos {
    @JsonProperty("VehRentLocInfo")
    public VehRentLocInfo vehRentLocInfo;

    public VehRentLocInfo getVehRentLocInfo() {
      return vehRentLocInfo;
    }

    public VehRentLocInfos setVehRentLocInfo(VehRentLocInfo vehRentLocInfo) {
      this.vehRentLocInfo = vehRentLocInfo;
      return this;
    }
  }

  public static class CounterLocation {
    @JsonProperty("@Location")
    public String location;

    public String getLocation() {
      return location;
    }

    public CounterLocation setLocation(String location) {
      this.location = location;
      return this;
    }
  }

  public static class SupplierLocation {
    @JsonProperty("@Timezone")
    public String timezone;
    @JsonProperty("@TimeZoneAdjustmentMins")
    public String timeZoneAdjustmentMins;

    public String getTimezone() {
      return timezone;
    }

    public SupplierLocation setTimezone(String timezone) {
      this.timezone = timezone;
      return this;
    }

    public String getTimeZoneAdjustmentMins() {
      return timeZoneAdjustmentMins;
    }

    public SupplierLocation setTimeZoneAdjustmentMins(String timeZoneAdjustmentMins) {
      this.timeZoneAdjustmentMins = timeZoneAdjustmentMins;
      return this;
    }
  }

  public static class AdditionalInfo {
    @JsonProperty("VehRentLocInfos")
    public VehRentLocInfos vehRentLocInfos;
    @JsonProperty("CounterLocation")
    public CounterLocation counterLocation;
    @JsonProperty("TPA_Extensions")
    public TPAExtensions tPA_Extensions;

    public VehRentLocInfos getVehRentLocInfos() {
      return vehRentLocInfos;
    }

    public AdditionalInfo setVehRentLocInfos(VehRentLocInfos vehRentLocInfos) {
      this.vehRentLocInfos = vehRentLocInfos;
      return this;
    }

    public CounterLocation getCounterLocation() {
      return counterLocation;
    }

    public AdditionalInfo setCounterLocation(CounterLocation counterLocation) {
      this.counterLocation = counterLocation;
      return this;
    }

    public TPAExtensions gettPA_Extensions() {
      return tPA_Extensions;
    }

    public AdditionalInfo settPA_Extensions(TPAExtensions tPA_Extensions) {
      this.tPA_Extensions = tPA_Extensions;
      return this;
    }
  }

  public static class LocationDetails {
    @JsonProperty("@Code")
    public String code;
    @JsonProperty("@Name")
    public String name;
    @JsonProperty("@AtAirport")
    public String atAirport;
    @JsonProperty("@ExtendedLocationCode")
    public String extendedLocationCode;
    @JsonProperty("Address")
    public Address address;
    @JsonProperty("Telephone")
    public Telephone telephone;
    @JsonProperty("AdditionalInfo")
    public AdditionalInfo additionalInfo;

    public String getCode() {
      return code;
    }

    public LocationDetails setCode(String code) {
      this.code = code;
      return this;
    }

    public String getName() {
      return name;
    }

    public LocationDetails setName(String name) {
      this.name = name;
      return this;
    }

    public String getAtAirport() {
      return atAirport;
    }

    public LocationDetails setAtAirport(String atAirport) {
      this.atAirport = atAirport;
      return this;
    }

    public String getExtendedLocationCode() {
      return extendedLocationCode;
    }

    public LocationDetails setExtendedLocationCode(String extendedLocationCode) {
      this.extendedLocationCode = extendedLocationCode;
      return this;
    }

    public Address getAddress() {
      return address;
    }

    public LocationDetails setAddress(Address address) {
      this.address = address;
      return this;
    }

    public Telephone getTelephone() {
      return telephone;
    }

    public LocationDetails setTelephone(Telephone telephone) {
      this.telephone = telephone;
      return this;
    }

    public AdditionalInfo getAdditionalInfo() {
      return additionalInfo;
    }

    public LocationDetails setAdditionalInfo(AdditionalInfo additionalInfo) {
      this.additionalInfo = additionalInfo;
      return this;
    }
  }

  public static class SortOrdering {
    @JsonProperty("@Type")
    public String type;

    public String getType() {
      return type;
    }

    public SortOrdering setType(String type) {
      this.type = type;
      return this;
    }
  }

  public static class VendorPruningCategory {
    @JsonProperty("@Key")
    public String key;
    @JsonProperty("@Description")
    public String description;

    public String getKey() {
      return key;
    }

    public VendorPruningCategory setKey(String key) {
      this.key = key;
      return this;
    }

    public String getDescription() {
      return description;
    }

    public VendorPruningCategory setDescription(String description) {
      this.description = description;
      return this;
    }
  }

  public static class VendorPictureURL {
    @JsonProperty("@UIToken")
    public String uIToken;
    @JsonProperty("#text")
    public String text;

    public String getuIToken() {
      return uIToken;
    }

    public VendorPictureURL setuIToken(String uIToken) {
      this.uIToken = uIToken;
      return this;
    }

    public String getText() {
      return text;
    }

    public VendorPictureURL setText(String text) {
      this.text = text;
      return this;
    }
  }

  public static class VendorPictureSVGURL {
    @JsonProperty("@UIToken")
    public String uIToken;
    @JsonProperty("#text")
    public String text;

    public String getuIToken() {
      return uIToken;
    }

    public VendorPictureSVGURL setuIToken(String uIToken) {
      this.uIToken = uIToken;
      return this;
    }

    public String getText() {
      return text;
    }

    public VendorPictureSVGURL setText(String text) {
      this.text = text;
      return this;
    }
  }

  public static class CustomerReviews {
    @JsonProperty("@total")
    public String total;
    @JsonProperty("@overall")
    public String overall;
    @JsonProperty("@agent")
    public String agent;
    @JsonProperty("@location")
    public String location;
    @JsonProperty("@name")
    public String name;
    @JsonProperty("@overall_review")
    public String overallReview;
    @JsonProperty("@car_review")
    public String carReview;
    @JsonProperty("@desk_review")
    public String deskReview;
    @JsonProperty("@dropoff_review")
    public String dropoffReview;
    @JsonProperty("@price_review")
    public String priceReview;
    @JsonProperty("@pickup_review")
    public String pickupReview;
    @JsonProperty("@wait_time")
    public String waitTime;
    @JsonProperty("@ave_wait_mins")
    public String aveWaitMins;
    @JsonProperty("@text")
    public String text;
    @JsonProperty("@total_agent")
    public String totalAgent;
    @JsonProperty("@total_agent_rounded")
    public String totalAgentRounded;

    public String getTotal() {
      return total;
    }

    public CustomerReviews setTotal(String total) {
      this.total = total;
      return this;
    }

    public String getOverall() {
      return overall;
    }

    public CustomerReviews setOverall(String overall) {
      this.overall = overall;
      return this;
    }

    public String getAgent() {
      return agent;
    }

    public CustomerReviews setAgent(String agent) {
      this.agent = agent;
      return this;
    }

    public String getLocation() {
      return location;
    }

    public CustomerReviews setLocation(String location) {
      this.location = location;
      return this;
    }

    public String getName() {
      return name;
    }

    public CustomerReviews setName(String name) {
      this.name = name;
      return this;
    }

    public String getOverallReview() {
      return overallReview;
    }

    public CustomerReviews setOverallReview(String overallReview) {
      this.overallReview = overallReview;
      return this;
    }

    public String getCarReview() {
      return carReview;
    }

    public CustomerReviews setCarReview(String carReview) {
      this.carReview = carReview;
      return this;
    }

    public String getDeskReview() {
      return deskReview;
    }

    public CustomerReviews setDeskReview(String deskReview) {
      this.deskReview = deskReview;
      return this;
    }

    public String getDropoffReview() {
      return dropoffReview;
    }

    public CustomerReviews setDropoffReview(String dropoffReview) {
      this.dropoffReview = dropoffReview;
      return this;
    }

    public String getPriceReview() {
      return priceReview;
    }

    public CustomerReviews setPriceReview(String priceReview) {
      this.priceReview = priceReview;
      return this;
    }

    public String getPickupReview() {
      return pickupReview;
    }

    public CustomerReviews setPickupReview(String pickupReview) {
      this.pickupReview = pickupReview;
      return this;
    }

    public String getWaitTime() {
      return waitTime;
    }

    public CustomerReviews setWaitTime(String waitTime) {
      this.waitTime = waitTime;
      return this;
    }

    public String getAveWaitMins() {
      return aveWaitMins;
    }

    public CustomerReviews setAveWaitMins(String aveWaitMins) {
      this.aveWaitMins = aveWaitMins;
      return this;
    }

    public String getText() {
      return text;
    }

    public CustomerReviews setText(String text) {
      this.text = text;
      return this;
    }

    public String getTotalAgent() {
      return totalAgent;
    }

    public CustomerReviews setTotalAgent(String totalAgent) {
      this.totalAgent = totalAgent;
      return this;
    }

    public String getTotalAgentRounded() {
      return totalAgentRounded;
    }

    public CustomerReviews setTotalAgentRounded(String totalAgentRounded) {
      this.totalAgentRounded = totalAgentRounded;
      return this;
    }
  }

  public static class Obfuscation {
    @JsonProperty("@ID")
    public String iD;

    public String getiD() {
      return iD;
    }

    public Obfuscation setiD(String iD) {
      this.iD = iD;
      return this;
    }
  }

  public static class Ranking {
    @JsonProperty("@index")
    public String index;
    @JsonProperty("@OrderBy")
    public String orderBy;

    public String getIndex() {
      return index;
    }

    public Ranking setIndex(String index) {
      this.index = index;
      return this;
    }

    public String getOrderBy() {
      return orderBy;
    }

    public Ranking setOrderBy(String orderBy) {
      this.orderBy = orderBy;
      return this;
    }
  }

  public static class Features {
    @JsonProperty("@PriceLock")
    public String priceLock;

    public String getPriceLock() {
      return priceLock;
    }

    public Features setPriceLock(String priceLock) {
      this.priceLock = priceLock;
      return this;
    }
  }

  public static class FlightDetails {
    @JsonProperty("@Required")
    public String required;

    public String getRequired() {
      return required;
    }

    public FlightDetails setRequired(String required) {
      this.required = required;
      return this;
    }
  }

  public static class Info {
    @JsonProperty("LocationDetails")
    public LocationDetails locationDetails;
    @JsonProperty("TPA_Extensions")
    public TPAExtensions tPA_Extensions;

    public LocationDetails getLocationDetails() {
      return locationDetails;
    }

    public Info setLocationDetails(LocationDetails locationDetails) {
      this.locationDetails = locationDetails;
      return this;
    }

    public TPAExtensions gettPA_Extensions() {
      return tPA_Extensions;
    }

    public Info settPA_Extensions(TPAExtensions tPA_Extensions) {
      this.tPA_Extensions = tPA_Extensions;
      return this;
    }
  }

  public static class VehVendorAvail {
    @JsonProperty("Vendor")
    public Vendor vendor;
    @JsonProperty("VehAvails")
    public List<VehAvail> vehAvails;
    @JsonProperty("Info")
    public Info info;

    public Vendor getVendor() {
      return vendor;
    }

    public VehVendorAvail setVendor(Vendor vendor) {
      this.vendor = vendor;
      return this;
    }

    public List<VehAvail> getVehAvails() {
      return vehAvails;
    }

    public VehVendorAvail setVehAvails(List<VehAvail> vehAvails) {
      this.vehAvails = vehAvails;
      return this;
    }

    public Info getInfo() {
      return info;
    }

    public VehVendorAvail setInfo(Info info) {
      this.info = info;
      return this;
    }
  }

  public static class VehAvailRSCore {
    
    @JsonProperty("VehRentalCore")
    public VehRentalCore vehRentalCore;
    @JsonProperty("VehVendorAvails")
    public List<VehVendorAvail> vehVendorAvails;

    public VehRentalCore getVehRentalCore() {
      return vehRentalCore;
    }

    public VehAvailRSCore setVehRentalCore(VehRentalCore vehRentalCore) {
      this.vehRentalCore = vehRentalCore;
      return this;
    }

    public List<VehVendorAvail> getVehVendorAvails() {
      return vehVendorAvails;
    }

    public VehAvailRSCore setVehVendorAvails(List<VehVendorAvail> vehVendorAvails) {
      this.vehVendorAvails = vehVendorAvails;
      return this;
    }
  }

}
