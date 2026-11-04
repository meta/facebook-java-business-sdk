/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 * All rights reserved.
 *
 * This source code is licensed under the license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.ads.sdk;

import java.io.File;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.base.Function;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import com.facebook.ads.sdk.APIException.MalformedResponseException;

/**
 * This class is auto-generated.
 *
 * For any issues or feature requests related to this class, please let us know
 * on github and we'll fix in our codegen framework. We'll not be able to accept
 * pull request for this class.
 *
 */
public class ProductCatalogAutomotiveItemGet extends APINode {
  @SerializedName("address")
  private Object mAddress = null;
  @SerializedName("amount_currency")
  private String mAmountCurrency = null;
  @SerializedName("amount_percentage")
  private Double mAmountPercentage = null;
  @SerializedName("amount_price")
  private String mAmountPrice = null;
  @SerializedName("amount_qualifier")
  private String mAmountQualifier = null;
  @SerializedName("applinks")
  private Object mApplinks = null;
  @SerializedName("automotive_model_id")
  private String mAutomotiveModelId = null;
  @SerializedName("availability")
  private EnumAvailability mAvailability = null;
  @SerializedName("availability_circle_radius")
  private Double mAvailabilityCircleRadius = null;
  @SerializedName("availability_circle_radius_unit")
  private EnumAvailabilityCircleRadiusUnit mAvailabilityCircleRadiusUnit = null;
  @SerializedName("body_style")
  private EnumBodyStyle mBodyStyle = null;
  @SerializedName("capabilities")
  private List<EnumCapabilities> mCapabilities = null;
  @SerializedName("capabilities_disabled_by_user")
  private List<EnumCapabilitiesDisabledByUser> mCapabilitiesDisabledByUser = null;
  @SerializedName("capabilities_rendering_catalog_manager")
  private List<EnumCapabilitiesRenderingCatalogManager> mCapabilitiesRenderingCatalogManager = null;
  @SerializedName("carfax_dealership_id")
  private String mCarfaxDealershipId = null;
  @SerializedName("channels_to_integrity_status")
  private Object mChannelsToIntegrityStatus = null;
  @SerializedName("comscore_market_codes")
  private List<String> mComscoreMarketCodes = null;
  @SerializedName("condition")
  private EnumCondition mCondition = null;
  @SerializedName("currency")
  private String mCurrency = null;
  @SerializedName("custom_label_0")
  private String mCustomLabel0 = null;
  @SerializedName("custom_label_1")
  private String mCustomLabel1 = null;
  @SerializedName("custom_label_2")
  private String mCustomLabel2 = null;
  @SerializedName("custom_label_3")
  private String mCustomLabel3 = null;
  @SerializedName("custom_label_4")
  private String mCustomLabel4 = null;
  @SerializedName("custom_number_0")
  private Long mCustomNumber0 = null;
  @SerializedName("custom_number_1")
  private Long mCustomNumber1 = null;
  @SerializedName("custom_number_2")
  private Long mCustomNumber2 = null;
  @SerializedName("custom_number_3")
  private Long mCustomNumber3 = null;
  @SerializedName("custom_number_4")
  private Long mCustomNumber4 = null;
  @SerializedName("date_first_on_lot")
  private String mDateFirstOnLot = null;
  @SerializedName("days_on_lot")
  private Long mDaysOnLot = null;
  @SerializedName("dealer_communication_channel")
  private EnumDealerCommunicationChannel mDealerCommunicationChannel = null;
  @SerializedName("dealer_email")
  private String mDealerEmail = null;
  @SerializedName("dealer_id")
  private String mDealerId = null;
  @SerializedName("dealer_name")
  private String mDealerName = null;
  @SerializedName("dealer_phone")
  private String mDealerPhone = null;
  @SerializedName("dealer_privacy_policy_url")
  private String mDealerPrivacyPolicyUrl = null;
  @SerializedName("dealer_url")
  private String mDealerUrl = null;
  @SerializedName("default_country")
  private String mDefaultCountry = null;
  @SerializedName("default_language_locale")
  private String mDefaultLanguageLocale = null;
  @SerializedName("description")
  private String mDescription = null;
  @SerializedName("downpayment_currency")
  private String mDownpaymentCurrency = null;
  @SerializedName("downpayment_price")
  private String mDownpaymentPrice = null;
  @SerializedName("downpayment_qualifier")
  private String mDownpaymentQualifier = null;
  @SerializedName("drivetrain")
  private EnumDrivetrain mDrivetrain = null;
  @SerializedName("enabled_capability_to_review_status")
  private List<Object> mEnabledCapabilityToReviewStatus = null;
  @SerializedName("end_date")
  private String mEndDate = null;
  @SerializedName("engine_size")
  private Double mEngineSize = null;
  @SerializedName("exterior_color")
  private String mExteriorColor = null;
  @SerializedName("fb_page_id")
  private Object mFbPageId = null;
  @SerializedName("features")
  private List<Object> mFeatures = null;
  @SerializedName("finance_description")
  private String mFinanceDescription = null;
  @SerializedName("finance_type")
  private EnumFinanceType mFinanceType = null;
  @SerializedName("fuel_type")
  private EnumFuelType mFuelType = null;
  @SerializedName("generation")
  private String mGeneration = null;
  @SerializedName("horse_power")
  private Long mHorsePower = null;
  @SerializedName("id")
  private Long mId = null;
  @SerializedName("image_fetch_status")
  private EnumImageFetchStatus mImageFetchStatus = null;
  @SerializedName("images")
  private List<String> mImages = null;
  @SerializedName("interior_color")
  private String mInteriorColor = null;
  @SerializedName("interior_upholstery")
  private String mInteriorUpholstery = null;
  @SerializedName("is_blackholed")
  private Boolean mIsBlackholed = null;
  @SerializedName("legal_disclosure_impressum_url")
  private String mLegalDisclosureImpressumUrl = null;
  @SerializedName("make")
  private String mMake = null;
  @SerializedName("mileage")
  private Object mMileage = null;
  @SerializedName("model")
  private String mModel = null;
  @SerializedName("offer_description")
  private String mOfferDescription = null;
  @SerializedName("offer_disclaimer")
  private String mOfferDisclaimer = null;
  @SerializedName("offer_disclaimer_url")
  private String mOfferDisclaimerUrl = null;
  @SerializedName("offer_type")
  private EnumOfferType mOfferType = null;
  @SerializedName("previous_currency")
  private String mPreviousCurrency = null;
  @SerializedName("previous_price")
  private String mPreviousPrice = null;
  @SerializedName("price")
  private String mPrice = null;
  @SerializedName("product_feed")
  private Object mProductFeed = null;
  @SerializedName("product_priority_0")
  private Double mProductPriority0 = null;
  @SerializedName("product_priority_1")
  private Double mProductPriority1 = null;
  @SerializedName("product_priority_2")
  private Double mProductPriority2 = null;
  @SerializedName("product_priority_3")
  private Double mProductPriority3 = null;
  @SerializedName("product_priority_4")
  private Double mProductPriority4 = null;
  @SerializedName("sale_currency")
  private String mSaleCurrency = null;
  @SerializedName("sale_price")
  private String mSalePrice = null;
  @SerializedName("sanitized_images")
  private List<String> mSanitizedImages = null;
  @SerializedName("sanitized_previews")
  private List<String> mSanitizedPreviews = null;
  @SerializedName("start_date")
  private String mStartDate = null;
  @SerializedName("state_of_vehicle")
  private EnumStateOfVehicle mStateOfVehicle = null;
  @SerializedName("stock_number")
  private String mStockNumber = null;
  @SerializedName("tags")
  private List<String> mTags = null;
  @SerializedName("term_length")
  private Long mTermLength = null;
  @SerializedName("term_qualifier")
  private String mTermQualifier = null;
  @SerializedName("title")
  private String mTitle = null;
  @SerializedName("transmission")
  private EnumTransmission mTransmission = null;
  @SerializedName("trim")
  private String mTrim = null;
  @SerializedName("unit_price")
  private Object mUnitPrice = null;
  @SerializedName("url")
  private String mUrl = null;
  @SerializedName("url_shimmed")
  private String mUrlShimmed = null;
  @SerializedName("validation_errors")
  private Object mValidationErrors = null;
  @SerializedName("vehicle_id")
  private String mVehicleId = null;
  @SerializedName("vehicle_offer_id")
  private String mVehicleOfferId = null;
  @SerializedName("vehicle_registration_plate")
  private String mVehicleRegistrationPlate = null;
  @SerializedName("vehicle_specifications")
  private List<Object> mVehicleSpecifications = null;
  @SerializedName("vehicle_type")
  private EnumVehicleType mVehicleType = null;
  @SerializedName("videos_metadata")
  private Object mVideosMetadata = null;
  @SerializedName("vin")
  private String mVin = null;
  @SerializedName("visibility")
  private EnumVisibility mVisibility = null;
  @SerializedName("year")
  private Long mYear = null;
  protected static Gson gson = null;

  public ProductCatalogAutomotiveItemGet() {
  }

  public String getId() {
    return getFieldId().toString();
  }
  public static ProductCatalogAutomotiveItemGet loadJSON(String json, APIContext context, String header) {
    ProductCatalogAutomotiveItemGet productCatalogAutomotiveItemGet = getGson().fromJson(json, ProductCatalogAutomotiveItemGet.class);
    if (context.isDebug()) {
      JsonParser parser = new JsonParser();
      JsonElement o1 = parser.parse(json);
      JsonElement o2 = parser.parse(productCatalogAutomotiveItemGet.toString());
      if (o1.getAsJsonObject().get("__fb_trace_id__") != null) {
        o2.getAsJsonObject().add("__fb_trace_id__", o1.getAsJsonObject().get("__fb_trace_id__"));
      }
      if (!o1.equals(o2)) {
        context.log("[Warning] When parsing response, object is not consistent with JSON:");
        context.log("[JSON]" + o1);
        context.log("[Object]" + o2);
      }
    }
    productCatalogAutomotiveItemGet.context = context;
    productCatalogAutomotiveItemGet.rawValue = json;
    productCatalogAutomotiveItemGet.header = header;
    return productCatalogAutomotiveItemGet;
  }

  public static APINodeList<ProductCatalogAutomotiveItemGet> parseResponse(String json, APIContext context, APIRequest request, String header) throws MalformedResponseException {
    APINodeList<ProductCatalogAutomotiveItemGet> productCatalogAutomotiveItemGets = new APINodeList<ProductCatalogAutomotiveItemGet>(request, json, header);
    JsonArray arr;
    JsonObject obj;
    JsonParser parser = new JsonParser();
    Exception exception = null;
    try{
      JsonElement result = parser.parse(json);
      if (result.isJsonArray()) {
        // First, check if it's a pure JSON Array
        arr = result.getAsJsonArray();
        for (int i = 0; i < arr.size(); i++) {
          productCatalogAutomotiveItemGets.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
        };
        return productCatalogAutomotiveItemGets;
      } else if (result.isJsonObject()) {
        obj = result.getAsJsonObject();
        if (obj.has("data")) {
          if (obj.has("paging")) {
            JsonObject paging = obj.get("paging").getAsJsonObject();
            if (paging.has("cursors")) {
                JsonObject cursors = paging.get("cursors").getAsJsonObject();
                String before = cursors.has("before") ? cursors.get("before").getAsString() : null;
                String after = cursors.has("after") ? cursors.get("after").getAsString() : null;
                productCatalogAutomotiveItemGets.setCursors(before, after);
            }
            String previous = paging.has("previous") ? paging.get("previous").getAsString() : null;
            String next = paging.has("next") ? paging.get("next").getAsString() : null;
            productCatalogAutomotiveItemGets.setPaging(previous, next);
            if (context.hasAppSecret()) {
              productCatalogAutomotiveItemGets.setAppSecret(context.getAppSecretProof());
            }
          }
          if (obj.get("data").isJsonArray()) {
            // Second, check if it's a JSON array with "data"
            arr = obj.get("data").getAsJsonArray();
            for (int i = 0; i < arr.size(); i++) {
              productCatalogAutomotiveItemGets.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
            };
          } else if (obj.get("data").isJsonObject()) {
            // Third, check if it's a JSON object with "data"
            obj = obj.get("data").getAsJsonObject();
            boolean isRedownload = false;
            for (String s : new String[]{"campaigns", "adsets", "ads"}) {
              if (obj.has(s)) {
                isRedownload = true;
                obj = obj.getAsJsonObject(s);
                for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
                  productCatalogAutomotiveItemGets.add(loadJSON(entry.getValue().toString(), context, header));
                }
                break;
              }
            }
            if (!isRedownload) {
              productCatalogAutomotiveItemGets.add(loadJSON(obj.toString(), context, header));
            }
          }
          return productCatalogAutomotiveItemGets;
        } else if (obj.has("images")) {
          // Fourth, check if it's a map of image objects
          obj = obj.get("images").getAsJsonObject();
          for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
              productCatalogAutomotiveItemGets.add(loadJSON(entry.getValue().toString(), context, header));
          }
          return productCatalogAutomotiveItemGets;
        } else {
          // Fifth, check if it's an array of objects indexed by id
          boolean isIdIndexedArray = true;
          for (Map.Entry entry : obj.entrySet()) {
            String key = (String) entry.getKey();
            if (key.equals("__fb_trace_id__")) {
              continue;
            }
            JsonElement value = (JsonElement) entry.getValue();
            if (
              value != null &&
              value.isJsonObject() &&
              value.getAsJsonObject().has("id") &&
              value.getAsJsonObject().get("id") != null &&
              value.getAsJsonObject().get("id").getAsString().equals(key)
            ) {
              productCatalogAutomotiveItemGets.add(loadJSON(value.toString(), context, header));
            } else {
              isIdIndexedArray = false;
              break;
            }
          }
          if (isIdIndexedArray) {
            return productCatalogAutomotiveItemGets;
          }

          // Sixth, check if it's pure JsonObject
          productCatalogAutomotiveItemGets.clear();
          productCatalogAutomotiveItemGets.add(loadJSON(json, context, header));
          return productCatalogAutomotiveItemGets;
        }
      }
    } catch (Exception e) {
      exception = e;
    }
    throw new MalformedResponseException(
      "Invalid response string: " + json,
      exception
    );
  }

  @Override
  public APIContext getContext() {
    return context;
  }

  @Override
  public void setContext(APIContext context) {
    this.context = context;
  }

  @Override
  public String toString() {
    return getGson().toJson(this);
  }


  public Object getFieldAddress() {
    return mAddress;
  }

  public ProductCatalogAutomotiveItemGet setFieldAddress(Object value) {
    this.mAddress = value;
    return this;
  }

  public String getFieldAmountCurrency() {
    return mAmountCurrency;
  }

  public ProductCatalogAutomotiveItemGet setFieldAmountCurrency(String value) {
    this.mAmountCurrency = value;
    return this;
  }

  public Double getFieldAmountPercentage() {
    return mAmountPercentage;
  }

  public ProductCatalogAutomotiveItemGet setFieldAmountPercentage(Double value) {
    this.mAmountPercentage = value;
    return this;
  }

  public String getFieldAmountPrice() {
    return mAmountPrice;
  }

  public ProductCatalogAutomotiveItemGet setFieldAmountPrice(String value) {
    this.mAmountPrice = value;
    return this;
  }

  public String getFieldAmountQualifier() {
    return mAmountQualifier;
  }

  public ProductCatalogAutomotiveItemGet setFieldAmountQualifier(String value) {
    this.mAmountQualifier = value;
    return this;
  }

  public Object getFieldApplinks() {
    return mApplinks;
  }

  public ProductCatalogAutomotiveItemGet setFieldApplinks(Object value) {
    this.mApplinks = value;
    return this;
  }

  public String getFieldAutomotiveModelId() {
    return mAutomotiveModelId;
  }

  public ProductCatalogAutomotiveItemGet setFieldAutomotiveModelId(String value) {
    this.mAutomotiveModelId = value;
    return this;
  }

  public EnumAvailability getFieldAvailability() {
    return mAvailability;
  }

  public ProductCatalogAutomotiveItemGet setFieldAvailability(EnumAvailability value) {
    this.mAvailability = value;
    return this;
  }

  public Double getFieldAvailabilityCircleRadius() {
    return mAvailabilityCircleRadius;
  }

  public ProductCatalogAutomotiveItemGet setFieldAvailabilityCircleRadius(Double value) {
    this.mAvailabilityCircleRadius = value;
    return this;
  }

  public EnumAvailabilityCircleRadiusUnit getFieldAvailabilityCircleRadiusUnit() {
    return mAvailabilityCircleRadiusUnit;
  }

  public ProductCatalogAutomotiveItemGet setFieldAvailabilityCircleRadiusUnit(EnumAvailabilityCircleRadiusUnit value) {
    this.mAvailabilityCircleRadiusUnit = value;
    return this;
  }

  public EnumBodyStyle getFieldBodyStyle() {
    return mBodyStyle;
  }

  public ProductCatalogAutomotiveItemGet setFieldBodyStyle(EnumBodyStyle value) {
    this.mBodyStyle = value;
    return this;
  }

  public List<EnumCapabilities> getFieldCapabilities() {
    return mCapabilities;
  }

  public ProductCatalogAutomotiveItemGet setFieldCapabilities(List<EnumCapabilities> value) {
    this.mCapabilities = value;
    return this;
  }

  public List<EnumCapabilitiesDisabledByUser> getFieldCapabilitiesDisabledByUser() {
    return mCapabilitiesDisabledByUser;
  }

  public ProductCatalogAutomotiveItemGet setFieldCapabilitiesDisabledByUser(List<EnumCapabilitiesDisabledByUser> value) {
    this.mCapabilitiesDisabledByUser = value;
    return this;
  }

  public List<EnumCapabilitiesRenderingCatalogManager> getFieldCapabilitiesRenderingCatalogManager() {
    return mCapabilitiesRenderingCatalogManager;
  }

  public ProductCatalogAutomotiveItemGet setFieldCapabilitiesRenderingCatalogManager(List<EnumCapabilitiesRenderingCatalogManager> value) {
    this.mCapabilitiesRenderingCatalogManager = value;
    return this;
  }

  public String getFieldCarfaxDealershipId() {
    return mCarfaxDealershipId;
  }

  public ProductCatalogAutomotiveItemGet setFieldCarfaxDealershipId(String value) {
    this.mCarfaxDealershipId = value;
    return this;
  }

  public Object getFieldChannelsToIntegrityStatus() {
    return mChannelsToIntegrityStatus;
  }

  public ProductCatalogAutomotiveItemGet setFieldChannelsToIntegrityStatus(Object value) {
    this.mChannelsToIntegrityStatus = value;
    return this;
  }

  public List<String> getFieldComscoreMarketCodes() {
    return mComscoreMarketCodes;
  }

  public ProductCatalogAutomotiveItemGet setFieldComscoreMarketCodes(List<String> value) {
    this.mComscoreMarketCodes = value;
    return this;
  }

  public EnumCondition getFieldCondition() {
    return mCondition;
  }

  public ProductCatalogAutomotiveItemGet setFieldCondition(EnumCondition value) {
    this.mCondition = value;
    return this;
  }

  public String getFieldCurrency() {
    return mCurrency;
  }

  public ProductCatalogAutomotiveItemGet setFieldCurrency(String value) {
    this.mCurrency = value;
    return this;
  }

  public String getFieldCustomLabel0() {
    return mCustomLabel0;
  }

  public ProductCatalogAutomotiveItemGet setFieldCustomLabel0(String value) {
    this.mCustomLabel0 = value;
    return this;
  }

  public String getFieldCustomLabel1() {
    return mCustomLabel1;
  }

  public ProductCatalogAutomotiveItemGet setFieldCustomLabel1(String value) {
    this.mCustomLabel1 = value;
    return this;
  }

  public String getFieldCustomLabel2() {
    return mCustomLabel2;
  }

  public ProductCatalogAutomotiveItemGet setFieldCustomLabel2(String value) {
    this.mCustomLabel2 = value;
    return this;
  }

  public String getFieldCustomLabel3() {
    return mCustomLabel3;
  }

  public ProductCatalogAutomotiveItemGet setFieldCustomLabel3(String value) {
    this.mCustomLabel3 = value;
    return this;
  }

  public String getFieldCustomLabel4() {
    return mCustomLabel4;
  }

  public ProductCatalogAutomotiveItemGet setFieldCustomLabel4(String value) {
    this.mCustomLabel4 = value;
    return this;
  }

  public Long getFieldCustomNumber0() {
    return mCustomNumber0;
  }

  public ProductCatalogAutomotiveItemGet setFieldCustomNumber0(Long value) {
    this.mCustomNumber0 = value;
    return this;
  }

  public Long getFieldCustomNumber1() {
    return mCustomNumber1;
  }

  public ProductCatalogAutomotiveItemGet setFieldCustomNumber1(Long value) {
    this.mCustomNumber1 = value;
    return this;
  }

  public Long getFieldCustomNumber2() {
    return mCustomNumber2;
  }

  public ProductCatalogAutomotiveItemGet setFieldCustomNumber2(Long value) {
    this.mCustomNumber2 = value;
    return this;
  }

  public Long getFieldCustomNumber3() {
    return mCustomNumber3;
  }

  public ProductCatalogAutomotiveItemGet setFieldCustomNumber3(Long value) {
    this.mCustomNumber3 = value;
    return this;
  }

  public Long getFieldCustomNumber4() {
    return mCustomNumber4;
  }

  public ProductCatalogAutomotiveItemGet setFieldCustomNumber4(Long value) {
    this.mCustomNumber4 = value;
    return this;
  }

  public String getFieldDateFirstOnLot() {
    return mDateFirstOnLot;
  }

  public ProductCatalogAutomotiveItemGet setFieldDateFirstOnLot(String value) {
    this.mDateFirstOnLot = value;
    return this;
  }

  public Long getFieldDaysOnLot() {
    return mDaysOnLot;
  }

  public ProductCatalogAutomotiveItemGet setFieldDaysOnLot(Long value) {
    this.mDaysOnLot = value;
    return this;
  }

  public EnumDealerCommunicationChannel getFieldDealerCommunicationChannel() {
    return mDealerCommunicationChannel;
  }

  public ProductCatalogAutomotiveItemGet setFieldDealerCommunicationChannel(EnumDealerCommunicationChannel value) {
    this.mDealerCommunicationChannel = value;
    return this;
  }

  public String getFieldDealerEmail() {
    return mDealerEmail;
  }

  public ProductCatalogAutomotiveItemGet setFieldDealerEmail(String value) {
    this.mDealerEmail = value;
    return this;
  }

  public String getFieldDealerId() {
    return mDealerId;
  }

  public ProductCatalogAutomotiveItemGet setFieldDealerId(String value) {
    this.mDealerId = value;
    return this;
  }

  public String getFieldDealerName() {
    return mDealerName;
  }

  public ProductCatalogAutomotiveItemGet setFieldDealerName(String value) {
    this.mDealerName = value;
    return this;
  }

  public String getFieldDealerPhone() {
    return mDealerPhone;
  }

  public ProductCatalogAutomotiveItemGet setFieldDealerPhone(String value) {
    this.mDealerPhone = value;
    return this;
  }

  public String getFieldDealerPrivacyPolicyUrl() {
    return mDealerPrivacyPolicyUrl;
  }

  public ProductCatalogAutomotiveItemGet setFieldDealerPrivacyPolicyUrl(String value) {
    this.mDealerPrivacyPolicyUrl = value;
    return this;
  }

  public String getFieldDealerUrl() {
    return mDealerUrl;
  }

  public ProductCatalogAutomotiveItemGet setFieldDealerUrl(String value) {
    this.mDealerUrl = value;
    return this;
  }

  public String getFieldDefaultCountry() {
    return mDefaultCountry;
  }

  public ProductCatalogAutomotiveItemGet setFieldDefaultCountry(String value) {
    this.mDefaultCountry = value;
    return this;
  }

  public String getFieldDefaultLanguageLocale() {
    return mDefaultLanguageLocale;
  }

  public ProductCatalogAutomotiveItemGet setFieldDefaultLanguageLocale(String value) {
    this.mDefaultLanguageLocale = value;
    return this;
  }

  public String getFieldDescription() {
    return mDescription;
  }

  public ProductCatalogAutomotiveItemGet setFieldDescription(String value) {
    this.mDescription = value;
    return this;
  }

  public String getFieldDownpaymentCurrency() {
    return mDownpaymentCurrency;
  }

  public ProductCatalogAutomotiveItemGet setFieldDownpaymentCurrency(String value) {
    this.mDownpaymentCurrency = value;
    return this;
  }

  public String getFieldDownpaymentPrice() {
    return mDownpaymentPrice;
  }

  public ProductCatalogAutomotiveItemGet setFieldDownpaymentPrice(String value) {
    this.mDownpaymentPrice = value;
    return this;
  }

  public String getFieldDownpaymentQualifier() {
    return mDownpaymentQualifier;
  }

  public ProductCatalogAutomotiveItemGet setFieldDownpaymentQualifier(String value) {
    this.mDownpaymentQualifier = value;
    return this;
  }

  public EnumDrivetrain getFieldDrivetrain() {
    return mDrivetrain;
  }

  public ProductCatalogAutomotiveItemGet setFieldDrivetrain(EnumDrivetrain value) {
    this.mDrivetrain = value;
    return this;
  }

  public List<Object> getFieldEnabledCapabilityToReviewStatus() {
    return mEnabledCapabilityToReviewStatus;
  }

  public ProductCatalogAutomotiveItemGet setFieldEnabledCapabilityToReviewStatus(List<Object> value) {
    this.mEnabledCapabilityToReviewStatus = value;
    return this;
  }

  public String getFieldEndDate() {
    return mEndDate;
  }

  public ProductCatalogAutomotiveItemGet setFieldEndDate(String value) {
    this.mEndDate = value;
    return this;
  }

  public Double getFieldEngineSize() {
    return mEngineSize;
  }

  public ProductCatalogAutomotiveItemGet setFieldEngineSize(Double value) {
    this.mEngineSize = value;
    return this;
  }

  public String getFieldExteriorColor() {
    return mExteriorColor;
  }

  public ProductCatalogAutomotiveItemGet setFieldExteriorColor(String value) {
    this.mExteriorColor = value;
    return this;
  }

  public Object getFieldFbPageId() {
    return mFbPageId;
  }

  public ProductCatalogAutomotiveItemGet setFieldFbPageId(Object value) {
    this.mFbPageId = value;
    return this;
  }

  public List<Object> getFieldFeatures() {
    return mFeatures;
  }

  public ProductCatalogAutomotiveItemGet setFieldFeatures(List<Object> value) {
    this.mFeatures = value;
    return this;
  }

  public String getFieldFinanceDescription() {
    return mFinanceDescription;
  }

  public ProductCatalogAutomotiveItemGet setFieldFinanceDescription(String value) {
    this.mFinanceDescription = value;
    return this;
  }

  public EnumFinanceType getFieldFinanceType() {
    return mFinanceType;
  }

  public ProductCatalogAutomotiveItemGet setFieldFinanceType(EnumFinanceType value) {
    this.mFinanceType = value;
    return this;
  }

  public EnumFuelType getFieldFuelType() {
    return mFuelType;
  }

  public ProductCatalogAutomotiveItemGet setFieldFuelType(EnumFuelType value) {
    this.mFuelType = value;
    return this;
  }

  public String getFieldGeneration() {
    return mGeneration;
  }

  public ProductCatalogAutomotiveItemGet setFieldGeneration(String value) {
    this.mGeneration = value;
    return this;
  }

  public Long getFieldHorsePower() {
    return mHorsePower;
  }

  public ProductCatalogAutomotiveItemGet setFieldHorsePower(Long value) {
    this.mHorsePower = value;
    return this;
  }

  public Long getFieldId() {
    return mId;
  }

  public ProductCatalogAutomotiveItemGet setFieldId(Long value) {
    this.mId = value;
    return this;
  }

  public EnumImageFetchStatus getFieldImageFetchStatus() {
    return mImageFetchStatus;
  }

  public ProductCatalogAutomotiveItemGet setFieldImageFetchStatus(EnumImageFetchStatus value) {
    this.mImageFetchStatus = value;
    return this;
  }

  public List<String> getFieldImages() {
    return mImages;
  }

  public ProductCatalogAutomotiveItemGet setFieldImages(List<String> value) {
    this.mImages = value;
    return this;
  }

  public String getFieldInteriorColor() {
    return mInteriorColor;
  }

  public ProductCatalogAutomotiveItemGet setFieldInteriorColor(String value) {
    this.mInteriorColor = value;
    return this;
  }

  public String getFieldInteriorUpholstery() {
    return mInteriorUpholstery;
  }

  public ProductCatalogAutomotiveItemGet setFieldInteriorUpholstery(String value) {
    this.mInteriorUpholstery = value;
    return this;
  }

  public Boolean getFieldIsBlackholed() {
    return mIsBlackholed;
  }

  public ProductCatalogAutomotiveItemGet setFieldIsBlackholed(Boolean value) {
    this.mIsBlackholed = value;
    return this;
  }

  public String getFieldLegalDisclosureImpressumUrl() {
    return mLegalDisclosureImpressumUrl;
  }

  public ProductCatalogAutomotiveItemGet setFieldLegalDisclosureImpressumUrl(String value) {
    this.mLegalDisclosureImpressumUrl = value;
    return this;
  }

  public String getFieldMake() {
    return mMake;
  }

  public ProductCatalogAutomotiveItemGet setFieldMake(String value) {
    this.mMake = value;
    return this;
  }

  public Object getFieldMileage() {
    return mMileage;
  }

  public ProductCatalogAutomotiveItemGet setFieldMileage(Object value) {
    this.mMileage = value;
    return this;
  }

  public String getFieldModel() {
    return mModel;
  }

  public ProductCatalogAutomotiveItemGet setFieldModel(String value) {
    this.mModel = value;
    return this;
  }

  public String getFieldOfferDescription() {
    return mOfferDescription;
  }

  public ProductCatalogAutomotiveItemGet setFieldOfferDescription(String value) {
    this.mOfferDescription = value;
    return this;
  }

  public String getFieldOfferDisclaimer() {
    return mOfferDisclaimer;
  }

  public ProductCatalogAutomotiveItemGet setFieldOfferDisclaimer(String value) {
    this.mOfferDisclaimer = value;
    return this;
  }

  public String getFieldOfferDisclaimerUrl() {
    return mOfferDisclaimerUrl;
  }

  public ProductCatalogAutomotiveItemGet setFieldOfferDisclaimerUrl(String value) {
    this.mOfferDisclaimerUrl = value;
    return this;
  }

  public EnumOfferType getFieldOfferType() {
    return mOfferType;
  }

  public ProductCatalogAutomotiveItemGet setFieldOfferType(EnumOfferType value) {
    this.mOfferType = value;
    return this;
  }

  public String getFieldPreviousCurrency() {
    return mPreviousCurrency;
  }

  public ProductCatalogAutomotiveItemGet setFieldPreviousCurrency(String value) {
    this.mPreviousCurrency = value;
    return this;
  }

  public String getFieldPreviousPrice() {
    return mPreviousPrice;
  }

  public ProductCatalogAutomotiveItemGet setFieldPreviousPrice(String value) {
    this.mPreviousPrice = value;
    return this;
  }

  public String getFieldPrice() {
    return mPrice;
  }

  public ProductCatalogAutomotiveItemGet setFieldPrice(String value) {
    this.mPrice = value;
    return this;
  }

  public Object getFieldProductFeed() {
    return mProductFeed;
  }

  public ProductCatalogAutomotiveItemGet setFieldProductFeed(Object value) {
    this.mProductFeed = value;
    return this;
  }

  public Double getFieldProductPriority0() {
    return mProductPriority0;
  }

  public ProductCatalogAutomotiveItemGet setFieldProductPriority0(Double value) {
    this.mProductPriority0 = value;
    return this;
  }

  public Double getFieldProductPriority1() {
    return mProductPriority1;
  }

  public ProductCatalogAutomotiveItemGet setFieldProductPriority1(Double value) {
    this.mProductPriority1 = value;
    return this;
  }

  public Double getFieldProductPriority2() {
    return mProductPriority2;
  }

  public ProductCatalogAutomotiveItemGet setFieldProductPriority2(Double value) {
    this.mProductPriority2 = value;
    return this;
  }

  public Double getFieldProductPriority3() {
    return mProductPriority3;
  }

  public ProductCatalogAutomotiveItemGet setFieldProductPriority3(Double value) {
    this.mProductPriority3 = value;
    return this;
  }

  public Double getFieldProductPriority4() {
    return mProductPriority4;
  }

  public ProductCatalogAutomotiveItemGet setFieldProductPriority4(Double value) {
    this.mProductPriority4 = value;
    return this;
  }

  public String getFieldSaleCurrency() {
    return mSaleCurrency;
  }

  public ProductCatalogAutomotiveItemGet setFieldSaleCurrency(String value) {
    this.mSaleCurrency = value;
    return this;
  }

  public String getFieldSalePrice() {
    return mSalePrice;
  }

  public ProductCatalogAutomotiveItemGet setFieldSalePrice(String value) {
    this.mSalePrice = value;
    return this;
  }

  public List<String> getFieldSanitizedImages() {
    return mSanitizedImages;
  }

  public ProductCatalogAutomotiveItemGet setFieldSanitizedImages(List<String> value) {
    this.mSanitizedImages = value;
    return this;
  }

  public List<String> getFieldSanitizedPreviews() {
    return mSanitizedPreviews;
  }

  public ProductCatalogAutomotiveItemGet setFieldSanitizedPreviews(List<String> value) {
    this.mSanitizedPreviews = value;
    return this;
  }

  public String getFieldStartDate() {
    return mStartDate;
  }

  public ProductCatalogAutomotiveItemGet setFieldStartDate(String value) {
    this.mStartDate = value;
    return this;
  }

  public EnumStateOfVehicle getFieldStateOfVehicle() {
    return mStateOfVehicle;
  }

  public ProductCatalogAutomotiveItemGet setFieldStateOfVehicle(EnumStateOfVehicle value) {
    this.mStateOfVehicle = value;
    return this;
  }

  public String getFieldStockNumber() {
    return mStockNumber;
  }

  public ProductCatalogAutomotiveItemGet setFieldStockNumber(String value) {
    this.mStockNumber = value;
    return this;
  }

  public List<String> getFieldTags() {
    return mTags;
  }

  public ProductCatalogAutomotiveItemGet setFieldTags(List<String> value) {
    this.mTags = value;
    return this;
  }

  public Long getFieldTermLength() {
    return mTermLength;
  }

  public ProductCatalogAutomotiveItemGet setFieldTermLength(Long value) {
    this.mTermLength = value;
    return this;
  }

  public String getFieldTermQualifier() {
    return mTermQualifier;
  }

  public ProductCatalogAutomotiveItemGet setFieldTermQualifier(String value) {
    this.mTermQualifier = value;
    return this;
  }

  public String getFieldTitle() {
    return mTitle;
  }

  public ProductCatalogAutomotiveItemGet setFieldTitle(String value) {
    this.mTitle = value;
    return this;
  }

  public EnumTransmission getFieldTransmission() {
    return mTransmission;
  }

  public ProductCatalogAutomotiveItemGet setFieldTransmission(EnumTransmission value) {
    this.mTransmission = value;
    return this;
  }

  public String getFieldTrim() {
    return mTrim;
  }

  public ProductCatalogAutomotiveItemGet setFieldTrim(String value) {
    this.mTrim = value;
    return this;
  }

  public Object getFieldUnitPrice() {
    return mUnitPrice;
  }

  public ProductCatalogAutomotiveItemGet setFieldUnitPrice(Object value) {
    this.mUnitPrice = value;
    return this;
  }

  public String getFieldUrl() {
    return mUrl;
  }

  public ProductCatalogAutomotiveItemGet setFieldUrl(String value) {
    this.mUrl = value;
    return this;
  }

  public String getFieldUrlShimmed() {
    return mUrlShimmed;
  }

  public ProductCatalogAutomotiveItemGet setFieldUrlShimmed(String value) {
    this.mUrlShimmed = value;
    return this;
  }

  public Object getFieldValidationErrors() {
    return mValidationErrors;
  }

  public ProductCatalogAutomotiveItemGet setFieldValidationErrors(Object value) {
    this.mValidationErrors = value;
    return this;
  }

  public String getFieldVehicleId() {
    return mVehicleId;
  }

  public ProductCatalogAutomotiveItemGet setFieldVehicleId(String value) {
    this.mVehicleId = value;
    return this;
  }

  public String getFieldVehicleOfferId() {
    return mVehicleOfferId;
  }

  public ProductCatalogAutomotiveItemGet setFieldVehicleOfferId(String value) {
    this.mVehicleOfferId = value;
    return this;
  }

  public String getFieldVehicleRegistrationPlate() {
    return mVehicleRegistrationPlate;
  }

  public ProductCatalogAutomotiveItemGet setFieldVehicleRegistrationPlate(String value) {
    this.mVehicleRegistrationPlate = value;
    return this;
  }

  public List<Object> getFieldVehicleSpecifications() {
    return mVehicleSpecifications;
  }

  public ProductCatalogAutomotiveItemGet setFieldVehicleSpecifications(List<Object> value) {
    this.mVehicleSpecifications = value;
    return this;
  }

  public EnumVehicleType getFieldVehicleType() {
    return mVehicleType;
  }

  public ProductCatalogAutomotiveItemGet setFieldVehicleType(EnumVehicleType value) {
    this.mVehicleType = value;
    return this;
  }

  public Object getFieldVideosMetadata() {
    return mVideosMetadata;
  }

  public ProductCatalogAutomotiveItemGet setFieldVideosMetadata(Object value) {
    this.mVideosMetadata = value;
    return this;
  }

  public String getFieldVin() {
    return mVin;
  }

  public ProductCatalogAutomotiveItemGet setFieldVin(String value) {
    this.mVin = value;
    return this;
  }

  public EnumVisibility getFieldVisibility() {
    return mVisibility;
  }

  public ProductCatalogAutomotiveItemGet setFieldVisibility(EnumVisibility value) {
    this.mVisibility = value;
    return this;
  }

  public Long getFieldYear() {
    return mYear;
  }

  public ProductCatalogAutomotiveItemGet setFieldYear(Long value) {
    this.mYear = value;
    return this;
  }



  public static enum EnumAvailability {
      @SerializedName("AVAILABLE")
      VALUE_AVAILABLE("AVAILABLE"),
      @SerializedName("NOT_AVAILABLE")
      VALUE_NOT_AVAILABLE("NOT_AVAILABLE"),
      @SerializedName("PENDING")
      VALUE_PENDING("PENDING"),
      @SerializedName("UNKNOWN")
      VALUE_UNKNOWN("UNKNOWN"),
      ;

      private String value;

      private EnumAvailability(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumAvailabilityCircleRadiusUnit {
      @SerializedName("KM")
      VALUE_KM("KM"),
      @SerializedName("MI")
      VALUE_MI("MI"),
      ;

      private String value;

      private EnumAvailabilityCircleRadiusUnit(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumBodyStyle {
      @SerializedName("CONVERTIBLE")
      VALUE_CONVERTIBLE("CONVERTIBLE"),
      @SerializedName("COUPE")
      VALUE_COUPE("COUPE"),
      @SerializedName("CROSSOVER")
      VALUE_CROSSOVER("CROSSOVER"),
      @SerializedName("ESTATE")
      VALUE_ESTATE("ESTATE"),
      @SerializedName("GRANDTOURER")
      VALUE_GRANDTOURER("GRANDTOURER"),
      @SerializedName("HATCHBACK")
      VALUE_HATCHBACK("HATCHBACK"),
      @SerializedName("MINIBUS")
      VALUE_MINIBUS("MINIBUS"),
      @SerializedName("MINIVAN")
      VALUE_MINIVAN("MINIVAN"),
      @SerializedName("MPV")
      VALUE_MPV("MPV"),
      @SerializedName("NONE")
      VALUE_NONE("NONE"),
      @SerializedName("OTHER")
      VALUE_OTHER("OTHER"),
      @SerializedName("PICKUP")
      VALUE_PICKUP("PICKUP"),
      @SerializedName("ROADSTER")
      VALUE_ROADSTER("ROADSTER"),
      @SerializedName("SALOON")
      VALUE_SALOON("SALOON"),
      @SerializedName("SEDAN")
      VALUE_SEDAN("SEDAN"),
      @SerializedName("SMALL_CAR")
      VALUE_SMALL_CAR("SMALL_CAR"),
      @SerializedName("SPORTSCAR")
      VALUE_SPORTSCAR("SPORTSCAR"),
      @SerializedName("SUPERCAR")
      VALUE_SUPERCAR("SUPERCAR"),
      @SerializedName("SUPERMINI")
      VALUE_SUPERMINI("SUPERMINI"),
      @SerializedName("SUV")
      VALUE_SUV("SUV"),
      @SerializedName("TRUCK")
      VALUE_TRUCK("TRUCK"),
      @SerializedName("VAN")
      VALUE_VAN("VAN"),
      @SerializedName("WAGON")
      VALUE_WAGON("WAGON"),
      ;

      private String value;

      private EnumBodyStyle(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumCapabilities {
      @SerializedName("B2C_MARKETPLACE")
      VALUE_B2C_MARKETPLACE("B2C_MARKETPLACE"),
      @SerializedName("C2C_MARKETPLACE")
      VALUE_C2C_MARKETPLACE("C2C_MARKETPLACE"),
      @SerializedName("DA")
      VALUE_DA("DA"),
      @SerializedName("DAILY_DEALS")
      VALUE_DAILY_DEALS("DAILY_DEALS"),
      @SerializedName("DAILY_DEALS_LEGACY")
      VALUE_DAILY_DEALS_LEGACY("DAILY_DEALS_LEGACY"),
      @SerializedName("IG_PRODUCT_TAGGING")
      VALUE_IG_PRODUCT_TAGGING("IG_PRODUCT_TAGGING"),
      @SerializedName("MARKETPLACE")
      VALUE_MARKETPLACE("MARKETPLACE"),
      @SerializedName("MARKETPLACE_ADS_DEPRECATED")
      VALUE_MARKETPLACE_ADS_DEPRECATED("MARKETPLACE_ADS_DEPRECATED"),
      @SerializedName("MARKETPLACE_SHOPS")
      VALUE_MARKETPLACE_SHOPS("MARKETPLACE_SHOPS"),
      @SerializedName("MINI_SHOPS")
      VALUE_MINI_SHOPS("MINI_SHOPS"),
      @SerializedName("OFFLINE_CONVERSIONS")
      VALUE_OFFLINE_CONVERSIONS("OFFLINE_CONVERSIONS"),
      @SerializedName("SHOPS")
      VALUE_SHOPS("SHOPS"),
      @SerializedName("UNIVERSAL_CHECKOUT")
      VALUE_UNIVERSAL_CHECKOUT("UNIVERSAL_CHECKOUT"),
      @SerializedName("WHATSAPP")
      VALUE_WHATSAPP("WHATSAPP"),
      ;

      private String value;

      private EnumCapabilities(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumCapabilitiesDisabledByUser {
      @SerializedName("B2C_MARKETPLACE")
      VALUE_B2C_MARKETPLACE("B2C_MARKETPLACE"),
      @SerializedName("BIZ_MSG_AI_AGENT")
      VALUE_BIZ_MSG_AI_AGENT("BIZ_MSG_AI_AGENT"),
      @SerializedName("BUSINESS_INBOX_IN_MESSENGER")
      VALUE_BUSINESS_INBOX_IN_MESSENGER("BUSINESS_INBOX_IN_MESSENGER"),
      @SerializedName("BUY_ON_FACEBOOK")
      VALUE_BUY_ON_FACEBOOK("BUY_ON_FACEBOOK"),
      @SerializedName("C2C_MARKETPLACE")
      VALUE_C2C_MARKETPLACE("C2C_MARKETPLACE"),
      @SerializedName("CPAS_PARENT_CATALOG")
      VALUE_CPAS_PARENT_CATALOG("CPAS_PARENT_CATALOG"),
      @SerializedName("DA")
      VALUE_DA("DA"),
      @SerializedName("DAILY_DEALS")
      VALUE_DAILY_DEALS("DAILY_DEALS"),
      @SerializedName("DAILY_DEALS_LEGACY")
      VALUE_DAILY_DEALS_LEGACY("DAILY_DEALS_LEGACY"),
      @SerializedName("EVENT")
      VALUE_EVENT("EVENT"),
      @SerializedName("EVENT_DEPRECATED")
      VALUE_EVENT_DEPRECATED("EVENT_DEPRECATED"),
      @SerializedName("GROUPS")
      VALUE_GROUPS("GROUPS"),
      @SerializedName("IG_ONSITE_SHOPPING")
      VALUE_IG_ONSITE_SHOPPING("IG_ONSITE_SHOPPING"),
      @SerializedName("IG_PRODUCT_TAGGING")
      VALUE_IG_PRODUCT_TAGGING("IG_PRODUCT_TAGGING"),
      @SerializedName("LDP")
      VALUE_LDP("LDP"),
      @SerializedName("MARKETPLACE")
      VALUE_MARKETPLACE("MARKETPLACE"),
      @SerializedName("MARKETPLACE_ADS_DEPRECATED")
      VALUE_MARKETPLACE_ADS_DEPRECATED("MARKETPLACE_ADS_DEPRECATED"),
      @SerializedName("MARKETPLACE_HOME_RENTALS")
      VALUE_MARKETPLACE_HOME_RENTALS("MARKETPLACE_HOME_RENTALS"),
      @SerializedName("MARKETPLACE_HOME_SALES")
      VALUE_MARKETPLACE_HOME_SALES("MARKETPLACE_HOME_SALES"),
      @SerializedName("MARKETPLACE_MOTORS")
      VALUE_MARKETPLACE_MOTORS("MARKETPLACE_MOTORS"),
      @SerializedName("MARKETPLACE_SHOPS")
      VALUE_MARKETPLACE_SHOPS("MARKETPLACE_SHOPS"),
      @SerializedName("MINI_SHOPS")
      VALUE_MINI_SHOPS("MINI_SHOPS"),
      @SerializedName("NEIGHBORHOODS")
      VALUE_NEIGHBORHOODS("NEIGHBORHOODS"),
      @SerializedName("OFFLINE_CONVERSIONS")
      VALUE_OFFLINE_CONVERSIONS("OFFLINE_CONVERSIONS"),
      @SerializedName("ORGANIC_DISCOVERY")
      VALUE_ORGANIC_DISCOVERY("ORGANIC_DISCOVERY"),
      @SerializedName("PROFILE")
      VALUE_PROFILE("PROFILE"),
      @SerializedName("SERVICE")
      VALUE_SERVICE("SERVICE"),
      @SerializedName("SHOPS")
      VALUE_SHOPS("SHOPS"),
      @SerializedName("TEST_CAPABILITY")
      VALUE_TEST_CAPABILITY("TEST_CAPABILITY"),
      @SerializedName("UNIVERSAL_CHECKOUT")
      VALUE_UNIVERSAL_CHECKOUT("UNIVERSAL_CHECKOUT"),
      @SerializedName("US_MARKETPLACE")
      VALUE_US_MARKETPLACE("US_MARKETPLACE"),
      @SerializedName("WHATSAPP")
      VALUE_WHATSAPP("WHATSAPP"),
      @SerializedName("WHATSAPP_MARKETING_MESSAGE")
      VALUE_WHATSAPP_MARKETING_MESSAGE("WHATSAPP_MARKETING_MESSAGE"),
      ;

      private String value;

      private EnumCapabilitiesDisabledByUser(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumCapabilitiesRenderingCatalogManager {
      @SerializedName("B2C_MARKETPLACE")
      VALUE_B2C_MARKETPLACE("B2C_MARKETPLACE"),
      @SerializedName("C2C_MARKETPLACE")
      VALUE_C2C_MARKETPLACE("C2C_MARKETPLACE"),
      @SerializedName("DA")
      VALUE_DA("DA"),
      @SerializedName("DAILY_DEALS")
      VALUE_DAILY_DEALS("DAILY_DEALS"),
      @SerializedName("DAILY_DEALS_LEGACY")
      VALUE_DAILY_DEALS_LEGACY("DAILY_DEALS_LEGACY"),
      @SerializedName("IG_PRODUCT_TAGGING")
      VALUE_IG_PRODUCT_TAGGING("IG_PRODUCT_TAGGING"),
      @SerializedName("MARKETPLACE")
      VALUE_MARKETPLACE("MARKETPLACE"),
      @SerializedName("MARKETPLACE_ADS_DEPRECATED")
      VALUE_MARKETPLACE_ADS_DEPRECATED("MARKETPLACE_ADS_DEPRECATED"),
      @SerializedName("MARKETPLACE_SHOPS")
      VALUE_MARKETPLACE_SHOPS("MARKETPLACE_SHOPS"),
      @SerializedName("MINI_SHOPS")
      VALUE_MINI_SHOPS("MINI_SHOPS"),
      @SerializedName("OFFLINE_CONVERSIONS")
      VALUE_OFFLINE_CONVERSIONS("OFFLINE_CONVERSIONS"),
      @SerializedName("SHOPS")
      VALUE_SHOPS("SHOPS"),
      @SerializedName("UNIVERSAL_CHECKOUT")
      VALUE_UNIVERSAL_CHECKOUT("UNIVERSAL_CHECKOUT"),
      @SerializedName("WHATSAPP")
      VALUE_WHATSAPP("WHATSAPP"),
      ;

      private String value;

      private EnumCapabilitiesRenderingCatalogManager(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumCondition {
      @SerializedName("EXCELLENT")
      VALUE_EXCELLENT("EXCELLENT"),
      @SerializedName("FAIR")
      VALUE_FAIR("FAIR"),
      @SerializedName("GOOD")
      VALUE_GOOD("GOOD"),
      @SerializedName("NONE")
      VALUE_NONE("NONE"),
      @SerializedName("OTHER")
      VALUE_OTHER("OTHER"),
      @SerializedName("POOR")
      VALUE_POOR("POOR"),
      @SerializedName("VERY_GOOD")
      VALUE_VERY_GOOD("VERY_GOOD"),
      ;

      private String value;

      private EnumCondition(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumDealerCommunicationChannel {
      @SerializedName("CHAT")
      VALUE_CHAT("CHAT"),
      @SerializedName("EMAIL_CHAT_PROXY")
      VALUE_EMAIL_CHAT_PROXY("EMAIL_CHAT_PROXY"),
      @SerializedName("LEAD_FORM")
      VALUE_LEAD_FORM("LEAD_FORM"),
      @SerializedName("UNKNOWN")
      VALUE_UNKNOWN("UNKNOWN"),
      ;

      private String value;

      private EnumDealerCommunicationChannel(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumDisplayFormat {
      @SerializedName("CAROUSEL_AD")
      VALUE_CAROUSEL_AD("CAROUSEL_AD"),
      @SerializedName("SHOPS_PDP")
      VALUE_SHOPS_PDP("SHOPS_PDP"),
      @SerializedName("SINGLE_AD")
      VALUE_SINGLE_AD("SINGLE_AD"),
      ;

      private String value;

      private EnumDisplayFormat(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumDrivetrain {
      @SerializedName("AWD")
      VALUE_AWD("AWD"),
      @SerializedName("FOUR_WD")
      VALUE_FOUR_WD("FOUR_WD"),
      @SerializedName("FWD")
      VALUE_FWD("FWD"),
      @SerializedName("NONE")
      VALUE_NONE("NONE"),
      @SerializedName("OTHER")
      VALUE_OTHER("OTHER"),
      @SerializedName("RWD")
      VALUE_RWD("RWD"),
      @SerializedName("TWO_WD")
      VALUE_TWO_WD("TWO_WD"),
      ;

      private String value;

      private EnumDrivetrain(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumFinanceType {
      @SerializedName("HIRE_PURCHASE")
      VALUE_HIRE_PURCHASE("HIRE_PURCHASE"),
      @SerializedName("LEASE")
      VALUE_LEASE("LEASE"),
      @SerializedName("NONE")
      VALUE_NONE("NONE"),
      @SerializedName("NO_FINANCE")
      VALUE_NO_FINANCE("NO_FINANCE"),
      @SerializedName("PERSONAL_CONTRACT_PURCHASE")
      VALUE_PERSONAL_CONTRACT_PURCHASE("PERSONAL_CONTRACT_PURCHASE"),
      ;

      private String value;

      private EnumFinanceType(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumFuelType {
      @SerializedName("DIESEL")
      VALUE_DIESEL("DIESEL"),
      @SerializedName("ELECTRIC")
      VALUE_ELECTRIC("ELECTRIC"),
      @SerializedName("FLEX")
      VALUE_FLEX("FLEX"),
      @SerializedName("GASOLINE")
      VALUE_GASOLINE("GASOLINE"),
      @SerializedName("HYBRID")
      VALUE_HYBRID("HYBRID"),
      @SerializedName("NONE")
      VALUE_NONE("NONE"),
      @SerializedName("OTHER")
      VALUE_OTHER("OTHER"),
      @SerializedName("PETROL")
      VALUE_PETROL("PETROL"),
      @SerializedName("PLUGIN_HYBRID")
      VALUE_PLUGIN_HYBRID("PLUGIN_HYBRID"),
      ;

      private String value;

      private EnumFuelType(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumImageFetchStatus {
      @SerializedName("DIRECT_UPLOAD")
      VALUE_DIRECT_UPLOAD("DIRECT_UPLOAD"),
      @SerializedName("FETCHED")
      VALUE_FETCHED("FETCHED"),
      @SerializedName("FETCH_FAILED")
      VALUE_FETCH_FAILED("FETCH_FAILED"),
      @SerializedName("NO_STATUS")
      VALUE_NO_STATUS("NO_STATUS"),
      @SerializedName("OUTDATED")
      VALUE_OUTDATED("OUTDATED"),
      @SerializedName("PARTIAL_FETCH")
      VALUE_PARTIAL_FETCH("PARTIAL_FETCH"),
      ;

      private String value;

      private EnumImageFetchStatus(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumOfferType {
      @SerializedName("CASH")
      VALUE_CASH("CASH"),
      @SerializedName("FINANCE")
      VALUE_FINANCE("FINANCE"),
      @SerializedName("LEASE")
      VALUE_LEASE("LEASE"),
      @SerializedName("NONE")
      VALUE_NONE("NONE"),
      ;

      private String value;

      private EnumOfferType(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumStateOfVehicle {
      @SerializedName("CPO")
      VALUE_CPO("CPO"),
      @SerializedName("NEW")
      VALUE_NEW("NEW"),
      @SerializedName("USED")
      VALUE_USED("USED"),
      ;

      private String value;

      private EnumStateOfVehicle(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumTransmission {
      @SerializedName("AUTOMATIC")
      VALUE_AUTOMATIC("AUTOMATIC"),
      @SerializedName("MANUAL")
      VALUE_MANUAL("MANUAL"),
      @SerializedName("NONE")
      VALUE_NONE("NONE"),
      @SerializedName("OTHER")
      VALUE_OTHER("OTHER"),
      ;

      private String value;

      private EnumTransmission(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumVehicleType {
      @SerializedName("BOAT")
      VALUE_BOAT("BOAT"),
      @SerializedName("CAR_TRUCK")
      VALUE_CAR_TRUCK("CAR_TRUCK"),
      @SerializedName("COMMERCIAL")
      VALUE_COMMERCIAL("COMMERCIAL"),
      @SerializedName("MOTORCYCLE")
      VALUE_MOTORCYCLE("MOTORCYCLE"),
      @SerializedName("OTHER")
      VALUE_OTHER("OTHER"),
      @SerializedName("POWERSPORT")
      VALUE_POWERSPORT("POWERSPORT"),
      @SerializedName("RV_CAMPER")
      VALUE_RV_CAMPER("RV_CAMPER"),
      @SerializedName("TRAILER")
      VALUE_TRAILER("TRAILER"),
      ;

      private String value;

      private EnumVehicleType(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumVisibility {
      @SerializedName("ACTIVE")
      VALUE_ACTIVE("ACTIVE"),
      @SerializedName("ARCHIVED")
      VALUE_ARCHIVED("ARCHIVED"),
      @SerializedName("HIDDEN")
      VALUE_HIDDEN("HIDDEN"),
      @SerializedName("LEGACY_PUBLIC")
      VALUE_LEGACY_PUBLIC("LEGACY_PUBLIC"),
      @SerializedName("PUBLISHED")
      VALUE_PUBLISHED("PUBLISHED"),
      @SerializedName("STAGING")
      VALUE_STAGING("STAGING"),
      @SerializedName("VISIBLE_ONLY_WITH_OVERRIDES")
      VALUE_VISIBLE_ONLY_WITH_OVERRIDES("VISIBLE_ONLY_WITH_OVERRIDES"),
      @SerializedName("WHITELIST_ONLY")
      VALUE_WHITELIST_ONLY("WHITELIST_ONLY"),
      ;

      private String value;

      private EnumVisibility(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }


  synchronized /*package*/ static Gson getGson() {
    if (gson != null) {
      return gson;
    } else {
      gson = new GsonBuilder()
        .excludeFieldsWithModifiers(Modifier.STATIC)
        .excludeFieldsWithModifiers(Modifier.PROTECTED)
        .disableHtmlEscaping()
        .create();
    }
    return gson;
  }

  public ProductCatalogAutomotiveItemGet copyFrom(ProductCatalogAutomotiveItemGet instance) {
    this.mAddress = instance.mAddress;
    this.mAmountCurrency = instance.mAmountCurrency;
    this.mAmountPercentage = instance.mAmountPercentage;
    this.mAmountPrice = instance.mAmountPrice;
    this.mAmountQualifier = instance.mAmountQualifier;
    this.mApplinks = instance.mApplinks;
    this.mAutomotiveModelId = instance.mAutomotiveModelId;
    this.mAvailability = instance.mAvailability;
    this.mAvailabilityCircleRadius = instance.mAvailabilityCircleRadius;
    this.mAvailabilityCircleRadiusUnit = instance.mAvailabilityCircleRadiusUnit;
    this.mBodyStyle = instance.mBodyStyle;
    this.mCapabilities = instance.mCapabilities;
    this.mCapabilitiesDisabledByUser = instance.mCapabilitiesDisabledByUser;
    this.mCapabilitiesRenderingCatalogManager = instance.mCapabilitiesRenderingCatalogManager;
    this.mCarfaxDealershipId = instance.mCarfaxDealershipId;
    this.mChannelsToIntegrityStatus = instance.mChannelsToIntegrityStatus;
    this.mComscoreMarketCodes = instance.mComscoreMarketCodes;
    this.mCondition = instance.mCondition;
    this.mCurrency = instance.mCurrency;
    this.mCustomLabel0 = instance.mCustomLabel0;
    this.mCustomLabel1 = instance.mCustomLabel1;
    this.mCustomLabel2 = instance.mCustomLabel2;
    this.mCustomLabel3 = instance.mCustomLabel3;
    this.mCustomLabel4 = instance.mCustomLabel4;
    this.mCustomNumber0 = instance.mCustomNumber0;
    this.mCustomNumber1 = instance.mCustomNumber1;
    this.mCustomNumber2 = instance.mCustomNumber2;
    this.mCustomNumber3 = instance.mCustomNumber3;
    this.mCustomNumber4 = instance.mCustomNumber4;
    this.mDateFirstOnLot = instance.mDateFirstOnLot;
    this.mDaysOnLot = instance.mDaysOnLot;
    this.mDealerCommunicationChannel = instance.mDealerCommunicationChannel;
    this.mDealerEmail = instance.mDealerEmail;
    this.mDealerId = instance.mDealerId;
    this.mDealerName = instance.mDealerName;
    this.mDealerPhone = instance.mDealerPhone;
    this.mDealerPrivacyPolicyUrl = instance.mDealerPrivacyPolicyUrl;
    this.mDealerUrl = instance.mDealerUrl;
    this.mDefaultCountry = instance.mDefaultCountry;
    this.mDefaultLanguageLocale = instance.mDefaultLanguageLocale;
    this.mDescription = instance.mDescription;
    this.mDownpaymentCurrency = instance.mDownpaymentCurrency;
    this.mDownpaymentPrice = instance.mDownpaymentPrice;
    this.mDownpaymentQualifier = instance.mDownpaymentQualifier;
    this.mDrivetrain = instance.mDrivetrain;
    this.mEnabledCapabilityToReviewStatus = instance.mEnabledCapabilityToReviewStatus;
    this.mEndDate = instance.mEndDate;
    this.mEngineSize = instance.mEngineSize;
    this.mExteriorColor = instance.mExteriorColor;
    this.mFbPageId = instance.mFbPageId;
    this.mFeatures = instance.mFeatures;
    this.mFinanceDescription = instance.mFinanceDescription;
    this.mFinanceType = instance.mFinanceType;
    this.mFuelType = instance.mFuelType;
    this.mGeneration = instance.mGeneration;
    this.mHorsePower = instance.mHorsePower;
    this.mId = instance.mId;
    this.mImageFetchStatus = instance.mImageFetchStatus;
    this.mImages = instance.mImages;
    this.mInteriorColor = instance.mInteriorColor;
    this.mInteriorUpholstery = instance.mInteriorUpholstery;
    this.mIsBlackholed = instance.mIsBlackholed;
    this.mLegalDisclosureImpressumUrl = instance.mLegalDisclosureImpressumUrl;
    this.mMake = instance.mMake;
    this.mMileage = instance.mMileage;
    this.mModel = instance.mModel;
    this.mOfferDescription = instance.mOfferDescription;
    this.mOfferDisclaimer = instance.mOfferDisclaimer;
    this.mOfferDisclaimerUrl = instance.mOfferDisclaimerUrl;
    this.mOfferType = instance.mOfferType;
    this.mPreviousCurrency = instance.mPreviousCurrency;
    this.mPreviousPrice = instance.mPreviousPrice;
    this.mPrice = instance.mPrice;
    this.mProductFeed = instance.mProductFeed;
    this.mProductPriority0 = instance.mProductPriority0;
    this.mProductPriority1 = instance.mProductPriority1;
    this.mProductPriority2 = instance.mProductPriority2;
    this.mProductPriority3 = instance.mProductPriority3;
    this.mProductPriority4 = instance.mProductPriority4;
    this.mSaleCurrency = instance.mSaleCurrency;
    this.mSalePrice = instance.mSalePrice;
    this.mSanitizedImages = instance.mSanitizedImages;
    this.mSanitizedPreviews = instance.mSanitizedPreviews;
    this.mStartDate = instance.mStartDate;
    this.mStateOfVehicle = instance.mStateOfVehicle;
    this.mStockNumber = instance.mStockNumber;
    this.mTags = instance.mTags;
    this.mTermLength = instance.mTermLength;
    this.mTermQualifier = instance.mTermQualifier;
    this.mTitle = instance.mTitle;
    this.mTransmission = instance.mTransmission;
    this.mTrim = instance.mTrim;
    this.mUnitPrice = instance.mUnitPrice;
    this.mUrl = instance.mUrl;
    this.mUrlShimmed = instance.mUrlShimmed;
    this.mValidationErrors = instance.mValidationErrors;
    this.mVehicleId = instance.mVehicleId;
    this.mVehicleOfferId = instance.mVehicleOfferId;
    this.mVehicleRegistrationPlate = instance.mVehicleRegistrationPlate;
    this.mVehicleSpecifications = instance.mVehicleSpecifications;
    this.mVehicleType = instance.mVehicleType;
    this.mVideosMetadata = instance.mVideosMetadata;
    this.mVin = instance.mVin;
    this.mVisibility = instance.mVisibility;
    this.mYear = instance.mYear;
    this.context = instance.context;
    this.rawValue = instance.rawValue;
    return this;
  }

  public static APIRequest.ResponseParser<ProductCatalogAutomotiveItemGet> getParser() {
    return new APIRequest.ResponseParser<ProductCatalogAutomotiveItemGet>() {
      public APINodeList<ProductCatalogAutomotiveItemGet> parseResponse(String response, APIContext context, APIRequest<ProductCatalogAutomotiveItemGet> request, String header) throws MalformedResponseException {
        return ProductCatalogAutomotiveItemGet.parseResponse(response, context, request, header);
      }
    };
  }
}
