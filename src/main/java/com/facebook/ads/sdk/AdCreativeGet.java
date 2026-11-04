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
public class AdCreativeGet extends APINode {
  @SerializedName("account_id")
  private String mAccountId = null;
  @SerializedName("actor_id")
  private Long mActorId = null;
  @SerializedName("actor_type")
  private EnumActorType mActorType = null;
  @SerializedName("adlabels")
  private List<Object> mAdlabels = null;
  @SerializedName("applink_treatment")
  private EnumApplinkTreatment mApplinkTreatment = null;
  @SerializedName("asset_feed_spec")
  private Object mAssetFeedSpec = null;
  @SerializedName("authorization_category")
  private EnumAuthorizationCategory mAuthorizationCategory = null;
  @SerializedName("body")
  private String mBody = null;
  @SerializedName("branded_content")
  private Object mBrandedContent = null;
  @SerializedName("branded_content_boosting_type")
  private EnumBrandedContentBoostingType mBrandedContentBoostingType = null;
  @SerializedName("bundle_folder_id")
  private Long mBundleFolderId = null;
  @SerializedName("call_to_action")
  private Object mCallToAction = null;
  @SerializedName("call_to_action_type")
  private EnumCallToActionType mCallToActionType = null;
  @SerializedName("categorization_criteria")
  private EnumCategorizationCriteria mCategorizationCriteria = null;
  @SerializedName("category_media_source")
  private EnumCategoryMediaSource mCategoryMediaSource = null;
  @SerializedName("contextual_multi_ads")
  private Object mContextualMultiAds = null;
  @SerializedName("creative_readiness")
  private Object mCreativeReadiness = null;
  @SerializedName("creative_sourcing_spec")
  private Object mCreativeSourcingSpec = null;
  @SerializedName("degrees_of_freedom_spec")
  private Object mDegreesOfFreedomSpec = null;
  @SerializedName("destination_spec")
  private Object mDestinationSpec = null;
  @SerializedName("dynamic_ad_voice")
  private String mDynamicAdVoice = null;
  @SerializedName("effective_authorization_category")
  private EnumEffectiveAuthorizationCategory mEffectiveAuthorizationCategory = null;
  @SerializedName("effective_instagram_media_id")
  private Long mEffectiveInstagramMediaId = null;
  @SerializedName("effective_instagram_story_id")
  private Long mEffectiveInstagramStoryId = null;
  @SerializedName("effective_object_story_id")
  private String mEffectiveObjectStoryId = null;
  @SerializedName("enable_direct_install")
  private Boolean mEnableDirectInstall = null;
  @SerializedName("enable_launch_instant_app")
  private Boolean mEnableLaunchInstantApp = null;
  @SerializedName("existing_post_title")
  private String mExistingPostTitle = null;
  @SerializedName("facebook_branded_content")
  private Object mFacebookBrandedContent = null;
  @SerializedName("format_transformation_spec")
  private List<Object> mFormatTransformationSpec = null;
  @SerializedName("generative_asset_spec")
  private Object mGenerativeAssetSpec = null;
  @SerializedName("id")
  private Long mId = null;
  @SerializedName("image_crops")
  private Object mImageCrops = null;
  @SerializedName("image_hash")
  private String mImageHash = null;
  @SerializedName("image_url")
  private String mImageUrl = null;
  @SerializedName("instagram_branded_content")
  private Object mInstagramBrandedContent = null;
  @SerializedName("instagram_permalink_url")
  private String mInstagramPermalinkUrl = null;
  @SerializedName("instagram_user_id")
  private Long mInstagramUserId = null;
  @SerializedName("interactive_components_spec")
  private Object mInteractiveComponentsSpec = null;
  @SerializedName("link_og_id")
  private Long mLinkOgId = null;
  @SerializedName("link_url")
  private String mLinkUrl = null;
  @SerializedName("media_sourcing_spec")
  private Object mMediaSourcingSpec = null;
  @SerializedName("media_type")
  private EnumMediaType mMediaType = null;
  @SerializedName("name")
  private String mName = null;
  @SerializedName("object_id")
  private Long mObjectId = null;
  @SerializedName("object_store_url")
  private String mObjectStoreUrl = null;
  @SerializedName("object_story_id")
  private String mObjectStoryId = null;
  @SerializedName("object_story_spec")
  private Object mObjectStorySpec = null;
  @SerializedName("object_type")
  private EnumObjectType mObjectType = null;
  @SerializedName("object_url")
  private String mObjectUrl = null;
  @SerializedName("omnichannel_link_spec")
  private Object mOmnichannelLinkSpec = null;
  @SerializedName("page_id")
  private Long mPageId = null;
  @SerializedName("page_welcome_message")
  private String mPageWelcomeMessage = null;
  @SerializedName("photo_album_source_object_story_id")
  private String mPhotoAlbumSourceObjectStoryId = null;
  @SerializedName("place_page_set_id")
  private Long mPlacePageSetId = null;
  @SerializedName("platform_customizations")
  private Object mPlatformCustomizations = null;
  @SerializedName("playable_asset_id")
  private Long mPlayableAssetId = null;
  @SerializedName("portrait_customizations")
  private Object mPortraitCustomizations = null;
  @SerializedName("product_set_id")
  private Long mProductSetId = null;
  @SerializedName("recommender_settings")
  private Object mRecommenderSettings = null;
  @SerializedName("regional_regulation_disclaimer_spec")
  private Object mRegionalRegulationDisclaimerSpec = null;
  @SerializedName("source_facebook_post_id")
  private Long mSourceFacebookPostId = null;
  @SerializedName("source_instagram_media_id")
  private Long mSourceInstagramMediaId = null;
  @SerializedName("status")
  private String mStatus = null;
  @SerializedName("template_url")
  private String mTemplateUrl = null;
  @SerializedName("template_url_spec")
  private Object mTemplateUrlSpec = null;
  @SerializedName("threads_media_id")
  private Long mThreadsMediaId = null;
  @SerializedName("threads_user_id")
  private Long mThreadsUserId = null;
  @SerializedName("thumbnail_id")
  private Long mThumbnailId = null;
  @SerializedName("thumbnail_url")
  private String mThumbnailUrl = null;
  @SerializedName("title")
  private String mTitle = null;
  @SerializedName("uca_draft_version")
  private Long mUcaDraftVersion = null;
  @SerializedName("url_tags")
  private String mUrlTags = null;
  @SerializedName("use_page_actor_override")
  private Boolean mUsePageActorOverride = null;
  @SerializedName("video_id")
  private Long mVideoId = null;
  @SerializedName("visual_hash")
  private Long mVisualHash = null;
  protected static Gson gson = null;

  public AdCreativeGet() {
  }

  public String getId() {
    return getFieldId().toString();
  }
  public static AdCreativeGet loadJSON(String json, APIContext context, String header) {
    AdCreativeGet adCreativeGet = getGson().fromJson(json, AdCreativeGet.class);
    if (context.isDebug()) {
      JsonParser parser = new JsonParser();
      JsonElement o1 = parser.parse(json);
      JsonElement o2 = parser.parse(adCreativeGet.toString());
      if (o1.getAsJsonObject().get("__fb_trace_id__") != null) {
        o2.getAsJsonObject().add("__fb_trace_id__", o1.getAsJsonObject().get("__fb_trace_id__"));
      }
      if (!o1.equals(o2)) {
        context.log("[Warning] When parsing response, object is not consistent with JSON:");
        context.log("[JSON]" + o1);
        context.log("[Object]" + o2);
      }
    }
    adCreativeGet.context = context;
    adCreativeGet.rawValue = json;
    adCreativeGet.header = header;
    return adCreativeGet;
  }

  public static APINodeList<AdCreativeGet> parseResponse(String json, APIContext context, APIRequest request, String header) throws MalformedResponseException {
    APINodeList<AdCreativeGet> adCreativeGets = new APINodeList<AdCreativeGet>(request, json, header);
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
          adCreativeGets.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
        };
        return adCreativeGets;
      } else if (result.isJsonObject()) {
        obj = result.getAsJsonObject();
        if (obj.has("data")) {
          if (obj.has("paging")) {
            JsonObject paging = obj.get("paging").getAsJsonObject();
            if (paging.has("cursors")) {
                JsonObject cursors = paging.get("cursors").getAsJsonObject();
                String before = cursors.has("before") ? cursors.get("before").getAsString() : null;
                String after = cursors.has("after") ? cursors.get("after").getAsString() : null;
                adCreativeGets.setCursors(before, after);
            }
            String previous = paging.has("previous") ? paging.get("previous").getAsString() : null;
            String next = paging.has("next") ? paging.get("next").getAsString() : null;
            adCreativeGets.setPaging(previous, next);
            if (context.hasAppSecret()) {
              adCreativeGets.setAppSecret(context.getAppSecretProof());
            }
          }
          if (obj.get("data").isJsonArray()) {
            // Second, check if it's a JSON array with "data"
            arr = obj.get("data").getAsJsonArray();
            for (int i = 0; i < arr.size(); i++) {
              adCreativeGets.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
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
                  adCreativeGets.add(loadJSON(entry.getValue().toString(), context, header));
                }
                break;
              }
            }
            if (!isRedownload) {
              adCreativeGets.add(loadJSON(obj.toString(), context, header));
            }
          }
          return adCreativeGets;
        } else if (obj.has("images")) {
          // Fourth, check if it's a map of image objects
          obj = obj.get("images").getAsJsonObject();
          for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
              adCreativeGets.add(loadJSON(entry.getValue().toString(), context, header));
          }
          return adCreativeGets;
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
              adCreativeGets.add(loadJSON(value.toString(), context, header));
            } else {
              isIdIndexedArray = false;
              break;
            }
          }
          if (isIdIndexedArray) {
            return adCreativeGets;
          }

          // Sixth, check if it's pure JsonObject
          adCreativeGets.clear();
          adCreativeGets.add(loadJSON(json, context, header));
          return adCreativeGets;
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

  public AdCreativeGet setFieldAccountId(String value) {
    this.mAccountId = value;
    return this;
  }

  public Long getFieldActorId() {
    return mActorId;
  }

  public AdCreativeGet setFieldActorId(Long value) {
    this.mActorId = value;
    return this;
  }

  public EnumActorType getFieldActorType() {
    return mActorType;
  }

  public AdCreativeGet setFieldActorType(EnumActorType value) {
    this.mActorType = value;
    return this;
  }

  public List<Object> getFieldAdlabels() {
    return mAdlabels;
  }

  public AdCreativeGet setFieldAdlabels(List<Object> value) {
    this.mAdlabels = value;
    return this;
  }

  public EnumApplinkTreatment getFieldApplinkTreatment() {
    return mApplinkTreatment;
  }

  public AdCreativeGet setFieldApplinkTreatment(EnumApplinkTreatment value) {
    this.mApplinkTreatment = value;
    return this;
  }

  public Object getFieldAssetFeedSpec() {
    return mAssetFeedSpec;
  }

  public AdCreativeGet setFieldAssetFeedSpec(Object value) {
    this.mAssetFeedSpec = value;
    return this;
  }

  public EnumAuthorizationCategory getFieldAuthorizationCategory() {
    return mAuthorizationCategory;
  }

  public AdCreativeGet setFieldAuthorizationCategory(EnumAuthorizationCategory value) {
    this.mAuthorizationCategory = value;
    return this;
  }

  public String getFieldBody() {
    return mBody;
  }

  public AdCreativeGet setFieldBody(String value) {
    this.mBody = value;
    return this;
  }

  public Object getFieldBrandedContent() {
    return mBrandedContent;
  }

  public AdCreativeGet setFieldBrandedContent(Object value) {
    this.mBrandedContent = value;
    return this;
  }

  public EnumBrandedContentBoostingType getFieldBrandedContentBoostingType() {
    return mBrandedContentBoostingType;
  }

  public AdCreativeGet setFieldBrandedContentBoostingType(EnumBrandedContentBoostingType value) {
    this.mBrandedContentBoostingType = value;
    return this;
  }

  public Long getFieldBundleFolderId() {
    return mBundleFolderId;
  }

  public AdCreativeGet setFieldBundleFolderId(Long value) {
    this.mBundleFolderId = value;
    return this;
  }

  public Object getFieldCallToAction() {
    return mCallToAction;
  }

  public AdCreativeGet setFieldCallToAction(Object value) {
    this.mCallToAction = value;
    return this;
  }

  public EnumCallToActionType getFieldCallToActionType() {
    return mCallToActionType;
  }

  public AdCreativeGet setFieldCallToActionType(EnumCallToActionType value) {
    this.mCallToActionType = value;
    return this;
  }

  public EnumCategorizationCriteria getFieldCategorizationCriteria() {
    return mCategorizationCriteria;
  }

  public AdCreativeGet setFieldCategorizationCriteria(EnumCategorizationCriteria value) {
    this.mCategorizationCriteria = value;
    return this;
  }

  public EnumCategoryMediaSource getFieldCategoryMediaSource() {
    return mCategoryMediaSource;
  }

  public AdCreativeGet setFieldCategoryMediaSource(EnumCategoryMediaSource value) {
    this.mCategoryMediaSource = value;
    return this;
  }

  public Object getFieldContextualMultiAds() {
    return mContextualMultiAds;
  }

  public AdCreativeGet setFieldContextualMultiAds(Object value) {
    this.mContextualMultiAds = value;
    return this;
  }

  public Object getFieldCreativeReadiness() {
    return mCreativeReadiness;
  }

  public AdCreativeGet setFieldCreativeReadiness(Object value) {
    this.mCreativeReadiness = value;
    return this;
  }

  public Object getFieldCreativeSourcingSpec() {
    return mCreativeSourcingSpec;
  }

  public AdCreativeGet setFieldCreativeSourcingSpec(Object value) {
    this.mCreativeSourcingSpec = value;
    return this;
  }

  public Object getFieldDegreesOfFreedomSpec() {
    return mDegreesOfFreedomSpec;
  }

  public AdCreativeGet setFieldDegreesOfFreedomSpec(Object value) {
    this.mDegreesOfFreedomSpec = value;
    return this;
  }

  public Object getFieldDestinationSpec() {
    return mDestinationSpec;
  }

  public AdCreativeGet setFieldDestinationSpec(Object value) {
    this.mDestinationSpec = value;
    return this;
  }

  public String getFieldDynamicAdVoice() {
    return mDynamicAdVoice;
  }

  public AdCreativeGet setFieldDynamicAdVoice(String value) {
    this.mDynamicAdVoice = value;
    return this;
  }

  public EnumEffectiveAuthorizationCategory getFieldEffectiveAuthorizationCategory() {
    return mEffectiveAuthorizationCategory;
  }

  public AdCreativeGet setFieldEffectiveAuthorizationCategory(EnumEffectiveAuthorizationCategory value) {
    this.mEffectiveAuthorizationCategory = value;
    return this;
  }

  public Long getFieldEffectiveInstagramMediaId() {
    return mEffectiveInstagramMediaId;
  }

  public AdCreativeGet setFieldEffectiveInstagramMediaId(Long value) {
    this.mEffectiveInstagramMediaId = value;
    return this;
  }

  public Long getFieldEffectiveInstagramStoryId() {
    return mEffectiveInstagramStoryId;
  }

  public AdCreativeGet setFieldEffectiveInstagramStoryId(Long value) {
    this.mEffectiveInstagramStoryId = value;
    return this;
  }

  public String getFieldEffectiveObjectStoryId() {
    return mEffectiveObjectStoryId;
  }

  public AdCreativeGet setFieldEffectiveObjectStoryId(String value) {
    this.mEffectiveObjectStoryId = value;
    return this;
  }

  public Boolean getFieldEnableDirectInstall() {
    return mEnableDirectInstall;
  }

  public AdCreativeGet setFieldEnableDirectInstall(Boolean value) {
    this.mEnableDirectInstall = value;
    return this;
  }

  public Boolean getFieldEnableLaunchInstantApp() {
    return mEnableLaunchInstantApp;
  }

  public AdCreativeGet setFieldEnableLaunchInstantApp(Boolean value) {
    this.mEnableLaunchInstantApp = value;
    return this;
  }

  public String getFieldExistingPostTitle() {
    return mExistingPostTitle;
  }

  public AdCreativeGet setFieldExistingPostTitle(String value) {
    this.mExistingPostTitle = value;
    return this;
  }

  public Object getFieldFacebookBrandedContent() {
    return mFacebookBrandedContent;
  }

  public AdCreativeGet setFieldFacebookBrandedContent(Object value) {
    this.mFacebookBrandedContent = value;
    return this;
  }

  public List<Object> getFieldFormatTransformationSpec() {
    return mFormatTransformationSpec;
  }

  public AdCreativeGet setFieldFormatTransformationSpec(List<Object> value) {
    this.mFormatTransformationSpec = value;
    return this;
  }

  public Object getFieldGenerativeAssetSpec() {
    return mGenerativeAssetSpec;
  }

  public AdCreativeGet setFieldGenerativeAssetSpec(Object value) {
    this.mGenerativeAssetSpec = value;
    return this;
  }

  public Long getFieldId() {
    return mId;
  }

  public AdCreativeGet setFieldId(Long value) {
    this.mId = value;
    return this;
  }

  public Object getFieldImageCrops() {
    return mImageCrops;
  }

  public AdCreativeGet setFieldImageCrops(Object value) {
    this.mImageCrops = value;
    return this;
  }

  public String getFieldImageHash() {
    return mImageHash;
  }

  public AdCreativeGet setFieldImageHash(String value) {
    this.mImageHash = value;
    return this;
  }

  public String getFieldImageUrl() {
    return mImageUrl;
  }

  public AdCreativeGet setFieldImageUrl(String value) {
    this.mImageUrl = value;
    return this;
  }

  public Object getFieldInstagramBrandedContent() {
    return mInstagramBrandedContent;
  }

  public AdCreativeGet setFieldInstagramBrandedContent(Object value) {
    this.mInstagramBrandedContent = value;
    return this;
  }

  public String getFieldInstagramPermalinkUrl() {
    return mInstagramPermalinkUrl;
  }

  public AdCreativeGet setFieldInstagramPermalinkUrl(String value) {
    this.mInstagramPermalinkUrl = value;
    return this;
  }

  public Long getFieldInstagramUserId() {
    return mInstagramUserId;
  }

  public AdCreativeGet setFieldInstagramUserId(Long value) {
    this.mInstagramUserId = value;
    return this;
  }

  public Object getFieldInteractiveComponentsSpec() {
    return mInteractiveComponentsSpec;
  }

  public AdCreativeGet setFieldInteractiveComponentsSpec(Object value) {
    this.mInteractiveComponentsSpec = value;
    return this;
  }

  public Long getFieldLinkOgId() {
    return mLinkOgId;
  }

  public AdCreativeGet setFieldLinkOgId(Long value) {
    this.mLinkOgId = value;
    return this;
  }

  public String getFieldLinkUrl() {
    return mLinkUrl;
  }

  public AdCreativeGet setFieldLinkUrl(String value) {
    this.mLinkUrl = value;
    return this;
  }

  public Object getFieldMediaSourcingSpec() {
    return mMediaSourcingSpec;
  }

  public AdCreativeGet setFieldMediaSourcingSpec(Object value) {
    this.mMediaSourcingSpec = value;
    return this;
  }

  public EnumMediaType getFieldMediaType() {
    return mMediaType;
  }

  public AdCreativeGet setFieldMediaType(EnumMediaType value) {
    this.mMediaType = value;
    return this;
  }

  public String getFieldName() {
    return mName;
  }

  public AdCreativeGet setFieldName(String value) {
    this.mName = value;
    return this;
  }

  public Long getFieldObjectId() {
    return mObjectId;
  }

  public AdCreativeGet setFieldObjectId(Long value) {
    this.mObjectId = value;
    return this;
  }

  public String getFieldObjectStoreUrl() {
    return mObjectStoreUrl;
  }

  public AdCreativeGet setFieldObjectStoreUrl(String value) {
    this.mObjectStoreUrl = value;
    return this;
  }

  public String getFieldObjectStoryId() {
    return mObjectStoryId;
  }

  public AdCreativeGet setFieldObjectStoryId(String value) {
    this.mObjectStoryId = value;
    return this;
  }

  public Object getFieldObjectStorySpec() {
    return mObjectStorySpec;
  }

  public AdCreativeGet setFieldObjectStorySpec(Object value) {
    this.mObjectStorySpec = value;
    return this;
  }

  public EnumObjectType getFieldObjectType() {
    return mObjectType;
  }

  public AdCreativeGet setFieldObjectType(EnumObjectType value) {
    this.mObjectType = value;
    return this;
  }

  public String getFieldObjectUrl() {
    return mObjectUrl;
  }

  public AdCreativeGet setFieldObjectUrl(String value) {
    this.mObjectUrl = value;
    return this;
  }

  public Object getFieldOmnichannelLinkSpec() {
    return mOmnichannelLinkSpec;
  }

  public AdCreativeGet setFieldOmnichannelLinkSpec(Object value) {
    this.mOmnichannelLinkSpec = value;
    return this;
  }

  public Long getFieldPageId() {
    return mPageId;
  }

  public AdCreativeGet setFieldPageId(Long value) {
    this.mPageId = value;
    return this;
  }

  public String getFieldPageWelcomeMessage() {
    return mPageWelcomeMessage;
  }

  public AdCreativeGet setFieldPageWelcomeMessage(String value) {
    this.mPageWelcomeMessage = value;
    return this;
  }

  public String getFieldPhotoAlbumSourceObjectStoryId() {
    return mPhotoAlbumSourceObjectStoryId;
  }

  public AdCreativeGet setFieldPhotoAlbumSourceObjectStoryId(String value) {
    this.mPhotoAlbumSourceObjectStoryId = value;
    return this;
  }

  public Long getFieldPlacePageSetId() {
    return mPlacePageSetId;
  }

  public AdCreativeGet setFieldPlacePageSetId(Long value) {
    this.mPlacePageSetId = value;
    return this;
  }

  public Object getFieldPlatformCustomizations() {
    return mPlatformCustomizations;
  }

  public AdCreativeGet setFieldPlatformCustomizations(Object value) {
    this.mPlatformCustomizations = value;
    return this;
  }

  public Long getFieldPlayableAssetId() {
    return mPlayableAssetId;
  }

  public AdCreativeGet setFieldPlayableAssetId(Long value) {
    this.mPlayableAssetId = value;
    return this;
  }

  public Object getFieldPortraitCustomizations() {
    return mPortraitCustomizations;
  }

  public AdCreativeGet setFieldPortraitCustomizations(Object value) {
    this.mPortraitCustomizations = value;
    return this;
  }

  public Long getFieldProductSetId() {
    return mProductSetId;
  }

  public AdCreativeGet setFieldProductSetId(Long value) {
    this.mProductSetId = value;
    return this;
  }

  public Object getFieldRecommenderSettings() {
    return mRecommenderSettings;
  }

  public AdCreativeGet setFieldRecommenderSettings(Object value) {
    this.mRecommenderSettings = value;
    return this;
  }

  public Object getFieldRegionalRegulationDisclaimerSpec() {
    return mRegionalRegulationDisclaimerSpec;
  }

  public AdCreativeGet setFieldRegionalRegulationDisclaimerSpec(Object value) {
    this.mRegionalRegulationDisclaimerSpec = value;
    return this;
  }

  public Long getFieldSourceFacebookPostId() {
    return mSourceFacebookPostId;
  }

  public AdCreativeGet setFieldSourceFacebookPostId(Long value) {
    this.mSourceFacebookPostId = value;
    return this;
  }

  public Long getFieldSourceInstagramMediaId() {
    return mSourceInstagramMediaId;
  }

  public AdCreativeGet setFieldSourceInstagramMediaId(Long value) {
    this.mSourceInstagramMediaId = value;
    return this;
  }

  public String getFieldStatus() {
    return mStatus;
  }

  public AdCreativeGet setFieldStatus(String value) {
    this.mStatus = value;
    return this;
  }

  public String getFieldTemplateUrl() {
    return mTemplateUrl;
  }

  public AdCreativeGet setFieldTemplateUrl(String value) {
    this.mTemplateUrl = value;
    return this;
  }

  public Object getFieldTemplateUrlSpec() {
    return mTemplateUrlSpec;
  }

  public AdCreativeGet setFieldTemplateUrlSpec(Object value) {
    this.mTemplateUrlSpec = value;
    return this;
  }

  public Long getFieldThreadsMediaId() {
    return mThreadsMediaId;
  }

  public AdCreativeGet setFieldThreadsMediaId(Long value) {
    this.mThreadsMediaId = value;
    return this;
  }

  public Long getFieldThreadsUserId() {
    return mThreadsUserId;
  }

  public AdCreativeGet setFieldThreadsUserId(Long value) {
    this.mThreadsUserId = value;
    return this;
  }

  public Long getFieldThumbnailId() {
    return mThumbnailId;
  }

  public AdCreativeGet setFieldThumbnailId(Long value) {
    this.mThumbnailId = value;
    return this;
  }

  public String getFieldThumbnailUrl() {
    return mThumbnailUrl;
  }

  public AdCreativeGet setFieldThumbnailUrl(String value) {
    this.mThumbnailUrl = value;
    return this;
  }

  public String getFieldTitle() {
    return mTitle;
  }

  public AdCreativeGet setFieldTitle(String value) {
    this.mTitle = value;
    return this;
  }

  public Long getFieldUcaDraftVersion() {
    return mUcaDraftVersion;
  }

  public AdCreativeGet setFieldUcaDraftVersion(Long value) {
    this.mUcaDraftVersion = value;
    return this;
  }

  public String getFieldUrlTags() {
    return mUrlTags;
  }

  public AdCreativeGet setFieldUrlTags(String value) {
    this.mUrlTags = value;
    return this;
  }

  public Boolean getFieldUsePageActorOverride() {
    return mUsePageActorOverride;
  }

  public AdCreativeGet setFieldUsePageActorOverride(Boolean value) {
    this.mUsePageActorOverride = value;
    return this;
  }

  public Long getFieldVideoId() {
    return mVideoId;
  }

  public AdCreativeGet setFieldVideoId(Long value) {
    this.mVideoId = value;
    return this;
  }

  public Long getFieldVisualHash() {
    return mVisualHash;
  }

  public AdCreativeGet setFieldVisualHash(Long value) {
    this.mVisualHash = value;
    return this;
  }



  public static enum EnumActorType {
      @SerializedName("PAGE")
      VALUE_PAGE("PAGE"),
      @SerializedName("USER")
      VALUE_USER("USER"),
      ;

      private String value;

      private EnumActorType(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumApplinkTreatment {
      @SerializedName("AUTOMATIC")
      VALUE_AUTOMATIC("AUTOMATIC"),
      @SerializedName("DEEPLINK_WITH_APPSTORE_FALLBACK")
      VALUE_DEEPLINK_WITH_APPSTORE_FALLBACK("DEEPLINK_WITH_APPSTORE_FALLBACK"),
      @SerializedName("DEEPLINK_WITH_WEB_FALLBACK")
      VALUE_DEEPLINK_WITH_WEB_FALLBACK("DEEPLINK_WITH_WEB_FALLBACK"),
      @SerializedName("WEB_ONLY")
      VALUE_WEB_ONLY("WEB_ONLY"),
      ;

      private String value;

      private EnumApplinkTreatment(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumAuthorizationCategory {
      @SerializedName("NONE")
      VALUE_NONE("NONE"),
      @SerializedName("POLITICAL")
      VALUE_POLITICAL("POLITICAL"),
      @SerializedName("POLITICAL_WITH_DIGITALLY_CREATED_MEDIA")
      VALUE_POLITICAL_WITH_DIGITALLY_CREATED_MEDIA("POLITICAL_WITH_DIGITALLY_CREATED_MEDIA"),
      ;

      private String value;

      private EnumAuthorizationCategory(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumBrandedContentBoostingType {
      @SerializedName("CREATOR_BOOST")
      VALUE_CREATOR_BOOST("CREATOR_BOOST"),
      @SerializedName("CREATOR_INLINE")
      VALUE_CREATOR_INLINE("CREATOR_INLINE"),
      @SerializedName("SPONSOR_BOOST")
      VALUE_SPONSOR_BOOST("SPONSOR_BOOST"),
      @SerializedName("SPONSOR_INLINE")
      VALUE_SPONSOR_INLINE("SPONSOR_INLINE"),
      ;

      private String value;

      private EnumBrandedContentBoostingType(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumCallToActionType {
      @SerializedName("ACTIVATE_OFFER")
      VALUE_ACTIVATE_OFFER("ACTIVATE_OFFER"),
      @SerializedName("ADD_TO_CART")
      VALUE_ADD_TO_CART("ADD_TO_CART"),
      @SerializedName("APPLY_NOW")
      VALUE_APPLY_NOW("APPLY_NOW"),
      @SerializedName("ASK_ABOUT_SERVICES")
      VALUE_ASK_ABOUT_SERVICES("ASK_ABOUT_SERVICES"),
      @SerializedName("ASK_A_QUESTION")
      VALUE_ASK_A_QUESTION("ASK_A_QUESTION"),
      @SerializedName("ASK_FOR_MORE_INFO")
      VALUE_ASK_FOR_MORE_INFO("ASK_FOR_MORE_INFO"),
      @SerializedName("ASK_US")
      VALUE_ASK_US("ASK_US"),
      @SerializedName("AUDIO_CALL")
      VALUE_AUDIO_CALL("AUDIO_CALL"),
      @SerializedName("BET_NOW")
      VALUE_BET_NOW("BET_NOW"),
      @SerializedName("BLOOD_DONATIONS")
      VALUE_BLOOD_DONATIONS("BLOOD_DONATIONS"),
      @SerializedName("BOOK_A_CONSULTATION")
      VALUE_BOOK_A_CONSULTATION("BOOK_A_CONSULTATION"),
      @SerializedName("BOOK_NOW")
      VALUE_BOOK_NOW("BOOK_NOW"),
      @SerializedName("BOOK_TEST_DRIVE")
      VALUE_BOOK_TEST_DRIVE("BOOK_TEST_DRIVE"),
      @SerializedName("BOOK_TRAVEL")
      VALUE_BOOK_TRAVEL("BOOK_TRAVEL"),
      @SerializedName("BROWSE_SHOP")
      VALUE_BROWSE_SHOP("BROWSE_SHOP"),
      @SerializedName("BUY")
      VALUE_BUY("BUY"),
      @SerializedName("BUY_ACTIVITY_TICKETS")
      VALUE_BUY_ACTIVITY_TICKETS("BUY_ACTIVITY_TICKETS"),
      @SerializedName("BUY_NOW")
      VALUE_BUY_NOW("BUY_NOW"),
      @SerializedName("BUY_TICKETS")
      VALUE_BUY_TICKETS("BUY_TICKETS"),
      @SerializedName("BUY_VIA_MESSAGE")
      VALUE_BUY_VIA_MESSAGE("BUY_VIA_MESSAGE"),
      @SerializedName("CALL")
      VALUE_CALL("CALL"),
      @SerializedName("CALL_ME")
      VALUE_CALL_ME("CALL_ME"),
      @SerializedName("CALL_NOW")
      VALUE_CALL_NOW("CALL_NOW"),
      @SerializedName("CHAT_NOW")
      VALUE_CHAT_NOW("CHAT_NOW"),
      @SerializedName("CHAT_ON_WHATSAPP")
      VALUE_CHAT_ON_WHATSAPP("CHAT_ON_WHATSAPP"),
      @SerializedName("CHAT_WITH_US")
      VALUE_CHAT_WITH_US("CHAT_WITH_US"),
      @SerializedName("CHECK_AVAILABILITY")
      VALUE_CHECK_AVAILABILITY("CHECK_AVAILABILITY"),
      @SerializedName("CIVIC_ACTION")
      VALUE_CIVIC_ACTION("CIVIC_ACTION"),
      @SerializedName("CLAIM_OFFER")
      VALUE_CLAIM_OFFER("CLAIM_OFFER"),
      @SerializedName("CONFIRM")
      VALUE_CONFIRM("CONFIRM"),
      @SerializedName("CONTACT")
      VALUE_CONTACT("CONTACT"),
      @SerializedName("CONTACT_US")
      VALUE_CONTACT_US("CONTACT_US"),
      @SerializedName("DIAL_CODE")
      VALUE_DIAL_CODE("DIAL_CODE"),
      @SerializedName("DONATE")
      VALUE_DONATE("DONATE"),
      @SerializedName("DONATE_NOW")
      VALUE_DONATE_NOW("DONATE_NOW"),
      @SerializedName("DOWNLOAD")
      VALUE_DOWNLOAD("DOWNLOAD"),
      @SerializedName("EMAIL_NOW")
      VALUE_EMAIL_NOW("EMAIL_NOW"),
      @SerializedName("EVENT_RSVP")
      VALUE_EVENT_RSVP("EVENT_RSVP"),
      @SerializedName("EXPLORE_MORE")
      VALUE_EXPLORE_MORE("EXPLORE_MORE"),
      @SerializedName("FIND_A_GROUP")
      VALUE_FIND_A_GROUP("FIND_A_GROUP"),
      @SerializedName("FIND_OUT_MORE")
      VALUE_FIND_OUT_MORE("FIND_OUT_MORE"),
      @SerializedName("FIND_YOUR_GROUPS")
      VALUE_FIND_YOUR_GROUPS("FIND_YOUR_GROUPS"),
      @SerializedName("FOLLOW_NEWS_STORYLINE")
      VALUE_FOLLOW_NEWS_STORYLINE("FOLLOW_NEWS_STORYLINE"),
      @SerializedName("FOLLOW_PAGE")
      VALUE_FOLLOW_PAGE("FOLLOW_PAGE"),
      @SerializedName("FOLLOW_USER")
      VALUE_FOLLOW_USER("FOLLOW_USER"),
      @SerializedName("GET_A_QUOTE")
      VALUE_GET_A_QUOTE("GET_A_QUOTE"),
      @SerializedName("GET_DETAILS")
      VALUE_GET_DETAILS("GET_DETAILS"),
      @SerializedName("GET_DIRECTIONS")
      VALUE_GET_DIRECTIONS("GET_DIRECTIONS"),
      @SerializedName("GET_EVENT_TICKETS")
      VALUE_GET_EVENT_TICKETS("GET_EVENT_TICKETS"),
      @SerializedName("GET_IN_TOUCH")
      VALUE_GET_IN_TOUCH("GET_IN_TOUCH"),
      @SerializedName("GET_MOBILE_APP")
      VALUE_GET_MOBILE_APP("GET_MOBILE_APP"),
      @SerializedName("GET_OFFER")
      VALUE_GET_OFFER("GET_OFFER"),
      @SerializedName("GET_OFFER_VIEW")
      VALUE_GET_OFFER_VIEW("GET_OFFER_VIEW"),
      @SerializedName("GET_PROMOTIONS")
      VALUE_GET_PROMOTIONS("GET_PROMOTIONS"),
      @SerializedName("GET_QUOTE")
      VALUE_GET_QUOTE("GET_QUOTE"),
      @SerializedName("GET_SHOWTIMES")
      VALUE_GET_SHOWTIMES("GET_SHOWTIMES"),
      @SerializedName("GET_STARTED")
      VALUE_GET_STARTED("GET_STARTED"),
      @SerializedName("GIVE_FREE_RIDES")
      VALUE_GIVE_FREE_RIDES("GIVE_FREE_RIDES"),
      @SerializedName("GO_LIVE")
      VALUE_GO_LIVE("GO_LIVE"),
      @SerializedName("IMAGINE")
      VALUE_IMAGINE("IMAGINE"),
      @SerializedName("INQUIRE_NOW")
      VALUE_INQUIRE_NOW("INQUIRE_NOW"),
      @SerializedName("INSTAGRAM_MESSAGE")
      VALUE_INSTAGRAM_MESSAGE("INSTAGRAM_MESSAGE"),
      @SerializedName("INSTALL_APP")
      VALUE_INSTALL_APP("INSTALL_APP"),
      @SerializedName("INSTALL_FREE_MOBILE_APP")
      VALUE_INSTALL_FREE_MOBILE_APP("INSTALL_FREE_MOBILE_APP"),
      @SerializedName("INSTALL_MOBILE_APP")
      VALUE_INSTALL_MOBILE_APP("INSTALL_MOBILE_APP"),
      @SerializedName("INTERESTED")
      VALUE_INTERESTED("INTERESTED"),
      @SerializedName("JOBS_APPLY_NOW")
      VALUE_JOBS_APPLY_NOW("JOBS_APPLY_NOW"),
      @SerializedName("JOIN_CHANNEL")
      VALUE_JOIN_CHANNEL("JOIN_CHANNEL"),
      @SerializedName("JOIN_GROUP")
      VALUE_JOIN_GROUP("JOIN_GROUP"),
      @SerializedName("JOIN_LIVE_VIDEO")
      VALUE_JOIN_LIVE_VIDEO("JOIN_LIVE_VIDEO"),
      @SerializedName("LEARN_MORE")
      VALUE_LEARN_MORE("LEARN_MORE"),
      @SerializedName("LIKE_PAGE")
      VALUE_LIKE_PAGE("LIKE_PAGE"),
      @SerializedName("LINK_CARD")
      VALUE_LINK_CARD("LINK_CARD"),
      @SerializedName("LISTEN_MUSIC")
      VALUE_LISTEN_MUSIC("LISTEN_MUSIC"),
      @SerializedName("LISTEN_NOW")
      VALUE_LISTEN_NOW("LISTEN_NOW"),
      @SerializedName("LOYALTY_LEARN_MORE")
      VALUE_LOYALTY_LEARN_MORE("LOYALTY_LEARN_MORE"),
      @SerializedName("MAKE_AN_APPOINTMENT")
      VALUE_MAKE_AN_APPOINTMENT("MAKE_AN_APPOINTMENT"),
      @SerializedName("MESSAGE_PAGE")
      VALUE_MESSAGE_PAGE("MESSAGE_PAGE"),
      @SerializedName("MESSAGE_USER")
      VALUE_MESSAGE_USER("MESSAGE_USER"),
      @SerializedName("MISSED_CALL")
      VALUE_MISSED_CALL("MISSED_CALL"),
      @SerializedName("MOBILE_DOWNLOAD")
      VALUE_MOBILE_DOWNLOAD("MOBILE_DOWNLOAD"),
      @SerializedName("MOMENTS")
      VALUE_MOMENTS("MOMENTS"),
      @SerializedName("NO_BUTTON")
      VALUE_NO_BUTTON("NO_BUTTON"),
      @SerializedName("OPEN_INSTANT_APP")
      VALUE_OPEN_INSTANT_APP("OPEN_INSTANT_APP"),
      @SerializedName("OPEN_LINK")
      VALUE_OPEN_LINK("OPEN_LINK"),
      @SerializedName("OPEN_MESSENGER_EXT")
      VALUE_OPEN_MESSENGER_EXT("OPEN_MESSENGER_EXT"),
      @SerializedName("OPEN_MOVIES")
      VALUE_OPEN_MOVIES("OPEN_MOVIES"),
      @SerializedName("ORDER_NOW")
      VALUE_ORDER_NOW("ORDER_NOW"),
      @SerializedName("PAY_OR_REQUEST")
      VALUE_PAY_OR_REQUEST("PAY_OR_REQUEST"),
      @SerializedName("PAY_TO_ACCESS")
      VALUE_PAY_TO_ACCESS("PAY_TO_ACCESS"),
      @SerializedName("PLAY")
      VALUE_PLAY("PLAY"),
      @SerializedName("PLAY_GAME")
      VALUE_PLAY_GAME("PLAY_GAME"),
      @SerializedName("PLAY_GAME_ON_FACEBOOK")
      VALUE_PLAY_GAME_ON_FACEBOOK("PLAY_GAME_ON_FACEBOOK"),
      @SerializedName("PRE_REGISTER")
      VALUE_PRE_REGISTER("PRE_REGISTER"),
      @SerializedName("PURCHASE_GIFT_CARDS")
      VALUE_PURCHASE_GIFT_CARDS("PURCHASE_GIFT_CARDS"),
      @SerializedName("RAISE_MONEY")
      VALUE_RAISE_MONEY("RAISE_MONEY"),
      @SerializedName("RECORD_NOW")
      VALUE_RECORD_NOW("RECORD_NOW"),
      @SerializedName("REFER_FRIENDS")
      VALUE_REFER_FRIENDS("REFER_FRIENDS"),
      @SerializedName("REGISTER_NOW")
      VALUE_REGISTER_NOW("REGISTER_NOW"),
      @SerializedName("REMIND_ME")
      VALUE_REMIND_ME("REMIND_ME"),
      @SerializedName("REQUEST_TIME")
      VALUE_REQUEST_TIME("REQUEST_TIME"),
      @SerializedName("SAVE")
      VALUE_SAVE("SAVE"),
      @SerializedName("SAVE_OFFER")
      VALUE_SAVE_OFFER("SAVE_OFFER"),
      @SerializedName("SAY_THANKS")
      VALUE_SAY_THANKS("SAY_THANKS"),
      @SerializedName("SEARCH")
      VALUE_SEARCH("SEARCH"),
      @SerializedName("SEARCH_MORE")
      VALUE_SEARCH_MORE("SEARCH_MORE"),
      @SerializedName("SEE_DETAILS")
      VALUE_SEE_DETAILS("SEE_DETAILS"),
      @SerializedName("SEE_MENU")
      VALUE_SEE_MENU("SEE_MENU"),
      @SerializedName("SEE_MORE")
      VALUE_SEE_MORE("SEE_MORE"),
      @SerializedName("SEE_OFFER")
      VALUE_SEE_OFFER("SEE_OFFER"),
      @SerializedName("SEE_SHOP")
      VALUE_SEE_SHOP("SEE_SHOP"),
      @SerializedName("SELL_NOW")
      VALUE_SELL_NOW("SELL_NOW"),
      @SerializedName("SEND_A_GIFT")
      VALUE_SEND_A_GIFT("SEND_A_GIFT"),
      @SerializedName("SEND_GIFT")
      VALUE_SEND_GIFT("SEND_GIFT"),
      @SerializedName("SEND_GIFT_MONEY")
      VALUE_SEND_GIFT_MONEY("SEND_GIFT_MONEY"),
      @SerializedName("SEND_INVITES")
      VALUE_SEND_INVITES("SEND_INVITES"),
      @SerializedName("SEND_TIP")
      VALUE_SEND_TIP("SEND_TIP"),
      @SerializedName("SEND_UPDATES")
      VALUE_SEND_UPDATES("SEND_UPDATES"),
      @SerializedName("SHARE")
      VALUE_SHARE("SHARE"),
      @SerializedName("SHOP_NOW")
      VALUE_SHOP_NOW("SHOP_NOW"),
      @SerializedName("SHOP_ON_RETAILER")
      VALUE_SHOP_ON_RETAILER("SHOP_ON_RETAILER"),
      @SerializedName("SHOP_WITH_AI")
      VALUE_SHOP_WITH_AI("SHOP_WITH_AI"),
      @SerializedName("SIGN_UP")
      VALUE_SIGN_UP("SIGN_UP"),
      @SerializedName("SOTTO_SUBSCRIBE")
      VALUE_SOTTO_SUBSCRIBE("SOTTO_SUBSCRIBE"),
      @SerializedName("START_A_CHAT")
      VALUE_START_A_CHAT("START_A_CHAT"),
      @SerializedName("START_ORDER")
      VALUE_START_ORDER("START_ORDER"),
      @SerializedName("STREAM_NOW")
      VALUE_STREAM_NOW("STREAM_NOW"),
      @SerializedName("SUBSCRIBE")
      VALUE_SUBSCRIBE("SUBSCRIBE"),
      @SerializedName("SWIPE_UP_PRODUCT")
      VALUE_SWIPE_UP_PRODUCT("SWIPE_UP_PRODUCT"),
      @SerializedName("SWIPE_UP_SHOP")
      VALUE_SWIPE_UP_SHOP("SWIPE_UP_SHOP"),
      @SerializedName("TRY_DEMO")
      VALUE_TRY_DEMO("TRY_DEMO"),
      @SerializedName("TRY_IN_CAMERA")
      VALUE_TRY_IN_CAMERA("TRY_IN_CAMERA"),
      @SerializedName("TRY_IT")
      VALUE_TRY_IT("TRY_IT"),
      @SerializedName("TRY_NOW")
      VALUE_TRY_NOW("TRY_NOW"),
      @SerializedName("TRY_ON")
      VALUE_TRY_ON("TRY_ON"),
      @SerializedName("TRY_ON_WITH_AI")
      VALUE_TRY_ON_WITH_AI("TRY_ON_WITH_AI"),
      @SerializedName("UNLIKE_PAGE")
      VALUE_UNLIKE_PAGE("UNLIKE_PAGE"),
      @SerializedName("UPDATE_APP")
      VALUE_UPDATE_APP("UPDATE_APP"),
      @SerializedName("USE_APP")
      VALUE_USE_APP("USE_APP"),
      @SerializedName("USE_MOBILE_APP")
      VALUE_USE_MOBILE_APP("USE_MOBILE_APP"),
      @SerializedName("VIDEO_ANNOTATION")
      VALUE_VIDEO_ANNOTATION("VIDEO_ANNOTATION"),
      @SerializedName("VIDEO_CALL")
      VALUE_VIDEO_CALL("VIDEO_CALL"),
      @SerializedName("VIEW_CART")
      VALUE_VIEW_CART("VIEW_CART"),
      @SerializedName("VIEW_CHANNEL")
      VALUE_VIEW_CHANNEL("VIEW_CHANNEL"),
      @SerializedName("VIEW_INSTAGRAM_PROFILE")
      VALUE_VIEW_INSTAGRAM_PROFILE("VIEW_INSTAGRAM_PROFILE"),
      @SerializedName("VIEW_IN_CART")
      VALUE_VIEW_IN_CART("VIEW_IN_CART"),
      @SerializedName("VIEW_PRODUCT")
      VALUE_VIEW_PRODUCT("VIEW_PRODUCT"),
      @SerializedName("VIEW_RESUME")
      VALUE_VIEW_RESUME("VIEW_RESUME"),
      @SerializedName("VISIT_PAGES_FEED")
      VALUE_VISIT_PAGES_FEED("VISIT_PAGES_FEED"),
      @SerializedName("VISIT_PROFILE")
      VALUE_VISIT_PROFILE("VISIT_PROFILE"),
      @SerializedName("VISIT_WEBSITE")
      VALUE_VISIT_WEBSITE("VISIT_WEBSITE"),
      @SerializedName("VISIT_WORLD")
      VALUE_VISIT_WORLD("VISIT_WORLD"),
      @SerializedName("VOTE_NOW")
      VALUE_VOTE_NOW("VOTE_NOW"),
      @SerializedName("WATCH_APP_UPGRADE")
      VALUE_WATCH_APP_UPGRADE("WATCH_APP_UPGRADE"),
      @SerializedName("WATCH_LIVE_VIDEO")
      VALUE_WATCH_LIVE_VIDEO("WATCH_LIVE_VIDEO"),
      @SerializedName("WATCH_MORE")
      VALUE_WATCH_MORE("WATCH_MORE"),
      @SerializedName("WATCH_MUSIC_VIDEO")
      VALUE_WATCH_MUSIC_VIDEO("WATCH_MUSIC_VIDEO"),
      @SerializedName("WATCH_NOW")
      VALUE_WATCH_NOW("WATCH_NOW"),
      @SerializedName("WATCH_VIDEO")
      VALUE_WATCH_VIDEO("WATCH_VIDEO"),
      @SerializedName("WHATSAPP_LINK")
      VALUE_WHATSAPP_LINK("WHATSAPP_LINK"),
      @SerializedName("WHATSAPP_MESSAGE")
      VALUE_WHATSAPP_MESSAGE("WHATSAPP_MESSAGE"),
      @SerializedName("WOODHENGE_SUPPORT")
      VALUE_WOODHENGE_SUPPORT("WOODHENGE_SUPPORT"),
      ;

      private String value;

      private EnumCallToActionType(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumCategorizationCriteria {
      @SerializedName("BRAND")
      VALUE_BRAND("BRAND"),
      @SerializedName("CATEGORY")
      VALUE_CATEGORY("CATEGORY"),
      @SerializedName("PRODUCT_TYPE")
      VALUE_PRODUCT_TYPE("PRODUCT_TYPE"),
      ;

      private String value;

      private EnumCategorizationCriteria(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumCategoryMediaSource {
      @SerializedName("CATEGORY")
      VALUE_CATEGORY("CATEGORY"),
      @SerializedName("MIXED")
      VALUE_MIXED("MIXED"),
      @SerializedName("PRODUCTS_COLLAGE")
      VALUE_PRODUCTS_COLLAGE("PRODUCTS_COLLAGE"),
      @SerializedName("PRODUCTS_SLIDESHOW")
      VALUE_PRODUCTS_SLIDESHOW("PRODUCTS_SLIDESHOW"),
      ;

      private String value;

      private EnumCategoryMediaSource(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumEffectiveAuthorizationCategory {
      @SerializedName("NONE")
      VALUE_NONE("NONE"),
      @SerializedName("POLITICAL")
      VALUE_POLITICAL("POLITICAL"),
      @SerializedName("POLITICAL_WITH_DIGITALLY_CREATED_MEDIA")
      VALUE_POLITICAL_WITH_DIGITALLY_CREATED_MEDIA("POLITICAL_WITH_DIGITALLY_CREATED_MEDIA"),
      ;

      private String value;

      private EnumEffectiveAuthorizationCategory(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumMediaType {
      @SerializedName("AUTOMATIC")
      VALUE_AUTOMATIC("AUTOMATIC"),
      @SerializedName("CAROUSEL")
      VALUE_CAROUSEL("CAROUSEL"),
      @SerializedName("CAROUSEL_IMAGE")
      VALUE_CAROUSEL_IMAGE("CAROUSEL_IMAGE"),
      @SerializedName("COLLECTIONS_IMAGE")
      VALUE_COLLECTIONS_IMAGE("COLLECTIONS_IMAGE"),
      @SerializedName("COLLECTIONS_VIDEO")
      VALUE_COLLECTIONS_VIDEO("COLLECTIONS_VIDEO"),
      @SerializedName("EXISTING_INSTAGRAM_POST")
      VALUE_EXISTING_INSTAGRAM_POST("EXISTING_INSTAGRAM_POST"),
      @SerializedName("EXISTING_POST")
      VALUE_EXISTING_POST("EXISTING_POST"),
      @SerializedName("INSTAGRAM_LIVE_VIDEO")
      VALUE_INSTAGRAM_LIVE_VIDEO("INSTAGRAM_LIVE_VIDEO"),
      @SerializedName("POST")
      VALUE_POST("POST"),
      @SerializedName("SCHEDULED_LIVE_VIDEO")
      VALUE_SCHEDULED_LIVE_VIDEO("SCHEDULED_LIVE_VIDEO"),
      @SerializedName("SINGLE_IMAGE")
      VALUE_SINGLE_IMAGE("SINGLE_IMAGE"),
      @SerializedName("SINGLE_LINK")
      VALUE_SINGLE_LINK("SINGLE_LINK"),
      @SerializedName("SINGLE_PHOTO")
      VALUE_SINGLE_PHOTO("SINGLE_PHOTO"),
      @SerializedName("SINGLE_VIDEO")
      VALUE_SINGLE_VIDEO("SINGLE_VIDEO"),
      ;

      private String value;

      private EnumMediaType(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumObjectType {
      @SerializedName("APPLICATION")
      VALUE_APPLICATION("APPLICATION"),
      @SerializedName("DOMAIN")
      VALUE_DOMAIN("DOMAIN"),
      @SerializedName("EVENT")
      VALUE_EVENT("EVENT"),
      @SerializedName("INVALID")
      VALUE_INVALID("INVALID"),
      @SerializedName("OFFER")
      VALUE_OFFER("OFFER"),
      @SerializedName("PAGE")
      VALUE_PAGE("PAGE"),
      @SerializedName("PHOTO")
      VALUE_PHOTO("PHOTO"),
      @SerializedName("POST_DELETED")
      VALUE_POST_DELETED("POST_DELETED"),
      @SerializedName("PRIVACY_CHECK_FAIL")
      VALUE_PRIVACY_CHECK_FAIL("PRIVACY_CHECK_FAIL"),
      @SerializedName("SHARE")
      VALUE_SHARE("SHARE"),
      @SerializedName("STATUS")
      VALUE_STATUS("STATUS"),
      @SerializedName("STORE_ITEM")
      VALUE_STORE_ITEM("STORE_ITEM"),
      @SerializedName("VIDEO")
      VALUE_VIDEO("VIDEO"),
      ;

      private String value;

      private EnumObjectType(String value) {
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

  public AdCreativeGet copyFrom(AdCreativeGet instance) {
    this.mAccountId = instance.mAccountId;
    this.mActorId = instance.mActorId;
    this.mActorType = instance.mActorType;
    this.mAdlabels = instance.mAdlabels;
    this.mApplinkTreatment = instance.mApplinkTreatment;
    this.mAssetFeedSpec = instance.mAssetFeedSpec;
    this.mAuthorizationCategory = instance.mAuthorizationCategory;
    this.mBody = instance.mBody;
    this.mBrandedContent = instance.mBrandedContent;
    this.mBrandedContentBoostingType = instance.mBrandedContentBoostingType;
    this.mBundleFolderId = instance.mBundleFolderId;
    this.mCallToAction = instance.mCallToAction;
    this.mCallToActionType = instance.mCallToActionType;
    this.mCategorizationCriteria = instance.mCategorizationCriteria;
    this.mCategoryMediaSource = instance.mCategoryMediaSource;
    this.mContextualMultiAds = instance.mContextualMultiAds;
    this.mCreativeReadiness = instance.mCreativeReadiness;
    this.mCreativeSourcingSpec = instance.mCreativeSourcingSpec;
    this.mDegreesOfFreedomSpec = instance.mDegreesOfFreedomSpec;
    this.mDestinationSpec = instance.mDestinationSpec;
    this.mDynamicAdVoice = instance.mDynamicAdVoice;
    this.mEffectiveAuthorizationCategory = instance.mEffectiveAuthorizationCategory;
    this.mEffectiveInstagramMediaId = instance.mEffectiveInstagramMediaId;
    this.mEffectiveInstagramStoryId = instance.mEffectiveInstagramStoryId;
    this.mEffectiveObjectStoryId = instance.mEffectiveObjectStoryId;
    this.mEnableDirectInstall = instance.mEnableDirectInstall;
    this.mEnableLaunchInstantApp = instance.mEnableLaunchInstantApp;
    this.mExistingPostTitle = instance.mExistingPostTitle;
    this.mFacebookBrandedContent = instance.mFacebookBrandedContent;
    this.mFormatTransformationSpec = instance.mFormatTransformationSpec;
    this.mGenerativeAssetSpec = instance.mGenerativeAssetSpec;
    this.mId = instance.mId;
    this.mImageCrops = instance.mImageCrops;
    this.mImageHash = instance.mImageHash;
    this.mImageUrl = instance.mImageUrl;
    this.mInstagramBrandedContent = instance.mInstagramBrandedContent;
    this.mInstagramPermalinkUrl = instance.mInstagramPermalinkUrl;
    this.mInstagramUserId = instance.mInstagramUserId;
    this.mInteractiveComponentsSpec = instance.mInteractiveComponentsSpec;
    this.mLinkOgId = instance.mLinkOgId;
    this.mLinkUrl = instance.mLinkUrl;
    this.mMediaSourcingSpec = instance.mMediaSourcingSpec;
    this.mMediaType = instance.mMediaType;
    this.mName = instance.mName;
    this.mObjectId = instance.mObjectId;
    this.mObjectStoreUrl = instance.mObjectStoreUrl;
    this.mObjectStoryId = instance.mObjectStoryId;
    this.mObjectStorySpec = instance.mObjectStorySpec;
    this.mObjectType = instance.mObjectType;
    this.mObjectUrl = instance.mObjectUrl;
    this.mOmnichannelLinkSpec = instance.mOmnichannelLinkSpec;
    this.mPageId = instance.mPageId;
    this.mPageWelcomeMessage = instance.mPageWelcomeMessage;
    this.mPhotoAlbumSourceObjectStoryId = instance.mPhotoAlbumSourceObjectStoryId;
    this.mPlacePageSetId = instance.mPlacePageSetId;
    this.mPlatformCustomizations = instance.mPlatformCustomizations;
    this.mPlayableAssetId = instance.mPlayableAssetId;
    this.mPortraitCustomizations = instance.mPortraitCustomizations;
    this.mProductSetId = instance.mProductSetId;
    this.mRecommenderSettings = instance.mRecommenderSettings;
    this.mRegionalRegulationDisclaimerSpec = instance.mRegionalRegulationDisclaimerSpec;
    this.mSourceFacebookPostId = instance.mSourceFacebookPostId;
    this.mSourceInstagramMediaId = instance.mSourceInstagramMediaId;
    this.mStatus = instance.mStatus;
    this.mTemplateUrl = instance.mTemplateUrl;
    this.mTemplateUrlSpec = instance.mTemplateUrlSpec;
    this.mThreadsMediaId = instance.mThreadsMediaId;
    this.mThreadsUserId = instance.mThreadsUserId;
    this.mThumbnailId = instance.mThumbnailId;
    this.mThumbnailUrl = instance.mThumbnailUrl;
    this.mTitle = instance.mTitle;
    this.mUcaDraftVersion = instance.mUcaDraftVersion;
    this.mUrlTags = instance.mUrlTags;
    this.mUsePageActorOverride = instance.mUsePageActorOverride;
    this.mVideoId = instance.mVideoId;
    this.mVisualHash = instance.mVisualHash;
    this.context = instance.context;
    this.rawValue = instance.rawValue;
    return this;
  }

  public static APIRequest.ResponseParser<AdCreativeGet> getParser() {
    return new APIRequest.ResponseParser<AdCreativeGet>() {
      public APINodeList<AdCreativeGet> parseResponse(String response, APIContext context, APIRequest<AdCreativeGet> request, String header) throws MalformedResponseException {
        return AdCreativeGet.parseResponse(response, context, request, header);
      }
    };
  }
}
