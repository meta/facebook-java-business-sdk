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
public class ProductCatalogAutomotiveItem extends APINode {
  @SerializedName("id")
  private String mId = null;
  protected static Gson gson = null;

  public ProductCatalogAutomotiveItem() {
  }

  public String getId() {
    return getFieldId().toString();
  }
  public static ProductCatalogAutomotiveItem loadJSON(String json, APIContext context, String header) {
    ProductCatalogAutomotiveItem productCatalogAutomotiveItem = getGson().fromJson(json, ProductCatalogAutomotiveItem.class);
    if (context.isDebug()) {
      JsonParser parser = new JsonParser();
      JsonElement o1 = parser.parse(json);
      JsonElement o2 = parser.parse(productCatalogAutomotiveItem.toString());
      if (o1.getAsJsonObject().get("__fb_trace_id__") != null) {
        o2.getAsJsonObject().add("__fb_trace_id__", o1.getAsJsonObject().get("__fb_trace_id__"));
      }
      if (!o1.equals(o2)) {
        context.log("[Warning] When parsing response, object is not consistent with JSON:");
        context.log("[JSON]" + o1);
        context.log("[Object]" + o2);
      }
    }
    productCatalogAutomotiveItem.context = context;
    productCatalogAutomotiveItem.rawValue = json;
    productCatalogAutomotiveItem.header = header;
    return productCatalogAutomotiveItem;
  }

  public static APINodeList<ProductCatalogAutomotiveItem> parseResponse(String json, APIContext context, APIRequest request, String header) throws MalformedResponseException {
    APINodeList<ProductCatalogAutomotiveItem> productCatalogAutomotiveItems = new APINodeList<ProductCatalogAutomotiveItem>(request, json, header);
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
          productCatalogAutomotiveItems.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
        };
        return productCatalogAutomotiveItems;
      } else if (result.isJsonObject()) {
        obj = result.getAsJsonObject();
        if (obj.has("data")) {
          if (obj.has("paging")) {
            JsonObject paging = obj.get("paging").getAsJsonObject();
            if (paging.has("cursors")) {
                JsonObject cursors = paging.get("cursors").getAsJsonObject();
                String before = cursors.has("before") ? cursors.get("before").getAsString() : null;
                String after = cursors.has("after") ? cursors.get("after").getAsString() : null;
                productCatalogAutomotiveItems.setCursors(before, after);
            }
            String previous = paging.has("previous") ? paging.get("previous").getAsString() : null;
            String next = paging.has("next") ? paging.get("next").getAsString() : null;
            productCatalogAutomotiveItems.setPaging(previous, next);
            if (context.hasAppSecret()) {
              productCatalogAutomotiveItems.setAppSecret(context.getAppSecretProof());
            }
          }
          if (obj.get("data").isJsonArray()) {
            // Second, check if it's a JSON array with "data"
            arr = obj.get("data").getAsJsonArray();
            for (int i = 0; i < arr.size(); i++) {
              productCatalogAutomotiveItems.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
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
                  productCatalogAutomotiveItems.add(loadJSON(entry.getValue().toString(), context, header));
                }
                break;
              }
            }
            if (!isRedownload) {
              productCatalogAutomotiveItems.add(loadJSON(obj.toString(), context, header));
            }
          }
          return productCatalogAutomotiveItems;
        } else if (obj.has("images")) {
          // Fourth, check if it's a map of image objects
          obj = obj.get("images").getAsJsonObject();
          for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
              productCatalogAutomotiveItems.add(loadJSON(entry.getValue().toString(), context, header));
          }
          return productCatalogAutomotiveItems;
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
              productCatalogAutomotiveItems.add(loadJSON(value.toString(), context, header));
            } else {
              isIdIndexedArray = false;
              break;
            }
          }
          if (isIdIndexedArray) {
            return productCatalogAutomotiveItems;
          }

          // Sixth, check if it's pure JsonObject
          productCatalogAutomotiveItems.clear();
          productCatalogAutomotiveItems.add(loadJSON(json, context, header));
          return productCatalogAutomotiveItems;
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

  public APIRequestGenget genget() {
    return new APIRequestGenget(this.getId(), context);
  }


  public String getFieldId() {
    return mId;
  }

  public ProductCatalogAutomotiveItem setFieldId(String value) {
    this.mId = value;
    return this;
  }



  public static class APIRequestGenget extends APIRequest<ProductCatalogAutomotiveItemGet> {

    APINodeList<ProductCatalogAutomotiveItemGet> lastResponse = null;
    @Override
    public APINodeList<ProductCatalogAutomotiveItemGet> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "display_format",
    };

    public static final String[] FIELDS = {
      "address",
      "amount_currency",
      "amount_percentage",
      "amount_price",
      "amount_qualifier",
      "applinks",
      "automotive_model_id",
      "availability",
      "availability_circle_radius",
      "availability_circle_radius_unit",
      "body_style",
      "capabilities",
      "capabilities_disabled_by_user",
      "capabilities_rendering_catalog_manager",
      "carfax_dealership_id",
      "channels_to_integrity_status",
      "comscore_market_codes",
      "condition",
      "currency",
      "custom_label_0",
      "custom_label_1",
      "custom_label_2",
      "custom_label_3",
      "custom_label_4",
      "custom_number_0",
      "custom_number_1",
      "custom_number_2",
      "custom_number_3",
      "custom_number_4",
      "date_first_on_lot",
      "days_on_lot",
      "dealer_communication_channel",
      "dealer_email",
      "dealer_id",
      "dealer_name",
      "dealer_phone",
      "dealer_privacy_policy_url",
      "dealer_url",
      "default_country",
      "default_language_locale",
      "description",
      "downpayment_currency",
      "downpayment_price",
      "downpayment_qualifier",
      "drivetrain",
      "enabled_capability_to_review_status",
      "end_date",
      "engine_size",
      "exterior_color",
      "fb_page_id",
      "features",
      "finance_description",
      "finance_type",
      "fuel_type",
      "generation",
      "horse_power",
      "id",
      "image_fetch_status",
      "images",
      "interior_color",
      "interior_upholstery",
      "is_blackholed",
      "legal_disclosure_impressum_url",
      "make",
      "mileage",
      "model",
      "offer_description",
      "offer_disclaimer",
      "offer_disclaimer_url",
      "offer_type",
      "previous_currency",
      "previous_price",
      "price",
      "product_feed",
      "product_priority_0",
      "product_priority_1",
      "product_priority_2",
      "product_priority_3",
      "product_priority_4",
      "sale_currency",
      "sale_price",
      "sanitized_images",
      "sanitized_previews",
      "start_date",
      "state_of_vehicle",
      "stock_number",
      "tags",
      "term_length",
      "term_qualifier",
      "title",
      "transmission",
      "trim",
      "unit_price",
      "url",
      "url_shimmed",
      "validation_errors",
      "vehicle_id",
      "vehicle_offer_id",
      "vehicle_registration_plate",
      "vehicle_specifications",
      "vehicle_type",
      "videos_metadata",
      "vin",
      "visibility",
      "year",
    };

    @Override
    public APINodeList<ProductCatalogAutomotiveItemGet> parseResponse(String response, String header) throws APIException {
      return ProductCatalogAutomotiveItemGet.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<ProductCatalogAutomotiveItemGet> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<ProductCatalogAutomotiveItemGet> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<ProductCatalogAutomotiveItemGet>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<ProductCatalogAutomotiveItemGet>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<ProductCatalogAutomotiveItemGet>>() {
           public APINodeList<ProductCatalogAutomotiveItemGet> apply(ResponseWrapper result) {
             try {
               return APIRequestGenget.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         },
         MoreExecutors.directExecutor()
      );
    };

    public APIRequestGenget(String nodeId, APIContext context) {
      super(context, nodeId, "/", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGenget setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGenget setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGenget setDisplayFormat (ProductCatalogAutomotiveItemGet.EnumDisplayFormat displayFormat) {
      this.setParam("display_format", displayFormat);
      return this;
    }
    public APIRequestGenget setDisplayFormat (String displayFormat) {
      this.setParam("display_format", displayFormat);
      return this;
    }

    public APIRequestGenget requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGenget requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGenget requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGenget requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGenget requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGenget requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGenget requestAddressField () {
      return this.requestAddressField(true);
    }
    public APIRequestGenget requestAddressField (boolean value) {
      this.requestField("address", value);
      return this;
    }
    public APIRequestGenget requestAmountCurrencyField () {
      return this.requestAmountCurrencyField(true);
    }
    public APIRequestGenget requestAmountCurrencyField (boolean value) {
      this.requestField("amount_currency", value);
      return this;
    }
    public APIRequestGenget requestAmountPercentageField () {
      return this.requestAmountPercentageField(true);
    }
    public APIRequestGenget requestAmountPercentageField (boolean value) {
      this.requestField("amount_percentage", value);
      return this;
    }
    public APIRequestGenget requestAmountPriceField () {
      return this.requestAmountPriceField(true);
    }
    public APIRequestGenget requestAmountPriceField (boolean value) {
      this.requestField("amount_price", value);
      return this;
    }
    public APIRequestGenget requestAmountQualifierField () {
      return this.requestAmountQualifierField(true);
    }
    public APIRequestGenget requestAmountQualifierField (boolean value) {
      this.requestField("amount_qualifier", value);
      return this;
    }
    public APIRequestGenget requestApplinksField () {
      return this.requestApplinksField(true);
    }
    public APIRequestGenget requestApplinksField (boolean value) {
      this.requestField("applinks", value);
      return this;
    }
    public APIRequestGenget requestAutomotiveModelIdField () {
      return this.requestAutomotiveModelIdField(true);
    }
    public APIRequestGenget requestAutomotiveModelIdField (boolean value) {
      this.requestField("automotive_model_id", value);
      return this;
    }
    public APIRequestGenget requestAvailabilityField () {
      return this.requestAvailabilityField(true);
    }
    public APIRequestGenget requestAvailabilityField (boolean value) {
      this.requestField("availability", value);
      return this;
    }
    public APIRequestGenget requestAvailabilityCircleRadiusField () {
      return this.requestAvailabilityCircleRadiusField(true);
    }
    public APIRequestGenget requestAvailabilityCircleRadiusField (boolean value) {
      this.requestField("availability_circle_radius", value);
      return this;
    }
    public APIRequestGenget requestAvailabilityCircleRadiusUnitField () {
      return this.requestAvailabilityCircleRadiusUnitField(true);
    }
    public APIRequestGenget requestAvailabilityCircleRadiusUnitField (boolean value) {
      this.requestField("availability_circle_radius_unit", value);
      return this;
    }
    public APIRequestGenget requestBodyStyleField () {
      return this.requestBodyStyleField(true);
    }
    public APIRequestGenget requestBodyStyleField (boolean value) {
      this.requestField("body_style", value);
      return this;
    }
    public APIRequestGenget requestCapabilitiesField () {
      return this.requestCapabilitiesField(true);
    }
    public APIRequestGenget requestCapabilitiesField (boolean value) {
      this.requestField("capabilities", value);
      return this;
    }
    public APIRequestGenget requestCapabilitiesDisabledByUserField () {
      return this.requestCapabilitiesDisabledByUserField(true);
    }
    public APIRequestGenget requestCapabilitiesDisabledByUserField (boolean value) {
      this.requestField("capabilities_disabled_by_user", value);
      return this;
    }
    public APIRequestGenget requestCapabilitiesRenderingCatalogManagerField () {
      return this.requestCapabilitiesRenderingCatalogManagerField(true);
    }
    public APIRequestGenget requestCapabilitiesRenderingCatalogManagerField (boolean value) {
      this.requestField("capabilities_rendering_catalog_manager", value);
      return this;
    }
    public APIRequestGenget requestCarfaxDealershipIdField () {
      return this.requestCarfaxDealershipIdField(true);
    }
    public APIRequestGenget requestCarfaxDealershipIdField (boolean value) {
      this.requestField("carfax_dealership_id", value);
      return this;
    }
    public APIRequestGenget requestChannelsToIntegrityStatusField () {
      return this.requestChannelsToIntegrityStatusField(true);
    }
    public APIRequestGenget requestChannelsToIntegrityStatusField (boolean value) {
      this.requestField("channels_to_integrity_status", value);
      return this;
    }
    public APIRequestGenget requestComscoreMarketCodesField () {
      return this.requestComscoreMarketCodesField(true);
    }
    public APIRequestGenget requestComscoreMarketCodesField (boolean value) {
      this.requestField("comscore_market_codes", value);
      return this;
    }
    public APIRequestGenget requestConditionField () {
      return this.requestConditionField(true);
    }
    public APIRequestGenget requestConditionField (boolean value) {
      this.requestField("condition", value);
      return this;
    }
    public APIRequestGenget requestCurrencyField () {
      return this.requestCurrencyField(true);
    }
    public APIRequestGenget requestCurrencyField (boolean value) {
      this.requestField("currency", value);
      return this;
    }
    public APIRequestGenget requestCustomLabel0Field () {
      return this.requestCustomLabel0Field(true);
    }
    public APIRequestGenget requestCustomLabel0Field (boolean value) {
      this.requestField("custom_label_0", value);
      return this;
    }
    public APIRequestGenget requestCustomLabel1Field () {
      return this.requestCustomLabel1Field(true);
    }
    public APIRequestGenget requestCustomLabel1Field (boolean value) {
      this.requestField("custom_label_1", value);
      return this;
    }
    public APIRequestGenget requestCustomLabel2Field () {
      return this.requestCustomLabel2Field(true);
    }
    public APIRequestGenget requestCustomLabel2Field (boolean value) {
      this.requestField("custom_label_2", value);
      return this;
    }
    public APIRequestGenget requestCustomLabel3Field () {
      return this.requestCustomLabel3Field(true);
    }
    public APIRequestGenget requestCustomLabel3Field (boolean value) {
      this.requestField("custom_label_3", value);
      return this;
    }
    public APIRequestGenget requestCustomLabel4Field () {
      return this.requestCustomLabel4Field(true);
    }
    public APIRequestGenget requestCustomLabel4Field (boolean value) {
      this.requestField("custom_label_4", value);
      return this;
    }
    public APIRequestGenget requestCustomNumber0Field () {
      return this.requestCustomNumber0Field(true);
    }
    public APIRequestGenget requestCustomNumber0Field (boolean value) {
      this.requestField("custom_number_0", value);
      return this;
    }
    public APIRequestGenget requestCustomNumber1Field () {
      return this.requestCustomNumber1Field(true);
    }
    public APIRequestGenget requestCustomNumber1Field (boolean value) {
      this.requestField("custom_number_1", value);
      return this;
    }
    public APIRequestGenget requestCustomNumber2Field () {
      return this.requestCustomNumber2Field(true);
    }
    public APIRequestGenget requestCustomNumber2Field (boolean value) {
      this.requestField("custom_number_2", value);
      return this;
    }
    public APIRequestGenget requestCustomNumber3Field () {
      return this.requestCustomNumber3Field(true);
    }
    public APIRequestGenget requestCustomNumber3Field (boolean value) {
      this.requestField("custom_number_3", value);
      return this;
    }
    public APIRequestGenget requestCustomNumber4Field () {
      return this.requestCustomNumber4Field(true);
    }
    public APIRequestGenget requestCustomNumber4Field (boolean value) {
      this.requestField("custom_number_4", value);
      return this;
    }
    public APIRequestGenget requestDateFirstOnLotField () {
      return this.requestDateFirstOnLotField(true);
    }
    public APIRequestGenget requestDateFirstOnLotField (boolean value) {
      this.requestField("date_first_on_lot", value);
      return this;
    }
    public APIRequestGenget requestDaysOnLotField () {
      return this.requestDaysOnLotField(true);
    }
    public APIRequestGenget requestDaysOnLotField (boolean value) {
      this.requestField("days_on_lot", value);
      return this;
    }
    public APIRequestGenget requestDealerCommunicationChannelField () {
      return this.requestDealerCommunicationChannelField(true);
    }
    public APIRequestGenget requestDealerCommunicationChannelField (boolean value) {
      this.requestField("dealer_communication_channel", value);
      return this;
    }
    public APIRequestGenget requestDealerEmailField () {
      return this.requestDealerEmailField(true);
    }
    public APIRequestGenget requestDealerEmailField (boolean value) {
      this.requestField("dealer_email", value);
      return this;
    }
    public APIRequestGenget requestDealerIdField () {
      return this.requestDealerIdField(true);
    }
    public APIRequestGenget requestDealerIdField (boolean value) {
      this.requestField("dealer_id", value);
      return this;
    }
    public APIRequestGenget requestDealerNameField () {
      return this.requestDealerNameField(true);
    }
    public APIRequestGenget requestDealerNameField (boolean value) {
      this.requestField("dealer_name", value);
      return this;
    }
    public APIRequestGenget requestDealerPhoneField () {
      return this.requestDealerPhoneField(true);
    }
    public APIRequestGenget requestDealerPhoneField (boolean value) {
      this.requestField("dealer_phone", value);
      return this;
    }
    public APIRequestGenget requestDealerPrivacyPolicyUrlField () {
      return this.requestDealerPrivacyPolicyUrlField(true);
    }
    public APIRequestGenget requestDealerPrivacyPolicyUrlField (boolean value) {
      this.requestField("dealer_privacy_policy_url", value);
      return this;
    }
    public APIRequestGenget requestDealerUrlField () {
      return this.requestDealerUrlField(true);
    }
    public APIRequestGenget requestDealerUrlField (boolean value) {
      this.requestField("dealer_url", value);
      return this;
    }
    public APIRequestGenget requestDefaultCountryField () {
      return this.requestDefaultCountryField(true);
    }
    public APIRequestGenget requestDefaultCountryField (boolean value) {
      this.requestField("default_country", value);
      return this;
    }
    public APIRequestGenget requestDefaultLanguageLocaleField () {
      return this.requestDefaultLanguageLocaleField(true);
    }
    public APIRequestGenget requestDefaultLanguageLocaleField (boolean value) {
      this.requestField("default_language_locale", value);
      return this;
    }
    public APIRequestGenget requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGenget requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGenget requestDownpaymentCurrencyField () {
      return this.requestDownpaymentCurrencyField(true);
    }
    public APIRequestGenget requestDownpaymentCurrencyField (boolean value) {
      this.requestField("downpayment_currency", value);
      return this;
    }
    public APIRequestGenget requestDownpaymentPriceField () {
      return this.requestDownpaymentPriceField(true);
    }
    public APIRequestGenget requestDownpaymentPriceField (boolean value) {
      this.requestField("downpayment_price", value);
      return this;
    }
    public APIRequestGenget requestDownpaymentQualifierField () {
      return this.requestDownpaymentQualifierField(true);
    }
    public APIRequestGenget requestDownpaymentQualifierField (boolean value) {
      this.requestField("downpayment_qualifier", value);
      return this;
    }
    public APIRequestGenget requestDrivetrainField () {
      return this.requestDrivetrainField(true);
    }
    public APIRequestGenget requestDrivetrainField (boolean value) {
      this.requestField("drivetrain", value);
      return this;
    }
    public APIRequestGenget requestEnabledCapabilityToReviewStatusField () {
      return this.requestEnabledCapabilityToReviewStatusField(true);
    }
    public APIRequestGenget requestEnabledCapabilityToReviewStatusField (boolean value) {
      this.requestField("enabled_capability_to_review_status", value);
      return this;
    }
    public APIRequestGenget requestEndDateField () {
      return this.requestEndDateField(true);
    }
    public APIRequestGenget requestEndDateField (boolean value) {
      this.requestField("end_date", value);
      return this;
    }
    public APIRequestGenget requestEngineSizeField () {
      return this.requestEngineSizeField(true);
    }
    public APIRequestGenget requestEngineSizeField (boolean value) {
      this.requestField("engine_size", value);
      return this;
    }
    public APIRequestGenget requestExteriorColorField () {
      return this.requestExteriorColorField(true);
    }
    public APIRequestGenget requestExteriorColorField (boolean value) {
      this.requestField("exterior_color", value);
      return this;
    }
    public APIRequestGenget requestFbPageIdField () {
      return this.requestFbPageIdField(true);
    }
    public APIRequestGenget requestFbPageIdField (boolean value) {
      this.requestField("fb_page_id", value);
      return this;
    }
    public APIRequestGenget requestFeaturesField () {
      return this.requestFeaturesField(true);
    }
    public APIRequestGenget requestFeaturesField (boolean value) {
      this.requestField("features", value);
      return this;
    }
    public APIRequestGenget requestFinanceDescriptionField () {
      return this.requestFinanceDescriptionField(true);
    }
    public APIRequestGenget requestFinanceDescriptionField (boolean value) {
      this.requestField("finance_description", value);
      return this;
    }
    public APIRequestGenget requestFinanceTypeField () {
      return this.requestFinanceTypeField(true);
    }
    public APIRequestGenget requestFinanceTypeField (boolean value) {
      this.requestField("finance_type", value);
      return this;
    }
    public APIRequestGenget requestFuelTypeField () {
      return this.requestFuelTypeField(true);
    }
    public APIRequestGenget requestFuelTypeField (boolean value) {
      this.requestField("fuel_type", value);
      return this;
    }
    public APIRequestGenget requestGenerationField () {
      return this.requestGenerationField(true);
    }
    public APIRequestGenget requestGenerationField (boolean value) {
      this.requestField("generation", value);
      return this;
    }
    public APIRequestGenget requestHorsePowerField () {
      return this.requestHorsePowerField(true);
    }
    public APIRequestGenget requestHorsePowerField (boolean value) {
      this.requestField("horse_power", value);
      return this;
    }
    public APIRequestGenget requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGenget requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGenget requestImageFetchStatusField () {
      return this.requestImageFetchStatusField(true);
    }
    public APIRequestGenget requestImageFetchStatusField (boolean value) {
      this.requestField("image_fetch_status", value);
      return this;
    }
    public APIRequestGenget requestImagesField () {
      return this.requestImagesField(true);
    }
    public APIRequestGenget requestImagesField (boolean value) {
      this.requestField("images", value);
      return this;
    }
    public APIRequestGenget requestInteriorColorField () {
      return this.requestInteriorColorField(true);
    }
    public APIRequestGenget requestInteriorColorField (boolean value) {
      this.requestField("interior_color", value);
      return this;
    }
    public APIRequestGenget requestInteriorUpholsteryField () {
      return this.requestInteriorUpholsteryField(true);
    }
    public APIRequestGenget requestInteriorUpholsteryField (boolean value) {
      this.requestField("interior_upholstery", value);
      return this;
    }
    public APIRequestGenget requestIsBlackholedField () {
      return this.requestIsBlackholedField(true);
    }
    public APIRequestGenget requestIsBlackholedField (boolean value) {
      this.requestField("is_blackholed", value);
      return this;
    }
    public APIRequestGenget requestLegalDisclosureImpressumUrlField () {
      return this.requestLegalDisclosureImpressumUrlField(true);
    }
    public APIRequestGenget requestLegalDisclosureImpressumUrlField (boolean value) {
      this.requestField("legal_disclosure_impressum_url", value);
      return this;
    }
    public APIRequestGenget requestMakeField () {
      return this.requestMakeField(true);
    }
    public APIRequestGenget requestMakeField (boolean value) {
      this.requestField("make", value);
      return this;
    }
    public APIRequestGenget requestMileageField () {
      return this.requestMileageField(true);
    }
    public APIRequestGenget requestMileageField (boolean value) {
      this.requestField("mileage", value);
      return this;
    }
    public APIRequestGenget requestModelField () {
      return this.requestModelField(true);
    }
    public APIRequestGenget requestModelField (boolean value) {
      this.requestField("model", value);
      return this;
    }
    public APIRequestGenget requestOfferDescriptionField () {
      return this.requestOfferDescriptionField(true);
    }
    public APIRequestGenget requestOfferDescriptionField (boolean value) {
      this.requestField("offer_description", value);
      return this;
    }
    public APIRequestGenget requestOfferDisclaimerField () {
      return this.requestOfferDisclaimerField(true);
    }
    public APIRequestGenget requestOfferDisclaimerField (boolean value) {
      this.requestField("offer_disclaimer", value);
      return this;
    }
    public APIRequestGenget requestOfferDisclaimerUrlField () {
      return this.requestOfferDisclaimerUrlField(true);
    }
    public APIRequestGenget requestOfferDisclaimerUrlField (boolean value) {
      this.requestField("offer_disclaimer_url", value);
      return this;
    }
    public APIRequestGenget requestOfferTypeField () {
      return this.requestOfferTypeField(true);
    }
    public APIRequestGenget requestOfferTypeField (boolean value) {
      this.requestField("offer_type", value);
      return this;
    }
    public APIRequestGenget requestPreviousCurrencyField () {
      return this.requestPreviousCurrencyField(true);
    }
    public APIRequestGenget requestPreviousCurrencyField (boolean value) {
      this.requestField("previous_currency", value);
      return this;
    }
    public APIRequestGenget requestPreviousPriceField () {
      return this.requestPreviousPriceField(true);
    }
    public APIRequestGenget requestPreviousPriceField (boolean value) {
      this.requestField("previous_price", value);
      return this;
    }
    public APIRequestGenget requestPriceField () {
      return this.requestPriceField(true);
    }
    public APIRequestGenget requestPriceField (boolean value) {
      this.requestField("price", value);
      return this;
    }
    public APIRequestGenget requestProductFeedField () {
      return this.requestProductFeedField(true);
    }
    public APIRequestGenget requestProductFeedField (boolean value) {
      this.requestField("product_feed", value);
      return this;
    }
    public APIRequestGenget requestProductPriority0Field () {
      return this.requestProductPriority0Field(true);
    }
    public APIRequestGenget requestProductPriority0Field (boolean value) {
      this.requestField("product_priority_0", value);
      return this;
    }
    public APIRequestGenget requestProductPriority1Field () {
      return this.requestProductPriority1Field(true);
    }
    public APIRequestGenget requestProductPriority1Field (boolean value) {
      this.requestField("product_priority_1", value);
      return this;
    }
    public APIRequestGenget requestProductPriority2Field () {
      return this.requestProductPriority2Field(true);
    }
    public APIRequestGenget requestProductPriority2Field (boolean value) {
      this.requestField("product_priority_2", value);
      return this;
    }
    public APIRequestGenget requestProductPriority3Field () {
      return this.requestProductPriority3Field(true);
    }
    public APIRequestGenget requestProductPriority3Field (boolean value) {
      this.requestField("product_priority_3", value);
      return this;
    }
    public APIRequestGenget requestProductPriority4Field () {
      return this.requestProductPriority4Field(true);
    }
    public APIRequestGenget requestProductPriority4Field (boolean value) {
      this.requestField("product_priority_4", value);
      return this;
    }
    public APIRequestGenget requestSaleCurrencyField () {
      return this.requestSaleCurrencyField(true);
    }
    public APIRequestGenget requestSaleCurrencyField (boolean value) {
      this.requestField("sale_currency", value);
      return this;
    }
    public APIRequestGenget requestSalePriceField () {
      return this.requestSalePriceField(true);
    }
    public APIRequestGenget requestSalePriceField (boolean value) {
      this.requestField("sale_price", value);
      return this;
    }
    public APIRequestGenget requestSanitizedImagesField () {
      return this.requestSanitizedImagesField(true);
    }
    public APIRequestGenget requestSanitizedImagesField (boolean value) {
      this.requestField("sanitized_images", value);
      return this;
    }
    public APIRequestGenget requestSanitizedPreviewsField () {
      return this.requestSanitizedPreviewsField(true);
    }
    public APIRequestGenget requestSanitizedPreviewsField (boolean value) {
      this.requestField("sanitized_previews", value);
      return this;
    }
    public APIRequestGenget requestStartDateField () {
      return this.requestStartDateField(true);
    }
    public APIRequestGenget requestStartDateField (boolean value) {
      this.requestField("start_date", value);
      return this;
    }
    public APIRequestGenget requestStateOfVehicleField () {
      return this.requestStateOfVehicleField(true);
    }
    public APIRequestGenget requestStateOfVehicleField (boolean value) {
      this.requestField("state_of_vehicle", value);
      return this;
    }
    public APIRequestGenget requestStockNumberField () {
      return this.requestStockNumberField(true);
    }
    public APIRequestGenget requestStockNumberField (boolean value) {
      this.requestField("stock_number", value);
      return this;
    }
    public APIRequestGenget requestTagsField () {
      return this.requestTagsField(true);
    }
    public APIRequestGenget requestTagsField (boolean value) {
      this.requestField("tags", value);
      return this;
    }
    public APIRequestGenget requestTermLengthField () {
      return this.requestTermLengthField(true);
    }
    public APIRequestGenget requestTermLengthField (boolean value) {
      this.requestField("term_length", value);
      return this;
    }
    public APIRequestGenget requestTermQualifierField () {
      return this.requestTermQualifierField(true);
    }
    public APIRequestGenget requestTermQualifierField (boolean value) {
      this.requestField("term_qualifier", value);
      return this;
    }
    public APIRequestGenget requestTitleField () {
      return this.requestTitleField(true);
    }
    public APIRequestGenget requestTitleField (boolean value) {
      this.requestField("title", value);
      return this;
    }
    public APIRequestGenget requestTransmissionField () {
      return this.requestTransmissionField(true);
    }
    public APIRequestGenget requestTransmissionField (boolean value) {
      this.requestField("transmission", value);
      return this;
    }
    public APIRequestGenget requestTrimField () {
      return this.requestTrimField(true);
    }
    public APIRequestGenget requestTrimField (boolean value) {
      this.requestField("trim", value);
      return this;
    }
    public APIRequestGenget requestUnitPriceField () {
      return this.requestUnitPriceField(true);
    }
    public APIRequestGenget requestUnitPriceField (boolean value) {
      this.requestField("unit_price", value);
      return this;
    }
    public APIRequestGenget requestUrlField () {
      return this.requestUrlField(true);
    }
    public APIRequestGenget requestUrlField (boolean value) {
      this.requestField("url", value);
      return this;
    }
    public APIRequestGenget requestUrlShimmedField () {
      return this.requestUrlShimmedField(true);
    }
    public APIRequestGenget requestUrlShimmedField (boolean value) {
      this.requestField("url_shimmed", value);
      return this;
    }
    public APIRequestGenget requestValidationErrorsField () {
      return this.requestValidationErrorsField(true);
    }
    public APIRequestGenget requestValidationErrorsField (boolean value) {
      this.requestField("validation_errors", value);
      return this;
    }
    public APIRequestGenget requestVehicleIdField () {
      return this.requestVehicleIdField(true);
    }
    public APIRequestGenget requestVehicleIdField (boolean value) {
      this.requestField("vehicle_id", value);
      return this;
    }
    public APIRequestGenget requestVehicleOfferIdField () {
      return this.requestVehicleOfferIdField(true);
    }
    public APIRequestGenget requestVehicleOfferIdField (boolean value) {
      this.requestField("vehicle_offer_id", value);
      return this;
    }
    public APIRequestGenget requestVehicleRegistrationPlateField () {
      return this.requestVehicleRegistrationPlateField(true);
    }
    public APIRequestGenget requestVehicleRegistrationPlateField (boolean value) {
      this.requestField("vehicle_registration_plate", value);
      return this;
    }
    public APIRequestGenget requestVehicleSpecificationsField () {
      return this.requestVehicleSpecificationsField(true);
    }
    public APIRequestGenget requestVehicleSpecificationsField (boolean value) {
      this.requestField("vehicle_specifications", value);
      return this;
    }
    public APIRequestGenget requestVehicleTypeField () {
      return this.requestVehicleTypeField(true);
    }
    public APIRequestGenget requestVehicleTypeField (boolean value) {
      this.requestField("vehicle_type", value);
      return this;
    }
    public APIRequestGenget requestVideosMetadataField () {
      return this.requestVideosMetadataField(true);
    }
    public APIRequestGenget requestVideosMetadataField (boolean value) {
      this.requestField("videos_metadata", value);
      return this;
    }
    public APIRequestGenget requestVinField () {
      return this.requestVinField(true);
    }
    public APIRequestGenget requestVinField (boolean value) {
      this.requestField("vin", value);
      return this;
    }
    public APIRequestGenget requestVisibilityField () {
      return this.requestVisibilityField(true);
    }
    public APIRequestGenget requestVisibilityField (boolean value) {
      this.requestField("visibility", value);
      return this;
    }
    public APIRequestGenget requestYearField () {
      return this.requestYearField(true);
    }
    public APIRequestGenget requestYearField (boolean value) {
      this.requestField("year", value);
      return this;
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

  public ProductCatalogAutomotiveItem copyFrom(ProductCatalogAutomotiveItem instance) {
    this.mId = instance.mId;
    this.context = instance.context;
    this.rawValue = instance.rawValue;
    return this;
  }

  public static APIRequest.ResponseParser<ProductCatalogAutomotiveItem> getParser() {
    return new APIRequest.ResponseParser<ProductCatalogAutomotiveItem>() {
      public APINodeList<ProductCatalogAutomotiveItem> parseResponse(String response, APIContext context, APIRequest<ProductCatalogAutomotiveItem> request, String header) throws MalformedResponseException {
        return ProductCatalogAutomotiveItem.parseResponse(response, context, request, header);
      }
    };
  }
}
