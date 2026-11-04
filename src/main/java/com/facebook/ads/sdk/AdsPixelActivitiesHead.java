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
public class AdsPixelActivitiesHead extends APINode {
  protected static Gson gson = null;

  public AdsPixelActivitiesHead() {
  }

  public String getId() {
    return null;
  }
  public static AdsPixelActivitiesHead loadJSON(String json, APIContext context, String header) {
    AdsPixelActivitiesHead adsPixelActivitiesHead = getGson().fromJson(json, AdsPixelActivitiesHead.class);
    if (context.isDebug()) {
      JsonParser parser = new JsonParser();
      JsonElement o1 = parser.parse(json);
      JsonElement o2 = parser.parse(adsPixelActivitiesHead.toString());
      if (o1.getAsJsonObject().get("__fb_trace_id__") != null) {
        o2.getAsJsonObject().add("__fb_trace_id__", o1.getAsJsonObject().get("__fb_trace_id__"));
      }
      if (!o1.equals(o2)) {
        context.log("[Warning] When parsing response, object is not consistent with JSON:");
        context.log("[JSON]" + o1);
        context.log("[Object]" + o2);
      }
    }
    adsPixelActivitiesHead.context = context;
    adsPixelActivitiesHead.rawValue = json;
    adsPixelActivitiesHead.header = header;
    return adsPixelActivitiesHead;
  }

  public static APINodeList<AdsPixelActivitiesHead> parseResponse(String json, APIContext context, APIRequest request, String header) throws MalformedResponseException {
    APINodeList<AdsPixelActivitiesHead> adsPixelActivitiesHeads = new APINodeList<AdsPixelActivitiesHead>(request, json, header);
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
          adsPixelActivitiesHeads.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
        };
        return adsPixelActivitiesHeads;
      } else if (result.isJsonObject()) {
        obj = result.getAsJsonObject();
        if (obj.has("data")) {
          if (obj.has("paging")) {
            JsonObject paging = obj.get("paging").getAsJsonObject();
            if (paging.has("cursors")) {
                JsonObject cursors = paging.get("cursors").getAsJsonObject();
                String before = cursors.has("before") ? cursors.get("before").getAsString() : null;
                String after = cursors.has("after") ? cursors.get("after").getAsString() : null;
                adsPixelActivitiesHeads.setCursors(before, after);
            }
            String previous = paging.has("previous") ? paging.get("previous").getAsString() : null;
            String next = paging.has("next") ? paging.get("next").getAsString() : null;
            adsPixelActivitiesHeads.setPaging(previous, next);
            if (context.hasAppSecret()) {
              adsPixelActivitiesHeads.setAppSecret(context.getAppSecretProof());
            }
          }
          if (obj.get("data").isJsonArray()) {
            // Second, check if it's a JSON array with "data"
            arr = obj.get("data").getAsJsonArray();
            for (int i = 0; i < arr.size(); i++) {
              adsPixelActivitiesHeads.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
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
                  adsPixelActivitiesHeads.add(loadJSON(entry.getValue().toString(), context, header));
                }
                break;
              }
            }
            if (!isRedownload) {
              adsPixelActivitiesHeads.add(loadJSON(obj.toString(), context, header));
            }
          }
          return adsPixelActivitiesHeads;
        } else if (obj.has("images")) {
          // Fourth, check if it's a map of image objects
          obj = obj.get("images").getAsJsonObject();
          for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
              adsPixelActivitiesHeads.add(loadJSON(entry.getValue().toString(), context, header));
          }
          return adsPixelActivitiesHeads;
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
              adsPixelActivitiesHeads.add(loadJSON(value.toString(), context, header));
            } else {
              isIdIndexedArray = false;
              break;
            }
          }
          if (isIdIndexedArray) {
            return adsPixelActivitiesHeads;
          }

          // Sixth, check if it's pure JsonObject
          adsPixelActivitiesHeads.clear();
          adsPixelActivitiesHeads.add(loadJSON(json, context, header));
          return adsPixelActivitiesHeads;
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




  public static enum EnumEventType {
      @SerializedName("ADD_DATASET_TO_BUSINESS")
      VALUE_ADD_DATASET_TO_BUSINESS("ADD_DATASET_TO_BUSINESS"),
      @SerializedName("ADD_USER_TO_DATASET")
      VALUE_ADD_USER_TO_DATASET("ADD_USER_TO_DATASET"),
      @SerializedName("CREATE_CUSTOM_AUDIENCE")
      VALUE_CREATE_CUSTOM_AUDIENCE("CREATE_CUSTOM_AUDIENCE"),
      @SerializedName("CREATE_CUSTOM_CONVERSION")
      VALUE_CREATE_CUSTOM_CONVERSION("CREATE_CUSTOM_CONVERSION"),
      @SerializedName("DATASET_ASSIGN_TO_ADACCT")
      VALUE_DATASET_ASSIGN_TO_ADACCT("DATASET_ASSIGN_TO_ADACCT"),
      @SerializedName("DATASET_AUTOTRACK_ON_ADACCT")
      VALUE_DATASET_AUTOTRACK_ON_ADACCT("DATASET_AUTOTRACK_ON_ADACCT"),
      @SerializedName("DATASET_DISABLE_AUTOTRACK_ON_ADACCT")
      VALUE_DATASET_DISABLE_AUTOTRACK_ON_ADACCT("DATASET_DISABLE_AUTOTRACK_ON_ADACCT"),
      @SerializedName("DATASET_UNASSIGN_FROM_ADACCT")
      VALUE_DATASET_UNASSIGN_FROM_ADACCT("DATASET_UNASSIGN_FROM_ADACCT"),
      @SerializedName("REMOVE_USER_FROM_DATASET")
      VALUE_REMOVE_USER_FROM_DATASET("REMOVE_USER_FROM_DATASET"),
      @SerializedName("SHARE_CUSTOM_AUDIENCE")
      VALUE_SHARE_CUSTOM_AUDIENCE("SHARE_CUSTOM_AUDIENCE"),
      @SerializedName("UNSHARE_CUSTOM_AUDIENCE")
      VALUE_UNSHARE_CUSTOM_AUDIENCE("UNSHARE_CUSTOM_AUDIENCE"),
      @SerializedName("UPDATE_CUSTOM_CONVERSION")
      VALUE_UPDATE_CUSTOM_CONVERSION("UPDATE_CUSTOM_CONVERSION"),
      @SerializedName("UPDATE_USER_ROLE_ON_DATASET")
      VALUE_UPDATE_USER_ROLE_ON_DATASET("UPDATE_USER_ROLE_ON_DATASET"),
      ;

      private String value;

      private EnumEventType(String value) {
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

  public AdsPixelActivitiesHead copyFrom(AdsPixelActivitiesHead instance) {
    this.context = instance.context;
    this.rawValue = instance.rawValue;
    return this;
  }

  public static APIRequest.ResponseParser<AdsPixelActivitiesHead> getParser() {
    return new APIRequest.ResponseParser<AdsPixelActivitiesHead>() {
      public APINodeList<AdsPixelActivitiesHead> parseResponse(String response, APIContext context, APIRequest<AdsPixelActivitiesHead> request, String header) throws MalformedResponseException {
        return AdsPixelActivitiesHead.parseResponse(response, context, request, header);
      }
    };
  }
}
