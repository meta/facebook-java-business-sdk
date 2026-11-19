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
public class BusinessCatalogAdvertiserInsights extends APINode {
  @SerializedName("id")
  private String mId = null;
  protected static Gson gson = null;

  public BusinessCatalogAdvertiserInsights() {
  }

  public String getId() {
    return getFieldId().toString();
  }
  public static BusinessCatalogAdvertiserInsights loadJSON(String json, APIContext context, String header) {
    BusinessCatalogAdvertiserInsights businessCatalogAdvertiserInsights = getGson().fromJson(json, BusinessCatalogAdvertiserInsights.class);
    if (context.isDebug()) {
      JsonParser parser = new JsonParser();
      JsonElement o1 = parser.parse(json);
      JsonElement o2 = parser.parse(businessCatalogAdvertiserInsights.toString());
      if (o1.getAsJsonObject().get("__fb_trace_id__") != null) {
        o2.getAsJsonObject().add("__fb_trace_id__", o1.getAsJsonObject().get("__fb_trace_id__"));
      }
      if (!o1.equals(o2)) {
        context.log("[Warning] When parsing response, object is not consistent with JSON:");
        context.log("[JSON]" + o1);
        context.log("[Object]" + o2);
      }
    }
    businessCatalogAdvertiserInsights.context = context;
    businessCatalogAdvertiserInsights.rawValue = json;
    businessCatalogAdvertiserInsights.header = header;
    return businessCatalogAdvertiserInsights;
  }

  public static APINodeList<BusinessCatalogAdvertiserInsights> parseResponse(String json, APIContext context, APIRequest request, String header) throws MalformedResponseException {
    APINodeList<BusinessCatalogAdvertiserInsights> businessCatalogAdvertiserInsightss = new APINodeList<BusinessCatalogAdvertiserInsights>(request, json, header);
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
          businessCatalogAdvertiserInsightss.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
        };
        return businessCatalogAdvertiserInsightss;
      } else if (result.isJsonObject()) {
        obj = result.getAsJsonObject();
        if (obj.has("data")) {
          if (obj.has("paging")) {
            JsonObject paging = obj.get("paging").getAsJsonObject();
            if (paging.has("cursors")) {
                JsonObject cursors = paging.get("cursors").getAsJsonObject();
                String before = cursors.has("before") ? cursors.get("before").getAsString() : null;
                String after = cursors.has("after") ? cursors.get("after").getAsString() : null;
                businessCatalogAdvertiserInsightss.setCursors(before, after);
            }
            String previous = paging.has("previous") ? paging.get("previous").getAsString() : null;
            String next = paging.has("next") ? paging.get("next").getAsString() : null;
            businessCatalogAdvertiserInsightss.setPaging(previous, next);
            if (context.hasAppSecret()) {
              businessCatalogAdvertiserInsightss.setAppSecret(context.getAppSecretProof());
            }
          }
          if (obj.get("data").isJsonArray()) {
            // Second, check if it's a JSON array with "data"
            arr = obj.get("data").getAsJsonArray();
            for (int i = 0; i < arr.size(); i++) {
              businessCatalogAdvertiserInsightss.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
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
                  businessCatalogAdvertiserInsightss.add(loadJSON(entry.getValue().toString(), context, header));
                }
                break;
              }
            }
            if (!isRedownload) {
              businessCatalogAdvertiserInsightss.add(loadJSON(obj.toString(), context, header));
            }
          }
          return businessCatalogAdvertiserInsightss;
        } else if (obj.has("images")) {
          // Fourth, check if it's a map of image objects
          obj = obj.get("images").getAsJsonObject();
          for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
              businessCatalogAdvertiserInsightss.add(loadJSON(entry.getValue().toString(), context, header));
          }
          return businessCatalogAdvertiserInsightss;
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
              businessCatalogAdvertiserInsightss.add(loadJSON(value.toString(), context, header));
            } else {
              isIdIndexedArray = false;
              break;
            }
          }
          if (isIdIndexedArray) {
            return businessCatalogAdvertiserInsightss;
          }

          // Sixth, check if it's pure JsonObject
          businessCatalogAdvertiserInsightss.clear();
          businessCatalogAdvertiserInsightss.add(loadJSON(json, context, header));
          return businessCatalogAdvertiserInsightss;
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

  public BusinessCatalogAdvertiserInsights setFieldId(String value) {
    this.mId = value;
    return this;
  }



  public static class APIRequestGenget extends APIRequest<BusinessCatalogAdvertiserInsightsGet> {

    APINodeList<BusinessCatalogAdvertiserInsightsGet> lastResponse = null;
    @Override
    public APINodeList<BusinessCatalogAdvertiserInsightsGet> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "after",
      "before",
      "category_filter",
      "category_level_down",
      "country_code",
      "fields",
      "limit",
      "time_range",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<BusinessCatalogAdvertiserInsightsGet> parseResponse(String response, String header) throws APIException {
      return BusinessCatalogAdvertiserInsightsGet.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<BusinessCatalogAdvertiserInsightsGet> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<BusinessCatalogAdvertiserInsightsGet> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<BusinessCatalogAdvertiserInsightsGet>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<BusinessCatalogAdvertiserInsightsGet>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<BusinessCatalogAdvertiserInsightsGet>>() {
           public APINodeList<BusinessCatalogAdvertiserInsightsGet> apply(ResponseWrapper result) {
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
      super(context, nodeId, "/catalog_advertiser_insights", "GET", Arrays.asList(PARAMS));
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


    public APIRequestGenget setAfter (String after) {
      this.setParam("after", after);
      return this;
    }

    public APIRequestGenget setBefore (String before) {
      this.setParam("before", before);
      return this;
    }

    public APIRequestGenget setCategoryFilter (String categoryFilter) {
      this.setParam("category_filter", categoryFilter);
      return this;
    }

    public APIRequestGenget setCategoryLevelDown (String categoryLevelDown) {
      this.setParam("category_level_down", categoryLevelDown);
      return this;
    }

    public APIRequestGenget setCountryCode (String countryCode) {
      this.setParam("country_code", countryCode);
      return this;
    }

    public APIRequestGenget setFields (String fields) {
      this.setParam("fields", fields);
      return this;
    }

    public APIRequestGenget setLimit (Long limit) {
      this.setParam("limit", limit);
      return this;
    }
    public APIRequestGenget setLimit (String limit) {
      this.setParam("limit", limit);
      return this;
    }

    public APIRequestGenget setTimeRange (String timeRange) {
      this.setParam("time_range", timeRange);
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

  public BusinessCatalogAdvertiserInsights copyFrom(BusinessCatalogAdvertiserInsights instance) {
    this.mId = instance.mId;
    this.context = instance.context;
    this.rawValue = instance.rawValue;
    return this;
  }

  public static APIRequest.ResponseParser<BusinessCatalogAdvertiserInsights> getParser() {
    return new APIRequest.ResponseParser<BusinessCatalogAdvertiserInsights>() {
      public APINodeList<BusinessCatalogAdvertiserInsights> parseResponse(String response, APIContext context, APIRequest<BusinessCatalogAdvertiserInsights> request, String header) throws MalformedResponseException {
        return BusinessCatalogAdvertiserInsights.parseResponse(response, context, request, header);
      }
    };
  }
}
