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
public class ProductCatalogDiagnostics extends APINode {
  @SerializedName("id")
  private String mId = null;
  protected static Gson gson = null;

  public ProductCatalogDiagnostics() {
  }

  public String getId() {
    return getFieldId().toString();
  }
  public static ProductCatalogDiagnostics loadJSON(String json, APIContext context, String header) {
    ProductCatalogDiagnostics productCatalogDiagnostics = getGson().fromJson(json, ProductCatalogDiagnostics.class);
    if (context.isDebug()) {
      JsonParser parser = new JsonParser();
      JsonElement o1 = parser.parse(json);
      JsonElement o2 = parser.parse(productCatalogDiagnostics.toString());
      if (o1.getAsJsonObject().get("__fb_trace_id__") != null) {
        o2.getAsJsonObject().add("__fb_trace_id__", o1.getAsJsonObject().get("__fb_trace_id__"));
      }
      if (!o1.equals(o2)) {
        context.log("[Warning] When parsing response, object is not consistent with JSON:");
        context.log("[JSON]" + o1);
        context.log("[Object]" + o2);
      }
    }
    productCatalogDiagnostics.context = context;
    productCatalogDiagnostics.rawValue = json;
    productCatalogDiagnostics.header = header;
    return productCatalogDiagnostics;
  }

  public static APINodeList<ProductCatalogDiagnostics> parseResponse(String json, APIContext context, APIRequest request, String header) throws MalformedResponseException {
    APINodeList<ProductCatalogDiagnostics> productCatalogDiagnosticss = new APINodeList<ProductCatalogDiagnostics>(request, json, header);
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
          productCatalogDiagnosticss.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
        };
        return productCatalogDiagnosticss;
      } else if (result.isJsonObject()) {
        obj = result.getAsJsonObject();
        if (obj.has("data")) {
          if (obj.has("paging")) {
            JsonObject paging = obj.get("paging").getAsJsonObject();
            if (paging.has("cursors")) {
                JsonObject cursors = paging.get("cursors").getAsJsonObject();
                String before = cursors.has("before") ? cursors.get("before").getAsString() : null;
                String after = cursors.has("after") ? cursors.get("after").getAsString() : null;
                productCatalogDiagnosticss.setCursors(before, after);
            }
            String previous = paging.has("previous") ? paging.get("previous").getAsString() : null;
            String next = paging.has("next") ? paging.get("next").getAsString() : null;
            productCatalogDiagnosticss.setPaging(previous, next);
            if (context.hasAppSecret()) {
              productCatalogDiagnosticss.setAppSecret(context.getAppSecretProof());
            }
          }
          if (obj.get("data").isJsonArray()) {
            // Second, check if it's a JSON array with "data"
            arr = obj.get("data").getAsJsonArray();
            for (int i = 0; i < arr.size(); i++) {
              productCatalogDiagnosticss.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
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
                  productCatalogDiagnosticss.add(loadJSON(entry.getValue().toString(), context, header));
                }
                break;
              }
            }
            if (!isRedownload) {
              productCatalogDiagnosticss.add(loadJSON(obj.toString(), context, header));
            }
          }
          return productCatalogDiagnosticss;
        } else if (obj.has("images")) {
          // Fourth, check if it's a map of image objects
          obj = obj.get("images").getAsJsonObject();
          for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
              productCatalogDiagnosticss.add(loadJSON(entry.getValue().toString(), context, header));
          }
          return productCatalogDiagnosticss;
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
              productCatalogDiagnosticss.add(loadJSON(value.toString(), context, header));
            } else {
              isIdIndexedArray = false;
              break;
            }
          }
          if (isIdIndexedArray) {
            return productCatalogDiagnosticss;
          }

          // Sixth, check if it's pure JsonObject
          productCatalogDiagnosticss.clear();
          productCatalogDiagnosticss.add(loadJSON(json, context, header));
          return productCatalogDiagnosticss;
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

  public ProductCatalogDiagnostics setFieldId(String value) {
    this.mId = value;
    return this;
  }



  public static class APIRequestGenget extends APIRequest<ProductCatalogDiagnosticsGet> {

    APINodeList<ProductCatalogDiagnosticsGet> lastResponse = null;
    @Override
    public APINodeList<ProductCatalogDiagnosticsGet> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "affected_channels",
      "affected_entities",
      "affected_features",
      "fields",
      "severities",
      "summary",
      "types",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<ProductCatalogDiagnosticsGet> parseResponse(String response, String header) throws APIException {
      return ProductCatalogDiagnosticsGet.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<ProductCatalogDiagnosticsGet> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<ProductCatalogDiagnosticsGet> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<ProductCatalogDiagnosticsGet>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<ProductCatalogDiagnosticsGet>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<ProductCatalogDiagnosticsGet>>() {
           public APINodeList<ProductCatalogDiagnosticsGet> apply(ResponseWrapper result) {
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
      super(context, nodeId, "/diagnostics", "GET", Arrays.asList(PARAMS));
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


    public APIRequestGenget setAffectedChannels (String affectedChannels) {
      this.setParam("affected_channels", affectedChannels);
      return this;
    }

    public APIRequestGenget setAffectedEntities (String affectedEntities) {
      this.setParam("affected_entities", affectedEntities);
      return this;
    }

    public APIRequestGenget setAffectedFeatures (String affectedFeatures) {
      this.setParam("affected_features", affectedFeatures);
      return this;
    }

    public APIRequestGenget setFields (String fields) {
      this.setParam("fields", fields);
      return this;
    }

    public APIRequestGenget setSeverities (String severities) {
      this.setParam("severities", severities);
      return this;
    }

    public APIRequestGenget setSummary (String summary) {
      this.setParam("summary", summary);
      return this;
    }

    public APIRequestGenget setTypes (String types) {
      this.setParam("types", types);
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

  public ProductCatalogDiagnostics copyFrom(ProductCatalogDiagnostics instance) {
    this.mId = instance.mId;
    this.context = instance.context;
    this.rawValue = instance.rawValue;
    return this;
  }

  public static APIRequest.ResponseParser<ProductCatalogDiagnostics> getParser() {
    return new APIRequest.ResponseParser<ProductCatalogDiagnostics>() {
      public APINodeList<ProductCatalogDiagnostics> parseResponse(String response, APIContext context, APIRequest<ProductCatalogDiagnostics> request, String header) throws MalformedResponseException {
        return ProductCatalogDiagnostics.parseResponse(response, context, request, header);
      }
    };
  }
}
