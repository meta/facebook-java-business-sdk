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
public class ProductFeedProductsGet extends APINode {
  @SerializedName("data")
  private List<Object> mData = null;
  @SerializedName("paging")
  private Object mPaging = null;
  @SerializedName("summary")
  private Object mSummary = null;
  protected static Gson gson = null;

  public ProductFeedProductsGet() {
  }

  public String getId() {
    return null;
  }
  public static ProductFeedProductsGet loadJSON(String json, APIContext context, String header) {
    ProductFeedProductsGet productFeedProductsGet = getGson().fromJson(json, ProductFeedProductsGet.class);
    if (context.isDebug()) {
      JsonParser parser = new JsonParser();
      JsonElement o1 = parser.parse(json);
      JsonElement o2 = parser.parse(productFeedProductsGet.toString());
      if (o1.getAsJsonObject().get("__fb_trace_id__") != null) {
        o2.getAsJsonObject().add("__fb_trace_id__", o1.getAsJsonObject().get("__fb_trace_id__"));
      }
      if (!o1.equals(o2)) {
        context.log("[Warning] When parsing response, object is not consistent with JSON:");
        context.log("[JSON]" + o1);
        context.log("[Object]" + o2);
      }
    }
    productFeedProductsGet.context = context;
    productFeedProductsGet.rawValue = json;
    productFeedProductsGet.header = header;
    return productFeedProductsGet;
  }

  public static APINodeList<ProductFeedProductsGet> parseResponse(String json, APIContext context, APIRequest request, String header) throws MalformedResponseException {
    APINodeList<ProductFeedProductsGet> productFeedProductsGets = new APINodeList<ProductFeedProductsGet>(request, json, header);
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
          productFeedProductsGets.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
        };
        return productFeedProductsGets;
      } else if (result.isJsonObject()) {
        obj = result.getAsJsonObject();
        if (obj.has("data")) {
          if (obj.has("paging")) {
            JsonObject paging = obj.get("paging").getAsJsonObject();
            if (paging.has("cursors")) {
                JsonObject cursors = paging.get("cursors").getAsJsonObject();
                String before = cursors.has("before") ? cursors.get("before").getAsString() : null;
                String after = cursors.has("after") ? cursors.get("after").getAsString() : null;
                productFeedProductsGets.setCursors(before, after);
            }
            String previous = paging.has("previous") ? paging.get("previous").getAsString() : null;
            String next = paging.has("next") ? paging.get("next").getAsString() : null;
            productFeedProductsGets.setPaging(previous, next);
            if (context.hasAppSecret()) {
              productFeedProductsGets.setAppSecret(context.getAppSecretProof());
            }
          }
          if (obj.get("data").isJsonArray()) {
            // Second, check if it's a JSON array with "data"
            arr = obj.get("data").getAsJsonArray();
            for (int i = 0; i < arr.size(); i++) {
              productFeedProductsGets.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
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
                  productFeedProductsGets.add(loadJSON(entry.getValue().toString(), context, header));
                }
                break;
              }
            }
            if (!isRedownload) {
              productFeedProductsGets.add(loadJSON(obj.toString(), context, header));
            }
          }
          return productFeedProductsGets;
        } else if (obj.has("images")) {
          // Fourth, check if it's a map of image objects
          obj = obj.get("images").getAsJsonObject();
          for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
              productFeedProductsGets.add(loadJSON(entry.getValue().toString(), context, header));
          }
          return productFeedProductsGets;
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
              productFeedProductsGets.add(loadJSON(value.toString(), context, header));
            } else {
              isIdIndexedArray = false;
              break;
            }
          }
          if (isIdIndexedArray) {
            return productFeedProductsGets;
          }

          // Sixth, check if it's pure JsonObject
          productFeedProductsGets.clear();
          productFeedProductsGets.add(loadJSON(json, context, header));
          return productFeedProductsGets;
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

  public ProductFeedProductsGet setFieldData(List<Object> value) {
    this.mData = value;
    return this;
  }

  public Object getFieldPaging() {
    return mPaging;
  }

  public ProductFeedProductsGet setFieldPaging(Object value) {
    this.mPaging = value;
    return this;
  }

  public Object getFieldSummary() {
    return mSummary;
  }

  public ProductFeedProductsGet setFieldSummary(Object value) {
    this.mSummary = value;
    return this;
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

  public static enum EnumErrorPriority {
      @SerializedName("HIGH")
      VALUE_HIGH("HIGH"),
      @SerializedName("LOW")
      VALUE_LOW("LOW"),
      @SerializedName("MEDIUM")
      VALUE_MEDIUM("MEDIUM"),
      ;

      private String value;

      private EnumErrorPriority(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumErrorType {
      @SerializedName("ADDRESS_BLOCKLISTED_IN_MARKET")
      VALUE_ADDRESS_BLOCKLISTED_IN_MARKET("ADDRESS_BLOCKLISTED_IN_MARKET"),
      @SerializedName("AGGREGATED_LOCALIZATION_ISSUES")
      VALUE_AGGREGATED_LOCALIZATION_ISSUES("AGGREGATED_LOCALIZATION_ISSUES"),
      @SerializedName("APP_HAS_NO_AEM_SETUP")
      VALUE_APP_HAS_NO_AEM_SETUP("APP_HAS_NO_AEM_SETUP"),
      @SerializedName("AR_DELETED_DUE_TO_UPDATE")
      VALUE_AR_DELETED_DUE_TO_UPDATE("AR_DELETED_DUE_TO_UPDATE"),
      @SerializedName("AR_POLICY_VIOLATED")
      VALUE_AR_POLICY_VIOLATED("AR_POLICY_VIOLATED"),
      @SerializedName("AVAILABLE")
      VALUE_AVAILABLE("AVAILABLE"),
      @SerializedName("BAD_QUALITY_IMAGE")
      VALUE_BAD_QUALITY_IMAGE("BAD_QUALITY_IMAGE"),
      @SerializedName("BIG_CATALOG_WITH_ALL_ITEMS_IN_STOCK")
      VALUE_BIG_CATALOG_WITH_ALL_ITEMS_IN_STOCK("BIG_CATALOG_WITH_ALL_ITEMS_IN_STOCK"),
      @SerializedName("BIZ_MSG_AI_AGENT_DISABLED_BY_USER")
      VALUE_BIZ_MSG_AI_AGENT_DISABLED_BY_USER("BIZ_MSG_AI_AGENT_DISABLED_BY_USER"),
      @SerializedName("BIZ_MSG_GEN_AI_POLICY_VIOLATED")
      VALUE_BIZ_MSG_GEN_AI_POLICY_VIOLATED("BIZ_MSG_GEN_AI_POLICY_VIOLATED"),
      @SerializedName("CANNOT_EDIT_SUBSCRIPTION_PRODUCTS")
      VALUE_CANNOT_EDIT_SUBSCRIPTION_PRODUCTS("CANNOT_EDIT_SUBSCRIPTION_PRODUCTS"),
      @SerializedName("CATALOG_NOT_CONNECTED_TO_EVENT_SOURCE")
      VALUE_CATALOG_NOT_CONNECTED_TO_EVENT_SOURCE("CATALOG_NOT_CONNECTED_TO_EVENT_SOURCE"),
      @SerializedName("CATALOG_NOT_ONBOARDED_FOR_AI_COMMERCE")
      VALUE_CATALOG_NOT_ONBOARDED_FOR_AI_COMMERCE("CATALOG_NOT_ONBOARDED_FOR_AI_COMMERCE"),
      @SerializedName("CHECKOUT_DISABLED_BY_USER")
      VALUE_CHECKOUT_DISABLED_BY_USER("CHECKOUT_DISABLED_BY_USER"),
      @SerializedName("COMMERCE_ACCOUNT_LEGAL_ADDRESS_INVALID")
      VALUE_COMMERCE_ACCOUNT_LEGAL_ADDRESS_INVALID("COMMERCE_ACCOUNT_LEGAL_ADDRESS_INVALID"),
      @SerializedName("COMMERCE_ACCOUNT_NOT_LEGALLY_COMPLIANT")
      VALUE_COMMERCE_ACCOUNT_NOT_LEGALLY_COMPLIANT("COMMERCE_ACCOUNT_NOT_LEGALLY_COMPLIANT"),
      @SerializedName("CRAWLED_AVAILABILITY_MISMATCH")
      VALUE_CRAWLED_AVAILABILITY_MISMATCH("CRAWLED_AVAILABILITY_MISMATCH"),
      @SerializedName("DA_DISABLED_BY_USER")
      VALUE_DA_DISABLED_BY_USER("DA_DISABLED_BY_USER"),
      @SerializedName("DA_POLICY_VIOLATION")
      VALUE_DA_POLICY_VIOLATION("DA_POLICY_VIOLATION"),
      @SerializedName("DELETED_ITEM")
      VALUE_DELETED_ITEM("DELETED_ITEM"),
      @SerializedName("DIGITAL_GOODS_NOT_AVAILABLE_FOR_CHECKOUT")
      VALUE_DIGITAL_GOODS_NOT_AVAILABLE_FOR_CHECKOUT("DIGITAL_GOODS_NOT_AVAILABLE_FOR_CHECKOUT"),
      @SerializedName("DUPLICATE_IMAGES")
      VALUE_DUPLICATE_IMAGES("DUPLICATE_IMAGES"),
      @SerializedName("DUPLICATE_TITLE_AND_DESCRIPTION")
      VALUE_DUPLICATE_TITLE_AND_DESCRIPTION("DUPLICATE_TITLE_AND_DESCRIPTION"),
      @SerializedName("EMPTY_AVAILABILITY")
      VALUE_EMPTY_AVAILABILITY("EMPTY_AVAILABILITY"),
      @SerializedName("EMPTY_BRAND")
      VALUE_EMPTY_BRAND("EMPTY_BRAND"),
      @SerializedName("EMPTY_CONDITION")
      VALUE_EMPTY_CONDITION("EMPTY_CONDITION"),
      @SerializedName("EMPTY_DESCRIPTION")
      VALUE_EMPTY_DESCRIPTION("EMPTY_DESCRIPTION"),
      @SerializedName("EMPTY_IMAGE_URL")
      VALUE_EMPTY_IMAGE_URL("EMPTY_IMAGE_URL"),
      @SerializedName("EMPTY_PRICE")
      VALUE_EMPTY_PRICE("EMPTY_PRICE"),
      @SerializedName("EMPTY_PRODUCT_URL")
      VALUE_EMPTY_PRODUCT_URL("EMPTY_PRODUCT_URL"),
      @SerializedName("EMPTY_SELLER_DESCRIPTION")
      VALUE_EMPTY_SELLER_DESCRIPTION("EMPTY_SELLER_DESCRIPTION"),
      @SerializedName("EMPTY_TITLE")
      VALUE_EMPTY_TITLE("EMPTY_TITLE"),
      @SerializedName("EXTERNAL_MERCHANT_ID_MISMATCH")
      VALUE_EXTERNAL_MERCHANT_ID_MISMATCH("EXTERNAL_MERCHANT_ID_MISMATCH"),
      @SerializedName("GENERIC_INVALID_FIELD")
      VALUE_GENERIC_INVALID_FIELD("GENERIC_INVALID_FIELD"),
      @SerializedName("GROUPS_DISABLED_BY_USER")
      VALUE_GROUPS_DISABLED_BY_USER("GROUPS_DISABLED_BY_USER"),
      @SerializedName("HIDDEN_UNTIL_PRODUCT_LAUNCH")
      VALUE_HIDDEN_UNTIL_PRODUCT_LAUNCH("HIDDEN_UNTIL_PRODUCT_LAUNCH"),
      @SerializedName("ILLEGAL_PRODUCT_CATEGORY")
      VALUE_ILLEGAL_PRODUCT_CATEGORY("ILLEGAL_PRODUCT_CATEGORY"),
      @SerializedName("IMAGE_FETCH_FAILED")
      VALUE_IMAGE_FETCH_FAILED("IMAGE_FETCH_FAILED"),
      @SerializedName("IMAGE_FETCH_FAILED_BAD_GATEWAY")
      VALUE_IMAGE_FETCH_FAILED_BAD_GATEWAY("IMAGE_FETCH_FAILED_BAD_GATEWAY"),
      @SerializedName("IMAGE_FETCH_FAILED_FILE_SIZE_EXCEEDED")
      VALUE_IMAGE_FETCH_FAILED_FILE_SIZE_EXCEEDED("IMAGE_FETCH_FAILED_FILE_SIZE_EXCEEDED"),
      @SerializedName("IMAGE_FETCH_FAILED_FORBIDDEN")
      VALUE_IMAGE_FETCH_FAILED_FORBIDDEN("IMAGE_FETCH_FAILED_FORBIDDEN"),
      @SerializedName("IMAGE_FETCH_FAILED_LINK_BROKEN")
      VALUE_IMAGE_FETCH_FAILED_LINK_BROKEN("IMAGE_FETCH_FAILED_LINK_BROKEN"),
      @SerializedName("IMAGE_FETCH_FAILED_TIMED_OUT")
      VALUE_IMAGE_FETCH_FAILED_TIMED_OUT("IMAGE_FETCH_FAILED_TIMED_OUT"),
      @SerializedName("IMAGE_RESOLUTION_LOW")
      VALUE_IMAGE_RESOLUTION_LOW("IMAGE_RESOLUTION_LOW"),
      @SerializedName("INACTIVE_MAGENTO_PRODUCT")
      VALUE_INACTIVE_MAGENTO_PRODUCT("INACTIVE_MAGENTO_PRODUCT"),
      @SerializedName("INACTIVE_SALESFORCE_COMMERCE_CLOUD_PRODUCT")
      VALUE_INACTIVE_SALESFORCE_COMMERCE_CLOUD_PRODUCT("INACTIVE_SALESFORCE_COMMERCE_CLOUD_PRODUCT"),
      @SerializedName("INACTIVE_SHOPIFY_PRODUCT")
      VALUE_INACTIVE_SHOPIFY_PRODUCT("INACTIVE_SHOPIFY_PRODUCT"),
      @SerializedName("INACTIVE_WOOCOMMERCE_PRODUCT")
      VALUE_INACTIVE_WOOCOMMERCE_PRODUCT("INACTIVE_WOOCOMMERCE_PRODUCT"),
      @SerializedName("INVALID_COMMERCE_TAX_CATEGORY")
      VALUE_INVALID_COMMERCE_TAX_CATEGORY("INVALID_COMMERCE_TAX_CATEGORY"),
      @SerializedName("INVALID_COMSCORE_MARKET_CODES")
      VALUE_INVALID_COMSCORE_MARKET_CODES("INVALID_COMSCORE_MARKET_CODES"),
      @SerializedName("INVALID_CONSOLIDATED_LOCALITY_INFORMATION")
      VALUE_INVALID_CONSOLIDATED_LOCALITY_INFORMATION("INVALID_CONSOLIDATED_LOCALITY_INFORMATION"),
      @SerializedName("INVALID_CONTENT_ID")
      VALUE_INVALID_CONTENT_ID("INVALID_CONTENT_ID"),
      @SerializedName("INVALID_DEALER_COMMUNICATION_PARAMETERS")
      VALUE_INVALID_DEALER_COMMUNICATION_PARAMETERS("INVALID_DEALER_COMMUNICATION_PARAMETERS"),
      @SerializedName("INVALID_DMA_CODES")
      VALUE_INVALID_DMA_CODES("INVALID_DMA_CODES"),
      @SerializedName("INVALID_FB_PAGE_ID")
      VALUE_INVALID_FB_PAGE_ID("INVALID_FB_PAGE_ID"),
      @SerializedName("INVALID_IMAGES")
      VALUE_INVALID_IMAGES("INVALID_IMAGES"),
      @SerializedName("INVALID_MONETIZER_RETURN_POLICY")
      VALUE_INVALID_MONETIZER_RETURN_POLICY("INVALID_MONETIZER_RETURN_POLICY"),
      @SerializedName("INVALID_OFFER_DISCLAIMER_URL")
      VALUE_INVALID_OFFER_DISCLAIMER_URL("INVALID_OFFER_DISCLAIMER_URL"),
      @SerializedName("INVALID_OFFER_END_DATE")
      VALUE_INVALID_OFFER_END_DATE("INVALID_OFFER_END_DATE"),
      @SerializedName("INVALID_PRE_ORDER_PARAMS")
      VALUE_INVALID_PRE_ORDER_PARAMS("INVALID_PRE_ORDER_PARAMS"),
      @SerializedName("INVALID_RANGE_FOR_AREA_SIZE")
      VALUE_INVALID_RANGE_FOR_AREA_SIZE("INVALID_RANGE_FOR_AREA_SIZE"),
      @SerializedName("INVALID_RANGE_FOR_BUILT_UP_AREA_SIZE")
      VALUE_INVALID_RANGE_FOR_BUILT_UP_AREA_SIZE("INVALID_RANGE_FOR_BUILT_UP_AREA_SIZE"),
      @SerializedName("INVALID_RANGE_FOR_NUM_OF_BATHS")
      VALUE_INVALID_RANGE_FOR_NUM_OF_BATHS("INVALID_RANGE_FOR_NUM_OF_BATHS"),
      @SerializedName("INVALID_RANGE_FOR_NUM_OF_BEDS")
      VALUE_INVALID_RANGE_FOR_NUM_OF_BEDS("INVALID_RANGE_FOR_NUM_OF_BEDS"),
      @SerializedName("INVALID_RANGE_FOR_NUM_OF_ROOMS")
      VALUE_INVALID_RANGE_FOR_NUM_OF_ROOMS("INVALID_RANGE_FOR_NUM_OF_ROOMS"),
      @SerializedName("INVALID_RANGE_FOR_PARKING_SPACES")
      VALUE_INVALID_RANGE_FOR_PARKING_SPACES("INVALID_RANGE_FOR_PARKING_SPACES"),
      @SerializedName("INVALID_SALE_PRICE")
      VALUE_INVALID_SALE_PRICE("INVALID_SALE_PRICE"),
      @SerializedName("INVALID_SHELTER_PAGE_ID")
      VALUE_INVALID_SHELTER_PAGE_ID("INVALID_SHELTER_PAGE_ID"),
      @SerializedName("INVALID_SHIPPING_PROFILE_PARAMS")
      VALUE_INVALID_SHIPPING_PROFILE_PARAMS("INVALID_SHIPPING_PROFILE_PARAMS"),
      @SerializedName("INVALID_SUBSCRIPTION_DISABLE_PARAMS")
      VALUE_INVALID_SUBSCRIPTION_DISABLE_PARAMS("INVALID_SUBSCRIPTION_DISABLE_PARAMS"),
      @SerializedName("INVALID_SUBSCRIPTION_ENABLE_PARAMS")
      VALUE_INVALID_SUBSCRIPTION_ENABLE_PARAMS("INVALID_SUBSCRIPTION_ENABLE_PARAMS"),
      @SerializedName("INVALID_SUBSCRIPTION_PARAMS")
      VALUE_INVALID_SUBSCRIPTION_PARAMS("INVALID_SUBSCRIPTION_PARAMS"),
      @SerializedName("INVALID_TAX_EXTENSION_STATE")
      VALUE_INVALID_TAX_EXTENSION_STATE("INVALID_TAX_EXTENSION_STATE"),
      @SerializedName("INVALID_VEHICLE_STATE")
      VALUE_INVALID_VEHICLE_STATE("INVALID_VEHICLE_STATE"),
      @SerializedName("INVALID_VIRTUAL_TOUR_URL_DOMAIN")
      VALUE_INVALID_VIRTUAL_TOUR_URL_DOMAIN("INVALID_VIRTUAL_TOUR_URL_DOMAIN"),
      @SerializedName("INVENTORY_ZERO_AVAILABILITY_IN_STOCK")
      VALUE_INVENTORY_ZERO_AVAILABILITY_IN_STOCK("INVENTORY_ZERO_AVAILABILITY_IN_STOCK"),
      @SerializedName("IN_ANOTHER_PRODUCT_LAUNCH")
      VALUE_IN_ANOTHER_PRODUCT_LAUNCH("IN_ANOTHER_PRODUCT_LAUNCH"),
      @SerializedName("ITEM_GROUP_NOT_SPECIFIED")
      VALUE_ITEM_GROUP_NOT_SPECIFIED("ITEM_GROUP_NOT_SPECIFIED"),
      @SerializedName("ITEM_INVALID_FEATURE")
      VALUE_ITEM_INVALID_FEATURE("ITEM_INVALID_FEATURE"),
      @SerializedName("ITEM_NOT_APPROVED")
      VALUE_ITEM_NOT_APPROVED("ITEM_NOT_APPROVED"),
      @SerializedName("ITEM_NOT_NATIVE_COMMERCE")
      VALUE_ITEM_NOT_NATIVE_COMMERCE("ITEM_NOT_NATIVE_COMMERCE"),
      @SerializedName("ITEM_NOT_SHIPPABLE_FOR_SCA_SHOP")
      VALUE_ITEM_NOT_SHIPPABLE_FOR_SCA_SHOP("ITEM_NOT_SHIPPABLE_FOR_SCA_SHOP"),
      @SerializedName("ITEM_OVERRIDE_EMPTY_AVAILABILITY")
      VALUE_ITEM_OVERRIDE_EMPTY_AVAILABILITY("ITEM_OVERRIDE_EMPTY_AVAILABILITY"),
      @SerializedName("ITEM_OVERRIDE_EMPTY_PRICE")
      VALUE_ITEM_OVERRIDE_EMPTY_PRICE("ITEM_OVERRIDE_EMPTY_PRICE"),
      @SerializedName("ITEM_OVERRIDE_NOT_VISIBLE")
      VALUE_ITEM_OVERRIDE_NOT_VISIBLE("ITEM_OVERRIDE_NOT_VISIBLE"),
      @SerializedName("ITEM_PRICE_NOT_POSITIVE")
      VALUE_ITEM_PRICE_NOT_POSITIVE("ITEM_PRICE_NOT_POSITIVE"),
      @SerializedName("ITEM_STALE_OUT_OF_STOCK")
      VALUE_ITEM_STALE_OUT_OF_STOCK("ITEM_STALE_OUT_OF_STOCK"),
      @SerializedName("ITEM_SUPPRESSED_CHECKOUT_ERROR")
      VALUE_ITEM_SUPPRESSED_CHECKOUT_ERROR("ITEM_SUPPRESSED_CHECKOUT_ERROR"),
      @SerializedName("ITEM_WITHOUT_VIDEO")
      VALUE_ITEM_WITHOUT_VIDEO("ITEM_WITHOUT_VIDEO"),
      @SerializedName("MARKETPLACE_DISABLED_BY_USER")
      VALUE_MARKETPLACE_DISABLED_BY_USER("MARKETPLACE_DISABLED_BY_USER"),
      @SerializedName("MARKETPLACE_NOT_SHIPPED_ITEM")
      VALUE_MARKETPLACE_NOT_SHIPPED_ITEM("MARKETPLACE_NOT_SHIPPED_ITEM"),
      @SerializedName("MARKETPLACE_PARTNER_AUCTION_NO_BID_CLOSE_TIME")
      VALUE_MARKETPLACE_PARTNER_AUCTION_NO_BID_CLOSE_TIME("MARKETPLACE_PARTNER_AUCTION_NO_BID_CLOSE_TIME"),
      @SerializedName("MARKETPLACE_PARTNER_CURRENCY_NOT_VALID")
      VALUE_MARKETPLACE_PARTNER_CURRENCY_NOT_VALID("MARKETPLACE_PARTNER_CURRENCY_NOT_VALID"),
      @SerializedName("MARKETPLACE_PARTNER_DISTRIBUTION_DISABLED")
      VALUE_MARKETPLACE_PARTNER_DISTRIBUTION_DISABLED("MARKETPLACE_PARTNER_DISTRIBUTION_DISABLED"),
      @SerializedName("MARKETPLACE_PARTNER_LISTING_COUNTRY_NOT_MATCH_CATALOG")
      VALUE_MARKETPLACE_PARTNER_LISTING_COUNTRY_NOT_MATCH_CATALOG("MARKETPLACE_PARTNER_LISTING_COUNTRY_NOT_MATCH_CATALOG"),
      @SerializedName("MARKETPLACE_PARTNER_LISTING_LIMIT_EXCEEDED")
      VALUE_MARKETPLACE_PARTNER_LISTING_LIMIT_EXCEEDED("MARKETPLACE_PARTNER_LISTING_LIMIT_EXCEEDED"),
      @SerializedName("MARKETPLACE_PARTNER_MISSING_LATLONG")
      VALUE_MARKETPLACE_PARTNER_MISSING_LATLONG("MARKETPLACE_PARTNER_MISSING_LATLONG"),
      @SerializedName("MARKETPLACE_PARTNER_MISSING_SHIPPING_COST")
      VALUE_MARKETPLACE_PARTNER_MISSING_SHIPPING_COST("MARKETPLACE_PARTNER_MISSING_SHIPPING_COST"),
      @SerializedName("MARKETPLACE_PARTNER_NOT_LOCAL_ITEM")
      VALUE_MARKETPLACE_PARTNER_NOT_LOCAL_ITEM("MARKETPLACE_PARTNER_NOT_LOCAL_ITEM"),
      @SerializedName("MARKETPLACE_PARTNER_NOT_SHIPPED_ITEM")
      VALUE_MARKETPLACE_PARTNER_NOT_SHIPPED_ITEM("MARKETPLACE_PARTNER_NOT_SHIPPED_ITEM"),
      @SerializedName("MARKETPLACE_PARTNER_POLICY_VIOLATION")
      VALUE_MARKETPLACE_PARTNER_POLICY_VIOLATION("MARKETPLACE_PARTNER_POLICY_VIOLATION"),
      @SerializedName("MARKETPLACE_PARTNER_RULE_LISTING_LIMIT_EXCEEDED")
      VALUE_MARKETPLACE_PARTNER_RULE_LISTING_LIMIT_EXCEEDED("MARKETPLACE_PARTNER_RULE_LISTING_LIMIT_EXCEEDED"),
      @SerializedName("MARKETPLACE_PARTNER_SELLER_BANNED")
      VALUE_MARKETPLACE_PARTNER_SELLER_BANNED("MARKETPLACE_PARTNER_SELLER_BANNED"),
      @SerializedName("MARKETPLACE_PARTNER_SELLER_NOT_VALID")
      VALUE_MARKETPLACE_PARTNER_SELLER_NOT_VALID("MARKETPLACE_PARTNER_SELLER_NOT_VALID"),
      @SerializedName("MARKETPLACE_SHIPPED_ITEM_EXPIRED")
      VALUE_MARKETPLACE_SHIPPED_ITEM_EXPIRED("MARKETPLACE_SHIPPED_ITEM_EXPIRED"),
      @SerializedName("MARKETPLACE_SHIPPED_ITEM_NOT_AVAILABLE")
      VALUE_MARKETPLACE_SHIPPED_ITEM_NOT_AVAILABLE("MARKETPLACE_SHIPPED_ITEM_NOT_AVAILABLE"),
      @SerializedName("MARKETPLACE_SHIPPED_SELLER_FEATURE_BANNED")
      VALUE_MARKETPLACE_SHIPPED_SELLER_FEATURE_BANNED("MARKETPLACE_SHIPPED_SELLER_FEATURE_BANNED"),
      @SerializedName("MARKETPLACE_SHIPPED_SELLER_NOT_FULLY_ONBOARDED")
      VALUE_MARKETPLACE_SHIPPED_SELLER_NOT_FULLY_ONBOARDED("MARKETPLACE_SHIPPED_SELLER_NOT_FULLY_ONBOARDED"),
      @SerializedName("MINI_SHOPS_DISABLED_BY_USER")
      VALUE_MINI_SHOPS_DISABLED_BY_USER("MINI_SHOPS_DISABLED_BY_USER"),
      @SerializedName("MISSING_CHECKOUT")
      VALUE_MISSING_CHECKOUT("MISSING_CHECKOUT"),
      @SerializedName("MISSING_CHECKOUT_CURRENCY")
      VALUE_MISSING_CHECKOUT_CURRENCY("MISSING_CHECKOUT_CURRENCY"),
      @SerializedName("MISSING_COLOR")
      VALUE_MISSING_COLOR("MISSING_COLOR"),
      @SerializedName("MISSING_COUNTRY_OVERRIDE_IN_SHIPPING_PROFILE")
      VALUE_MISSING_COUNTRY_OVERRIDE_IN_SHIPPING_PROFILE("MISSING_COUNTRY_OVERRIDE_IN_SHIPPING_PROFILE"),
      @SerializedName("MISSING_EVENT")
      VALUE_MISSING_EVENT("MISSING_EVENT"),
      @SerializedName("MISSING_INDIA_COMPLIANCE_FIELDS")
      VALUE_MISSING_INDIA_COMPLIANCE_FIELDS("MISSING_INDIA_COMPLIANCE_FIELDS"),
      @SerializedName("MISSING_SHIPPING_PROFILE")
      VALUE_MISSING_SHIPPING_PROFILE("MISSING_SHIPPING_PROFILE"),
      @SerializedName("MISSING_SIZE")
      VALUE_MISSING_SIZE("MISSING_SIZE"),
      @SerializedName("MISSING_TAX_CATEGORY")
      VALUE_MISSING_TAX_CATEGORY("MISSING_TAX_CATEGORY"),
      @SerializedName("NEGATIVE_COMMUNITY_FEEDBACK")
      VALUE_NEGATIVE_COMMUNITY_FEEDBACK("NEGATIVE_COMMUNITY_FEEDBACK"),
      @SerializedName("NEGATIVE_PRICE")
      VALUE_NEGATIVE_PRICE("NEGATIVE_PRICE"),
      @SerializedName("NOT_ENOUGH_IMAGES")
      VALUE_NOT_ENOUGH_IMAGES("NOT_ENOUGH_IMAGES"),
      @SerializedName("NOT_ENOUGH_UNIQUE_PRODUCTS")
      VALUE_NOT_ENOUGH_UNIQUE_PRODUCTS("NOT_ENOUGH_UNIQUE_PRODUCTS"),
      @SerializedName("NO_CONTENT_ID")
      VALUE_NO_CONTENT_ID("NO_CONTENT_ID"),
      @SerializedName("OVERLAY_DISCLAIMER_EXCEEDED_MAX_LENGTH")
      VALUE_OVERLAY_DISCLAIMER_EXCEEDED_MAX_LENGTH("OVERLAY_DISCLAIMER_EXCEEDED_MAX_LENGTH"),
      @SerializedName("PART_OF_PRODUCT_LAUNCH")
      VALUE_PART_OF_PRODUCT_LAUNCH("PART_OF_PRODUCT_LAUNCH"),
      @SerializedName("PASSING_MULTIPLE_CONTENT_IDS")
      VALUE_PASSING_MULTIPLE_CONTENT_IDS("PASSING_MULTIPLE_CONTENT_IDS"),
      @SerializedName("PRODUCT_DOMINANT_CURRENCY_MISMATCH")
      VALUE_PRODUCT_DOMINANT_CURRENCY_MISMATCH("PRODUCT_DOMINANT_CURRENCY_MISMATCH"),
      @SerializedName("PRODUCT_EXPIRED")
      VALUE_PRODUCT_EXPIRED("PRODUCT_EXPIRED"),
      @SerializedName("PRODUCT_ITEM_HIDDEN_FROM_ALL_SHOPS")
      VALUE_PRODUCT_ITEM_HIDDEN_FROM_ALL_SHOPS("PRODUCT_ITEM_HIDDEN_FROM_ALL_SHOPS"),
      @SerializedName("PRODUCT_ITEM_INVALID_PARTNER_TOKENS")
      VALUE_PRODUCT_ITEM_INVALID_PARTNER_TOKENS("PRODUCT_ITEM_INVALID_PARTNER_TOKENS"),
      @SerializedName("PRODUCT_ITEM_MISSING_LOCATION_INFORMATION")
      VALUE_PRODUCT_ITEM_MISSING_LOCATION_INFORMATION("PRODUCT_ITEM_MISSING_LOCATION_INFORMATION"),
      @SerializedName("PRODUCT_ITEM_NOT_INCLUDED_IN_ANY_SHOP")
      VALUE_PRODUCT_ITEM_NOT_INCLUDED_IN_ANY_SHOP("PRODUCT_ITEM_NOT_INCLUDED_IN_ANY_SHOP"),
      @SerializedName("PRODUCT_ITEM_NOT_VISIBLE")
      VALUE_PRODUCT_ITEM_NOT_VISIBLE("PRODUCT_ITEM_NOT_VISIBLE"),
      @SerializedName("PRODUCT_NOT_APPROVED")
      VALUE_PRODUCT_NOT_APPROVED("PRODUCT_NOT_APPROVED"),
      @SerializedName("PRODUCT_NOT_DOMINANT_CURRENCY")
      VALUE_PRODUCT_NOT_DOMINANT_CURRENCY("PRODUCT_NOT_DOMINANT_CURRENCY"),
      @SerializedName("PRODUCT_OUT_OF_STOCK")
      VALUE_PRODUCT_OUT_OF_STOCK("PRODUCT_OUT_OF_STOCK"),
      @SerializedName("PRODUCT_URL_EQUALS_DOMAIN")
      VALUE_PRODUCT_URL_EQUALS_DOMAIN("PRODUCT_URL_EQUALS_DOMAIN"),
      @SerializedName("PROPERTY_PRICE_CURRENCY_NOT_SUPPORTED")
      VALUE_PROPERTY_PRICE_CURRENCY_NOT_SUPPORTED("PROPERTY_PRICE_CURRENCY_NOT_SUPPORTED"),
      @SerializedName("PROPERTY_PRICE_TOO_HIGH")
      VALUE_PROPERTY_PRICE_TOO_HIGH("PROPERTY_PRICE_TOO_HIGH"),
      @SerializedName("PROPERTY_PRICE_TOO_LOW")
      VALUE_PROPERTY_PRICE_TOO_LOW("PROPERTY_PRICE_TOO_LOW"),
      @SerializedName("PROPERTY_UNIT_PRICE_CURRENCY_MISMATCH_ITEM_PRICE_CURRENCY")
      VALUE_PROPERTY_UNIT_PRICE_CURRENCY_MISMATCH_ITEM_PRICE_CURRENCY("PROPERTY_UNIT_PRICE_CURRENCY_MISMATCH_ITEM_PRICE_CURRENCY"),
      @SerializedName("PROPERTY_VALUE_CONTAINS_HTML_TAGS")
      VALUE_PROPERTY_VALUE_CONTAINS_HTML_TAGS("PROPERTY_VALUE_CONTAINS_HTML_TAGS"),
      @SerializedName("PROPERTY_VALUE_DESCRIPTION_CONTAINS_OFF_PLATFORM_LINK")
      VALUE_PROPERTY_VALUE_DESCRIPTION_CONTAINS_OFF_PLATFORM_LINK("PROPERTY_VALUE_DESCRIPTION_CONTAINS_OFF_PLATFORM_LINK"),
      @SerializedName("PROPERTY_VALUE_FORMAT")
      VALUE_PROPERTY_VALUE_FORMAT("PROPERTY_VALUE_FORMAT"),
      @SerializedName("PROPERTY_VALUE_MISSING")
      VALUE_PROPERTY_VALUE_MISSING("PROPERTY_VALUE_MISSING"),
      @SerializedName("PROPERTY_VALUE_MISSING_WARNING")
      VALUE_PROPERTY_VALUE_MISSING_WARNING("PROPERTY_VALUE_MISSING_WARNING"),
      @SerializedName("PROPERTY_VALUE_NON_POSITIVE")
      VALUE_PROPERTY_VALUE_NON_POSITIVE("PROPERTY_VALUE_NON_POSITIVE"),
      @SerializedName("PROPERTY_VALUE_STRING_EXCEEDS_LENGTH")
      VALUE_PROPERTY_VALUE_STRING_EXCEEDS_LENGTH("PROPERTY_VALUE_STRING_EXCEEDS_LENGTH"),
      @SerializedName("PROPERTY_VALUE_STRING_TOO_SHORT")
      VALUE_PROPERTY_VALUE_STRING_TOO_SHORT("PROPERTY_VALUE_STRING_TOO_SHORT"),
      @SerializedName("PROPERTY_VALUE_UPPERCASE")
      VALUE_PROPERTY_VALUE_UPPERCASE("PROPERTY_VALUE_UPPERCASE"),
      @SerializedName("PROPERTY_VALUE_UPPERCASE_WARNING")
      VALUE_PROPERTY_VALUE_UPPERCASE_WARNING("PROPERTY_VALUE_UPPERCASE_WARNING"),
      @SerializedName("PURCHASE_RATE_BELOW_ADDTOCART")
      VALUE_PURCHASE_RATE_BELOW_ADDTOCART("PURCHASE_RATE_BELOW_ADDTOCART"),
      @SerializedName("PURCHASE_RATE_BELOW_VIEWCONTENT")
      VALUE_PURCHASE_RATE_BELOW_VIEWCONTENT("PURCHASE_RATE_BELOW_VIEWCONTENT"),
      @SerializedName("QUALITY_DUPLICATED_DESCRIPTION")
      VALUE_QUALITY_DUPLICATED_DESCRIPTION("QUALITY_DUPLICATED_DESCRIPTION"),
      @SerializedName("QUALITY_ITEM_LINK_BROKEN")
      VALUE_QUALITY_ITEM_LINK_BROKEN("QUALITY_ITEM_LINK_BROKEN"),
      @SerializedName("QUALITY_ITEM_LINK_REDIRECTING")
      VALUE_QUALITY_ITEM_LINK_REDIRECTING("QUALITY_ITEM_LINK_REDIRECTING"),
      @SerializedName("RETAILER_ID_NOT_PROVIDED")
      VALUE_RETAILER_ID_NOT_PROVIDED("RETAILER_ID_NOT_PROVIDED"),
      @SerializedName("RETAILER_ID_USED_BY_GROUP")
      VALUE_RETAILER_ID_USED_BY_GROUP("RETAILER_ID_USED_BY_GROUP"),
      @SerializedName("SHOPIFY_INVALID_RETAILER_ID")
      VALUE_SHOPIFY_INVALID_RETAILER_ID("SHOPIFY_INVALID_RETAILER_ID"),
      @SerializedName("SHOPIFY_ITEM_MISSING_DELIVERY_PROFILE_ZERO_INVENTORY")
      VALUE_SHOPIFY_ITEM_MISSING_DELIVERY_PROFILE_ZERO_INVENTORY("SHOPIFY_ITEM_MISSING_DELIVERY_PROFILE_ZERO_INVENTORY"),
      @SerializedName("SHOPIFY_ITEM_MISSING_SHIPPING_PROFILE")
      VALUE_SHOPIFY_ITEM_MISSING_SHIPPING_PROFILE("SHOPIFY_ITEM_MISSING_SHIPPING_PROFILE"),
      @SerializedName("SHOPS_POLICY_VIOLATION")
      VALUE_SHOPS_POLICY_VIOLATION("SHOPS_POLICY_VIOLATION"),
      @SerializedName("SUBSCRIPTION_INFO_NOT_ENABLED_FOR_FEED")
      VALUE_SUBSCRIPTION_INFO_NOT_ENABLED_FOR_FEED("SUBSCRIPTION_INFO_NOT_ENABLED_FOR_FEED"),
      @SerializedName("TAX_CATEGORY_NOT_SUPPORTED_IN_UK")
      VALUE_TAX_CATEGORY_NOT_SUPPORTED_IN_UK("TAX_CATEGORY_NOT_SUPPORTED_IN_UK"),
      @SerializedName("TOP_PRODUCT_WITHOUT_VIDEOS")
      VALUE_TOP_PRODUCT_WITHOUT_VIDEOS("TOP_PRODUCT_WITHOUT_VIDEOS"),
      @SerializedName("UNIQUE_PRODUCT_IDENTIFIER_MISSING")
      VALUE_UNIQUE_PRODUCT_IDENTIFIER_MISSING("UNIQUE_PRODUCT_IDENTIFIER_MISSING"),
      @SerializedName("UNMATCHED_EVENTS")
      VALUE_UNMATCHED_EVENTS("UNMATCHED_EVENTS"),
      @SerializedName("UNSUPPORTED_PRODUCT_CATEGORY")
      VALUE_UNSUPPORTED_PRODUCT_CATEGORY("UNSUPPORTED_PRODUCT_CATEGORY"),
      @SerializedName("VARIANT_ATTRIBUTE_ISSUE")
      VALUE_VARIANT_ATTRIBUTE_ISSUE("VARIANT_ATTRIBUTE_ISSUE"),
      @SerializedName("VERSION_OVERRIDE_NOT_EXISTS")
      VALUE_VERSION_OVERRIDE_NOT_EXISTS("VERSION_OVERRIDE_NOT_EXISTS"),
      @SerializedName("VIDEO_FETCH_FAILED")
      VALUE_VIDEO_FETCH_FAILED("VIDEO_FETCH_FAILED"),
      @SerializedName("VIDEO_FETCH_FAILED_BAD_GATEWAY")
      VALUE_VIDEO_FETCH_FAILED_BAD_GATEWAY("VIDEO_FETCH_FAILED_BAD_GATEWAY"),
      @SerializedName("VIDEO_FETCH_FAILED_FILE_SIZE_EXCEEDED")
      VALUE_VIDEO_FETCH_FAILED_FILE_SIZE_EXCEEDED("VIDEO_FETCH_FAILED_FILE_SIZE_EXCEEDED"),
      @SerializedName("VIDEO_FETCH_FAILED_FORBIDDEN")
      VALUE_VIDEO_FETCH_FAILED_FORBIDDEN("VIDEO_FETCH_FAILED_FORBIDDEN"),
      @SerializedName("VIDEO_FETCH_FAILED_LINK_BROKEN")
      VALUE_VIDEO_FETCH_FAILED_LINK_BROKEN("VIDEO_FETCH_FAILED_LINK_BROKEN"),
      @SerializedName("VIDEO_FETCH_FAILED_RATE_LIMITED")
      VALUE_VIDEO_FETCH_FAILED_RATE_LIMITED("VIDEO_FETCH_FAILED_RATE_LIMITED"),
      @SerializedName("VIDEO_FETCH_FAILED_SERVER_ERROR")
      VALUE_VIDEO_FETCH_FAILED_SERVER_ERROR("VIDEO_FETCH_FAILED_SERVER_ERROR"),
      @SerializedName("VIDEO_FETCH_FAILED_TIMED_OUT")
      VALUE_VIDEO_FETCH_FAILED_TIMED_OUT("VIDEO_FETCH_FAILED_TIMED_OUT"),
      @SerializedName("VIDEO_ISSUE_GENERIC")
      VALUE_VIDEO_ISSUE_GENERIC("VIDEO_ISSUE_GENERIC"),
      @SerializedName("VIDEO_NOT_DOWNLOADABLE")
      VALUE_VIDEO_NOT_DOWNLOADABLE("VIDEO_NOT_DOWNLOADABLE"),
      @SerializedName("WHATSAPP_DISABLED_BY_USER")
      VALUE_WHATSAPP_DISABLED_BY_USER("WHATSAPP_DISABLED_BY_USER"),
      @SerializedName("WHATSAPP_MARKETING_MESSAGE_DISABLED_BY_USER")
      VALUE_WHATSAPP_MARKETING_MESSAGE_DISABLED_BY_USER("WHATSAPP_MARKETING_MESSAGE_DISABLED_BY_USER"),
      @SerializedName("WHATSAPP_MARKETING_MESSAGE_POLICY_VIOLATION")
      VALUE_WHATSAPP_MARKETING_MESSAGE_POLICY_VIOLATION("WHATSAPP_MARKETING_MESSAGE_POLICY_VIOLATION"),
      @SerializedName("WHATSAPP_POLICY_VIOLATION")
      VALUE_WHATSAPP_POLICY_VIOLATION("WHATSAPP_POLICY_VIOLATION"),
      ;

      private String value;

      private EnumErrorType(String value) {
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

  public ProductFeedProductsGet copyFrom(ProductFeedProductsGet instance) {
    this.mData = instance.mData;
    this.mPaging = instance.mPaging;
    this.mSummary = instance.mSummary;
    this.context = instance.context;
    this.rawValue = instance.rawValue;
    return this;
  }

  public static APIRequest.ResponseParser<ProductFeedProductsGet> getParser() {
    return new APIRequest.ResponseParser<ProductFeedProductsGet>() {
      public APINodeList<ProductFeedProductsGet> parseResponse(String response, APIContext context, APIRequest<ProductFeedProductsGet> request, String header) throws MalformedResponseException {
        return ProductFeedProductsGet.parseResponse(response, context, request, header);
      }
    };
  }
}
