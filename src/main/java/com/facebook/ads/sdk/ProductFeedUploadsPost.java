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
public class ProductFeedUploadsPost extends APINode {
  @SerializedName("end_time")
  private Object mEndTime = null;
  @SerializedName("error_count")
  private Long mErrorCount = null;
  @SerializedName("error_report")
  private Object mErrorReport = null;
  @SerializedName("errors")
  private Object mErrors = null;
  @SerializedName("filename")
  private String mFilename = null;
  @SerializedName("id")
  private Long mId = null;
  @SerializedName("input_method")
  private EnumInputMethod mInputMethod = null;
  @SerializedName("num_deleted_items")
  private Long mNumDeletedItems = null;
  @SerializedName("num_detected_items")
  private Long mNumDetectedItems = null;
  @SerializedName("num_invalid_items")
  private Long mNumInvalidItems = null;
  @SerializedName("num_persisted_items")
  private Long mNumPersistedItems = null;
  @SerializedName("progresses")
  private Object mProgresses = null;
  @SerializedName("start_time")
  private Object mStartTime = null;
  @SerializedName("upload_complete")
  private Boolean mUploadComplete = null;
  @SerializedName("url")
  private String mUrl = null;
  @SerializedName("warning_count")
  private Long mWarningCount = null;
  protected static Gson gson = null;

  public ProductFeedUploadsPost() {
  }

  public String getId() {
    return getFieldId().toString();
  }
  public static ProductFeedUploadsPost loadJSON(String json, APIContext context, String header) {
    ProductFeedUploadsPost productFeedUploadsPost = getGson().fromJson(json, ProductFeedUploadsPost.class);
    if (context.isDebug()) {
      JsonParser parser = new JsonParser();
      JsonElement o1 = parser.parse(json);
      JsonElement o2 = parser.parse(productFeedUploadsPost.toString());
      if (o1.getAsJsonObject().get("__fb_trace_id__") != null) {
        o2.getAsJsonObject().add("__fb_trace_id__", o1.getAsJsonObject().get("__fb_trace_id__"));
      }
      if (!o1.equals(o2)) {
        context.log("[Warning] When parsing response, object is not consistent with JSON:");
        context.log("[JSON]" + o1);
        context.log("[Object]" + o2);
      }
    }
    productFeedUploadsPost.context = context;
    productFeedUploadsPost.rawValue = json;
    productFeedUploadsPost.header = header;
    return productFeedUploadsPost;
  }

  public static APINodeList<ProductFeedUploadsPost> parseResponse(String json, APIContext context, APIRequest request, String header) throws MalformedResponseException {
    APINodeList<ProductFeedUploadsPost> productFeedUploadsPosts = new APINodeList<ProductFeedUploadsPost>(request, json, header);
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
          productFeedUploadsPosts.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
        };
        return productFeedUploadsPosts;
      } else if (result.isJsonObject()) {
        obj = result.getAsJsonObject();
        if (obj.has("data")) {
          if (obj.has("paging")) {
            JsonObject paging = obj.get("paging").getAsJsonObject();
            if (paging.has("cursors")) {
                JsonObject cursors = paging.get("cursors").getAsJsonObject();
                String before = cursors.has("before") ? cursors.get("before").getAsString() : null;
                String after = cursors.has("after") ? cursors.get("after").getAsString() : null;
                productFeedUploadsPosts.setCursors(before, after);
            }
            String previous = paging.has("previous") ? paging.get("previous").getAsString() : null;
            String next = paging.has("next") ? paging.get("next").getAsString() : null;
            productFeedUploadsPosts.setPaging(previous, next);
            if (context.hasAppSecret()) {
              productFeedUploadsPosts.setAppSecret(context.getAppSecretProof());
            }
          }
          if (obj.get("data").isJsonArray()) {
            // Second, check if it's a JSON array with "data"
            arr = obj.get("data").getAsJsonArray();
            for (int i = 0; i < arr.size(); i++) {
              productFeedUploadsPosts.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
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
                  productFeedUploadsPosts.add(loadJSON(entry.getValue().toString(), context, header));
                }
                break;
              }
            }
            if (!isRedownload) {
              productFeedUploadsPosts.add(loadJSON(obj.toString(), context, header));
            }
          }
          return productFeedUploadsPosts;
        } else if (obj.has("images")) {
          // Fourth, check if it's a map of image objects
          obj = obj.get("images").getAsJsonObject();
          for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
              productFeedUploadsPosts.add(loadJSON(entry.getValue().toString(), context, header));
          }
          return productFeedUploadsPosts;
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
              productFeedUploadsPosts.add(loadJSON(value.toString(), context, header));
            } else {
              isIdIndexedArray = false;
              break;
            }
          }
          if (isIdIndexedArray) {
            return productFeedUploadsPosts;
          }

          // Sixth, check if it's pure JsonObject
          productFeedUploadsPosts.clear();
          productFeedUploadsPosts.add(loadJSON(json, context, header));
          return productFeedUploadsPosts;
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


  public Object getFieldEndTime() {
    return mEndTime;
  }

  public ProductFeedUploadsPost setFieldEndTime(Object value) {
    this.mEndTime = value;
    return this;
  }

  public Long getFieldErrorCount() {
    return mErrorCount;
  }

  public ProductFeedUploadsPost setFieldErrorCount(Long value) {
    this.mErrorCount = value;
    return this;
  }

  public Object getFieldErrorReport() {
    return mErrorReport;
  }

  public ProductFeedUploadsPost setFieldErrorReport(Object value) {
    this.mErrorReport = value;
    return this;
  }

  public Object getFieldErrors() {
    return mErrors;
  }

  public ProductFeedUploadsPost setFieldErrors(Object value) {
    this.mErrors = value;
    return this;
  }

  public String getFieldFilename() {
    return mFilename;
  }

  public ProductFeedUploadsPost setFieldFilename(String value) {
    this.mFilename = value;
    return this;
  }

  public Long getFieldId() {
    return mId;
  }

  public ProductFeedUploadsPost setFieldId(Long value) {
    this.mId = value;
    return this;
  }

  public EnumInputMethod getFieldInputMethod() {
    return mInputMethod;
  }

  public ProductFeedUploadsPost setFieldInputMethod(EnumInputMethod value) {
    this.mInputMethod = value;
    return this;
  }

  public Long getFieldNumDeletedItems() {
    return mNumDeletedItems;
  }

  public ProductFeedUploadsPost setFieldNumDeletedItems(Long value) {
    this.mNumDeletedItems = value;
    return this;
  }

  public Long getFieldNumDetectedItems() {
    return mNumDetectedItems;
  }

  public ProductFeedUploadsPost setFieldNumDetectedItems(Long value) {
    this.mNumDetectedItems = value;
    return this;
  }

  public Long getFieldNumInvalidItems() {
    return mNumInvalidItems;
  }

  public ProductFeedUploadsPost setFieldNumInvalidItems(Long value) {
    this.mNumInvalidItems = value;
    return this;
  }

  public Long getFieldNumPersistedItems() {
    return mNumPersistedItems;
  }

  public ProductFeedUploadsPost setFieldNumPersistedItems(Long value) {
    this.mNumPersistedItems = value;
    return this;
  }

  public Object getFieldProgresses() {
    return mProgresses;
  }

  public ProductFeedUploadsPost setFieldProgresses(Object value) {
    this.mProgresses = value;
    return this;
  }

  public Object getFieldStartTime() {
    return mStartTime;
  }

  public ProductFeedUploadsPost setFieldStartTime(Object value) {
    this.mStartTime = value;
    return this;
  }

  public Boolean getFieldUploadComplete() {
    return mUploadComplete;
  }

  public ProductFeedUploadsPost setFieldUploadComplete(Boolean value) {
    this.mUploadComplete = value;
    return this;
  }

  public String getFieldUrl() {
    return mUrl;
  }

  public ProductFeedUploadsPost setFieldUrl(String value) {
    this.mUrl = value;
    return this;
  }

  public Long getFieldWarningCount() {
    return mWarningCount;
  }

  public ProductFeedUploadsPost setFieldWarningCount(Long value) {
    this.mWarningCount = value;
    return this;
  }



  public static enum EnumInputMethod {
      @SerializedName("GOOGLE_SHEETS_FETCH")
      VALUE_GOOGLE_SHEETS_FETCH("GOOGLE_SHEETS_FETCH"),
      @SerializedName("MANUAL_UPLOAD")
      VALUE_MANUAL_UPLOAD("MANUAL_UPLOAD"),
      @SerializedName("REUPLOAD_EXISTING")
      VALUE_REUPLOAD_EXISTING("REUPLOAD_EXISTING"),
      @SerializedName("REUPLOAD_LAST_FILE")
      VALUE_REUPLOAD_LAST_FILE("REUPLOAD_LAST_FILE"),
      @SerializedName("SERVER_FETCH")
      VALUE_SERVER_FETCH("SERVER_FETCH"),
      @SerializedName("USER_INITIATED_SERVER_FETCH")
      VALUE_USER_INITIATED_SERVER_FETCH("USER_INITIATED_SERVER_FETCH"),
      ;

      private String value;

      private EnumInputMethod(String value) {
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

  public ProductFeedUploadsPost copyFrom(ProductFeedUploadsPost instance) {
    this.mEndTime = instance.mEndTime;
    this.mErrorCount = instance.mErrorCount;
    this.mErrorReport = instance.mErrorReport;
    this.mErrors = instance.mErrors;
    this.mFilename = instance.mFilename;
    this.mId = instance.mId;
    this.mInputMethod = instance.mInputMethod;
    this.mNumDeletedItems = instance.mNumDeletedItems;
    this.mNumDetectedItems = instance.mNumDetectedItems;
    this.mNumInvalidItems = instance.mNumInvalidItems;
    this.mNumPersistedItems = instance.mNumPersistedItems;
    this.mProgresses = instance.mProgresses;
    this.mStartTime = instance.mStartTime;
    this.mUploadComplete = instance.mUploadComplete;
    this.mUrl = instance.mUrl;
    this.mWarningCount = instance.mWarningCount;
    this.context = instance.context;
    this.rawValue = instance.rawValue;
    return this;
  }

  public static APIRequest.ResponseParser<ProductFeedUploadsPost> getParser() {
    return new APIRequest.ResponseParser<ProductFeedUploadsPost>() {
      public APINodeList<ProductFeedUploadsPost> parseResponse(String response, APIContext context, APIRequest<ProductFeedUploadsPost> request, String header) throws MalformedResponseException {
        return ProductFeedUploadsPost.parseResponse(response, context, request, header);
      }
    };
  }
}
