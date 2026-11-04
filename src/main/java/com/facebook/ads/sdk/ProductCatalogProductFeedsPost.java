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
public class ProductCatalogProductFeedsPost extends APINode {
  @SerializedName("country")
  private String mCountry = null;
  @SerializedName("created_time")
  private String mCreatedTime = null;
  @SerializedName("default_currency")
  private String mDefaultCurrency = null;
  @SerializedName("deletion_enabled")
  private Boolean mDeletionEnabled = null;
  @SerializedName("delimiter")
  private EnumDelimiter mDelimiter = null;
  @SerializedName("encoding")
  private EnumEncoding mEncoding = null;
  @SerializedName("errors")
  private List<Object> mErrors = null;
  @SerializedName("file_name")
  private String mFileName = null;
  @SerializedName("id")
  private Long mId = null;
  @SerializedName("ingestion_source_type")
  private EnumIngestionSourceType mIngestionSourceType = null;
  @SerializedName("item_sub_type")
  private EnumItemSubType mItemSubType = null;
  @SerializedName("name")
  private String mName = null;
  @SerializedName("override_type")
  private EnumOverrideType mOverrideType = null;
  @SerializedName("primary_feeds")
  private List<Long> mPrimaryFeeds = null;
  @SerializedName("product_count")
  private Long mProductCount = null;
  @SerializedName("quoted_fields_mode")
  private EnumQuotedFieldsMode mQuotedFieldsMode = null;
  @SerializedName("schedule")
  private Object mSchedule = null;
  @SerializedName("update_schedule")
  private Object mUpdateSchedule = null;
  protected static Gson gson = null;

  public ProductCatalogProductFeedsPost() {
  }

  public String getId() {
    return getFieldId().toString();
  }
  public static ProductCatalogProductFeedsPost loadJSON(String json, APIContext context, String header) {
    ProductCatalogProductFeedsPost productCatalogProductFeedsPost = getGson().fromJson(json, ProductCatalogProductFeedsPost.class);
    if (context.isDebug()) {
      JsonParser parser = new JsonParser();
      JsonElement o1 = parser.parse(json);
      JsonElement o2 = parser.parse(productCatalogProductFeedsPost.toString());
      if (o1.getAsJsonObject().get("__fb_trace_id__") != null) {
        o2.getAsJsonObject().add("__fb_trace_id__", o1.getAsJsonObject().get("__fb_trace_id__"));
      }
      if (!o1.equals(o2)) {
        context.log("[Warning] When parsing response, object is not consistent with JSON:");
        context.log("[JSON]" + o1);
        context.log("[Object]" + o2);
      }
    }
    productCatalogProductFeedsPost.context = context;
    productCatalogProductFeedsPost.rawValue = json;
    productCatalogProductFeedsPost.header = header;
    return productCatalogProductFeedsPost;
  }

  public static APINodeList<ProductCatalogProductFeedsPost> parseResponse(String json, APIContext context, APIRequest request, String header) throws MalformedResponseException {
    APINodeList<ProductCatalogProductFeedsPost> productCatalogProductFeedsPosts = new APINodeList<ProductCatalogProductFeedsPost>(request, json, header);
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
          productCatalogProductFeedsPosts.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
        };
        return productCatalogProductFeedsPosts;
      } else if (result.isJsonObject()) {
        obj = result.getAsJsonObject();
        if (obj.has("data")) {
          if (obj.has("paging")) {
            JsonObject paging = obj.get("paging").getAsJsonObject();
            if (paging.has("cursors")) {
                JsonObject cursors = paging.get("cursors").getAsJsonObject();
                String before = cursors.has("before") ? cursors.get("before").getAsString() : null;
                String after = cursors.has("after") ? cursors.get("after").getAsString() : null;
                productCatalogProductFeedsPosts.setCursors(before, after);
            }
            String previous = paging.has("previous") ? paging.get("previous").getAsString() : null;
            String next = paging.has("next") ? paging.get("next").getAsString() : null;
            productCatalogProductFeedsPosts.setPaging(previous, next);
            if (context.hasAppSecret()) {
              productCatalogProductFeedsPosts.setAppSecret(context.getAppSecretProof());
            }
          }
          if (obj.get("data").isJsonArray()) {
            // Second, check if it's a JSON array with "data"
            arr = obj.get("data").getAsJsonArray();
            for (int i = 0; i < arr.size(); i++) {
              productCatalogProductFeedsPosts.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
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
                  productCatalogProductFeedsPosts.add(loadJSON(entry.getValue().toString(), context, header));
                }
                break;
              }
            }
            if (!isRedownload) {
              productCatalogProductFeedsPosts.add(loadJSON(obj.toString(), context, header));
            }
          }
          return productCatalogProductFeedsPosts;
        } else if (obj.has("images")) {
          // Fourth, check if it's a map of image objects
          obj = obj.get("images").getAsJsonObject();
          for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
              productCatalogProductFeedsPosts.add(loadJSON(entry.getValue().toString(), context, header));
          }
          return productCatalogProductFeedsPosts;
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
              productCatalogProductFeedsPosts.add(loadJSON(value.toString(), context, header));
            } else {
              isIdIndexedArray = false;
              break;
            }
          }
          if (isIdIndexedArray) {
            return productCatalogProductFeedsPosts;
          }

          // Sixth, check if it's pure JsonObject
          productCatalogProductFeedsPosts.clear();
          productCatalogProductFeedsPosts.add(loadJSON(json, context, header));
          return productCatalogProductFeedsPosts;
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


  public String getFieldCountry() {
    return mCountry;
  }

  public ProductCatalogProductFeedsPost setFieldCountry(String value) {
    this.mCountry = value;
    return this;
  }

  public String getFieldCreatedTime() {
    return mCreatedTime;
  }

  public ProductCatalogProductFeedsPost setFieldCreatedTime(String value) {
    this.mCreatedTime = value;
    return this;
  }

  public String getFieldDefaultCurrency() {
    return mDefaultCurrency;
  }

  public ProductCatalogProductFeedsPost setFieldDefaultCurrency(String value) {
    this.mDefaultCurrency = value;
    return this;
  }

  public Boolean getFieldDeletionEnabled() {
    return mDeletionEnabled;
  }

  public ProductCatalogProductFeedsPost setFieldDeletionEnabled(Boolean value) {
    this.mDeletionEnabled = value;
    return this;
  }

  public EnumDelimiter getFieldDelimiter() {
    return mDelimiter;
  }

  public ProductCatalogProductFeedsPost setFieldDelimiter(EnumDelimiter value) {
    this.mDelimiter = value;
    return this;
  }

  public EnumEncoding getFieldEncoding() {
    return mEncoding;
  }

  public ProductCatalogProductFeedsPost setFieldEncoding(EnumEncoding value) {
    this.mEncoding = value;
    return this;
  }

  public List<Object> getFieldErrors() {
    return mErrors;
  }

  public ProductCatalogProductFeedsPost setFieldErrors(List<Object> value) {
    this.mErrors = value;
    return this;
  }

  public String getFieldFileName() {
    return mFileName;
  }

  public ProductCatalogProductFeedsPost setFieldFileName(String value) {
    this.mFileName = value;
    return this;
  }

  public Long getFieldId() {
    return mId;
  }

  public ProductCatalogProductFeedsPost setFieldId(Long value) {
    this.mId = value;
    return this;
  }

  public EnumIngestionSourceType getFieldIngestionSourceType() {
    return mIngestionSourceType;
  }

  public ProductCatalogProductFeedsPost setFieldIngestionSourceType(EnumIngestionSourceType value) {
    this.mIngestionSourceType = value;
    return this;
  }

  public EnumItemSubType getFieldItemSubType() {
    return mItemSubType;
  }

  public ProductCatalogProductFeedsPost setFieldItemSubType(EnumItemSubType value) {
    this.mItemSubType = value;
    return this;
  }

  public String getFieldName() {
    return mName;
  }

  public ProductCatalogProductFeedsPost setFieldName(String value) {
    this.mName = value;
    return this;
  }

  public EnumOverrideType getFieldOverrideType() {
    return mOverrideType;
  }

  public ProductCatalogProductFeedsPost setFieldOverrideType(EnumOverrideType value) {
    this.mOverrideType = value;
    return this;
  }

  public List<Long> getFieldPrimaryFeeds() {
    return mPrimaryFeeds;
  }

  public ProductCatalogProductFeedsPost setFieldPrimaryFeeds(List<Long> value) {
    this.mPrimaryFeeds = value;
    return this;
  }

  public Long getFieldProductCount() {
    return mProductCount;
  }

  public ProductCatalogProductFeedsPost setFieldProductCount(Long value) {
    this.mProductCount = value;
    return this;
  }

  public EnumQuotedFieldsMode getFieldQuotedFieldsMode() {
    return mQuotedFieldsMode;
  }

  public ProductCatalogProductFeedsPost setFieldQuotedFieldsMode(EnumQuotedFieldsMode value) {
    this.mQuotedFieldsMode = value;
    return this;
  }

  public Object getFieldSchedule() {
    return mSchedule;
  }

  public ProductCatalogProductFeedsPost setFieldSchedule(Object value) {
    this.mSchedule = value;
    return this;
  }

  public Object getFieldUpdateSchedule() {
    return mUpdateSchedule;
  }

  public ProductCatalogProductFeedsPost setFieldUpdateSchedule(Object value) {
    this.mUpdateSchedule = value;
    return this;
  }



  public static enum EnumDelimiter {
      @SerializedName("AUTODETECT")
      VALUE_AUTODETECT("AUTODETECT"),
      @SerializedName("BAR")
      VALUE_BAR("BAR"),
      @SerializedName("COMMA")
      VALUE_COMMA("COMMA"),
      @SerializedName("SEMICOLON")
      VALUE_SEMICOLON("SEMICOLON"),
      @SerializedName("TAB")
      VALUE_TAB("TAB"),
      @SerializedName("TILDE")
      VALUE_TILDE("TILDE"),
      ;

      private String value;

      private EnumDelimiter(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumEncoding {
      @SerializedName("AUTODETECT")
      VALUE_AUTODETECT("AUTODETECT"),
      @SerializedName("LATIN1")
      VALUE_LATIN1("LATIN1"),
      @SerializedName("UTF16BE")
      VALUE_UTF16BE("UTF16BE"),
      @SerializedName("UTF16LE")
      VALUE_UTF16LE("UTF16LE"),
      @SerializedName("UTF32BE")
      VALUE_UTF32BE("UTF32BE"),
      @SerializedName("UTF32LE")
      VALUE_UTF32LE("UTF32LE"),
      @SerializedName("UTF8")
      VALUE_UTF8("UTF8"),
      ;

      private String value;

      private EnumEncoding(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumIngestionSourceType {
      @SerializedName("PRIMARY_FEED")
      VALUE_PRIMARY_FEED("PRIMARY_FEED"),
      @SerializedName("SUPPLEMENTARY_FEED")
      VALUE_SUPPLEMENTARY_FEED("SUPPLEMENTARY_FEED"),
      ;

      private String value;

      private EnumIngestionSourceType(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumItemSubType {
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

      private EnumItemSubType(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumOverrideType {
      @SerializedName("BATCH_API_LANGUAGE_OR_COUNTRY")
      VALUE_BATCH_API_LANGUAGE_OR_COUNTRY("BATCH_API_LANGUAGE_OR_COUNTRY"),
      @SerializedName("CATALOG_SEGMENT_CUSTOMIZE_DEFAULT")
      VALUE_CATALOG_SEGMENT_CUSTOMIZE_DEFAULT("CATALOG_SEGMENT_CUSTOMIZE_DEFAULT"),
      @SerializedName("COUNTRY")
      VALUE_COUNTRY("COUNTRY"),
      @SerializedName("LANGUAGE")
      VALUE_LANGUAGE("LANGUAGE"),
      @SerializedName("LANGUAGE_AND_COUNTRY")
      VALUE_LANGUAGE_AND_COUNTRY("LANGUAGE_AND_COUNTRY"),
      @SerializedName("LOCAL")
      VALUE_LOCAL("LOCAL"),
      @SerializedName("SMART_PIXEL_LANGUAGE_OR_COUNTRY")
      VALUE_SMART_PIXEL_LANGUAGE_OR_COUNTRY("SMART_PIXEL_LANGUAGE_OR_COUNTRY"),
      @SerializedName("VERSION")
      VALUE_VERSION("VERSION"),
      ;

      private String value;

      private EnumOverrideType(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumQuotedFieldsMode {
      @SerializedName("AUTODETECT")
      VALUE_AUTODETECT("AUTODETECT"),
      @SerializedName("OFF")
      VALUE_OFF("OFF"),
      @SerializedName("ON")
      VALUE_ON("ON"),
      ;

      private String value;

      private EnumQuotedFieldsMode(String value) {
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

  public ProductCatalogProductFeedsPost copyFrom(ProductCatalogProductFeedsPost instance) {
    this.mCountry = instance.mCountry;
    this.mCreatedTime = instance.mCreatedTime;
    this.mDefaultCurrency = instance.mDefaultCurrency;
    this.mDeletionEnabled = instance.mDeletionEnabled;
    this.mDelimiter = instance.mDelimiter;
    this.mEncoding = instance.mEncoding;
    this.mErrors = instance.mErrors;
    this.mFileName = instance.mFileName;
    this.mId = instance.mId;
    this.mIngestionSourceType = instance.mIngestionSourceType;
    this.mItemSubType = instance.mItemSubType;
    this.mName = instance.mName;
    this.mOverrideType = instance.mOverrideType;
    this.mPrimaryFeeds = instance.mPrimaryFeeds;
    this.mProductCount = instance.mProductCount;
    this.mQuotedFieldsMode = instance.mQuotedFieldsMode;
    this.mSchedule = instance.mSchedule;
    this.mUpdateSchedule = instance.mUpdateSchedule;
    this.context = instance.context;
    this.rawValue = instance.rawValue;
    return this;
  }

  public static APIRequest.ResponseParser<ProductCatalogProductFeedsPost> getParser() {
    return new APIRequest.ResponseParser<ProductCatalogProductFeedsPost>() {
      public APINodeList<ProductCatalogProductFeedsPost> parseResponse(String response, APIContext context, APIRequest<ProductCatalogProductFeedsPost> request, String header) throws MalformedResponseException {
        return ProductCatalogProductFeedsPost.parseResponse(response, context, request, header);
      }
    };
  }
}
