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
public class ApplicationDAChecksGet extends APINode {
  @SerializedName("data")
  private List<Object> mData = null;
  protected static Gson gson = null;

  public ApplicationDAChecksGet() {
  }

  public String getId() {
    return null;
  }
  public static ApplicationDAChecksGet loadJSON(String json, APIContext context, String header) {
    ApplicationDAChecksGet applicationDAChecksGet = getGson().fromJson(json, ApplicationDAChecksGet.class);
    if (context.isDebug()) {
      JsonParser parser = new JsonParser();
      JsonElement o1 = parser.parse(json);
      JsonElement o2 = parser.parse(applicationDAChecksGet.toString());
      if (o1.getAsJsonObject().get("__fb_trace_id__") != null) {
        o2.getAsJsonObject().add("__fb_trace_id__", o1.getAsJsonObject().get("__fb_trace_id__"));
      }
      if (!o1.equals(o2)) {
        context.log("[Warning] When parsing response, object is not consistent with JSON:");
        context.log("[JSON]" + o1);
        context.log("[Object]" + o2);
      }
    }
    applicationDAChecksGet.context = context;
    applicationDAChecksGet.rawValue = json;
    applicationDAChecksGet.header = header;
    return applicationDAChecksGet;
  }

  public static APINodeList<ApplicationDAChecksGet> parseResponse(String json, APIContext context, APIRequest request, String header) throws MalformedResponseException {
    APINodeList<ApplicationDAChecksGet> applicationDAChecksGets = new APINodeList<ApplicationDAChecksGet>(request, json, header);
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
          applicationDAChecksGets.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
        };
        return applicationDAChecksGets;
      } else if (result.isJsonObject()) {
        obj = result.getAsJsonObject();
        if (obj.has("data")) {
          if (obj.has("paging")) {
            JsonObject paging = obj.get("paging").getAsJsonObject();
            if (paging.has("cursors")) {
                JsonObject cursors = paging.get("cursors").getAsJsonObject();
                String before = cursors.has("before") ? cursors.get("before").getAsString() : null;
                String after = cursors.has("after") ? cursors.get("after").getAsString() : null;
                applicationDAChecksGets.setCursors(before, after);
            }
            String previous = paging.has("previous") ? paging.get("previous").getAsString() : null;
            String next = paging.has("next") ? paging.get("next").getAsString() : null;
            applicationDAChecksGets.setPaging(previous, next);
            if (context.hasAppSecret()) {
              applicationDAChecksGets.setAppSecret(context.getAppSecretProof());
            }
          }
          if (obj.get("data").isJsonArray()) {
            // Second, check if it's a JSON array with "data"
            arr = obj.get("data").getAsJsonArray();
            for (int i = 0; i < arr.size(); i++) {
              applicationDAChecksGets.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
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
                  applicationDAChecksGets.add(loadJSON(entry.getValue().toString(), context, header));
                }
                break;
              }
            }
            if (!isRedownload) {
              applicationDAChecksGets.add(loadJSON(obj.toString(), context, header));
            }
          }
          return applicationDAChecksGets;
        } else if (obj.has("images")) {
          // Fourth, check if it's a map of image objects
          obj = obj.get("images").getAsJsonObject();
          for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
              applicationDAChecksGets.add(loadJSON(entry.getValue().toString(), context, header));
          }
          return applicationDAChecksGets;
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
              applicationDAChecksGets.add(loadJSON(value.toString(), context, header));
            } else {
              isIdIndexedArray = false;
              break;
            }
          }
          if (isIdIndexedArray) {
            return applicationDAChecksGets;
          }

          // Sixth, check if it's pure JsonObject
          applicationDAChecksGets.clear();
          applicationDAChecksGets.add(loadJSON(json, context, header));
          return applicationDAChecksGets;
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


  public List<Object> getFieldData() {
    return mData;
  }

  public ApplicationDAChecksGet setFieldData(List<Object> value) {
    this.mData = value;
    return this;
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

  public static enum EnumCategories {
      @SerializedName("APPLIANCES")
      VALUE_APPLIANCES("APPLIANCES"),
      @SerializedName("BABY_FEEDING")
      VALUE_BABY_FEEDING("BABY_FEEDING"),
      @SerializedName("BABY_TRANSPORT")
      VALUE_BABY_TRANSPORT("BABY_TRANSPORT"),
      @SerializedName("BEAUTY")
      VALUE_BEAUTY("BEAUTY"),
      @SerializedName("BEDDING")
      VALUE_BEDDING("BEDDING"),
      @SerializedName("CAMERAS")
      VALUE_CAMERAS("CAMERAS"),
      @SerializedName("CAMERAS_AND_PHOTOS")
      VALUE_CAMERAS_AND_PHOTOS("CAMERAS_AND_PHOTOS"),
      @SerializedName("CELL_PHONES_AND_SMART_WATCHES")
      VALUE_CELL_PHONES_AND_SMART_WATCHES("CELL_PHONES_AND_SMART_WATCHES"),
      @SerializedName("CLEANING_SUPPLIES")
      VALUE_CLEANING_SUPPLIES("CLEANING_SUPPLIES"),
      @SerializedName("CLOTHING")
      VALUE_CLOTHING("CLOTHING"),
      @SerializedName("CLOTHING_ACCESSORIES")
      VALUE_CLOTHING_ACCESSORIES("CLOTHING_ACCESSORIES"),
      @SerializedName("CLO_OFFER")
      VALUE_CLO_OFFER("CLO_OFFER"),
      @SerializedName("COMPUTERS_AND_TABLETS")
      VALUE_COMPUTERS_AND_TABLETS("COMPUTERS_AND_TABLETS"),
      @SerializedName("COMPUTERS_LAPTOPS_AND_TABLETS")
      VALUE_COMPUTERS_LAPTOPS_AND_TABLETS("COMPUTERS_LAPTOPS_AND_TABLETS"),
      @SerializedName("COMPUTER_COMPONENTS")
      VALUE_COMPUTER_COMPONENTS("COMPUTER_COMPONENTS"),
      @SerializedName("DIAPERING_AND_POTTY_TRAINING")
      VALUE_DIAPERING_AND_POTTY_TRAINING("DIAPERING_AND_POTTY_TRAINING"),
      @SerializedName("ELECTRONICS_ACCESSORIES")
      VALUE_ELECTRONICS_ACCESSORIES("ELECTRONICS_ACCESSORIES"),
      @SerializedName("ELECTRONIC_ACCESSORIES_AND_CABLES")
      VALUE_ELECTRONIC_ACCESSORIES_AND_CABLES("ELECTRONIC_ACCESSORIES_AND_CABLES"),
      @SerializedName("EMPTY")
      VALUE_EMPTY("EMPTY"),
      @SerializedName("FURNITURE")
      VALUE_FURNITURE("FURNITURE"),
      @SerializedName("HEALTH")
      VALUE_HEALTH("HEALTH"),
      @SerializedName("HOME")
      VALUE_HOME("HOME"),
      @SerializedName("HOME_GOODS")
      VALUE_HOME_GOODS("HOME_GOODS"),
      @SerializedName("HOUSEHOLD_AND_CLEANING_SUPPLIES")
      VALUE_HOUSEHOLD_AND_CLEANING_SUPPLIES("HOUSEHOLD_AND_CLEANING_SUPPLIES"),
      @SerializedName("JEWELRY")
      VALUE_JEWELRY("JEWELRY"),
      @SerializedName("LARGE_APPLIANCES")
      VALUE_LARGE_APPLIANCES("LARGE_APPLIANCES"),
      @SerializedName("LOCAL_SERVICE_BUSINESS_ITEM")
      VALUE_LOCAL_SERVICE_BUSINESS_ITEM("LOCAL_SERVICE_BUSINESS_ITEM"),
      @SerializedName("LOCAL_SERVICE_BUSINESS_RESTAURANT")
      VALUE_LOCAL_SERVICE_BUSINESS_RESTAURANT("LOCAL_SERVICE_BUSINESS_RESTAURANT"),
      @SerializedName("NURSERY")
      VALUE_NURSERY("NURSERY"),
      @SerializedName("PRINTERS_AND_SCANNERS")
      VALUE_PRINTERS_AND_SCANNERS("PRINTERS_AND_SCANNERS"),
      @SerializedName("PRINTERS_SCANNERS_AND_FAX_MACHINES")
      VALUE_PRINTERS_SCANNERS_AND_FAX_MACHINES("PRINTERS_SCANNERS_AND_FAX_MACHINES"),
      @SerializedName("PRODUCT_DISCOUNT")
      VALUE_PRODUCT_DISCOUNT("PRODUCT_DISCOUNT"),
      @SerializedName("PROJECTORS")
      VALUE_PROJECTORS("PROJECTORS"),
      @SerializedName("SHOES")
      VALUE_SHOES("SHOES"),
      @SerializedName("SHOES_AND_FOOTWEAR")
      VALUE_SHOES_AND_FOOTWEAR("SHOES_AND_FOOTWEAR"),
      @SerializedName("SOFTWARE")
      VALUE_SOFTWARE("SOFTWARE"),
      @SerializedName("TELEVISIONS_AND_MONITORS")
      VALUE_TELEVISIONS_AND_MONITORS("TELEVISIONS_AND_MONITORS"),
      @SerializedName("TEST_CHILD_SUB_VERTICAL")
      VALUE_TEST_CHILD_SUB_VERTICAL("TEST_CHILD_SUB_VERTICAL"),
      @SerializedName("TEST_GRAND_CHILD_SUB_VERTICAL")
      VALUE_TEST_GRAND_CHILD_SUB_VERTICAL("TEST_GRAND_CHILD_SUB_VERTICAL"),
      @SerializedName("TEST_SUB_VERTICAL")
      VALUE_TEST_SUB_VERTICAL("TEST_SUB_VERTICAL"),
      @SerializedName("TEST_SUB_VERTICAL_ALIAS")
      VALUE_TEST_SUB_VERTICAL_ALIAS("TEST_SUB_VERTICAL_ALIAS"),
      @SerializedName("TEST_SUB_VERTICAL_DATA_OBJECT")
      VALUE_TEST_SUB_VERTICAL_DATA_OBJECT("TEST_SUB_VERTICAL_DATA_OBJECT"),
      @SerializedName("THIRD_PARTY_ELECTRONICS")
      VALUE_THIRD_PARTY_ELECTRONICS("THIRD_PARTY_ELECTRONICS"),
      @SerializedName("THIRD_PARTY_TOYS_AND_GAMES")
      VALUE_THIRD_PARTY_TOYS_AND_GAMES("THIRD_PARTY_TOYS_AND_GAMES"),
      @SerializedName("TOYS")
      VALUE_TOYS("TOYS"),
      @SerializedName("TOYS_AND_GAMES")
      VALUE_TOYS_AND_GAMES("TOYS_AND_GAMES"),
      @SerializedName("TVS_AND_MONITORS")
      VALUE_TVS_AND_MONITORS("TVS_AND_MONITORS"),
      @SerializedName("VEHICLE_MANUFACTURER")
      VALUE_VEHICLE_MANUFACTURER("VEHICLE_MANUFACTURER"),
      @SerializedName("VIDEO_GAMES_AND_CONSOLES")
      VALUE_VIDEO_GAMES_AND_CONSOLES("VIDEO_GAMES_AND_CONSOLES"),
      @SerializedName("VIDEO_GAME_CONSOLES_AND_VIDEO_GAMES")
      VALUE_VIDEO_GAME_CONSOLES_AND_VIDEO_GAMES("VIDEO_GAME_CONSOLES_AND_VIDEO_GAMES"),
      @SerializedName("VIDEO_PROJECTORS")
      VALUE_VIDEO_PROJECTORS("VIDEO_PROJECTORS"),
      @SerializedName("WATCHES")
      VALUE_WATCHES("WATCHES"),
      ;

      private String value;

      private EnumCategories(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumConnectionMethod {
      @SerializedName("ALL")
      VALUE_ALL("ALL"),
      @SerializedName("APP")
      VALUE_APP("APP"),
      @SerializedName("BROWSER")
      VALUE_BROWSER("BROWSER"),
      @SerializedName("SERVER")
      VALUE_SERVER("SERVER"),
      ;

      private String value;

      private EnumConnectionMethod(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumFeatures {
      @SerializedName("AGENTIC_CHECKOUT")
      VALUE_AGENTIC_CHECKOUT("AGENTIC_CHECKOUT"),
      @SerializedName("AGENTIC_CHECKOUT_PRE_CLICK")
      VALUE_AGENTIC_CHECKOUT_PRE_CLICK("AGENTIC_CHECKOUT_PRE_CLICK"),
      @SerializedName("AMAZON_BUY_WITH_PRIME")
      VALUE_AMAZON_BUY_WITH_PRIME("AMAZON_BUY_WITH_PRIME"),
      @SerializedName("AUGMENTED_REALITY")
      VALUE_AUGMENTED_REALITY("AUGMENTED_REALITY"),
      @SerializedName("CHECKOUT")
      VALUE_CHECKOUT("CHECKOUT"),
      @SerializedName("INTEGRATED_CHECKOUT_LOWES")
      VALUE_INTEGRATED_CHECKOUT_LOWES("INTEGRATED_CHECKOUT_LOWES"),
      @SerializedName("INTEGRATED_CHECKOUT_MELI")
      VALUE_INTEGRATED_CHECKOUT_MELI("INTEGRATED_CHECKOUT_MELI"),
      @SerializedName("INTEGRATED_CHECKOUT_SHEIN")
      VALUE_INTEGRATED_CHECKOUT_SHEIN("INTEGRATED_CHECKOUT_SHEIN"),
      @SerializedName("INTEGRATED_CHECKOUT_SHOPEE")
      VALUE_INTEGRATED_CHECKOUT_SHOPEE("INTEGRATED_CHECKOUT_SHOPEE"),
      @SerializedName("INTEGRATED_CHECKOUT_WALMART")
      VALUE_INTEGRATED_CHECKOUT_WALMART("INTEGRATED_CHECKOUT_WALMART"),
      @SerializedName("INTEGRATED_CHECKOUT_ZALANDO")
      VALUE_INTEGRATED_CHECKOUT_ZALANDO("INTEGRATED_CHECKOUT_ZALANDO"),
      @SerializedName("LIVE_SHOPPING")
      VALUE_LIVE_SHOPPING("LIVE_SHOPPING"),
      ;

      private String value;

      private EnumFeatures(String value) {
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

  public ApplicationDAChecksGet copyFrom(ApplicationDAChecksGet instance) {
    this.mData = instance.mData;
    this.context = instance.context;
    this.rawValue = instance.rawValue;
    return this;
  }

  public static APIRequest.ResponseParser<ApplicationDAChecksGet> getParser() {
    return new APIRequest.ResponseParser<ApplicationDAChecksGet>() {
      public APINodeList<ApplicationDAChecksGet> parseResponse(String response, APIContext context, APIRequest<ApplicationDAChecksGet> request, String header) throws MalformedResponseException {
        return ApplicationDAChecksGet.parseResponse(response, context, request, header);
      }
    };
  }
}
