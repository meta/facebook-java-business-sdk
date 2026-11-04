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
public class AdgroupGet extends APINode {
  @SerializedName("account_id")
  private String mAccountId = null;
  @SerializedName("ad_active_time")
  private String mAdActiveTime = null;
  @SerializedName("ad_schedule_end_time")
  private Object mAdScheduleEndTime = null;
  @SerializedName("ad_schedule_start_time")
  private Object mAdScheduleStartTime = null;
  @SerializedName("adcreatives")
  private Object mAdcreatives = null;
  @SerializedName("adlabels")
  private List<Object> mAdlabels = null;
  @SerializedName("adrules_governed")
  private Object mAdrulesGoverned = null;
  @SerializedName("adset")
  private Object mAdset = null;
  @SerializedName("adset_id")
  private Long mAdsetId = null;
  @SerializedName("bid_amount")
  private Long mBidAmount = null;
  @SerializedName("bid_info")
  private Map<Long, Long> mBidInfo = null;
  @SerializedName("bid_type")
  private String mBidType = null;
  @SerializedName("campaign")
  private Object mCampaign = null;
  @SerializedName("campaign_id")
  private Long mCampaignId = null;
  @SerializedName("can_aggregate_social_feedback_on_edit")
  private Boolean mCanAggregateSocialFeedbackOnEdit = null;
  @SerializedName("clicks")
  private Long mClicks = null;
  @SerializedName("configured_status")
  private String mConfiguredStatus = null;
  @SerializedName("conversion_domain")
  private String mConversionDomain = null;
  @SerializedName("conversion_specs")
  private List<Object> mConversionSpecs = null;
  @SerializedName("created_time")
  private Object mCreatedTime = null;
  @SerializedName("creative")
  private Object mCreative = null;
  @SerializedName("creative_asset_groups_spec")
  private Object mCreativeAssetGroupsSpec = null;
  @SerializedName("creative_audience_pairing_persona")
  private Object mCreativeAudiencePairingPersona = null;
  @SerializedName("creative_body")
  private String mCreativeBody = null;
  @SerializedName("creative_history")
  private List<Object> mCreativeHistory = null;
  @SerializedName("creative_id")
  private Long mCreativeId = null;
  @SerializedName("creative_link_url")
  private String mCreativeLinkUrl = null;
  @SerializedName("creative_title")
  private String mCreativeTitle = null;
  @SerializedName("delivery_info")
  private Object mDeliveryInfo = null;
  @SerializedName("delivery_status")
  private Object mDeliveryStatus = null;
  @SerializedName("demolink_hash")
  private String mDemolinkHash = null;
  @SerializedName("display_sequence")
  private Long mDisplaySequence = null;
  @SerializedName("effective_status")
  private String mEffectiveStatus = null;
  @SerializedName("engagement_audience")
  private Boolean mEngagementAudience = null;
  @SerializedName("frequency")
  private Double mFrequency = null;
  @SerializedName("id")
  private Long mId = null;
  @SerializedName("impressions")
  private Long mImpressions = null;
  @SerializedName("is_autobid")
  private Boolean mIsAutobid = null;
  @SerializedName("last_updated_by_app_id")
  private String mLastUpdatedByAppId = null;
  @SerializedName("meta_reward_adgroup_status")
  private String mMetaRewardAdgroupStatus = null;
  @SerializedName("special_ad_categories")
  private List<String> mSpecialAdCategories = null;
  @SerializedName("spent")
  private String mSpent = null;
  @SerializedName("status")
  private String mStatus = null;
  @SerializedName("updated_time")
  private Object mUpdatedTime = null;
  @SerializedName("view_tags")
  private List<String> mViewTags = null;
  @SerializedName("yesterday_spent")
  private String mYesterdaySpent = null;
  protected static Gson gson = null;

  public AdgroupGet() {
  }

  public String getId() {
    return getFieldId().toString();
  }
  public static AdgroupGet loadJSON(String json, APIContext context, String header) {
    AdgroupGet adgroupGet = getGson().fromJson(json, AdgroupGet.class);
    if (context.isDebug()) {
      JsonParser parser = new JsonParser();
      JsonElement o1 = parser.parse(json);
      JsonElement o2 = parser.parse(adgroupGet.toString());
      if (o1.getAsJsonObject().get("__fb_trace_id__") != null) {
        o2.getAsJsonObject().add("__fb_trace_id__", o1.getAsJsonObject().get("__fb_trace_id__"));
      }
      if (!o1.equals(o2)) {
        context.log("[Warning] When parsing response, object is not consistent with JSON:");
        context.log("[JSON]" + o1);
        context.log("[Object]" + o2);
      }
    }
    adgroupGet.context = context;
    adgroupGet.rawValue = json;
    adgroupGet.header = header;
    return adgroupGet;
  }

  public static APINodeList<AdgroupGet> parseResponse(String json, APIContext context, APIRequest request, String header) throws MalformedResponseException {
    APINodeList<AdgroupGet> adgroupGets = new APINodeList<AdgroupGet>(request, json, header);
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
          adgroupGets.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
        };
        return adgroupGets;
      } else if (result.isJsonObject()) {
        obj = result.getAsJsonObject();
        if (obj.has("data")) {
          if (obj.has("paging")) {
            JsonObject paging = obj.get("paging").getAsJsonObject();
            if (paging.has("cursors")) {
                JsonObject cursors = paging.get("cursors").getAsJsonObject();
                String before = cursors.has("before") ? cursors.get("before").getAsString() : null;
                String after = cursors.has("after") ? cursors.get("after").getAsString() : null;
                adgroupGets.setCursors(before, after);
            }
            String previous = paging.has("previous") ? paging.get("previous").getAsString() : null;
            String next = paging.has("next") ? paging.get("next").getAsString() : null;
            adgroupGets.setPaging(previous, next);
            if (context.hasAppSecret()) {
              adgroupGets.setAppSecret(context.getAppSecretProof());
            }
          }
          if (obj.get("data").isJsonArray()) {
            // Second, check if it's a JSON array with "data"
            arr = obj.get("data").getAsJsonArray();
            for (int i = 0; i < arr.size(); i++) {
              adgroupGets.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
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
                  adgroupGets.add(loadJSON(entry.getValue().toString(), context, header));
                }
                break;
              }
            }
            if (!isRedownload) {
              adgroupGets.add(loadJSON(obj.toString(), context, header));
            }
          }
          return adgroupGets;
        } else if (obj.has("images")) {
          // Fourth, check if it's a map of image objects
          obj = obj.get("images").getAsJsonObject();
          for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
              adgroupGets.add(loadJSON(entry.getValue().toString(), context, header));
          }
          return adgroupGets;
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
              adgroupGets.add(loadJSON(value.toString(), context, header));
            } else {
              isIdIndexedArray = false;
              break;
            }
          }
          if (isIdIndexedArray) {
            return adgroupGets;
          }

          // Sixth, check if it's pure JsonObject
          adgroupGets.clear();
          adgroupGets.add(loadJSON(json, context, header));
          return adgroupGets;
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


  public String getFieldAccountId() {
    return mAccountId;
  }

  public AdgroupGet setFieldAccountId(String value) {
    this.mAccountId = value;
    return this;
  }

  public String getFieldAdActiveTime() {
    return mAdActiveTime;
  }

  public AdgroupGet setFieldAdActiveTime(String value) {
    this.mAdActiveTime = value;
    return this;
  }

  public Object getFieldAdScheduleEndTime() {
    return mAdScheduleEndTime;
  }

  public AdgroupGet setFieldAdScheduleEndTime(Object value) {
    this.mAdScheduleEndTime = value;
    return this;
  }

  public Object getFieldAdScheduleStartTime() {
    return mAdScheduleStartTime;
  }

  public AdgroupGet setFieldAdScheduleStartTime(Object value) {
    this.mAdScheduleStartTime = value;
    return this;
  }

  public Object getFieldAdcreatives() {
    return mAdcreatives;
  }

  public AdgroupGet setFieldAdcreatives(Object value) {
    this.mAdcreatives = value;
    return this;
  }

  public List<Object> getFieldAdlabels() {
    return mAdlabels;
  }

  public AdgroupGet setFieldAdlabels(List<Object> value) {
    this.mAdlabels = value;
    return this;
  }

  public Object getFieldAdrulesGoverned() {
    return mAdrulesGoverned;
  }

  public AdgroupGet setFieldAdrulesGoverned(Object value) {
    this.mAdrulesGoverned = value;
    return this;
  }

  public Object getFieldAdset() {
    return mAdset;
  }

  public AdgroupGet setFieldAdset(Object value) {
    this.mAdset = value;
    return this;
  }

  public Long getFieldAdsetId() {
    return mAdsetId;
  }

  public AdgroupGet setFieldAdsetId(Long value) {
    this.mAdsetId = value;
    return this;
  }

  public Long getFieldBidAmount() {
    return mBidAmount;
  }

  public AdgroupGet setFieldBidAmount(Long value) {
    this.mBidAmount = value;
    return this;
  }

  public Map<Long, Long> getFieldBidInfo() {
    return mBidInfo;
  }

  public AdgroupGet setFieldBidInfo(Map<Long, Long> value) {
    this.mBidInfo = value;
    return this;
  }

  public String getFieldBidType() {
    return mBidType;
  }

  public AdgroupGet setFieldBidType(String value) {
    this.mBidType = value;
    return this;
  }

  public Object getFieldCampaign() {
    return mCampaign;
  }

  public AdgroupGet setFieldCampaign(Object value) {
    this.mCampaign = value;
    return this;
  }

  public Long getFieldCampaignId() {
    return mCampaignId;
  }

  public AdgroupGet setFieldCampaignId(Long value) {
    this.mCampaignId = value;
    return this;
  }

  public Boolean getFieldCanAggregateSocialFeedbackOnEdit() {
    return mCanAggregateSocialFeedbackOnEdit;
  }

  public AdgroupGet setFieldCanAggregateSocialFeedbackOnEdit(Boolean value) {
    this.mCanAggregateSocialFeedbackOnEdit = value;
    return this;
  }

  public Long getFieldClicks() {
    return mClicks;
  }

  public AdgroupGet setFieldClicks(Long value) {
    this.mClicks = value;
    return this;
  }

  public String getFieldConfiguredStatus() {
    return mConfiguredStatus;
  }

  public AdgroupGet setFieldConfiguredStatus(String value) {
    this.mConfiguredStatus = value;
    return this;
  }

  public String getFieldConversionDomain() {
    return mConversionDomain;
  }

  public AdgroupGet setFieldConversionDomain(String value) {
    this.mConversionDomain = value;
    return this;
  }

  public List<Object> getFieldConversionSpecs() {
    return mConversionSpecs;
  }

  public AdgroupGet setFieldConversionSpecs(List<Object> value) {
    this.mConversionSpecs = value;
    return this;
  }

  public Object getFieldCreatedTime() {
    return mCreatedTime;
  }

  public AdgroupGet setFieldCreatedTime(Object value) {
    this.mCreatedTime = value;
    return this;
  }

  public Object getFieldCreative() {
    return mCreative;
  }

  public AdgroupGet setFieldCreative(Object value) {
    this.mCreative = value;
    return this;
  }

  public Object getFieldCreativeAssetGroupsSpec() {
    return mCreativeAssetGroupsSpec;
  }

  public AdgroupGet setFieldCreativeAssetGroupsSpec(Object value) {
    this.mCreativeAssetGroupsSpec = value;
    return this;
  }

  public Object getFieldCreativeAudiencePairingPersona() {
    return mCreativeAudiencePairingPersona;
  }

  public AdgroupGet setFieldCreativeAudiencePairingPersona(Object value) {
    this.mCreativeAudiencePairingPersona = value;
    return this;
  }

  public String getFieldCreativeBody() {
    return mCreativeBody;
  }

  public AdgroupGet setFieldCreativeBody(String value) {
    this.mCreativeBody = value;
    return this;
  }

  public List<Object> getFieldCreativeHistory() {
    return mCreativeHistory;
  }

  public AdgroupGet setFieldCreativeHistory(List<Object> value) {
    this.mCreativeHistory = value;
    return this;
  }

  public Long getFieldCreativeId() {
    return mCreativeId;
  }

  public AdgroupGet setFieldCreativeId(Long value) {
    this.mCreativeId = value;
    return this;
  }

  public String getFieldCreativeLinkUrl() {
    return mCreativeLinkUrl;
  }

  public AdgroupGet setFieldCreativeLinkUrl(String value) {
    this.mCreativeLinkUrl = value;
    return this;
  }

  public String getFieldCreativeTitle() {
    return mCreativeTitle;
  }

  public AdgroupGet setFieldCreativeTitle(String value) {
    this.mCreativeTitle = value;
    return this;
  }

  public Object getFieldDeliveryInfo() {
    return mDeliveryInfo;
  }

  public AdgroupGet setFieldDeliveryInfo(Object value) {
    this.mDeliveryInfo = value;
    return this;
  }

  public Object getFieldDeliveryStatus() {
    return mDeliveryStatus;
  }

  public AdgroupGet setFieldDeliveryStatus(Object value) {
    this.mDeliveryStatus = value;
    return this;
  }

  public String getFieldDemolinkHash() {
    return mDemolinkHash;
  }

  public AdgroupGet setFieldDemolinkHash(String value) {
    this.mDemolinkHash = value;
    return this;
  }

  public Long getFieldDisplaySequence() {
    return mDisplaySequence;
  }

  public AdgroupGet setFieldDisplaySequence(Long value) {
    this.mDisplaySequence = value;
    return this;
  }

  public String getFieldEffectiveStatus() {
    return mEffectiveStatus;
  }

  public AdgroupGet setFieldEffectiveStatus(String value) {
    this.mEffectiveStatus = value;
    return this;
  }

  public Boolean getFieldEngagementAudience() {
    return mEngagementAudience;
  }

  public AdgroupGet setFieldEngagementAudience(Boolean value) {
    this.mEngagementAudience = value;
    return this;
  }

  public Double getFieldFrequency() {
    return mFrequency;
  }

  public AdgroupGet setFieldFrequency(Double value) {
    this.mFrequency = value;
    return this;
  }

  public Long getFieldId() {
    return mId;
  }

  public AdgroupGet setFieldId(Long value) {
    this.mId = value;
    return this;
  }

  public Long getFieldImpressions() {
    return mImpressions;
  }

  public AdgroupGet setFieldImpressions(Long value) {
    this.mImpressions = value;
    return this;
  }

  public Boolean getFieldIsAutobid() {
    return mIsAutobid;
  }

  public AdgroupGet setFieldIsAutobid(Boolean value) {
    this.mIsAutobid = value;
    return this;
  }

  public String getFieldLastUpdatedByAppId() {
    return mLastUpdatedByAppId;
  }

  public AdgroupGet setFieldLastUpdatedByAppId(String value) {
    this.mLastUpdatedByAppId = value;
    return this;
  }

  public String getFieldMetaRewardAdgroupStatus() {
    return mMetaRewardAdgroupStatus;
  }

  public AdgroupGet setFieldMetaRewardAdgroupStatus(String value) {
    this.mMetaRewardAdgroupStatus = value;
    return this;
  }

  public List<String> getFieldSpecialAdCategories() {
    return mSpecialAdCategories;
  }

  public AdgroupGet setFieldSpecialAdCategories(List<String> value) {
    this.mSpecialAdCategories = value;
    return this;
  }

  public String getFieldSpent() {
    return mSpent;
  }

  public AdgroupGet setFieldSpent(String value) {
    this.mSpent = value;
    return this;
  }

  public String getFieldStatus() {
    return mStatus;
  }

  public AdgroupGet setFieldStatus(String value) {
    this.mStatus = value;
    return this;
  }

  public Object getFieldUpdatedTime() {
    return mUpdatedTime;
  }

  public AdgroupGet setFieldUpdatedTime(Object value) {
    this.mUpdatedTime = value;
    return this;
  }

  public List<String> getFieldViewTags() {
    return mViewTags;
  }

  public AdgroupGet setFieldViewTags(List<String> value) {
    this.mViewTags = value;
    return this;
  }

  public String getFieldYesterdaySpent() {
    return mYesterdaySpent;
  }

  public AdgroupGet setFieldYesterdaySpent(String value) {
    this.mYesterdaySpent = value;
    return this;
  }



  public static enum EnumDatePreset {
      @SerializedName("DATA_MAXIMUM")
      VALUE_DATA_MAXIMUM("DATA_MAXIMUM"),
      @SerializedName("LAST_12M")
      VALUE_LAST_12M("LAST_12M"),
      @SerializedName("LAST_14D")
      VALUE_LAST_14D("LAST_14D"),
      @SerializedName("LAST_14_DAYS")
      VALUE_LAST_14_DAYS("LAST_14_DAYS"),
      @SerializedName("LAST_180D")
      VALUE_LAST_180D("LAST_180D"),
      @SerializedName("LAST_180_DAYS")
      VALUE_LAST_180_DAYS("LAST_180_DAYS"),
      @SerializedName("LAST_24M")
      VALUE_LAST_24M("LAST_24M"),
      @SerializedName("LAST_28D")
      VALUE_LAST_28D("LAST_28D"),
      @SerializedName("LAST_28_DAYS")
      VALUE_LAST_28_DAYS("LAST_28_DAYS"),
      @SerializedName("LAST_2D")
      VALUE_LAST_2D("LAST_2D"),
      @SerializedName("LAST_2_DAYS")
      VALUE_LAST_2_DAYS("LAST_2_DAYS"),
      @SerializedName("LAST_30D")
      VALUE_LAST_30D("LAST_30D"),
      @SerializedName("LAST_30_DAYS")
      VALUE_LAST_30_DAYS("LAST_30_DAYS"),
      @SerializedName("LAST_3D")
      VALUE_LAST_3D("LAST_3D"),
      @SerializedName("LAST_3_DAYS")
      VALUE_LAST_3_DAYS("LAST_3_DAYS"),
      @SerializedName("LAST_3_MONTHS")
      VALUE_LAST_3_MONTHS("LAST_3_MONTHS"),
      @SerializedName("LAST_40D")
      VALUE_LAST_40D("LAST_40D"),
      @SerializedName("LAST_60D")
      VALUE_LAST_60D("LAST_60D"),
      @SerializedName("LAST_7D")
      VALUE_LAST_7D("LAST_7D"),
      @SerializedName("LAST_7_DAYS")
      VALUE_LAST_7_DAYS("LAST_7_DAYS"),
      @SerializedName("LAST_8_DAYS")
      VALUE_LAST_8_DAYS("LAST_8_DAYS"),
      @SerializedName("LAST_90D")
      VALUE_LAST_90D("LAST_90D"),
      @SerializedName("LAST_90_DAYS")
      VALUE_LAST_90_DAYS("LAST_90_DAYS"),
      @SerializedName("LAST_MONTH")
      VALUE_LAST_MONTH("LAST_MONTH"),
      @SerializedName("LAST_ND_3_2")
      VALUE_LAST_ND_3_2("LAST_ND_3_2"),
      @SerializedName("LAST_ND_4_3")
      VALUE_LAST_ND_4_3("LAST_ND_4_3"),
      @SerializedName("LAST_ND_5_4")
      VALUE_LAST_ND_5_4("LAST_ND_5_4"),
      @SerializedName("LAST_ND_6_5")
      VALUE_LAST_ND_6_5("LAST_ND_6_5"),
      @SerializedName("LAST_ND_7_6")
      VALUE_LAST_ND_7_6("LAST_ND_7_6"),
      @SerializedName("LAST_ND_8_7")
      VALUE_LAST_ND_8_7("LAST_ND_8_7"),
      @SerializedName("LAST_NM_1_0")
      VALUE_LAST_NM_1_0("LAST_NM_1_0"),
      @SerializedName("LAST_NM_2_0")
      VALUE_LAST_NM_2_0("LAST_NM_2_0"),
      @SerializedName("LAST_NM_3_0")
      VALUE_LAST_NM_3_0("LAST_NM_3_0"),
      @SerializedName("LAST_NM_3_2")
      VALUE_LAST_NM_3_2("LAST_NM_3_2"),
      @SerializedName("LAST_NM_4_3")
      VALUE_LAST_NM_4_3("LAST_NM_4_3"),
      @SerializedName("LAST_NM_5_4")
      VALUE_LAST_NM_5_4("LAST_NM_5_4"),
      @SerializedName("LAST_NQ_2_0")
      VALUE_LAST_NQ_2_0("LAST_NQ_2_0"),
      @SerializedName("LAST_NQ_2_1")
      VALUE_LAST_NQ_2_1("LAST_NQ_2_1"),
      @SerializedName("LAST_NQ_3_0")
      VALUE_LAST_NQ_3_0("LAST_NQ_3_0"),
      @SerializedName("LAST_NQ_3_1")
      VALUE_LAST_NQ_3_1("LAST_NQ_3_1"),
      @SerializedName("LAST_QUARTER")
      VALUE_LAST_QUARTER("LAST_QUARTER"),
      @SerializedName("LAST_WEEK")
      VALUE_LAST_WEEK("LAST_WEEK"),
      @SerializedName("LAST_WEEK_MON_SUN")
      VALUE_LAST_WEEK_MON_SUN("LAST_WEEK_MON_SUN"),
      @SerializedName("LAST_WEEK_SUN_SAT")
      VALUE_LAST_WEEK_SUN_SAT("LAST_WEEK_SUN_SAT"),
      @SerializedName("LAST_YEAR")
      VALUE_LAST_YEAR("LAST_YEAR"),
      @SerializedName("LIFETIME")
      VALUE_LIFETIME("LIFETIME"),
      @SerializedName("MAXIMUM")
      VALUE_MAXIMUM("MAXIMUM"),
      @SerializedName("NONE")
      VALUE_NONE("NONE"),
      @SerializedName("THIS_MONTH")
      VALUE_THIS_MONTH("THIS_MONTH"),
      @SerializedName("THIS_MONTH_NO_TODAY")
      VALUE_THIS_MONTH_NO_TODAY("THIS_MONTH_NO_TODAY"),
      @SerializedName("THIS_QUARTER")
      VALUE_THIS_QUARTER("THIS_QUARTER"),
      @SerializedName("THIS_WEEK")
      VALUE_THIS_WEEK("THIS_WEEK"),
      @SerializedName("THIS_WEEK_MON_NO_TODAY")
      VALUE_THIS_WEEK_MON_NO_TODAY("THIS_WEEK_MON_NO_TODAY"),
      @SerializedName("THIS_WEEK_MON_TODAY")
      VALUE_THIS_WEEK_MON_TODAY("THIS_WEEK_MON_TODAY"),
      @SerializedName("THIS_WEEK_SUN_NO_TODAY")
      VALUE_THIS_WEEK_SUN_NO_TODAY("THIS_WEEK_SUN_NO_TODAY"),
      @SerializedName("THIS_WEEK_SUN_TODAY")
      VALUE_THIS_WEEK_SUN_TODAY("THIS_WEEK_SUN_TODAY"),
      @SerializedName("THIS_YEAR")
      VALUE_THIS_YEAR("THIS_YEAR"),
      @SerializedName("TODAY")
      VALUE_TODAY("TODAY"),
      @SerializedName("YESTERDAY")
      VALUE_YESTERDAY("YESTERDAY"),
      ;

      private String value;

      private EnumDatePreset(String value) {
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

  public AdgroupGet copyFrom(AdgroupGet instance) {
    this.mAccountId = instance.mAccountId;
    this.mAdActiveTime = instance.mAdActiveTime;
    this.mAdScheduleEndTime = instance.mAdScheduleEndTime;
    this.mAdScheduleStartTime = instance.mAdScheduleStartTime;
    this.mAdcreatives = instance.mAdcreatives;
    this.mAdlabels = instance.mAdlabels;
    this.mAdrulesGoverned = instance.mAdrulesGoverned;
    this.mAdset = instance.mAdset;
    this.mAdsetId = instance.mAdsetId;
    this.mBidAmount = instance.mBidAmount;
    this.mBidInfo = instance.mBidInfo;
    this.mBidType = instance.mBidType;
    this.mCampaign = instance.mCampaign;
    this.mCampaignId = instance.mCampaignId;
    this.mCanAggregateSocialFeedbackOnEdit = instance.mCanAggregateSocialFeedbackOnEdit;
    this.mClicks = instance.mClicks;
    this.mConfiguredStatus = instance.mConfiguredStatus;
    this.mConversionDomain = instance.mConversionDomain;
    this.mConversionSpecs = instance.mConversionSpecs;
    this.mCreatedTime = instance.mCreatedTime;
    this.mCreative = instance.mCreative;
    this.mCreativeAssetGroupsSpec = instance.mCreativeAssetGroupsSpec;
    this.mCreativeAudiencePairingPersona = instance.mCreativeAudiencePairingPersona;
    this.mCreativeBody = instance.mCreativeBody;
    this.mCreativeHistory = instance.mCreativeHistory;
    this.mCreativeId = instance.mCreativeId;
    this.mCreativeLinkUrl = instance.mCreativeLinkUrl;
    this.mCreativeTitle = instance.mCreativeTitle;
    this.mDeliveryInfo = instance.mDeliveryInfo;
    this.mDeliveryStatus = instance.mDeliveryStatus;
    this.mDemolinkHash = instance.mDemolinkHash;
    this.mDisplaySequence = instance.mDisplaySequence;
    this.mEffectiveStatus = instance.mEffectiveStatus;
    this.mEngagementAudience = instance.mEngagementAudience;
    this.mFrequency = instance.mFrequency;
    this.mId = instance.mId;
    this.mImpressions = instance.mImpressions;
    this.mIsAutobid = instance.mIsAutobid;
    this.mLastUpdatedByAppId = instance.mLastUpdatedByAppId;
    this.mMetaRewardAdgroupStatus = instance.mMetaRewardAdgroupStatus;
    this.mSpecialAdCategories = instance.mSpecialAdCategories;
    this.mSpent = instance.mSpent;
    this.mStatus = instance.mStatus;
    this.mUpdatedTime = instance.mUpdatedTime;
    this.mViewTags = instance.mViewTags;
    this.mYesterdaySpent = instance.mYesterdaySpent;
    this.context = instance.context;
    this.rawValue = instance.rawValue;
    return this;
  }

  public static APIRequest.ResponseParser<AdgroupGet> getParser() {
    return new APIRequest.ResponseParser<AdgroupGet>() {
      public APINodeList<AdgroupGet> parseResponse(String response, APIContext context, APIRequest<AdgroupGet> request, String header) throws MalformedResponseException {
        return AdgroupGet.parseResponse(response, context, request, header);
      }
    };
  }
}
