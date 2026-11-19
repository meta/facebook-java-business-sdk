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
public class BusinessOwnedProductCatalogsPost extends APINode {
  @SerializedName("ad_account_to_collaborative_ads_share_settings")
  private Object mAdAccountToCollaborativeAdsShareSettings = null;
  @SerializedName("agencies")
  private Object mAgencies = null;
  @SerializedName("agency_collaborative_ads_share_settings")
  private Object mAgencyCollaborativeAdsShareSettings = null;
  @SerializedName("assigned_users")
  private Object mAssignedUsers = null;
  @SerializedName("business")
  private Object mBusiness = null;
  @SerializedName("can_advertise")
  private Boolean mCanAdvertise = null;
  @SerializedName("can_catalog_segment_create_campaign")
  private Boolean mCanCatalogSegmentCreateCampaign = null;
  @SerializedName("can_create_catalog_segments")
  private Boolean mCanCreateCatalogSegments = null;
  @SerializedName("can_manage")
  private Boolean mCanManage = null;
  @SerializedName("capabilities")
  private List<Object> mCapabilities = null;
  @SerializedName("capability_features")
  private List<String> mCapabilityFeatures = null;
  @SerializedName("catalog_duplicate_data")
  private Object mCatalogDuplicateData = null;
  @SerializedName("catalog_item_type")
  private EnumCatalogItemType mCatalogItemType = null;
  @SerializedName("catalog_segment_filter")
  private String mCatalogSegmentFilter = null;
  @SerializedName("catalog_segment_type")
  private String mCatalogSegmentType = null;
  @SerializedName("catalog_segments")
  private Object mCatalogSegments = null;
  @SerializedName("catalog_store")
  private Object mCatalogStore = null;
  @SerializedName("check_external_event_source_association")
  private String mCheckExternalEventSourceAssociation = null;
  @SerializedName("checkout_urls")
  private List<Object> mCheckoutUrls = null;
  @SerializedName("collaborative_ads_share_settings")
  private Object mCollaborativeAdsShareSettings = null;
  @SerializedName("commerce_merchant_settings")
  private Object mCommerceMerchantSettings = null;
  @SerializedName("cpas_catalog_compliance_status")
  private String mCpasCatalogComplianceStatus = null;
  @SerializedName("cpas_customization_enabled_fields")
  private List<String> mCpasCustomizationEnabledFields = null;
  @SerializedName("cpas_is_mpa_lite_omni_enabled_catalog_segment")
  private Boolean mCpasIsMpaLiteOmniEnabledCatalogSegment = null;
  @SerializedName("cpas_parent_catalog_settings")
  private Object mCpasParentCatalogSettings = null;
  @SerializedName("creation_source")
  private String mCreationSource = null;
  @SerializedName("creator_user")
  private Object mCreatorUser = null;
  @SerializedName("da_display_settings")
  private Object mDaDisplaySettings = null;
  @SerializedName("da_pe_spend_28d")
  private Double mDaPeSpend28d = null;
  @SerializedName("da_spend_28d")
  private Double mDaSpend28d = null;
  @SerializedName("data_sources")
  private Object mDataSources = null;
  @SerializedName("default_image_url")
  private String mDefaultImageUrl = null;
  @SerializedName("destinations")
  private Object mDestinations = null;
  @SerializedName("diagnostics")
  private Object mDiagnostics = null;
  @SerializedName("dominant_pixel")
  private String mDominantPixel = null;
  @SerializedName("dpa_eligible_ad_accounts")
  private Object mDpaEligibleAdAccounts = null;
  @SerializedName("event_stats")
  private Object mEventStats = null;
  @SerializedName("external_event_sources")
  private Object mExternalEventSources = null;
  @SerializedName("fallback_image_url")
  private List<String> mFallbackImageUrl = null;
  @SerializedName("feed_count")
  private Long mFeedCount = null;
  @SerializedName("has_external_event_source_associated_skip_privacy")
  private Boolean mHasExternalEventSourceAssociatedSkipPrivacy = null;
  @SerializedName("has_issues")
  private Boolean mHasIssues = null;
  @SerializedName("has_localized_overrides")
  private Boolean mHasLocalizedOverrides = null;
  @SerializedName("has_multiple_partner_integrations_for_platform")
  private Boolean mHasMultiplePartnerIntegrationsForPlatform = null;
  @SerializedName("home_listings")
  private Object mHomeListings = null;
  @SerializedName("hotels")
  private Object mHotels = null;
  @SerializedName("hpi_count")
  private Long mHpiCount = null;
  @SerializedName("id")
  private Long mId = null;
  @SerializedName("is_catalog_segment")
  private Boolean mIsCatalogSegment = null;
  @SerializedName("is_eligible_for_category_targeting")
  private Boolean mIsEligibleForCategoryTargeting = null;
  @SerializedName("is_eligible_for_checkout")
  private Boolean mIsEligibleForCheckout = null;
  @SerializedName("is_eligible_for_value_optimization")
  private Boolean mIsEligibleForValueOptimization = null;
  @SerializedName("is_local_catalog")
  private Boolean mIsLocalCatalog = null;
  @SerializedName("localization_settings")
  private Object mLocalizationSettings = null;
  @SerializedName("name")
  private String mName = null;
  @SerializedName("owner_business")
  private Object mOwnerBusiness = null;
  @SerializedName("page")
  private Object mPage = null;
  @SerializedName("parent_catalog_id")
  private Long mParentCatalogId = null;
  @SerializedName("product_count")
  private Long mProductCount = null;
  @SerializedName("product_feeds")
  private Object mProductFeeds = null;
  @SerializedName("product_groups")
  private Object mProductGroups = null;
  @SerializedName("product_sets")
  private Object mProductSets = null;
  @SerializedName("products")
  private Object mProducts = null;
  @SerializedName("smart_pixel_settings")
  private Object mSmartPixelSettings = null;
  @SerializedName("source_app")
  private Object mSourceApp = null;
  @SerializedName("store_catalog_settings")
  private Object mStoreCatalogSettings = null;
  @SerializedName("sub_vertical")
  private String mSubVertical = null;
  @SerializedName("suggested_conversion_event")
  private EnumSuggestedConversionEvent mSuggestedConversionEvent = null;
  @SerializedName("user_tasks")
  private Object mUserTasks = null;
  @SerializedName("vehicles")
  private Object mVehicles = null;
  @SerializedName("vertical")
  private String mVertical = null;
  @SerializedName("website_onboarding_settings")
  private Object mWebsiteOnboardingSettings = null;
  protected static Gson gson = null;

  public BusinessOwnedProductCatalogsPost() {
  }

  public String getId() {
    return getFieldId().toString();
  }
  public static BusinessOwnedProductCatalogsPost loadJSON(String json, APIContext context, String header) {
    BusinessOwnedProductCatalogsPost businessOwnedProductCatalogsPost = getGson().fromJson(json, BusinessOwnedProductCatalogsPost.class);
    if (context.isDebug()) {
      JsonParser parser = new JsonParser();
      JsonElement o1 = parser.parse(json);
      JsonElement o2 = parser.parse(businessOwnedProductCatalogsPost.toString());
      if (o1.getAsJsonObject().get("__fb_trace_id__") != null) {
        o2.getAsJsonObject().add("__fb_trace_id__", o1.getAsJsonObject().get("__fb_trace_id__"));
      }
      if (!o1.equals(o2)) {
        context.log("[Warning] When parsing response, object is not consistent with JSON:");
        context.log("[JSON]" + o1);
        context.log("[Object]" + o2);
      }
    }
    businessOwnedProductCatalogsPost.context = context;
    businessOwnedProductCatalogsPost.rawValue = json;
    businessOwnedProductCatalogsPost.header = header;
    return businessOwnedProductCatalogsPost;
  }

  public static APINodeList<BusinessOwnedProductCatalogsPost> parseResponse(String json, APIContext context, APIRequest request, String header) throws MalformedResponseException {
    APINodeList<BusinessOwnedProductCatalogsPost> businessOwnedProductCatalogsPosts = new APINodeList<BusinessOwnedProductCatalogsPost>(request, json, header);
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
          businessOwnedProductCatalogsPosts.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
        };
        return businessOwnedProductCatalogsPosts;
      } else if (result.isJsonObject()) {
        obj = result.getAsJsonObject();
        if (obj.has("data")) {
          if (obj.has("paging")) {
            JsonObject paging = obj.get("paging").getAsJsonObject();
            if (paging.has("cursors")) {
                JsonObject cursors = paging.get("cursors").getAsJsonObject();
                String before = cursors.has("before") ? cursors.get("before").getAsString() : null;
                String after = cursors.has("after") ? cursors.get("after").getAsString() : null;
                businessOwnedProductCatalogsPosts.setCursors(before, after);
            }
            String previous = paging.has("previous") ? paging.get("previous").getAsString() : null;
            String next = paging.has("next") ? paging.get("next").getAsString() : null;
            businessOwnedProductCatalogsPosts.setPaging(previous, next);
            if (context.hasAppSecret()) {
              businessOwnedProductCatalogsPosts.setAppSecret(context.getAppSecretProof());
            }
          }
          if (obj.get("data").isJsonArray()) {
            // Second, check if it's a JSON array with "data"
            arr = obj.get("data").getAsJsonArray();
            for (int i = 0; i < arr.size(); i++) {
              businessOwnedProductCatalogsPosts.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
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
                  businessOwnedProductCatalogsPosts.add(loadJSON(entry.getValue().toString(), context, header));
                }
                break;
              }
            }
            if (!isRedownload) {
              businessOwnedProductCatalogsPosts.add(loadJSON(obj.toString(), context, header));
            }
          }
          return businessOwnedProductCatalogsPosts;
        } else if (obj.has("images")) {
          // Fourth, check if it's a map of image objects
          obj = obj.get("images").getAsJsonObject();
          for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
              businessOwnedProductCatalogsPosts.add(loadJSON(entry.getValue().toString(), context, header));
          }
          return businessOwnedProductCatalogsPosts;
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
              businessOwnedProductCatalogsPosts.add(loadJSON(value.toString(), context, header));
            } else {
              isIdIndexedArray = false;
              break;
            }
          }
          if (isIdIndexedArray) {
            return businessOwnedProductCatalogsPosts;
          }

          // Sixth, check if it's pure JsonObject
          businessOwnedProductCatalogsPosts.clear();
          businessOwnedProductCatalogsPosts.add(loadJSON(json, context, header));
          return businessOwnedProductCatalogsPosts;
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


  public Object getFieldAdAccountToCollaborativeAdsShareSettings() {
    return mAdAccountToCollaborativeAdsShareSettings;
  }

  public BusinessOwnedProductCatalogsPost setFieldAdAccountToCollaborativeAdsShareSettings(Object value) {
    this.mAdAccountToCollaborativeAdsShareSettings = value;
    return this;
  }

  public Object getFieldAgencies() {
    return mAgencies;
  }

  public BusinessOwnedProductCatalogsPost setFieldAgencies(Object value) {
    this.mAgencies = value;
    return this;
  }

  public Object getFieldAgencyCollaborativeAdsShareSettings() {
    return mAgencyCollaborativeAdsShareSettings;
  }

  public BusinessOwnedProductCatalogsPost setFieldAgencyCollaborativeAdsShareSettings(Object value) {
    this.mAgencyCollaborativeAdsShareSettings = value;
    return this;
  }

  public Object getFieldAssignedUsers() {
    return mAssignedUsers;
  }

  public BusinessOwnedProductCatalogsPost setFieldAssignedUsers(Object value) {
    this.mAssignedUsers = value;
    return this;
  }

  public Object getFieldBusiness() {
    return mBusiness;
  }

  public BusinessOwnedProductCatalogsPost setFieldBusiness(Object value) {
    this.mBusiness = value;
    return this;
  }

  public Boolean getFieldCanAdvertise() {
    return mCanAdvertise;
  }

  public BusinessOwnedProductCatalogsPost setFieldCanAdvertise(Boolean value) {
    this.mCanAdvertise = value;
    return this;
  }

  public Boolean getFieldCanCatalogSegmentCreateCampaign() {
    return mCanCatalogSegmentCreateCampaign;
  }

  public BusinessOwnedProductCatalogsPost setFieldCanCatalogSegmentCreateCampaign(Boolean value) {
    this.mCanCatalogSegmentCreateCampaign = value;
    return this;
  }

  public Boolean getFieldCanCreateCatalogSegments() {
    return mCanCreateCatalogSegments;
  }

  public BusinessOwnedProductCatalogsPost setFieldCanCreateCatalogSegments(Boolean value) {
    this.mCanCreateCatalogSegments = value;
    return this;
  }

  public Boolean getFieldCanManage() {
    return mCanManage;
  }

  public BusinessOwnedProductCatalogsPost setFieldCanManage(Boolean value) {
    this.mCanManage = value;
    return this;
  }

  public List<Object> getFieldCapabilities() {
    return mCapabilities;
  }

  public BusinessOwnedProductCatalogsPost setFieldCapabilities(List<Object> value) {
    this.mCapabilities = value;
    return this;
  }

  public List<String> getFieldCapabilityFeatures() {
    return mCapabilityFeatures;
  }

  public BusinessOwnedProductCatalogsPost setFieldCapabilityFeatures(List<String> value) {
    this.mCapabilityFeatures = value;
    return this;
  }

  public Object getFieldCatalogDuplicateData() {
    return mCatalogDuplicateData;
  }

  public BusinessOwnedProductCatalogsPost setFieldCatalogDuplicateData(Object value) {
    this.mCatalogDuplicateData = value;
    return this;
  }

  public EnumCatalogItemType getFieldCatalogItemType() {
    return mCatalogItemType;
  }

  public BusinessOwnedProductCatalogsPost setFieldCatalogItemType(EnumCatalogItemType value) {
    this.mCatalogItemType = value;
    return this;
  }

  public String getFieldCatalogSegmentFilter() {
    return mCatalogSegmentFilter;
  }

  public BusinessOwnedProductCatalogsPost setFieldCatalogSegmentFilter(String value) {
    this.mCatalogSegmentFilter = value;
    return this;
  }

  public String getFieldCatalogSegmentType() {
    return mCatalogSegmentType;
  }

  public BusinessOwnedProductCatalogsPost setFieldCatalogSegmentType(String value) {
    this.mCatalogSegmentType = value;
    return this;
  }

  public Object getFieldCatalogSegments() {
    return mCatalogSegments;
  }

  public BusinessOwnedProductCatalogsPost setFieldCatalogSegments(Object value) {
    this.mCatalogSegments = value;
    return this;
  }

  public Object getFieldCatalogStore() {
    return mCatalogStore;
  }

  public BusinessOwnedProductCatalogsPost setFieldCatalogStore(Object value) {
    this.mCatalogStore = value;
    return this;
  }

  public String getFieldCheckExternalEventSourceAssociation() {
    return mCheckExternalEventSourceAssociation;
  }

  public BusinessOwnedProductCatalogsPost setFieldCheckExternalEventSourceAssociation(String value) {
    this.mCheckExternalEventSourceAssociation = value;
    return this;
  }

  public List<Object> getFieldCheckoutUrls() {
    return mCheckoutUrls;
  }

  public BusinessOwnedProductCatalogsPost setFieldCheckoutUrls(List<Object> value) {
    this.mCheckoutUrls = value;
    return this;
  }

  public Object getFieldCollaborativeAdsShareSettings() {
    return mCollaborativeAdsShareSettings;
  }

  public BusinessOwnedProductCatalogsPost setFieldCollaborativeAdsShareSettings(Object value) {
    this.mCollaborativeAdsShareSettings = value;
    return this;
  }

  public Object getFieldCommerceMerchantSettings() {
    return mCommerceMerchantSettings;
  }

  public BusinessOwnedProductCatalogsPost setFieldCommerceMerchantSettings(Object value) {
    this.mCommerceMerchantSettings = value;
    return this;
  }

  public String getFieldCpasCatalogComplianceStatus() {
    return mCpasCatalogComplianceStatus;
  }

  public BusinessOwnedProductCatalogsPost setFieldCpasCatalogComplianceStatus(String value) {
    this.mCpasCatalogComplianceStatus = value;
    return this;
  }

  public List<String> getFieldCpasCustomizationEnabledFields() {
    return mCpasCustomizationEnabledFields;
  }

  public BusinessOwnedProductCatalogsPost setFieldCpasCustomizationEnabledFields(List<String> value) {
    this.mCpasCustomizationEnabledFields = value;
    return this;
  }

  public Boolean getFieldCpasIsMpaLiteOmniEnabledCatalogSegment() {
    return mCpasIsMpaLiteOmniEnabledCatalogSegment;
  }

  public BusinessOwnedProductCatalogsPost setFieldCpasIsMpaLiteOmniEnabledCatalogSegment(Boolean value) {
    this.mCpasIsMpaLiteOmniEnabledCatalogSegment = value;
    return this;
  }

  public Object getFieldCpasParentCatalogSettings() {
    return mCpasParentCatalogSettings;
  }

  public BusinessOwnedProductCatalogsPost setFieldCpasParentCatalogSettings(Object value) {
    this.mCpasParentCatalogSettings = value;
    return this;
  }

  public String getFieldCreationSource() {
    return mCreationSource;
  }

  public BusinessOwnedProductCatalogsPost setFieldCreationSource(String value) {
    this.mCreationSource = value;
    return this;
  }

  public Object getFieldCreatorUser() {
    return mCreatorUser;
  }

  public BusinessOwnedProductCatalogsPost setFieldCreatorUser(Object value) {
    this.mCreatorUser = value;
    return this;
  }

  public Object getFieldDaDisplaySettings() {
    return mDaDisplaySettings;
  }

  public BusinessOwnedProductCatalogsPost setFieldDaDisplaySettings(Object value) {
    this.mDaDisplaySettings = value;
    return this;
  }

  public Double getFieldDaPeSpend28d() {
    return mDaPeSpend28d;
  }

  public BusinessOwnedProductCatalogsPost setFieldDaPeSpend28d(Double value) {
    this.mDaPeSpend28d = value;
    return this;
  }

  public Double getFieldDaSpend28d() {
    return mDaSpend28d;
  }

  public BusinessOwnedProductCatalogsPost setFieldDaSpend28d(Double value) {
    this.mDaSpend28d = value;
    return this;
  }

  public Object getFieldDataSources() {
    return mDataSources;
  }

  public BusinessOwnedProductCatalogsPost setFieldDataSources(Object value) {
    this.mDataSources = value;
    return this;
  }

  public String getFieldDefaultImageUrl() {
    return mDefaultImageUrl;
  }

  public BusinessOwnedProductCatalogsPost setFieldDefaultImageUrl(String value) {
    this.mDefaultImageUrl = value;
    return this;
  }

  public Object getFieldDestinations() {
    return mDestinations;
  }

  public BusinessOwnedProductCatalogsPost setFieldDestinations(Object value) {
    this.mDestinations = value;
    return this;
  }

  public Object getFieldDiagnostics() {
    return mDiagnostics;
  }

  public BusinessOwnedProductCatalogsPost setFieldDiagnostics(Object value) {
    this.mDiagnostics = value;
    return this;
  }

  public String getFieldDominantPixel() {
    return mDominantPixel;
  }

  public BusinessOwnedProductCatalogsPost setFieldDominantPixel(String value) {
    this.mDominantPixel = value;
    return this;
  }

  public Object getFieldDpaEligibleAdAccounts() {
    return mDpaEligibleAdAccounts;
  }

  public BusinessOwnedProductCatalogsPost setFieldDpaEligibleAdAccounts(Object value) {
    this.mDpaEligibleAdAccounts = value;
    return this;
  }

  public Object getFieldEventStats() {
    return mEventStats;
  }

  public BusinessOwnedProductCatalogsPost setFieldEventStats(Object value) {
    this.mEventStats = value;
    return this;
  }

  public Object getFieldExternalEventSources() {
    return mExternalEventSources;
  }

  public BusinessOwnedProductCatalogsPost setFieldExternalEventSources(Object value) {
    this.mExternalEventSources = value;
    return this;
  }

  public List<String> getFieldFallbackImageUrl() {
    return mFallbackImageUrl;
  }

  public BusinessOwnedProductCatalogsPost setFieldFallbackImageUrl(List<String> value) {
    this.mFallbackImageUrl = value;
    return this;
  }

  public Long getFieldFeedCount() {
    return mFeedCount;
  }

  public BusinessOwnedProductCatalogsPost setFieldFeedCount(Long value) {
    this.mFeedCount = value;
    return this;
  }

  public Boolean getFieldHasExternalEventSourceAssociatedSkipPrivacy() {
    return mHasExternalEventSourceAssociatedSkipPrivacy;
  }

  public BusinessOwnedProductCatalogsPost setFieldHasExternalEventSourceAssociatedSkipPrivacy(Boolean value) {
    this.mHasExternalEventSourceAssociatedSkipPrivacy = value;
    return this;
  }

  public Boolean getFieldHasIssues() {
    return mHasIssues;
  }

  public BusinessOwnedProductCatalogsPost setFieldHasIssues(Boolean value) {
    this.mHasIssues = value;
    return this;
  }

  public Boolean getFieldHasLocalizedOverrides() {
    return mHasLocalizedOverrides;
  }

  public BusinessOwnedProductCatalogsPost setFieldHasLocalizedOverrides(Boolean value) {
    this.mHasLocalizedOverrides = value;
    return this;
  }

  public Boolean getFieldHasMultiplePartnerIntegrationsForPlatform() {
    return mHasMultiplePartnerIntegrationsForPlatform;
  }

  public BusinessOwnedProductCatalogsPost setFieldHasMultiplePartnerIntegrationsForPlatform(Boolean value) {
    this.mHasMultiplePartnerIntegrationsForPlatform = value;
    return this;
  }

  public Object getFieldHomeListings() {
    return mHomeListings;
  }

  public BusinessOwnedProductCatalogsPost setFieldHomeListings(Object value) {
    this.mHomeListings = value;
    return this;
  }

  public Object getFieldHotels() {
    return mHotels;
  }

  public BusinessOwnedProductCatalogsPost setFieldHotels(Object value) {
    this.mHotels = value;
    return this;
  }

  public Long getFieldHpiCount() {
    return mHpiCount;
  }

  public BusinessOwnedProductCatalogsPost setFieldHpiCount(Long value) {
    this.mHpiCount = value;
    return this;
  }

  public Long getFieldId() {
    return mId;
  }

  public BusinessOwnedProductCatalogsPost setFieldId(Long value) {
    this.mId = value;
    return this;
  }

  public Boolean getFieldIsCatalogSegment() {
    return mIsCatalogSegment;
  }

  public BusinessOwnedProductCatalogsPost setFieldIsCatalogSegment(Boolean value) {
    this.mIsCatalogSegment = value;
    return this;
  }

  public Boolean getFieldIsEligibleForCategoryTargeting() {
    return mIsEligibleForCategoryTargeting;
  }

  public BusinessOwnedProductCatalogsPost setFieldIsEligibleForCategoryTargeting(Boolean value) {
    this.mIsEligibleForCategoryTargeting = value;
    return this;
  }

  public Boolean getFieldIsEligibleForCheckout() {
    return mIsEligibleForCheckout;
  }

  public BusinessOwnedProductCatalogsPost setFieldIsEligibleForCheckout(Boolean value) {
    this.mIsEligibleForCheckout = value;
    return this;
  }

  public Boolean getFieldIsEligibleForValueOptimization() {
    return mIsEligibleForValueOptimization;
  }

  public BusinessOwnedProductCatalogsPost setFieldIsEligibleForValueOptimization(Boolean value) {
    this.mIsEligibleForValueOptimization = value;
    return this;
  }

  public Boolean getFieldIsLocalCatalog() {
    return mIsLocalCatalog;
  }

  public BusinessOwnedProductCatalogsPost setFieldIsLocalCatalog(Boolean value) {
    this.mIsLocalCatalog = value;
    return this;
  }

  public Object getFieldLocalizationSettings() {
    return mLocalizationSettings;
  }

  public BusinessOwnedProductCatalogsPost setFieldLocalizationSettings(Object value) {
    this.mLocalizationSettings = value;
    return this;
  }

  public String getFieldName() {
    return mName;
  }

  public BusinessOwnedProductCatalogsPost setFieldName(String value) {
    this.mName = value;
    return this;
  }

  public Object getFieldOwnerBusiness() {
    return mOwnerBusiness;
  }

  public BusinessOwnedProductCatalogsPost setFieldOwnerBusiness(Object value) {
    this.mOwnerBusiness = value;
    return this;
  }

  public Object getFieldPage() {
    return mPage;
  }

  public BusinessOwnedProductCatalogsPost setFieldPage(Object value) {
    this.mPage = value;
    return this;
  }

  public Long getFieldParentCatalogId() {
    return mParentCatalogId;
  }

  public BusinessOwnedProductCatalogsPost setFieldParentCatalogId(Long value) {
    this.mParentCatalogId = value;
    return this;
  }

  public Long getFieldProductCount() {
    return mProductCount;
  }

  public BusinessOwnedProductCatalogsPost setFieldProductCount(Long value) {
    this.mProductCount = value;
    return this;
  }

  public Object getFieldProductFeeds() {
    return mProductFeeds;
  }

  public BusinessOwnedProductCatalogsPost setFieldProductFeeds(Object value) {
    this.mProductFeeds = value;
    return this;
  }

  public Object getFieldProductGroups() {
    return mProductGroups;
  }

  public BusinessOwnedProductCatalogsPost setFieldProductGroups(Object value) {
    this.mProductGroups = value;
    return this;
  }

  public Object getFieldProductSets() {
    return mProductSets;
  }

  public BusinessOwnedProductCatalogsPost setFieldProductSets(Object value) {
    this.mProductSets = value;
    return this;
  }

  public Object getFieldProducts() {
    return mProducts;
  }

  public BusinessOwnedProductCatalogsPost setFieldProducts(Object value) {
    this.mProducts = value;
    return this;
  }

  public Object getFieldSmartPixelSettings() {
    return mSmartPixelSettings;
  }

  public BusinessOwnedProductCatalogsPost setFieldSmartPixelSettings(Object value) {
    this.mSmartPixelSettings = value;
    return this;
  }

  public Object getFieldSourceApp() {
    return mSourceApp;
  }

  public BusinessOwnedProductCatalogsPost setFieldSourceApp(Object value) {
    this.mSourceApp = value;
    return this;
  }

  public Object getFieldStoreCatalogSettings() {
    return mStoreCatalogSettings;
  }

  public BusinessOwnedProductCatalogsPost setFieldStoreCatalogSettings(Object value) {
    this.mStoreCatalogSettings = value;
    return this;
  }

  public String getFieldSubVertical() {
    return mSubVertical;
  }

  public BusinessOwnedProductCatalogsPost setFieldSubVertical(String value) {
    this.mSubVertical = value;
    return this;
  }

  public EnumSuggestedConversionEvent getFieldSuggestedConversionEvent() {
    return mSuggestedConversionEvent;
  }

  public BusinessOwnedProductCatalogsPost setFieldSuggestedConversionEvent(EnumSuggestedConversionEvent value) {
    this.mSuggestedConversionEvent = value;
    return this;
  }

  public Object getFieldUserTasks() {
    return mUserTasks;
  }

  public BusinessOwnedProductCatalogsPost setFieldUserTasks(Object value) {
    this.mUserTasks = value;
    return this;
  }

  public Object getFieldVehicles() {
    return mVehicles;
  }

  public BusinessOwnedProductCatalogsPost setFieldVehicles(Object value) {
    this.mVehicles = value;
    return this;
  }

  public String getFieldVertical() {
    return mVertical;
  }

  public BusinessOwnedProductCatalogsPost setFieldVertical(String value) {
    this.mVertical = value;
    return this;
  }

  public Object getFieldWebsiteOnboardingSettings() {
    return mWebsiteOnboardingSettings;
  }

  public BusinessOwnedProductCatalogsPost setFieldWebsiteOnboardingSettings(Object value) {
    this.mWebsiteOnboardingSettings = value;
    return this;
  }



  public static enum EnumCatalogItemType {
      @SerializedName("ACTIVITY")
      VALUE_ACTIVITY("ACTIVITY"),
      @SerializedName("APP_AND_SOFTWARE")
      VALUE_APP_AND_SOFTWARE("APP_AND_SOFTWARE"),
      @SerializedName("ARTICLE_AND_PUBLICATION")
      VALUE_ARTICLE_AND_PUBLICATION("ARTICLE_AND_PUBLICATION"),
      @SerializedName("AUTOMOTIVE")
      VALUE_AUTOMOTIVE("AUTOMOTIVE"),
      @SerializedName("DESTINATION")
      VALUE_DESTINATION("DESTINATION"),
      @SerializedName("FLIGHT")
      VALUE_FLIGHT("FLIGHT"),
      @SerializedName("HOME_LISTING")
      VALUE_HOME_LISTING("HOME_LISTING"),
      @SerializedName("HOTEL")
      VALUE_HOTEL("HOTEL"),
      @SerializedName("MEDIA_TITLE")
      VALUE_MEDIA_TITLE("MEDIA_TITLE"),
      @SerializedName("OTHER")
      VALUE_OTHER("OTHER"),
      @SerializedName("PRODUCT")
      VALUE_PRODUCT("PRODUCT"),
      @SerializedName("SERVICE")
      VALUE_SERVICE("SERVICE"),
      @SerializedName("TEST_ITEM")
      VALUE_TEST_ITEM("TEST_ITEM"),
      ;

      private String value;

      private EnumCatalogItemType(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumSuggestedConversionEvent {
      @SerializedName("ACHIEVEMENT_UNLOCKED")
      VALUE_ACHIEVEMENT_UNLOCKED("ACHIEVEMENT_UNLOCKED"),
      @SerializedName("ACTIVATE_APP")
      VALUE_ACTIVATE_APP("ACTIVATE_APP"),
      @SerializedName("ADD_PAYMENT_INFO")
      VALUE_ADD_PAYMENT_INFO("ADD_PAYMENT_INFO"),
      @SerializedName("ADD_TO_CART")
      VALUE_ADD_TO_CART("ADD_TO_CART"),
      @SerializedName("ADD_TO_WISHLIST")
      VALUE_ADD_TO_WISHLIST("ADD_TO_WISHLIST"),
      @SerializedName("AD_IMPRESSION")
      VALUE_AD_IMPRESSION("AD_IMPRESSION"),
      @SerializedName("COMPLETE_REGISTRATION")
      VALUE_COMPLETE_REGISTRATION("COMPLETE_REGISTRATION"),
      @SerializedName("CONTACT")
      VALUE_CONTACT("CONTACT"),
      @SerializedName("CONTENT_VIEW")
      VALUE_CONTENT_VIEW("CONTENT_VIEW"),
      @SerializedName("CUSTOMIZE_PRODUCT")
      VALUE_CUSTOMIZE_PRODUCT("CUSTOMIZE_PRODUCT"),
      @SerializedName("D2_RETENTION")
      VALUE_D2_RETENTION("D2_RETENTION"),
      @SerializedName("D7_RETENTION")
      VALUE_D7_RETENTION("D7_RETENTION"),
      @SerializedName("DONATE")
      VALUE_DONATE("DONATE"),
      @SerializedName("FIND_LOCATION")
      VALUE_FIND_LOCATION("FIND_LOCATION"),
      @SerializedName("FLOW_COMPLETE")
      VALUE_FLOW_COMPLETE("FLOW_COMPLETE"),
      @SerializedName("INITIATED_CHECKOUT")
      VALUE_INITIATED_CHECKOUT("INITIATED_CHECKOUT"),
      @SerializedName("LEAD")
      VALUE_LEAD("LEAD"),
      @SerializedName("LEVEL_ACHIEVED")
      VALUE_LEVEL_ACHIEVED("LEVEL_ACHIEVED"),
      @SerializedName("LISTING_INTERACTION")
      VALUE_LISTING_INTERACTION("LISTING_INTERACTION"),
      @SerializedName("MESSAGING_ACCEPT")
      VALUE_MESSAGING_ACCEPT("MESSAGING_ACCEPT"),
      @SerializedName("MESSAGING_BLOCK")
      VALUE_MESSAGING_BLOCK("MESSAGING_BLOCK"),
      @SerializedName("MESSAGING_CONVERSATION_STARTED_7D")
      VALUE_MESSAGING_CONVERSATION_STARTED_7D("MESSAGING_CONVERSATION_STARTED_7D"),
      @SerializedName("MESSAGING_DELETE_MESSAGE")
      VALUE_MESSAGING_DELETE_MESSAGE("MESSAGING_DELETE_MESSAGE"),
      @SerializedName("MESSAGING_DELETE_THREAD")
      VALUE_MESSAGING_DELETE_THREAD("MESSAGING_DELETE_THREAD"),
      @SerializedName("MESSAGING_DELIVERY_RECEIPT")
      VALUE_MESSAGING_DELIVERY_RECEIPT("MESSAGING_DELIVERY_RECEIPT"),
      @SerializedName("MESSAGING_FIRST_REPLY")
      VALUE_MESSAGING_FIRST_REPLY("MESSAGING_FIRST_REPLY"),
      @SerializedName("MESSAGING_IGNORE_REQUEST")
      VALUE_MESSAGING_IGNORE_REQUEST("MESSAGING_IGNORE_REQUEST"),
      @SerializedName("MESSAGING_MARK_SPAM")
      VALUE_MESSAGING_MARK_SPAM("MESSAGING_MARK_SPAM"),
      @SerializedName("MESSAGING_OPEN_THREAD")
      VALUE_MESSAGING_OPEN_THREAD("MESSAGING_OPEN_THREAD"),
      @SerializedName("MESSAGING_PROMOTIONAL_OFF")
      VALUE_MESSAGING_PROMOTIONAL_OFF("MESSAGING_PROMOTIONAL_OFF"),
      @SerializedName("MESSAGING_READ_RECEIPT")
      VALUE_MESSAGING_READ_RECEIPT("MESSAGING_READ_RECEIPT"),
      @SerializedName("MESSAGING_REPLY")
      VALUE_MESSAGING_REPLY("MESSAGING_REPLY"),
      @SerializedName("OTHER")
      VALUE_OTHER("OTHER"),
      @SerializedName("PURCHASE")
      VALUE_PURCHASE("PURCHASE"),
      @SerializedName("RATE")
      VALUE_RATE("RATE"),
      @SerializedName("SCHEDULE")
      VALUE_SCHEDULE("SCHEDULE"),
      @SerializedName("SEARCH")
      VALUE_SEARCH("SEARCH"),
      @SerializedName("SERVICE_BOOKING_REQUEST")
      VALUE_SERVICE_BOOKING_REQUEST("SERVICE_BOOKING_REQUEST"),
      @SerializedName("SPENT_CREDITS")
      VALUE_SPENT_CREDITS("SPENT_CREDITS"),
      @SerializedName("START_TRIAL")
      VALUE_START_TRIAL("START_TRIAL"),
      @SerializedName("SUBMIT_APPLICATION")
      VALUE_SUBMIT_APPLICATION("SUBMIT_APPLICATION"),
      @SerializedName("SUBSCRIBE")
      VALUE_SUBSCRIBE("SUBSCRIBE"),
      @SerializedName("TUTORIAL_COMPLETION")
      VALUE_TUTORIAL_COMPLETION("TUTORIAL_COMPLETION"),
      ;

      private String value;

      private EnumSuggestedConversionEvent(String value) {
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

  public BusinessOwnedProductCatalogsPost copyFrom(BusinessOwnedProductCatalogsPost instance) {
    this.mAdAccountToCollaborativeAdsShareSettings = instance.mAdAccountToCollaborativeAdsShareSettings;
    this.mAgencies = instance.mAgencies;
    this.mAgencyCollaborativeAdsShareSettings = instance.mAgencyCollaborativeAdsShareSettings;
    this.mAssignedUsers = instance.mAssignedUsers;
    this.mBusiness = instance.mBusiness;
    this.mCanAdvertise = instance.mCanAdvertise;
    this.mCanCatalogSegmentCreateCampaign = instance.mCanCatalogSegmentCreateCampaign;
    this.mCanCreateCatalogSegments = instance.mCanCreateCatalogSegments;
    this.mCanManage = instance.mCanManage;
    this.mCapabilities = instance.mCapabilities;
    this.mCapabilityFeatures = instance.mCapabilityFeatures;
    this.mCatalogDuplicateData = instance.mCatalogDuplicateData;
    this.mCatalogItemType = instance.mCatalogItemType;
    this.mCatalogSegmentFilter = instance.mCatalogSegmentFilter;
    this.mCatalogSegmentType = instance.mCatalogSegmentType;
    this.mCatalogSegments = instance.mCatalogSegments;
    this.mCatalogStore = instance.mCatalogStore;
    this.mCheckExternalEventSourceAssociation = instance.mCheckExternalEventSourceAssociation;
    this.mCheckoutUrls = instance.mCheckoutUrls;
    this.mCollaborativeAdsShareSettings = instance.mCollaborativeAdsShareSettings;
    this.mCommerceMerchantSettings = instance.mCommerceMerchantSettings;
    this.mCpasCatalogComplianceStatus = instance.mCpasCatalogComplianceStatus;
    this.mCpasCustomizationEnabledFields = instance.mCpasCustomizationEnabledFields;
    this.mCpasIsMpaLiteOmniEnabledCatalogSegment = instance.mCpasIsMpaLiteOmniEnabledCatalogSegment;
    this.mCpasParentCatalogSettings = instance.mCpasParentCatalogSettings;
    this.mCreationSource = instance.mCreationSource;
    this.mCreatorUser = instance.mCreatorUser;
    this.mDaDisplaySettings = instance.mDaDisplaySettings;
    this.mDaPeSpend28d = instance.mDaPeSpend28d;
    this.mDaSpend28d = instance.mDaSpend28d;
    this.mDataSources = instance.mDataSources;
    this.mDefaultImageUrl = instance.mDefaultImageUrl;
    this.mDestinations = instance.mDestinations;
    this.mDiagnostics = instance.mDiagnostics;
    this.mDominantPixel = instance.mDominantPixel;
    this.mDpaEligibleAdAccounts = instance.mDpaEligibleAdAccounts;
    this.mEventStats = instance.mEventStats;
    this.mExternalEventSources = instance.mExternalEventSources;
    this.mFallbackImageUrl = instance.mFallbackImageUrl;
    this.mFeedCount = instance.mFeedCount;
    this.mHasExternalEventSourceAssociatedSkipPrivacy = instance.mHasExternalEventSourceAssociatedSkipPrivacy;
    this.mHasIssues = instance.mHasIssues;
    this.mHasLocalizedOverrides = instance.mHasLocalizedOverrides;
    this.mHasMultiplePartnerIntegrationsForPlatform = instance.mHasMultiplePartnerIntegrationsForPlatform;
    this.mHomeListings = instance.mHomeListings;
    this.mHotels = instance.mHotels;
    this.mHpiCount = instance.mHpiCount;
    this.mId = instance.mId;
    this.mIsCatalogSegment = instance.mIsCatalogSegment;
    this.mIsEligibleForCategoryTargeting = instance.mIsEligibleForCategoryTargeting;
    this.mIsEligibleForCheckout = instance.mIsEligibleForCheckout;
    this.mIsEligibleForValueOptimization = instance.mIsEligibleForValueOptimization;
    this.mIsLocalCatalog = instance.mIsLocalCatalog;
    this.mLocalizationSettings = instance.mLocalizationSettings;
    this.mName = instance.mName;
    this.mOwnerBusiness = instance.mOwnerBusiness;
    this.mPage = instance.mPage;
    this.mParentCatalogId = instance.mParentCatalogId;
    this.mProductCount = instance.mProductCount;
    this.mProductFeeds = instance.mProductFeeds;
    this.mProductGroups = instance.mProductGroups;
    this.mProductSets = instance.mProductSets;
    this.mProducts = instance.mProducts;
    this.mSmartPixelSettings = instance.mSmartPixelSettings;
    this.mSourceApp = instance.mSourceApp;
    this.mStoreCatalogSettings = instance.mStoreCatalogSettings;
    this.mSubVertical = instance.mSubVertical;
    this.mSuggestedConversionEvent = instance.mSuggestedConversionEvent;
    this.mUserTasks = instance.mUserTasks;
    this.mVehicles = instance.mVehicles;
    this.mVertical = instance.mVertical;
    this.mWebsiteOnboardingSettings = instance.mWebsiteOnboardingSettings;
    this.context = instance.context;
    this.rawValue = instance.rawValue;
    return this;
  }

  public static APIRequest.ResponseParser<BusinessOwnedProductCatalogsPost> getParser() {
    return new APIRequest.ResponseParser<BusinessOwnedProductCatalogsPost>() {
      public APINodeList<BusinessOwnedProductCatalogsPost> parseResponse(String response, APIContext context, APIRequest<BusinessOwnedProductCatalogsPost> request, String header) throws MalformedResponseException {
        return BusinessOwnedProductCatalogsPost.parseResponse(response, context, request, header);
      }
    };
  }
}
