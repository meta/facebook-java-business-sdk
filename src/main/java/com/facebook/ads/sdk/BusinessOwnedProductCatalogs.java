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
public class BusinessOwnedProductCatalogs extends APINode {
  @SerializedName("id")
  private String mId = null;
  protected static Gson gson = null;

  public BusinessOwnedProductCatalogs() {
  }

  public String getId() {
    return getFieldId().toString();
  }
  public static BusinessOwnedProductCatalogs loadJSON(String json, APIContext context, String header) {
    BusinessOwnedProductCatalogs businessOwnedProductCatalogs = getGson().fromJson(json, BusinessOwnedProductCatalogs.class);
    if (context.isDebug()) {
      JsonParser parser = new JsonParser();
      JsonElement o1 = parser.parse(json);
      JsonElement o2 = parser.parse(businessOwnedProductCatalogs.toString());
      if (o1.getAsJsonObject().get("__fb_trace_id__") != null) {
        o2.getAsJsonObject().add("__fb_trace_id__", o1.getAsJsonObject().get("__fb_trace_id__"));
      }
      if (!o1.equals(o2)) {
        context.log("[Warning] When parsing response, object is not consistent with JSON:");
        context.log("[JSON]" + o1);
        context.log("[Object]" + o2);
      }
    }
    businessOwnedProductCatalogs.context = context;
    businessOwnedProductCatalogs.rawValue = json;
    businessOwnedProductCatalogs.header = header;
    return businessOwnedProductCatalogs;
  }

  public static APINodeList<BusinessOwnedProductCatalogs> parseResponse(String json, APIContext context, APIRequest request, String header) throws MalformedResponseException {
    APINodeList<BusinessOwnedProductCatalogs> businessOwnedProductCatalogss = new APINodeList<BusinessOwnedProductCatalogs>(request, json, header);
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
          businessOwnedProductCatalogss.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
        };
        return businessOwnedProductCatalogss;
      } else if (result.isJsonObject()) {
        obj = result.getAsJsonObject();
        if (obj.has("data")) {
          if (obj.has("paging")) {
            JsonObject paging = obj.get("paging").getAsJsonObject();
            if (paging.has("cursors")) {
                JsonObject cursors = paging.get("cursors").getAsJsonObject();
                String before = cursors.has("before") ? cursors.get("before").getAsString() : null;
                String after = cursors.has("after") ? cursors.get("after").getAsString() : null;
                businessOwnedProductCatalogss.setCursors(before, after);
            }
            String previous = paging.has("previous") ? paging.get("previous").getAsString() : null;
            String next = paging.has("next") ? paging.get("next").getAsString() : null;
            businessOwnedProductCatalogss.setPaging(previous, next);
            if (context.hasAppSecret()) {
              businessOwnedProductCatalogss.setAppSecret(context.getAppSecretProof());
            }
          }
          if (obj.get("data").isJsonArray()) {
            // Second, check if it's a JSON array with "data"
            arr = obj.get("data").getAsJsonArray();
            for (int i = 0; i < arr.size(); i++) {
              businessOwnedProductCatalogss.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
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
                  businessOwnedProductCatalogss.add(loadJSON(entry.getValue().toString(), context, header));
                }
                break;
              }
            }
            if (!isRedownload) {
              businessOwnedProductCatalogss.add(loadJSON(obj.toString(), context, header));
            }
          }
          return businessOwnedProductCatalogss;
        } else if (obj.has("images")) {
          // Fourth, check if it's a map of image objects
          obj = obj.get("images").getAsJsonObject();
          for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
              businessOwnedProductCatalogss.add(loadJSON(entry.getValue().toString(), context, header));
          }
          return businessOwnedProductCatalogss;
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
              businessOwnedProductCatalogss.add(loadJSON(value.toString(), context, header));
            } else {
              isIdIndexedArray = false;
              break;
            }
          }
          if (isIdIndexedArray) {
            return businessOwnedProductCatalogss;
          }

          // Sixth, check if it's pure JsonObject
          businessOwnedProductCatalogss.clear();
          businessOwnedProductCatalogss.add(loadJSON(json, context, header));
          return businessOwnedProductCatalogss;
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

  public APIRequestGenpost genpost() {
    return new APIRequestGenpost(this.getId(), context);
  }


  public String getFieldId() {
    return mId;
  }

  public BusinessOwnedProductCatalogs setFieldId(String value) {
    this.mId = value;
    return this;
  }



  public static class APIRequestGenpost extends APIRequest<BusinessOwnedProductCatalogsPost> {

    BusinessOwnedProductCatalogsPost lastResponse = null;
    @Override
    public BusinessOwnedProductCatalogsPost getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "additional_vertical_option",
      "business_metadata",
      "capabilities",
      "catalog_segment_filter",
      "catalog_segment_product_set_id",
      "da_display_settings",
      "destination_catalog_settings",
      "fields",
      "flight_catalog_settings",
      "hotel_catalog_settings",
      "image_display_settings",
      "localization_settings",
      "name",
      "parent_catalog_id",
      "partner_integration",
      "store_catalog_settings",
      "vertical",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public BusinessOwnedProductCatalogsPost parseResponse(String response, String header) throws APIException {
      return BusinessOwnedProductCatalogsPost.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public BusinessOwnedProductCatalogsPost execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public BusinessOwnedProductCatalogsPost execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<BusinessOwnedProductCatalogsPost> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<BusinessOwnedProductCatalogsPost> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, BusinessOwnedProductCatalogsPost>() {
           public BusinessOwnedProductCatalogsPost apply(ResponseWrapper result) {
             try {
               return APIRequestGenpost.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         },
         MoreExecutors.directExecutor()
      );
    };

    public APIRequestGenpost(String nodeId, APIContext context) {
      super(context, nodeId, "/owned_product_catalogs", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGenpost setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGenpost setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGenpost setAdditionalVerticalOption (String additionalVerticalOption) {
      this.setParam("additional_vertical_option", additionalVerticalOption);
      return this;
    }

    public APIRequestGenpost setBusinessMetadata (String businessMetadata) {
      this.setParam("business_metadata", businessMetadata);
      return this;
    }

    public APIRequestGenpost setCapabilities (String capabilities) {
      this.setParam("capabilities", capabilities);
      return this;
    }

    public APIRequestGenpost setCatalogSegmentFilter (String catalogSegmentFilter) {
      this.setParam("catalog_segment_filter", catalogSegmentFilter);
      return this;
    }

    public APIRequestGenpost setCatalogSegmentProductSetId (String catalogSegmentProductSetId) {
      this.setParam("catalog_segment_product_set_id", catalogSegmentProductSetId);
      return this;
    }

    public APIRequestGenpost setDaDisplaySettings (String daDisplaySettings) {
      this.setParam("da_display_settings", daDisplaySettings);
      return this;
    }

    public APIRequestGenpost setDestinationCatalogSettings (String destinationCatalogSettings) {
      this.setParam("destination_catalog_settings", destinationCatalogSettings);
      return this;
    }

    public APIRequestGenpost setFields (String fields) {
      this.setParam("fields", fields);
      return this;
    }

    public APIRequestGenpost setFlightCatalogSettings (String flightCatalogSettings) {
      this.setParam("flight_catalog_settings", flightCatalogSettings);
      return this;
    }

    public APIRequestGenpost setHotelCatalogSettings (String hotelCatalogSettings) {
      this.setParam("hotel_catalog_settings", hotelCatalogSettings);
      return this;
    }

    public APIRequestGenpost setImageDisplaySettings (String imageDisplaySettings) {
      this.setParam("image_display_settings", imageDisplaySettings);
      return this;
    }

    public APIRequestGenpost setLocalizationSettings (String localizationSettings) {
      this.setParam("localization_settings", localizationSettings);
      return this;
    }

    public APIRequestGenpost setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestGenpost setParentCatalogId (String parentCatalogId) {
      this.setParam("parent_catalog_id", parentCatalogId);
      return this;
    }

    public APIRequestGenpost setPartnerIntegration (String partnerIntegration) {
      this.setParam("partner_integration", partnerIntegration);
      return this;
    }

    public APIRequestGenpost setStoreCatalogSettings (String storeCatalogSettings) {
      this.setParam("store_catalog_settings", storeCatalogSettings);
      return this;
    }

    public APIRequestGenpost setVertical (String vertical) {
      this.setParam("vertical", vertical);
      return this;
    }

    public APIRequestGenpost requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGenpost requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGenpost requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGenpost requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGenpost requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGenpost requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
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

  public BusinessOwnedProductCatalogs copyFrom(BusinessOwnedProductCatalogs instance) {
    this.mId = instance.mId;
    this.context = instance.context;
    this.rawValue = instance.rawValue;
    return this;
  }

  public static APIRequest.ResponseParser<BusinessOwnedProductCatalogs> getParser() {
    return new APIRequest.ResponseParser<BusinessOwnedProductCatalogs>() {
      public APINodeList<BusinessOwnedProductCatalogs> parseResponse(String response, APIContext context, APIRequest<BusinessOwnedProductCatalogs> request, String header) throws MalformedResponseException {
        return BusinessOwnedProductCatalogs.parseResponse(response, context, request, header);
      }
    };
  }
}
