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
public class AdAccountGet extends APINode {
  @SerializedName("account_controls")
  private Object mAccountControls = null;
  @SerializedName("account_currency_ratio_to_usd")
  private Double mAccountCurrencyRatioToUsd = null;
  @SerializedName("account_id")
  private Long mAccountId = null;
  @SerializedName("account_status")
  private Long mAccountStatus = null;
  @SerializedName("active_billing_date_preference")
  private Object mActiveBillingDatePreference = null;
  @SerializedName("activities")
  private Object mActivities = null;
  @SerializedName("ad_account_creation_request")
  private Object mAdAccountCreationRequest = null;
  @SerializedName("ad_account_promotable_objects")
  private Object mAdAccountPromotableObjects = null;
  @SerializedName("ad_column_sizes")
  private Object mAdColumnSizes = null;
  @SerializedName("ad_limits_insights")
  private Object mAdLimitsInsights = null;
  @SerializedName("ad_place_page_sets")
  private Object mAdPlacePageSets = null;
  @SerializedName("ad_quick_views")
  private Object mAdQuickViews = null;
  @SerializedName("ad_report_builder_reports")
  private Object mAdReportBuilderReports = null;
  @SerializedName("ad_studies")
  private Object mAdStudies = null;
  @SerializedName("adcreatives")
  private Object mAdcreatives = null;
  @SerializedName("addrafts")
  private Object mAddrafts = null;
  @SerializedName("adimages")
  private Object mAdimages = null;
  @SerializedName("adlabels")
  private Object mAdlabels = null;
  @SerializedName("adrules_count_by_type")
  private Object mAdrulesCountByType = null;
  @SerializedName("adrules_history")
  private Object mAdrulesHistory = null;
  @SerializedName("adrules_library")
  private Object mAdrulesLibrary = null;
  @SerializedName("ads")
  private Object mAds = null;
  @SerializedName("ads_creation_saved_state")
  private Object mAdsCreationSavedState = null;
  @SerializedName("ads_paused")
  private Boolean mAdsPaused = null;
  @SerializedName("ads_volume")
  private Object mAdsVolume = null;
  @SerializedName("adsets")
  private Object mAdsets = null;
  @SerializedName("adspaymentcycle")
  private Object mAdspaymentcycle = null;
  @SerializedName("adspixels")
  private Object mAdspixels = null;
  @SerializedName("adtrust_dsl")
  private Double mAdtrustDsl = null;
  @SerializedName("advertisable_applications")
  private Object mAdvertisableApplications = null;
  @SerializedName("advideos")
  private Object mAdvideos = null;
  @SerializedName("age")
  private Double mAge = null;
  @SerializedName("agencies")
  private Object mAgencies = null;
  @SerializedName("agency_client_declaration")
  private Object mAgencyClientDeclaration = null;
  @SerializedName("agency_fee_config")
  private Object mAgencyFeeConfig = null;
  @SerializedName("ai_generated_features_test_framework_enrolled")
  private Boolean mAiGeneratedFeaturesTestFrameworkEnrolled = null;
  @SerializedName("all_capabilities")
  private List<String> mAllCapabilities = null;
  @SerializedName("all_payment_methods")
  private Object mAllPaymentMethods = null;
  @SerializedName("am_oneshop_settings")
  private Object mAmOneshopSettings = null;
  @SerializedName("amount_spent")
  private String mAmountSpent = null;
  @SerializedName("amount_spent_history")
  private List<Object> mAmountSpentHistory = null;
  @SerializedName("applications")
  private Object mApplications = null;
  @SerializedName("applied_publisher_block_lists")
  private Object mAppliedPublisherBlockLists = null;
  @SerializedName("archived_adgroup_count")
  private Long mArchivedAdgroupCount = null;
  @SerializedName("archived_campaign_count")
  private Long mArchivedCampaignCount = null;
  @SerializedName("archived_campaign_group_count")
  private Long mArchivedCampaignGroupCount = null;
  @SerializedName("asset_feed_spec_from_existing_post")
  private Object mAssetFeedSpecFromExistingPost = null;
  @SerializedName("asset_feed_spec_from_instagram_media")
  private Object mAssetFeedSpecFromInstagramMedia = null;
  @SerializedName("asset_score")
  private Double mAssetScore = null;
  @SerializedName("assigned_partners")
  private Object mAssignedPartners = null;
  @SerializedName("assigned_users")
  private Object mAssignedUsers = null;
  @SerializedName("attr_window_deprecation_group")
  private String mAttrWindowDeprecationGroup = null;
  @SerializedName("audiencesharing_recipientaccounts")
  private Object mAudiencesharingRecipientaccounts = null;
  @SerializedName("auth_flow_for_trust_tier_state")
  private EnumAuthFlowForTrustTierState mAuthFlowForTrustTierState = null;
  @SerializedName("authorized_country_for_political_ads")
  private EnumAuthorizedCountryForPoliticalAds mAuthorizedCountryForPoliticalAds = null;
  @SerializedName("automatic_creative_optimization_test_framework_enrolled")
  private Boolean mAutomaticCreativeOptimizationTestFrameworkEnrolled = null;
  @SerializedName("average_daily_campaign_budget")
  private String mAverageDailyCampaignBudget = null;
  @SerializedName("average_daily_campaign_group_budget")
  private String mAverageDailyCampaignGroupBudget = null;
  @SerializedName("average_lifetime_campaign_budget")
  private String mAverageLifetimeCampaignBudget = null;
  @SerializedName("average_lifetime_campaign_group_budget")
  private String mAverageLifetimeCampaignGroupBudget = null;
  @SerializedName("balance")
  private String mBalance = null;
  @SerializedName("brand_safety_content_filter_levels")
  private List<String> mBrandSafetyContentFilterLevels = null;
  @SerializedName("brand_safety_excluded_topics")
  private List<EnumBrandSafetyExcludedTopics> mBrandSafetyExcludedTopics = null;
  @SerializedName("business")
  private Object mBusiness = null;
  @SerializedName("business_ad_account_requests")
  private Object mBusinessAdAccountRequests = null;
  @SerializedName("business_city")
  private String mBusinessCity = null;
  @SerializedName("business_country_code")
  private String mBusinessCountryCode = null;
  @SerializedName("business_name")
  private String mBusinessName = null;
  @SerializedName("business_restriction_reason")
  private EnumBusinessRestrictionReason mBusinessRestrictionReason = null;
  @SerializedName("business_state")
  private String mBusinessState = null;
  @SerializedName("business_street")
  private String mBusinessStreet = null;
  @SerializedName("business_street2")
  private String mBusinessStreet2 = null;
  @SerializedName("business_verification_status")
  private EnumBusinessVerificationStatus mBusinessVerificationStatus = null;
  @SerializedName("business_zip")
  private String mBusinessZip = null;
  @SerializedName("businessprojects")
  private Object mBusinessprojects = null;
  @SerializedName("call_ads_ad_account_similar_advertiser_budget_recommendation")
  private Double mCallAdsAdAccountSimilarAdvertiserBudgetRecommendation = null;
  @SerializedName("call_ads_similar_advertiser_budget_recommendation")
  private Object mCallAdsSimilarAdvertiserBudgetRecommendation = null;
  @SerializedName("campaign_group_with_cbo")
  private Object mCampaignGroupWithCbo = null;
  @SerializedName("campaigns")
  private Object mCampaigns = null;
  @SerializedName("can_bypass_fs_check")
  private Boolean mCanBypassFsCheck = null;
  @SerializedName("can_create_brand_lift_study")
  private Boolean mCanCreateBrandLiftStudy = null;
  @SerializedName("can_pay_now")
  private Boolean mCanPayNow = null;
  @SerializedName("can_remove_payment_methods")
  private Boolean mCanRemovePaymentMethods = null;
  @SerializedName("can_repay_now")
  private Boolean mCanRepayNow = null;
  @SerializedName("can_see_collaborative_ads_reporting")
  private Boolean mCanSeeCollaborativeAdsReporting = null;
  @SerializedName("capabilities")
  private List<String> mCapabilities = null;
  @SerializedName("connected_instagram_accounts")
  private Object mConnectedInstagramAccounts = null;
  @SerializedName("cpas_campaign_default_budget")
  private Long mCpasCampaignDefaultBudget = null;
  @SerializedName("cpas_campaign_group_default_budget")
  private Long mCpasCampaignGroupDefaultBudget = null;
  @SerializedName("created_time")
  private Object mCreatedTime = null;
  @SerializedName("creation_packages")
  private Object mCreationPackages = null;
  @SerializedName("creative_text_suggestions")
  private Object mCreativeTextSuggestions = null;
  @SerializedName("ctwa_smb_enforcing_days_left")
  private Long mCtwaSmbEnforcingDaysLeft = null;
  @SerializedName("ctx_advertiser_sabr_lifetime_duration_recommendation")
  private Long mCtxAdvertiserSabrLifetimeDurationRecommendation = null;
  @SerializedName("ctx_dfo_objective_defaults")
  private Object mCtxDfoObjectiveDefaults = null;
  @SerializedName("ctx_flexible_format_targeting")
  private Boolean mCtxFlexibleFormatTargeting = null;
  @SerializedName("currency")
  private String mCurrency = null;
  @SerializedName("current_addrafts")
  private Object mCurrentAddrafts = null;
  @SerializedName("current_unbilled_spend")
  private Object mCurrentUnbilledSpend = null;
  @SerializedName("current_unpaid_unrepaid_invoice")
  private Object mCurrentUnpaidUnrepaidInvoice = null;
  @SerializedName("custom_audience_info")
  private Object mCustomAudienceInfo = null;
  @SerializedName("customaudiences")
  private Object mCustomaudiences = null;
  @SerializedName("customaudiencestos")
  private Object mCustomaudiencestos = null;
  @SerializedName("customconversions")
  private Object mCustomconversions = null;
  @SerializedName("customer_po_number")
  private String mCustomerPoNumber = null;
  @SerializedName("daily_spend_limit")
  private Object mDailySpendLimit = null;
  @SerializedName("dcaf")
  private Boolean mDcaf = null;
  @SerializedName("default_dsa_beneficiary")
  private String mDefaultDsaBeneficiary = null;
  @SerializedName("default_dsa_payor")
  private String mDefaultDsaPayor = null;
  @SerializedName("default_unified_attribution_spec")
  private List<Object> mDefaultUnifiedAttributionSpec = null;
  @SerializedName("default_values")
  private Object mDefaultValues = null;
  @SerializedName("disable_reason")
  private Long mDisableReason = null;
  @SerializedName("domain_and_site_links")
  private Object mDomainAndSiteLinks = null;
  @SerializedName("dsa_recommendations")
  private Object mDsaRecommendations = null;
  @SerializedName("dynamic_probation_dsl")
  private Double mDynamicProbationDsl = null;
  @SerializedName("end_advertiser")
  private Long mEndAdvertiser = null;
  @SerializedName("end_advertiser_name")
  private String mEndAdvertiserName = null;
  @SerializedName("existing_customers")
  private List<String> mExistingCustomers = null;
  @SerializedName("expired_funding_source_details")
  private Object mExpiredFundingSourceDetails = null;
  @SerializedName("extended_credit")
  private Object mExtendedCredit = null;
  @SerializedName("extended_credit_info")
  private Object mExtendedCreditInfo = null;
  @SerializedName("extended_credit_invoice_group")
  private Object mExtendedCreditInvoiceGroup = null;
  @SerializedName("failed_delivery_checks")
  private List<Object> mFailedDeliveryChecks = null;
  @SerializedName("fb_entity")
  private Long mFbEntity = null;
  @SerializedName("flex_single_objective")
  private EnumFlexSingleObjective mFlexSingleObjective = null;
  @SerializedName("funding_source")
  private Long mFundingSource = null;
  @SerializedName("funding_source_details")
  private Object mFundingSourceDetails = null;
  @SerializedName("generatepreviews")
  private Object mGeneratepreviews = null;
  @SerializedName("has_active_skan_campaign_groups")
  private Boolean mHasActiveSkanCampaignGroups = null;
  @SerializedName("has_combo_cards_on_file")
  private Boolean mHasComboCardsOnFile = null;
  @SerializedName("has_extended_credit")
  private Boolean mHasExtendedCredit = null;
  @SerializedName("has_migrated_permissions")
  private Boolean mHasMigratedPermissions = null;
  @SerializedName("has_page_authorized_adaccount")
  private Boolean mHasPageAuthorizedAdaccount = null;
  @SerializedName("has_personal_access")
  private Boolean mHasPersonalAccess = null;
  @SerializedName("has_purchase_optimization_eligible_page")
  private Boolean mHasPurchaseOptimizationEligiblePage = null;
  @SerializedName("has_repay_processing_invoices")
  private Boolean mHasRepayProcessingInvoices = null;
  @SerializedName("has_started_purchase_optimized_ctm_ad_within_1d")
  private Boolean mHasStartedPurchaseOptimizedCtmAdWithin1d = null;
  @SerializedName("has_value_rule_set")
  private Boolean mHasValueRuleSet = null;
  @SerializedName("id")
  private String mId = null;
  @SerializedName("if_viewer_has_permission_to_advertise")
  private Boolean mIfViewerHasPermissionToAdvertise = null;
  @SerializedName("impacting_ad_studies")
  private Object mImpactingAdStudies = null;
  @SerializedName("incremental_conversion_optimization_ad_studies")
  private List<Object> mIncrementalConversionOptimizationAdStudies = null;
  @SerializedName("insights")
  private Object mInsights = null;
  @SerializedName("instagram_accounts")
  private Object mInstagramAccounts = null;
  @SerializedName("invoicing_emails")
  private Object mInvoicingEmails = null;
  @SerializedName("ios_fourteen_campaign_limits")
  private Object mIosFourteenCampaignLimits = null;
  @SerializedName("is_attribution_spec_system_default")
  private Boolean mIsAttributionSpecSystemDefault = null;
  @SerializedName("is_ba_skip_delayed_eligible")
  private Boolean mIsBaSkipDelayedEligible = null;
  @SerializedName("is_biz_migration_eligible")
  private Boolean mIsBizMigrationEligible = null;
  @SerializedName("is_br_entity_account")
  private Boolean mIsBrEntityAccount = null;
  @SerializedName("is_business_allowed_to_advertise")
  private Boolean mIsBusinessAllowedToAdvertise = null;
  @SerializedName("is_business_verification_eligible")
  private Boolean mIsBusinessVerificationEligible = null;
  @SerializedName("is_closed_by_advertiser_compromise_bot")
  private Boolean mIsClosedByAdvertiserCompromiseBot = null;
  @SerializedName("is_collaborative_ads_ad_account")
  private Boolean mIsCollaborativeAdsAdAccount = null;
  @SerializedName("is_ctx_advertiser")
  private Boolean mIsCtxAdvertiser = null;
  @SerializedName("is_direct_deals_enabled")
  private Boolean mIsDirectDealsEnabled = null;
  @SerializedName("is_disabled_umbrella")
  private Boolean mIsDisabledUmbrella = null;
  @SerializedName("is_eligible_for_advantage_plus_creative_regulated_category")
  private Boolean mIsEligibleForAdvantagePlusCreativeRegulatedCategory = null;
  @SerializedName("is_expanded_shopless_awpt_eligible")
  private Boolean mIsExpandedShoplessAwptEligible = null;
  @SerializedName("is_in_3ds_authorization_enabled_market")
  private Boolean mIsIn3dsAuthorizationEnabledMarket = null;
  @SerializedName("is_mi_billing_info_updated")
  private Boolean mIsMiBillingInfoUpdated = null;
  @SerializedName("is_mm_lite_api_enabled")
  private Boolean mIsMmLiteApiEnabled = null;
  @SerializedName("is_new_advertiser")
  private Boolean mIsNewAdvertiser = null;
  @SerializedName("is_notifications_enabled")
  private Boolean mIsNotificationsEnabled = null;
  @SerializedName("is_oba_opt_out")
  private Boolean mIsObaOptOut = null;
  @SerializedName("is_omnichannel_campaign_eligible")
  private Boolean mIsOmnichannelCampaignEligible = null;
  @SerializedName("is_pageless_ctwa_eligible")
  private Boolean mIsPagelessCtwaEligible = null;
  @SerializedName("is_pending_numbers_exposure_flag_enabled")
  private Boolean mIsPendingNumbersExposureFlagEnabled = null;
  @SerializedName("is_personal")
  private Long mIsPersonal = null;
  @SerializedName("is_pinless_debit_eligible")
  private Boolean mIsPinlessDebitEligible = null;
  @SerializedName("is_placement_soft_opt_out_enabled")
  private Boolean mIsPlacementSoftOptOutEnabled = null;
  @SerializedName("is_prepay_account")
  private Boolean mIsPrepayAccount = null;
  @SerializedName("is_retail_media_network")
  private Boolean mIsRetailMediaNetwork = null;
  @SerializedName("is_shopless_awpt_eligible")
  private Boolean mIsShoplessAwptEligible = null;
  @SerializedName("is_simplified_creation_only_111_eligible")
  private Boolean mIsSimplifiedCreationOnly111Eligible = null;
  @SerializedName("is_simplified_creation_segment_eligible")
  private Boolean mIsSimplifiedCreationSegmentEligible = null;
  @SerializedName("is_tax_id_required")
  private Boolean mIsTaxIdRequired = null;
  @SerializedName("is_tier_0")
  private Boolean mIsTier0 = null;
  @SerializedName("is_tier_0_full")
  private Boolean mIsTier0Full = null;
  @SerializedName("is_tier_1")
  private Boolean mIsTier1 = null;
  @SerializedName("is_tier_restricted")
  private Boolean mIsTierRestricted = null;
  @SerializedName("is_update_timezone_currency_too_recently")
  private Boolean mIsUpdateTimezoneCurrencyTooRecently = null;
  @SerializedName("is_user_allowed_to_advertise")
  private Boolean mIsUserAllowedToAdvertise = null;
  @SerializedName("is_using_higher_daily_flex_rate")
  private Boolean mIsUsingHigherDailyFlexRate = null;
  @SerializedName("is_value_rules_smart_default_on")
  private Boolean mIsValueRulesSmartDefaultOn = null;
  @SerializedName("is_wa_cloud_api_user")
  private Boolean mIsWaCloudApiUser = null;
  @SerializedName("is_youth_ads_pao_basic_advertiser")
  private Boolean mIsYouthAdsPaoBasicAdvertiser = null;
  @SerializedName("is_youth_ads_pao_basic_advertiser_announcement_eligible")
  private Boolean mIsYouthAdsPaoBasicAdvertiserAnnouncementEligible = null;
  @SerializedName("last_spend_time")
  private Long mLastSpendTime = null;
  @SerializedName("last_used_time")
  private Object mLastUsedTime = null;
  @SerializedName("liable_address")
  private Object mLiableAddress = null;
  @SerializedName("liable_addresses")
  private Object mLiableAddresses = null;
  @SerializedName("liable_to_org")
  private Object mLiableToOrg = null;
  @SerializedName("light_adsets")
  private Object mLightAdsets = null;
  @SerializedName("light_campaigns")
  private Object mLightCampaigns = null;
  @SerializedName("lightads")
  private Object mLightads = null;
  @SerializedName("live_video_advertiser_details")
  private Object mLiveVideoAdvertiserDetails = null;
  @SerializedName("marketing_message_enablement_status")
  private EnumMarketingMessageEnablementStatus mMarketingMessageEnablementStatus = null;
  @SerializedName("marketing_messages_settings")
  private Object mMarketingMessagesSettings = null;
  @SerializedName("max_bid")
  private Object mMaxBid = null;
  @SerializedName("max_billing_threshold")
  private Object mMaxBillingThreshold = null;
  @SerializedName("maybe_pac_internal_post_from_primary_post")
  private String mMaybePacInternalPostFromPrimaryPost = null;
  @SerializedName("media_agency")
  private Long mMediaAgency = null;
  @SerializedName("min_billing_threshold")
  private Object mMinBillingThreshold = null;
  @SerializedName("min_campaign_group_spend_cap")
  private String mMinCampaignGroupSpendCap = null;
  @SerializedName("min_daily_budget")
  private Long mMinDailyBudget = null;
  @SerializedName("min_live_boosting_budget")
  private Long mMinLiveBoostingBudget = null;
  @SerializedName("min_payment")
  private Object mMinPayment = null;
  @SerializedName("minimum_budgets")
  private Object mMinimumBudgets = null;
  @SerializedName("modeled_reporting_type")
  private EnumModeledReportingType mModeledReportingType = null;
  @SerializedName("moo_default_conversion_bid")
  private Long mMooDefaultConversionBid = null;
  @SerializedName("name")
  private String mName = null;
  @SerializedName("naming_templates")
  private Object mNamingTemplates = null;
  @SerializedName("next_bill_date")
  private Object mNextBillDate = null;
  @SerializedName("offline_conversion_data_sets")
  private Object mOfflineConversionDataSets = null;
  @SerializedName("offsite_pixels_tos_accepted")
  private Boolean mOffsitePixelsTosAccepted = null;
  @SerializedName("onbehalf_requests")
  private Object mOnbehalfRequests = null;
  @SerializedName("opportunity_score")
  private Double mOpportunityScore = null;
  @SerializedName("opportunity_score_weight")
  private Long mOpportunityScoreWeight = null;
  @SerializedName("owner")
  private Long mOwner = null;
  @SerializedName("owner_business")
  private Object mOwnerBusiness = null;
  @SerializedName("page_authorized_country_for_political_ads")
  private List<Object> mPageAuthorizedCountryForPoliticalAds = null;
  @SerializedName("pages_in_authorizations")
  private List<Object> mPagesInAuthorizations = null;
  @SerializedName("partner")
  private Long mPartner = null;
  @SerializedName("payment_options")
  private Object mPaymentOptions = null;
  @SerializedName("pending_billing_date_preference")
  private Object mPendingBillingDatePreference = null;
  @SerializedName("prepay_account_balance")
  private Object mPrepayAccountBalance = null;
  @SerializedName("promote_pages")
  private Object mPromotePages = null;
  @SerializedName("promotion_metadata")
  private List<Object> mPromotionMetadata = null;
  @SerializedName("promotion_metadata_live_crawl")
  private List<Object> mPromotionMetadataLiveCrawl = null;
  @SerializedName("publisher_block_lists")
  private Object mPublisherBlockLists = null;
  @SerializedName("reachestimate")
  private Object mReachestimate = null;
  @SerializedName("reachfrequencypredictions")
  private Object mReachfrequencypredictions = null;
  @SerializedName("recommendations")
  private Object mRecommendations = null;
  @SerializedName("rf_spec")
  private Object mRfSpec = null;
  @SerializedName("sales_segment_v2")
  private String mSalesSegmentV2 = null;
  @SerializedName("saved_audiences")
  private Object mSavedAudiences = null;
  @SerializedName("segment")
  private EnumSegment mSegment = null;
  @SerializedName("send_bill_to_address")
  private Object mSendBillToAddress = null;
  @SerializedName("send_bill_to_addresses")
  private Object mSendBillToAddresses = null;
  @SerializedName("show_checkout_experience")
  private Boolean mShowCheckoutExperience = null;
  @SerializedName("show_improved_boleto")
  private Boolean mShowImprovedBoleto = null;
  @SerializedName("show_sac_campaign_group_input")
  private Boolean mShowSacCampaignGroupInput = null;
  @SerializedName("site_links_live_crawl")
  private List<Object> mSiteLinksLiveCrawl = null;
  @SerializedName("sold_to_address")
  private Object mSoldToAddress = null;
  @SerializedName("sold_to_addresses")
  private Object mSoldToAddresses = null;
  @SerializedName("sold_to_org")
  private Object mSoldToOrg = null;
  @SerializedName("spend_cap")
  private String mSpendCap = null;
  @SerializedName("spend_cap_history")
  private List<Object> mSpendCapHistory = null;
  @SerializedName("spendlimits")
  private Object mSpendlimits = null;
  @SerializedName("stored_balance_status")
  private EnumStoredBalanceStatus mStoredBalanceStatus = null;
  @SerializedName("subscribed_apps")
  private Object mSubscribedApps = null;
  @SerializedName("targetingbrowse")
  private Object mTargetingbrowse = null;
  @SerializedName("targetingsearch")
  private Object mTargetingsearch = null;
  @SerializedName("targetingsuggestions")
  private Object mTargetingsuggestions = null;
  @SerializedName("tax_country")
  private String mTaxCountry = null;
  @SerializedName("tax_exempt")
  private Boolean mTaxExempt = null;
  @SerializedName("tax_id")
  private String mTaxId = null;
  @SerializedName("tax_id_status")
  private Long mTaxIdStatus = null;
  @SerializedName("tax_id_type")
  private String mTaxIdType = null;
  @SerializedName("timezone_id")
  private Long mTimezoneId = null;
  @SerializedName("timezone_name")
  private String mTimezoneName = null;
  @SerializedName("timezone_offset_hours_utc")
  private Double mTimezoneOffsetHoursUtc = null;
  @SerializedName("tos_accepted")
  private Map<Long, Long> mTosAccepted = null;
  @SerializedName("total_prepay_balance")
  private Object mTotalPrepayBalance = null;
  @SerializedName("tracking")
  private Object mTracking = null;
  @SerializedName("transactions")
  private Object mTransactions = null;
  @SerializedName("user_access_expire_time")
  private Long mUserAccessExpireTime = null;
  @SerializedName("user_role")
  private String mUserRole = null;
  @SerializedName("user_settings")
  private Object mUserSettings = null;
  @SerializedName("user_tasks")
  private List<String> mUserTasks = null;
  @SerializedName("user_tos_accepted")
  private Map<Long, Long> mUserTosAccepted = null;
  @SerializedName("userpermissions")
  private Object mUserpermissions = null;
  @SerializedName("users")
  private Object mUsers = null;
  @SerializedName("value_rule_set")
  private Object mValueRuleSet = null;
  @SerializedName("video_ads")
  private Object mVideoAds = null;
  @SerializedName("viewable_business")
  private Object mViewableBusiness = null;
  @SerializedName("viewable_businesses")
  private List<Object> mViewableBusinesses = null;
  protected static Gson gson = null;

  public AdAccountGet() {
  }

  public String getId() {
    return getFieldId().toString();
  }
  public static AdAccountGet loadJSON(String json, APIContext context, String header) {
    AdAccountGet adAccountGet = getGson().fromJson(json, AdAccountGet.class);
    if (context.isDebug()) {
      JsonParser parser = new JsonParser();
      JsonElement o1 = parser.parse(json);
      JsonElement o2 = parser.parse(adAccountGet.toString());
      if (o1.getAsJsonObject().get("__fb_trace_id__") != null) {
        o2.getAsJsonObject().add("__fb_trace_id__", o1.getAsJsonObject().get("__fb_trace_id__"));
      }
      if (!o1.equals(o2)) {
        context.log("[Warning] When parsing response, object is not consistent with JSON:");
        context.log("[JSON]" + o1);
        context.log("[Object]" + o2);
      }
    }
    adAccountGet.context = context;
    adAccountGet.rawValue = json;
    adAccountGet.header = header;
    return adAccountGet;
  }

  public static APINodeList<AdAccountGet> parseResponse(String json, APIContext context, APIRequest request, String header) throws MalformedResponseException {
    APINodeList<AdAccountGet> adAccountGets = new APINodeList<AdAccountGet>(request, json, header);
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
          adAccountGets.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
        };
        return adAccountGets;
      } else if (result.isJsonObject()) {
        obj = result.getAsJsonObject();
        if (obj.has("data")) {
          if (obj.has("paging")) {
            JsonObject paging = obj.get("paging").getAsJsonObject();
            if (paging.has("cursors")) {
                JsonObject cursors = paging.get("cursors").getAsJsonObject();
                String before = cursors.has("before") ? cursors.get("before").getAsString() : null;
                String after = cursors.has("after") ? cursors.get("after").getAsString() : null;
                adAccountGets.setCursors(before, after);
            }
            String previous = paging.has("previous") ? paging.get("previous").getAsString() : null;
            String next = paging.has("next") ? paging.get("next").getAsString() : null;
            adAccountGets.setPaging(previous, next);
            if (context.hasAppSecret()) {
              adAccountGets.setAppSecret(context.getAppSecretProof());
            }
          }
          if (obj.get("data").isJsonArray()) {
            // Second, check if it's a JSON array with "data"
            arr = obj.get("data").getAsJsonArray();
            for (int i = 0; i < arr.size(); i++) {
              adAccountGets.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
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
                  adAccountGets.add(loadJSON(entry.getValue().toString(), context, header));
                }
                break;
              }
            }
            if (!isRedownload) {
              adAccountGets.add(loadJSON(obj.toString(), context, header));
            }
          }
          return adAccountGets;
        } else if (obj.has("images")) {
          // Fourth, check if it's a map of image objects
          obj = obj.get("images").getAsJsonObject();
          for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
              adAccountGets.add(loadJSON(entry.getValue().toString(), context, header));
          }
          return adAccountGets;
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
              adAccountGets.add(loadJSON(value.toString(), context, header));
            } else {
              isIdIndexedArray = false;
              break;
            }
          }
          if (isIdIndexedArray) {
            return adAccountGets;
          }

          // Sixth, check if it's pure JsonObject
          adAccountGets.clear();
          adAccountGets.add(loadJSON(json, context, header));
          return adAccountGets;
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


  public Object getFieldAccountControls() {
    return mAccountControls;
  }

  public AdAccountGet setFieldAccountControls(Object value) {
    this.mAccountControls = value;
    return this;
  }

  public Double getFieldAccountCurrencyRatioToUsd() {
    return mAccountCurrencyRatioToUsd;
  }

  public AdAccountGet setFieldAccountCurrencyRatioToUsd(Double value) {
    this.mAccountCurrencyRatioToUsd = value;
    return this;
  }

  public Long getFieldAccountId() {
    return mAccountId;
  }

  public AdAccountGet setFieldAccountId(Long value) {
    this.mAccountId = value;
    return this;
  }

  public Long getFieldAccountStatus() {
    return mAccountStatus;
  }

  public AdAccountGet setFieldAccountStatus(Long value) {
    this.mAccountStatus = value;
    return this;
  }

  public Object getFieldActiveBillingDatePreference() {
    return mActiveBillingDatePreference;
  }

  public AdAccountGet setFieldActiveBillingDatePreference(Object value) {
    this.mActiveBillingDatePreference = value;
    return this;
  }

  public Object getFieldActivities() {
    return mActivities;
  }

  public AdAccountGet setFieldActivities(Object value) {
    this.mActivities = value;
    return this;
  }

  public Object getFieldAdAccountCreationRequest() {
    return mAdAccountCreationRequest;
  }

  public AdAccountGet setFieldAdAccountCreationRequest(Object value) {
    this.mAdAccountCreationRequest = value;
    return this;
  }

  public Object getFieldAdAccountPromotableObjects() {
    return mAdAccountPromotableObjects;
  }

  public AdAccountGet setFieldAdAccountPromotableObjects(Object value) {
    this.mAdAccountPromotableObjects = value;
    return this;
  }

  public Object getFieldAdColumnSizes() {
    return mAdColumnSizes;
  }

  public AdAccountGet setFieldAdColumnSizes(Object value) {
    this.mAdColumnSizes = value;
    return this;
  }

  public Object getFieldAdLimitsInsights() {
    return mAdLimitsInsights;
  }

  public AdAccountGet setFieldAdLimitsInsights(Object value) {
    this.mAdLimitsInsights = value;
    return this;
  }

  public Object getFieldAdPlacePageSets() {
    return mAdPlacePageSets;
  }

  public AdAccountGet setFieldAdPlacePageSets(Object value) {
    this.mAdPlacePageSets = value;
    return this;
  }

  public Object getFieldAdQuickViews() {
    return mAdQuickViews;
  }

  public AdAccountGet setFieldAdQuickViews(Object value) {
    this.mAdQuickViews = value;
    return this;
  }

  public Object getFieldAdReportBuilderReports() {
    return mAdReportBuilderReports;
  }

  public AdAccountGet setFieldAdReportBuilderReports(Object value) {
    this.mAdReportBuilderReports = value;
    return this;
  }

  public Object getFieldAdStudies() {
    return mAdStudies;
  }

  public AdAccountGet setFieldAdStudies(Object value) {
    this.mAdStudies = value;
    return this;
  }

  public Object getFieldAdcreatives() {
    return mAdcreatives;
  }

  public AdAccountGet setFieldAdcreatives(Object value) {
    this.mAdcreatives = value;
    return this;
  }

  public Object getFieldAddrafts() {
    return mAddrafts;
  }

  public AdAccountGet setFieldAddrafts(Object value) {
    this.mAddrafts = value;
    return this;
  }

  public Object getFieldAdimages() {
    return mAdimages;
  }

  public AdAccountGet setFieldAdimages(Object value) {
    this.mAdimages = value;
    return this;
  }

  public Object getFieldAdlabels() {
    return mAdlabels;
  }

  public AdAccountGet setFieldAdlabels(Object value) {
    this.mAdlabels = value;
    return this;
  }

  public Object getFieldAdrulesCountByType() {
    return mAdrulesCountByType;
  }

  public AdAccountGet setFieldAdrulesCountByType(Object value) {
    this.mAdrulesCountByType = value;
    return this;
  }

  public Object getFieldAdrulesHistory() {
    return mAdrulesHistory;
  }

  public AdAccountGet setFieldAdrulesHistory(Object value) {
    this.mAdrulesHistory = value;
    return this;
  }

  public Object getFieldAdrulesLibrary() {
    return mAdrulesLibrary;
  }

  public AdAccountGet setFieldAdrulesLibrary(Object value) {
    this.mAdrulesLibrary = value;
    return this;
  }

  public Object getFieldAds() {
    return mAds;
  }

  public AdAccountGet setFieldAds(Object value) {
    this.mAds = value;
    return this;
  }

  public Object getFieldAdsCreationSavedState() {
    return mAdsCreationSavedState;
  }

  public AdAccountGet setFieldAdsCreationSavedState(Object value) {
    this.mAdsCreationSavedState = value;
    return this;
  }

  public Boolean getFieldAdsPaused() {
    return mAdsPaused;
  }

  public AdAccountGet setFieldAdsPaused(Boolean value) {
    this.mAdsPaused = value;
    return this;
  }

  public Object getFieldAdsVolume() {
    return mAdsVolume;
  }

  public AdAccountGet setFieldAdsVolume(Object value) {
    this.mAdsVolume = value;
    return this;
  }

  public Object getFieldAdsets() {
    return mAdsets;
  }

  public AdAccountGet setFieldAdsets(Object value) {
    this.mAdsets = value;
    return this;
  }

  public Object getFieldAdspaymentcycle() {
    return mAdspaymentcycle;
  }

  public AdAccountGet setFieldAdspaymentcycle(Object value) {
    this.mAdspaymentcycle = value;
    return this;
  }

  public Object getFieldAdspixels() {
    return mAdspixels;
  }

  public AdAccountGet setFieldAdspixels(Object value) {
    this.mAdspixels = value;
    return this;
  }

  public Double getFieldAdtrustDsl() {
    return mAdtrustDsl;
  }

  public AdAccountGet setFieldAdtrustDsl(Double value) {
    this.mAdtrustDsl = value;
    return this;
  }

  public Object getFieldAdvertisableApplications() {
    return mAdvertisableApplications;
  }

  public AdAccountGet setFieldAdvertisableApplications(Object value) {
    this.mAdvertisableApplications = value;
    return this;
  }

  public Object getFieldAdvideos() {
    return mAdvideos;
  }

  public AdAccountGet setFieldAdvideos(Object value) {
    this.mAdvideos = value;
    return this;
  }

  public Double getFieldAge() {
    return mAge;
  }

  public AdAccountGet setFieldAge(Double value) {
    this.mAge = value;
    return this;
  }

  public Object getFieldAgencies() {
    return mAgencies;
  }

  public AdAccountGet setFieldAgencies(Object value) {
    this.mAgencies = value;
    return this;
  }

  public Object getFieldAgencyClientDeclaration() {
    return mAgencyClientDeclaration;
  }

  public AdAccountGet setFieldAgencyClientDeclaration(Object value) {
    this.mAgencyClientDeclaration = value;
    return this;
  }

  public Object getFieldAgencyFeeConfig() {
    return mAgencyFeeConfig;
  }

  public AdAccountGet setFieldAgencyFeeConfig(Object value) {
    this.mAgencyFeeConfig = value;
    return this;
  }

  public Boolean getFieldAiGeneratedFeaturesTestFrameworkEnrolled() {
    return mAiGeneratedFeaturesTestFrameworkEnrolled;
  }

  public AdAccountGet setFieldAiGeneratedFeaturesTestFrameworkEnrolled(Boolean value) {
    this.mAiGeneratedFeaturesTestFrameworkEnrolled = value;
    return this;
  }

  public List<String> getFieldAllCapabilities() {
    return mAllCapabilities;
  }

  public AdAccountGet setFieldAllCapabilities(List<String> value) {
    this.mAllCapabilities = value;
    return this;
  }

  public Object getFieldAllPaymentMethods() {
    return mAllPaymentMethods;
  }

  public AdAccountGet setFieldAllPaymentMethods(Object value) {
    this.mAllPaymentMethods = value;
    return this;
  }

  public Object getFieldAmOneshopSettings() {
    return mAmOneshopSettings;
  }

  public AdAccountGet setFieldAmOneshopSettings(Object value) {
    this.mAmOneshopSettings = value;
    return this;
  }

  public String getFieldAmountSpent() {
    return mAmountSpent;
  }

  public AdAccountGet setFieldAmountSpent(String value) {
    this.mAmountSpent = value;
    return this;
  }

  public List<Object> getFieldAmountSpentHistory() {
    return mAmountSpentHistory;
  }

  public AdAccountGet setFieldAmountSpentHistory(List<Object> value) {
    this.mAmountSpentHistory = value;
    return this;
  }

  public Object getFieldApplications() {
    return mApplications;
  }

  public AdAccountGet setFieldApplications(Object value) {
    this.mApplications = value;
    return this;
  }

  public Object getFieldAppliedPublisherBlockLists() {
    return mAppliedPublisherBlockLists;
  }

  public AdAccountGet setFieldAppliedPublisherBlockLists(Object value) {
    this.mAppliedPublisherBlockLists = value;
    return this;
  }

  public Long getFieldArchivedAdgroupCount() {
    return mArchivedAdgroupCount;
  }

  public AdAccountGet setFieldArchivedAdgroupCount(Long value) {
    this.mArchivedAdgroupCount = value;
    return this;
  }

  public Long getFieldArchivedCampaignCount() {
    return mArchivedCampaignCount;
  }

  public AdAccountGet setFieldArchivedCampaignCount(Long value) {
    this.mArchivedCampaignCount = value;
    return this;
  }

  public Long getFieldArchivedCampaignGroupCount() {
    return mArchivedCampaignGroupCount;
  }

  public AdAccountGet setFieldArchivedCampaignGroupCount(Long value) {
    this.mArchivedCampaignGroupCount = value;
    return this;
  }

  public Object getFieldAssetFeedSpecFromExistingPost() {
    return mAssetFeedSpecFromExistingPost;
  }

  public AdAccountGet setFieldAssetFeedSpecFromExistingPost(Object value) {
    this.mAssetFeedSpecFromExistingPost = value;
    return this;
  }

  public Object getFieldAssetFeedSpecFromInstagramMedia() {
    return mAssetFeedSpecFromInstagramMedia;
  }

  public AdAccountGet setFieldAssetFeedSpecFromInstagramMedia(Object value) {
    this.mAssetFeedSpecFromInstagramMedia = value;
    return this;
  }

  public Double getFieldAssetScore() {
    return mAssetScore;
  }

  public AdAccountGet setFieldAssetScore(Double value) {
    this.mAssetScore = value;
    return this;
  }

  public Object getFieldAssignedPartners() {
    return mAssignedPartners;
  }

  public AdAccountGet setFieldAssignedPartners(Object value) {
    this.mAssignedPartners = value;
    return this;
  }

  public Object getFieldAssignedUsers() {
    return mAssignedUsers;
  }

  public AdAccountGet setFieldAssignedUsers(Object value) {
    this.mAssignedUsers = value;
    return this;
  }

  public String getFieldAttrWindowDeprecationGroup() {
    return mAttrWindowDeprecationGroup;
  }

  public AdAccountGet setFieldAttrWindowDeprecationGroup(String value) {
    this.mAttrWindowDeprecationGroup = value;
    return this;
  }

  public Object getFieldAudiencesharingRecipientaccounts() {
    return mAudiencesharingRecipientaccounts;
  }

  public AdAccountGet setFieldAudiencesharingRecipientaccounts(Object value) {
    this.mAudiencesharingRecipientaccounts = value;
    return this;
  }

  public EnumAuthFlowForTrustTierState getFieldAuthFlowForTrustTierState() {
    return mAuthFlowForTrustTierState;
  }

  public AdAccountGet setFieldAuthFlowForTrustTierState(EnumAuthFlowForTrustTierState value) {
    this.mAuthFlowForTrustTierState = value;
    return this;
  }

  public EnumAuthorizedCountryForPoliticalAds getFieldAuthorizedCountryForPoliticalAds() {
    return mAuthorizedCountryForPoliticalAds;
  }

  public AdAccountGet setFieldAuthorizedCountryForPoliticalAds(EnumAuthorizedCountryForPoliticalAds value) {
    this.mAuthorizedCountryForPoliticalAds = value;
    return this;
  }

  public Boolean getFieldAutomaticCreativeOptimizationTestFrameworkEnrolled() {
    return mAutomaticCreativeOptimizationTestFrameworkEnrolled;
  }

  public AdAccountGet setFieldAutomaticCreativeOptimizationTestFrameworkEnrolled(Boolean value) {
    this.mAutomaticCreativeOptimizationTestFrameworkEnrolled = value;
    return this;
  }

  public String getFieldAverageDailyCampaignBudget() {
    return mAverageDailyCampaignBudget;
  }

  public AdAccountGet setFieldAverageDailyCampaignBudget(String value) {
    this.mAverageDailyCampaignBudget = value;
    return this;
  }

  public String getFieldAverageDailyCampaignGroupBudget() {
    return mAverageDailyCampaignGroupBudget;
  }

  public AdAccountGet setFieldAverageDailyCampaignGroupBudget(String value) {
    this.mAverageDailyCampaignGroupBudget = value;
    return this;
  }

  public String getFieldAverageLifetimeCampaignBudget() {
    return mAverageLifetimeCampaignBudget;
  }

  public AdAccountGet setFieldAverageLifetimeCampaignBudget(String value) {
    this.mAverageLifetimeCampaignBudget = value;
    return this;
  }

  public String getFieldAverageLifetimeCampaignGroupBudget() {
    return mAverageLifetimeCampaignGroupBudget;
  }

  public AdAccountGet setFieldAverageLifetimeCampaignGroupBudget(String value) {
    this.mAverageLifetimeCampaignGroupBudget = value;
    return this;
  }

  public String getFieldBalance() {
    return mBalance;
  }

  public AdAccountGet setFieldBalance(String value) {
    this.mBalance = value;
    return this;
  }

  public List<String> getFieldBrandSafetyContentFilterLevels() {
    return mBrandSafetyContentFilterLevels;
  }

  public AdAccountGet setFieldBrandSafetyContentFilterLevels(List<String> value) {
    this.mBrandSafetyContentFilterLevels = value;
    return this;
  }

  public List<EnumBrandSafetyExcludedTopics> getFieldBrandSafetyExcludedTopics() {
    return mBrandSafetyExcludedTopics;
  }

  public AdAccountGet setFieldBrandSafetyExcludedTopics(List<EnumBrandSafetyExcludedTopics> value) {
    this.mBrandSafetyExcludedTopics = value;
    return this;
  }

  public Object getFieldBusiness() {
    return mBusiness;
  }

  public AdAccountGet setFieldBusiness(Object value) {
    this.mBusiness = value;
    return this;
  }

  public Object getFieldBusinessAdAccountRequests() {
    return mBusinessAdAccountRequests;
  }

  public AdAccountGet setFieldBusinessAdAccountRequests(Object value) {
    this.mBusinessAdAccountRequests = value;
    return this;
  }

  public String getFieldBusinessCity() {
    return mBusinessCity;
  }

  public AdAccountGet setFieldBusinessCity(String value) {
    this.mBusinessCity = value;
    return this;
  }

  public String getFieldBusinessCountryCode() {
    return mBusinessCountryCode;
  }

  public AdAccountGet setFieldBusinessCountryCode(String value) {
    this.mBusinessCountryCode = value;
    return this;
  }

  public String getFieldBusinessName() {
    return mBusinessName;
  }

  public AdAccountGet setFieldBusinessName(String value) {
    this.mBusinessName = value;
    return this;
  }

  public EnumBusinessRestrictionReason getFieldBusinessRestrictionReason() {
    return mBusinessRestrictionReason;
  }

  public AdAccountGet setFieldBusinessRestrictionReason(EnumBusinessRestrictionReason value) {
    this.mBusinessRestrictionReason = value;
    return this;
  }

  public String getFieldBusinessState() {
    return mBusinessState;
  }

  public AdAccountGet setFieldBusinessState(String value) {
    this.mBusinessState = value;
    return this;
  }

  public String getFieldBusinessStreet() {
    return mBusinessStreet;
  }

  public AdAccountGet setFieldBusinessStreet(String value) {
    this.mBusinessStreet = value;
    return this;
  }

  public String getFieldBusinessStreet2() {
    return mBusinessStreet2;
  }

  public AdAccountGet setFieldBusinessStreet2(String value) {
    this.mBusinessStreet2 = value;
    return this;
  }

  public EnumBusinessVerificationStatus getFieldBusinessVerificationStatus() {
    return mBusinessVerificationStatus;
  }

  public AdAccountGet setFieldBusinessVerificationStatus(EnumBusinessVerificationStatus value) {
    this.mBusinessVerificationStatus = value;
    return this;
  }

  public String getFieldBusinessZip() {
    return mBusinessZip;
  }

  public AdAccountGet setFieldBusinessZip(String value) {
    this.mBusinessZip = value;
    return this;
  }

  public Object getFieldBusinessprojects() {
    return mBusinessprojects;
  }

  public AdAccountGet setFieldBusinessprojects(Object value) {
    this.mBusinessprojects = value;
    return this;
  }

  public Double getFieldCallAdsAdAccountSimilarAdvertiserBudgetRecommendation() {
    return mCallAdsAdAccountSimilarAdvertiserBudgetRecommendation;
  }

  public AdAccountGet setFieldCallAdsAdAccountSimilarAdvertiserBudgetRecommendation(Double value) {
    this.mCallAdsAdAccountSimilarAdvertiserBudgetRecommendation = value;
    return this;
  }

  public Object getFieldCallAdsSimilarAdvertiserBudgetRecommendation() {
    return mCallAdsSimilarAdvertiserBudgetRecommendation;
  }

  public AdAccountGet setFieldCallAdsSimilarAdvertiserBudgetRecommendation(Object value) {
    this.mCallAdsSimilarAdvertiserBudgetRecommendation = value;
    return this;
  }

  public Object getFieldCampaignGroupWithCbo() {
    return mCampaignGroupWithCbo;
  }

  public AdAccountGet setFieldCampaignGroupWithCbo(Object value) {
    this.mCampaignGroupWithCbo = value;
    return this;
  }

  public Object getFieldCampaigns() {
    return mCampaigns;
  }

  public AdAccountGet setFieldCampaigns(Object value) {
    this.mCampaigns = value;
    return this;
  }

  public Boolean getFieldCanBypassFsCheck() {
    return mCanBypassFsCheck;
  }

  public AdAccountGet setFieldCanBypassFsCheck(Boolean value) {
    this.mCanBypassFsCheck = value;
    return this;
  }

  public Boolean getFieldCanCreateBrandLiftStudy() {
    return mCanCreateBrandLiftStudy;
  }

  public AdAccountGet setFieldCanCreateBrandLiftStudy(Boolean value) {
    this.mCanCreateBrandLiftStudy = value;
    return this;
  }

  public Boolean getFieldCanPayNow() {
    return mCanPayNow;
  }

  public AdAccountGet setFieldCanPayNow(Boolean value) {
    this.mCanPayNow = value;
    return this;
  }

  public Boolean getFieldCanRemovePaymentMethods() {
    return mCanRemovePaymentMethods;
  }

  public AdAccountGet setFieldCanRemovePaymentMethods(Boolean value) {
    this.mCanRemovePaymentMethods = value;
    return this;
  }

  public Boolean getFieldCanRepayNow() {
    return mCanRepayNow;
  }

  public AdAccountGet setFieldCanRepayNow(Boolean value) {
    this.mCanRepayNow = value;
    return this;
  }

  public Boolean getFieldCanSeeCollaborativeAdsReporting() {
    return mCanSeeCollaborativeAdsReporting;
  }

  public AdAccountGet setFieldCanSeeCollaborativeAdsReporting(Boolean value) {
    this.mCanSeeCollaborativeAdsReporting = value;
    return this;
  }

  public List<String> getFieldCapabilities() {
    return mCapabilities;
  }

  public AdAccountGet setFieldCapabilities(List<String> value) {
    this.mCapabilities = value;
    return this;
  }

  public Object getFieldConnectedInstagramAccounts() {
    return mConnectedInstagramAccounts;
  }

  public AdAccountGet setFieldConnectedInstagramAccounts(Object value) {
    this.mConnectedInstagramAccounts = value;
    return this;
  }

  public Long getFieldCpasCampaignDefaultBudget() {
    return mCpasCampaignDefaultBudget;
  }

  public AdAccountGet setFieldCpasCampaignDefaultBudget(Long value) {
    this.mCpasCampaignDefaultBudget = value;
    return this;
  }

  public Long getFieldCpasCampaignGroupDefaultBudget() {
    return mCpasCampaignGroupDefaultBudget;
  }

  public AdAccountGet setFieldCpasCampaignGroupDefaultBudget(Long value) {
    this.mCpasCampaignGroupDefaultBudget = value;
    return this;
  }

  public Object getFieldCreatedTime() {
    return mCreatedTime;
  }

  public AdAccountGet setFieldCreatedTime(Object value) {
    this.mCreatedTime = value;
    return this;
  }

  public Object getFieldCreationPackages() {
    return mCreationPackages;
  }

  public AdAccountGet setFieldCreationPackages(Object value) {
    this.mCreationPackages = value;
    return this;
  }

  public Object getFieldCreativeTextSuggestions() {
    return mCreativeTextSuggestions;
  }

  public AdAccountGet setFieldCreativeTextSuggestions(Object value) {
    this.mCreativeTextSuggestions = value;
    return this;
  }

  public Long getFieldCtwaSmbEnforcingDaysLeft() {
    return mCtwaSmbEnforcingDaysLeft;
  }

  public AdAccountGet setFieldCtwaSmbEnforcingDaysLeft(Long value) {
    this.mCtwaSmbEnforcingDaysLeft = value;
    return this;
  }

  public Long getFieldCtxAdvertiserSabrLifetimeDurationRecommendation() {
    return mCtxAdvertiserSabrLifetimeDurationRecommendation;
  }

  public AdAccountGet setFieldCtxAdvertiserSabrLifetimeDurationRecommendation(Long value) {
    this.mCtxAdvertiserSabrLifetimeDurationRecommendation = value;
    return this;
  }

  public Object getFieldCtxDfoObjectiveDefaults() {
    return mCtxDfoObjectiveDefaults;
  }

  public AdAccountGet setFieldCtxDfoObjectiveDefaults(Object value) {
    this.mCtxDfoObjectiveDefaults = value;
    return this;
  }

  public Boolean getFieldCtxFlexibleFormatTargeting() {
    return mCtxFlexibleFormatTargeting;
  }

  public AdAccountGet setFieldCtxFlexibleFormatTargeting(Boolean value) {
    this.mCtxFlexibleFormatTargeting = value;
    return this;
  }

  public String getFieldCurrency() {
    return mCurrency;
  }

  public AdAccountGet setFieldCurrency(String value) {
    this.mCurrency = value;
    return this;
  }

  public Object getFieldCurrentAddrafts() {
    return mCurrentAddrafts;
  }

  public AdAccountGet setFieldCurrentAddrafts(Object value) {
    this.mCurrentAddrafts = value;
    return this;
  }

  public Object getFieldCurrentUnbilledSpend() {
    return mCurrentUnbilledSpend;
  }

  public AdAccountGet setFieldCurrentUnbilledSpend(Object value) {
    this.mCurrentUnbilledSpend = value;
    return this;
  }

  public Object getFieldCurrentUnpaidUnrepaidInvoice() {
    return mCurrentUnpaidUnrepaidInvoice;
  }

  public AdAccountGet setFieldCurrentUnpaidUnrepaidInvoice(Object value) {
    this.mCurrentUnpaidUnrepaidInvoice = value;
    return this;
  }

  public Object getFieldCustomAudienceInfo() {
    return mCustomAudienceInfo;
  }

  public AdAccountGet setFieldCustomAudienceInfo(Object value) {
    this.mCustomAudienceInfo = value;
    return this;
  }

  public Object getFieldCustomaudiences() {
    return mCustomaudiences;
  }

  public AdAccountGet setFieldCustomaudiences(Object value) {
    this.mCustomaudiences = value;
    return this;
  }

  public Object getFieldCustomaudiencestos() {
    return mCustomaudiencestos;
  }

  public AdAccountGet setFieldCustomaudiencestos(Object value) {
    this.mCustomaudiencestos = value;
    return this;
  }

  public Object getFieldCustomconversions() {
    return mCustomconversions;
  }

  public AdAccountGet setFieldCustomconversions(Object value) {
    this.mCustomconversions = value;
    return this;
  }

  public String getFieldCustomerPoNumber() {
    return mCustomerPoNumber;
  }

  public AdAccountGet setFieldCustomerPoNumber(String value) {
    this.mCustomerPoNumber = value;
    return this;
  }

  public Object getFieldDailySpendLimit() {
    return mDailySpendLimit;
  }

  public AdAccountGet setFieldDailySpendLimit(Object value) {
    this.mDailySpendLimit = value;
    return this;
  }

  public Boolean getFieldDcaf() {
    return mDcaf;
  }

  public AdAccountGet setFieldDcaf(Boolean value) {
    this.mDcaf = value;
    return this;
  }

  public String getFieldDefaultDsaBeneficiary() {
    return mDefaultDsaBeneficiary;
  }

  public AdAccountGet setFieldDefaultDsaBeneficiary(String value) {
    this.mDefaultDsaBeneficiary = value;
    return this;
  }

  public String getFieldDefaultDsaPayor() {
    return mDefaultDsaPayor;
  }

  public AdAccountGet setFieldDefaultDsaPayor(String value) {
    this.mDefaultDsaPayor = value;
    return this;
  }

  public List<Object> getFieldDefaultUnifiedAttributionSpec() {
    return mDefaultUnifiedAttributionSpec;
  }

  public AdAccountGet setFieldDefaultUnifiedAttributionSpec(List<Object> value) {
    this.mDefaultUnifiedAttributionSpec = value;
    return this;
  }

  public Object getFieldDefaultValues() {
    return mDefaultValues;
  }

  public AdAccountGet setFieldDefaultValues(Object value) {
    this.mDefaultValues = value;
    return this;
  }

  public Long getFieldDisableReason() {
    return mDisableReason;
  }

  public AdAccountGet setFieldDisableReason(Long value) {
    this.mDisableReason = value;
    return this;
  }

  public Object getFieldDomainAndSiteLinks() {
    return mDomainAndSiteLinks;
  }

  public AdAccountGet setFieldDomainAndSiteLinks(Object value) {
    this.mDomainAndSiteLinks = value;
    return this;
  }

  public Object getFieldDsaRecommendations() {
    return mDsaRecommendations;
  }

  public AdAccountGet setFieldDsaRecommendations(Object value) {
    this.mDsaRecommendations = value;
    return this;
  }

  public Double getFieldDynamicProbationDsl() {
    return mDynamicProbationDsl;
  }

  public AdAccountGet setFieldDynamicProbationDsl(Double value) {
    this.mDynamicProbationDsl = value;
    return this;
  }

  public Long getFieldEndAdvertiser() {
    return mEndAdvertiser;
  }

  public AdAccountGet setFieldEndAdvertiser(Long value) {
    this.mEndAdvertiser = value;
    return this;
  }

  public String getFieldEndAdvertiserName() {
    return mEndAdvertiserName;
  }

  public AdAccountGet setFieldEndAdvertiserName(String value) {
    this.mEndAdvertiserName = value;
    return this;
  }

  public List<String> getFieldExistingCustomers() {
    return mExistingCustomers;
  }

  public AdAccountGet setFieldExistingCustomers(List<String> value) {
    this.mExistingCustomers = value;
    return this;
  }

  public Object getFieldExpiredFundingSourceDetails() {
    return mExpiredFundingSourceDetails;
  }

  public AdAccountGet setFieldExpiredFundingSourceDetails(Object value) {
    this.mExpiredFundingSourceDetails = value;
    return this;
  }

  public Object getFieldExtendedCredit() {
    return mExtendedCredit;
  }

  public AdAccountGet setFieldExtendedCredit(Object value) {
    this.mExtendedCredit = value;
    return this;
  }

  public Object getFieldExtendedCreditInfo() {
    return mExtendedCreditInfo;
  }

  public AdAccountGet setFieldExtendedCreditInfo(Object value) {
    this.mExtendedCreditInfo = value;
    return this;
  }

  public Object getFieldExtendedCreditInvoiceGroup() {
    return mExtendedCreditInvoiceGroup;
  }

  public AdAccountGet setFieldExtendedCreditInvoiceGroup(Object value) {
    this.mExtendedCreditInvoiceGroup = value;
    return this;
  }

  public List<Object> getFieldFailedDeliveryChecks() {
    return mFailedDeliveryChecks;
  }

  public AdAccountGet setFieldFailedDeliveryChecks(List<Object> value) {
    this.mFailedDeliveryChecks = value;
    return this;
  }

  public Long getFieldFbEntity() {
    return mFbEntity;
  }

  public AdAccountGet setFieldFbEntity(Long value) {
    this.mFbEntity = value;
    return this;
  }

  public EnumFlexSingleObjective getFieldFlexSingleObjective() {
    return mFlexSingleObjective;
  }

  public AdAccountGet setFieldFlexSingleObjective(EnumFlexSingleObjective value) {
    this.mFlexSingleObjective = value;
    return this;
  }

  public Long getFieldFundingSource() {
    return mFundingSource;
  }

  public AdAccountGet setFieldFundingSource(Long value) {
    this.mFundingSource = value;
    return this;
  }

  public Object getFieldFundingSourceDetails() {
    return mFundingSourceDetails;
  }

  public AdAccountGet setFieldFundingSourceDetails(Object value) {
    this.mFundingSourceDetails = value;
    return this;
  }

  public Object getFieldGeneratepreviews() {
    return mGeneratepreviews;
  }

  public AdAccountGet setFieldGeneratepreviews(Object value) {
    this.mGeneratepreviews = value;
    return this;
  }

  public Boolean getFieldHasActiveSkanCampaignGroups() {
    return mHasActiveSkanCampaignGroups;
  }

  public AdAccountGet setFieldHasActiveSkanCampaignGroups(Boolean value) {
    this.mHasActiveSkanCampaignGroups = value;
    return this;
  }

  public Boolean getFieldHasComboCardsOnFile() {
    return mHasComboCardsOnFile;
  }

  public AdAccountGet setFieldHasComboCardsOnFile(Boolean value) {
    this.mHasComboCardsOnFile = value;
    return this;
  }

  public Boolean getFieldHasExtendedCredit() {
    return mHasExtendedCredit;
  }

  public AdAccountGet setFieldHasExtendedCredit(Boolean value) {
    this.mHasExtendedCredit = value;
    return this;
  }

  public Boolean getFieldHasMigratedPermissions() {
    return mHasMigratedPermissions;
  }

  public AdAccountGet setFieldHasMigratedPermissions(Boolean value) {
    this.mHasMigratedPermissions = value;
    return this;
  }

  public Boolean getFieldHasPageAuthorizedAdaccount() {
    return mHasPageAuthorizedAdaccount;
  }

  public AdAccountGet setFieldHasPageAuthorizedAdaccount(Boolean value) {
    this.mHasPageAuthorizedAdaccount = value;
    return this;
  }

  public Boolean getFieldHasPersonalAccess() {
    return mHasPersonalAccess;
  }

  public AdAccountGet setFieldHasPersonalAccess(Boolean value) {
    this.mHasPersonalAccess = value;
    return this;
  }

  public Boolean getFieldHasPurchaseOptimizationEligiblePage() {
    return mHasPurchaseOptimizationEligiblePage;
  }

  public AdAccountGet setFieldHasPurchaseOptimizationEligiblePage(Boolean value) {
    this.mHasPurchaseOptimizationEligiblePage = value;
    return this;
  }

  public Boolean getFieldHasRepayProcessingInvoices() {
    return mHasRepayProcessingInvoices;
  }

  public AdAccountGet setFieldHasRepayProcessingInvoices(Boolean value) {
    this.mHasRepayProcessingInvoices = value;
    return this;
  }

  public Boolean getFieldHasStartedPurchaseOptimizedCtmAdWithin1d() {
    return mHasStartedPurchaseOptimizedCtmAdWithin1d;
  }

  public AdAccountGet setFieldHasStartedPurchaseOptimizedCtmAdWithin1d(Boolean value) {
    this.mHasStartedPurchaseOptimizedCtmAdWithin1d = value;
    return this;
  }

  public Boolean getFieldHasValueRuleSet() {
    return mHasValueRuleSet;
  }

  public AdAccountGet setFieldHasValueRuleSet(Boolean value) {
    this.mHasValueRuleSet = value;
    return this;
  }

  public String getFieldId() {
    return mId;
  }

  public AdAccountGet setFieldId(String value) {
    this.mId = value;
    return this;
  }

  public Boolean getFieldIfViewerHasPermissionToAdvertise() {
    return mIfViewerHasPermissionToAdvertise;
  }

  public AdAccountGet setFieldIfViewerHasPermissionToAdvertise(Boolean value) {
    this.mIfViewerHasPermissionToAdvertise = value;
    return this;
  }

  public Object getFieldImpactingAdStudies() {
    return mImpactingAdStudies;
  }

  public AdAccountGet setFieldImpactingAdStudies(Object value) {
    this.mImpactingAdStudies = value;
    return this;
  }

  public List<Object> getFieldIncrementalConversionOptimizationAdStudies() {
    return mIncrementalConversionOptimizationAdStudies;
  }

  public AdAccountGet setFieldIncrementalConversionOptimizationAdStudies(List<Object> value) {
    this.mIncrementalConversionOptimizationAdStudies = value;
    return this;
  }

  public Object getFieldInsights() {
    return mInsights;
  }

  public AdAccountGet setFieldInsights(Object value) {
    this.mInsights = value;
    return this;
  }

  public Object getFieldInstagramAccounts() {
    return mInstagramAccounts;
  }

  public AdAccountGet setFieldInstagramAccounts(Object value) {
    this.mInstagramAccounts = value;
    return this;
  }

  public Object getFieldInvoicingEmails() {
    return mInvoicingEmails;
  }

  public AdAccountGet setFieldInvoicingEmails(Object value) {
    this.mInvoicingEmails = value;
    return this;
  }

  public Object getFieldIosFourteenCampaignLimits() {
    return mIosFourteenCampaignLimits;
  }

  public AdAccountGet setFieldIosFourteenCampaignLimits(Object value) {
    this.mIosFourteenCampaignLimits = value;
    return this;
  }

  public Boolean getFieldIsAttributionSpecSystemDefault() {
    return mIsAttributionSpecSystemDefault;
  }

  public AdAccountGet setFieldIsAttributionSpecSystemDefault(Boolean value) {
    this.mIsAttributionSpecSystemDefault = value;
    return this;
  }

  public Boolean getFieldIsBaSkipDelayedEligible() {
    return mIsBaSkipDelayedEligible;
  }

  public AdAccountGet setFieldIsBaSkipDelayedEligible(Boolean value) {
    this.mIsBaSkipDelayedEligible = value;
    return this;
  }

  public Boolean getFieldIsBizMigrationEligible() {
    return mIsBizMigrationEligible;
  }

  public AdAccountGet setFieldIsBizMigrationEligible(Boolean value) {
    this.mIsBizMigrationEligible = value;
    return this;
  }

  public Boolean getFieldIsBrEntityAccount() {
    return mIsBrEntityAccount;
  }

  public AdAccountGet setFieldIsBrEntityAccount(Boolean value) {
    this.mIsBrEntityAccount = value;
    return this;
  }

  public Boolean getFieldIsBusinessAllowedToAdvertise() {
    return mIsBusinessAllowedToAdvertise;
  }

  public AdAccountGet setFieldIsBusinessAllowedToAdvertise(Boolean value) {
    this.mIsBusinessAllowedToAdvertise = value;
    return this;
  }

  public Boolean getFieldIsBusinessVerificationEligible() {
    return mIsBusinessVerificationEligible;
  }

  public AdAccountGet setFieldIsBusinessVerificationEligible(Boolean value) {
    this.mIsBusinessVerificationEligible = value;
    return this;
  }

  public Boolean getFieldIsClosedByAdvertiserCompromiseBot() {
    return mIsClosedByAdvertiserCompromiseBot;
  }

  public AdAccountGet setFieldIsClosedByAdvertiserCompromiseBot(Boolean value) {
    this.mIsClosedByAdvertiserCompromiseBot = value;
    return this;
  }

  public Boolean getFieldIsCollaborativeAdsAdAccount() {
    return mIsCollaborativeAdsAdAccount;
  }

  public AdAccountGet setFieldIsCollaborativeAdsAdAccount(Boolean value) {
    this.mIsCollaborativeAdsAdAccount = value;
    return this;
  }

  public Boolean getFieldIsCtxAdvertiser() {
    return mIsCtxAdvertiser;
  }

  public AdAccountGet setFieldIsCtxAdvertiser(Boolean value) {
    this.mIsCtxAdvertiser = value;
    return this;
  }

  public Boolean getFieldIsDirectDealsEnabled() {
    return mIsDirectDealsEnabled;
  }

  public AdAccountGet setFieldIsDirectDealsEnabled(Boolean value) {
    this.mIsDirectDealsEnabled = value;
    return this;
  }

  public Boolean getFieldIsDisabledUmbrella() {
    return mIsDisabledUmbrella;
  }

  public AdAccountGet setFieldIsDisabledUmbrella(Boolean value) {
    this.mIsDisabledUmbrella = value;
    return this;
  }

  public Boolean getFieldIsEligibleForAdvantagePlusCreativeRegulatedCategory() {
    return mIsEligibleForAdvantagePlusCreativeRegulatedCategory;
  }

  public AdAccountGet setFieldIsEligibleForAdvantagePlusCreativeRegulatedCategory(Boolean value) {
    this.mIsEligibleForAdvantagePlusCreativeRegulatedCategory = value;
    return this;
  }

  public Boolean getFieldIsExpandedShoplessAwptEligible() {
    return mIsExpandedShoplessAwptEligible;
  }

  public AdAccountGet setFieldIsExpandedShoplessAwptEligible(Boolean value) {
    this.mIsExpandedShoplessAwptEligible = value;
    return this;
  }

  public Boolean getFieldIsIn3dsAuthorizationEnabledMarket() {
    return mIsIn3dsAuthorizationEnabledMarket;
  }

  public AdAccountGet setFieldIsIn3dsAuthorizationEnabledMarket(Boolean value) {
    this.mIsIn3dsAuthorizationEnabledMarket = value;
    return this;
  }

  public Boolean getFieldIsMiBillingInfoUpdated() {
    return mIsMiBillingInfoUpdated;
  }

  public AdAccountGet setFieldIsMiBillingInfoUpdated(Boolean value) {
    this.mIsMiBillingInfoUpdated = value;
    return this;
  }

  public Boolean getFieldIsMmLiteApiEnabled() {
    return mIsMmLiteApiEnabled;
  }

  public AdAccountGet setFieldIsMmLiteApiEnabled(Boolean value) {
    this.mIsMmLiteApiEnabled = value;
    return this;
  }

  public Boolean getFieldIsNewAdvertiser() {
    return mIsNewAdvertiser;
  }

  public AdAccountGet setFieldIsNewAdvertiser(Boolean value) {
    this.mIsNewAdvertiser = value;
    return this;
  }

  public Boolean getFieldIsNotificationsEnabled() {
    return mIsNotificationsEnabled;
  }

  public AdAccountGet setFieldIsNotificationsEnabled(Boolean value) {
    this.mIsNotificationsEnabled = value;
    return this;
  }

  public Boolean getFieldIsObaOptOut() {
    return mIsObaOptOut;
  }

  public AdAccountGet setFieldIsObaOptOut(Boolean value) {
    this.mIsObaOptOut = value;
    return this;
  }

  public Boolean getFieldIsOmnichannelCampaignEligible() {
    return mIsOmnichannelCampaignEligible;
  }

  public AdAccountGet setFieldIsOmnichannelCampaignEligible(Boolean value) {
    this.mIsOmnichannelCampaignEligible = value;
    return this;
  }

  public Boolean getFieldIsPagelessCtwaEligible() {
    return mIsPagelessCtwaEligible;
  }

  public AdAccountGet setFieldIsPagelessCtwaEligible(Boolean value) {
    this.mIsPagelessCtwaEligible = value;
    return this;
  }

  public Boolean getFieldIsPendingNumbersExposureFlagEnabled() {
    return mIsPendingNumbersExposureFlagEnabled;
  }

  public AdAccountGet setFieldIsPendingNumbersExposureFlagEnabled(Boolean value) {
    this.mIsPendingNumbersExposureFlagEnabled = value;
    return this;
  }

  public Long getFieldIsPersonal() {
    return mIsPersonal;
  }

  public AdAccountGet setFieldIsPersonal(Long value) {
    this.mIsPersonal = value;
    return this;
  }

  public Boolean getFieldIsPinlessDebitEligible() {
    return mIsPinlessDebitEligible;
  }

  public AdAccountGet setFieldIsPinlessDebitEligible(Boolean value) {
    this.mIsPinlessDebitEligible = value;
    return this;
  }

  public Boolean getFieldIsPlacementSoftOptOutEnabled() {
    return mIsPlacementSoftOptOutEnabled;
  }

  public AdAccountGet setFieldIsPlacementSoftOptOutEnabled(Boolean value) {
    this.mIsPlacementSoftOptOutEnabled = value;
    return this;
  }

  public Boolean getFieldIsPrepayAccount() {
    return mIsPrepayAccount;
  }

  public AdAccountGet setFieldIsPrepayAccount(Boolean value) {
    this.mIsPrepayAccount = value;
    return this;
  }

  public Boolean getFieldIsRetailMediaNetwork() {
    return mIsRetailMediaNetwork;
  }

  public AdAccountGet setFieldIsRetailMediaNetwork(Boolean value) {
    this.mIsRetailMediaNetwork = value;
    return this;
  }

  public Boolean getFieldIsShoplessAwptEligible() {
    return mIsShoplessAwptEligible;
  }

  public AdAccountGet setFieldIsShoplessAwptEligible(Boolean value) {
    this.mIsShoplessAwptEligible = value;
    return this;
  }

  public Boolean getFieldIsSimplifiedCreationOnly111Eligible() {
    return mIsSimplifiedCreationOnly111Eligible;
  }

  public AdAccountGet setFieldIsSimplifiedCreationOnly111Eligible(Boolean value) {
    this.mIsSimplifiedCreationOnly111Eligible = value;
    return this;
  }

  public Boolean getFieldIsSimplifiedCreationSegmentEligible() {
    return mIsSimplifiedCreationSegmentEligible;
  }

  public AdAccountGet setFieldIsSimplifiedCreationSegmentEligible(Boolean value) {
    this.mIsSimplifiedCreationSegmentEligible = value;
    return this;
  }

  public Boolean getFieldIsTaxIdRequired() {
    return mIsTaxIdRequired;
  }

  public AdAccountGet setFieldIsTaxIdRequired(Boolean value) {
    this.mIsTaxIdRequired = value;
    return this;
  }

  public Boolean getFieldIsTier0() {
    return mIsTier0;
  }

  public AdAccountGet setFieldIsTier0(Boolean value) {
    this.mIsTier0 = value;
    return this;
  }

  public Boolean getFieldIsTier0Full() {
    return mIsTier0Full;
  }

  public AdAccountGet setFieldIsTier0Full(Boolean value) {
    this.mIsTier0Full = value;
    return this;
  }

  public Boolean getFieldIsTier1() {
    return mIsTier1;
  }

  public AdAccountGet setFieldIsTier1(Boolean value) {
    this.mIsTier1 = value;
    return this;
  }

  public Boolean getFieldIsTierRestricted() {
    return mIsTierRestricted;
  }

  public AdAccountGet setFieldIsTierRestricted(Boolean value) {
    this.mIsTierRestricted = value;
    return this;
  }

  public Boolean getFieldIsUpdateTimezoneCurrencyTooRecently() {
    return mIsUpdateTimezoneCurrencyTooRecently;
  }

  public AdAccountGet setFieldIsUpdateTimezoneCurrencyTooRecently(Boolean value) {
    this.mIsUpdateTimezoneCurrencyTooRecently = value;
    return this;
  }

  public Boolean getFieldIsUserAllowedToAdvertise() {
    return mIsUserAllowedToAdvertise;
  }

  public AdAccountGet setFieldIsUserAllowedToAdvertise(Boolean value) {
    this.mIsUserAllowedToAdvertise = value;
    return this;
  }

  public Boolean getFieldIsUsingHigherDailyFlexRate() {
    return mIsUsingHigherDailyFlexRate;
  }

  public AdAccountGet setFieldIsUsingHigherDailyFlexRate(Boolean value) {
    this.mIsUsingHigherDailyFlexRate = value;
    return this;
  }

  public Boolean getFieldIsValueRulesSmartDefaultOn() {
    return mIsValueRulesSmartDefaultOn;
  }

  public AdAccountGet setFieldIsValueRulesSmartDefaultOn(Boolean value) {
    this.mIsValueRulesSmartDefaultOn = value;
    return this;
  }

  public Boolean getFieldIsWaCloudApiUser() {
    return mIsWaCloudApiUser;
  }

  public AdAccountGet setFieldIsWaCloudApiUser(Boolean value) {
    this.mIsWaCloudApiUser = value;
    return this;
  }

  public Boolean getFieldIsYouthAdsPaoBasicAdvertiser() {
    return mIsYouthAdsPaoBasicAdvertiser;
  }

  public AdAccountGet setFieldIsYouthAdsPaoBasicAdvertiser(Boolean value) {
    this.mIsYouthAdsPaoBasicAdvertiser = value;
    return this;
  }

  public Boolean getFieldIsYouthAdsPaoBasicAdvertiserAnnouncementEligible() {
    return mIsYouthAdsPaoBasicAdvertiserAnnouncementEligible;
  }

  public AdAccountGet setFieldIsYouthAdsPaoBasicAdvertiserAnnouncementEligible(Boolean value) {
    this.mIsYouthAdsPaoBasicAdvertiserAnnouncementEligible = value;
    return this;
  }

  public Long getFieldLastSpendTime() {
    return mLastSpendTime;
  }

  public AdAccountGet setFieldLastSpendTime(Long value) {
    this.mLastSpendTime = value;
    return this;
  }

  public Object getFieldLastUsedTime() {
    return mLastUsedTime;
  }

  public AdAccountGet setFieldLastUsedTime(Object value) {
    this.mLastUsedTime = value;
    return this;
  }

  public Object getFieldLiableAddress() {
    return mLiableAddress;
  }

  public AdAccountGet setFieldLiableAddress(Object value) {
    this.mLiableAddress = value;
    return this;
  }

  public Object getFieldLiableAddresses() {
    return mLiableAddresses;
  }

  public AdAccountGet setFieldLiableAddresses(Object value) {
    this.mLiableAddresses = value;
    return this;
  }

  public Object getFieldLiableToOrg() {
    return mLiableToOrg;
  }

  public AdAccountGet setFieldLiableToOrg(Object value) {
    this.mLiableToOrg = value;
    return this;
  }

  public Object getFieldLightAdsets() {
    return mLightAdsets;
  }

  public AdAccountGet setFieldLightAdsets(Object value) {
    this.mLightAdsets = value;
    return this;
  }

  public Object getFieldLightCampaigns() {
    return mLightCampaigns;
  }

  public AdAccountGet setFieldLightCampaigns(Object value) {
    this.mLightCampaigns = value;
    return this;
  }

  public Object getFieldLightads() {
    return mLightads;
  }

  public AdAccountGet setFieldLightads(Object value) {
    this.mLightads = value;
    return this;
  }

  public Object getFieldLiveVideoAdvertiserDetails() {
    return mLiveVideoAdvertiserDetails;
  }

  public AdAccountGet setFieldLiveVideoAdvertiserDetails(Object value) {
    this.mLiveVideoAdvertiserDetails = value;
    return this;
  }

  public EnumMarketingMessageEnablementStatus getFieldMarketingMessageEnablementStatus() {
    return mMarketingMessageEnablementStatus;
  }

  public AdAccountGet setFieldMarketingMessageEnablementStatus(EnumMarketingMessageEnablementStatus value) {
    this.mMarketingMessageEnablementStatus = value;
    return this;
  }

  public Object getFieldMarketingMessagesSettings() {
    return mMarketingMessagesSettings;
  }

  public AdAccountGet setFieldMarketingMessagesSettings(Object value) {
    this.mMarketingMessagesSettings = value;
    return this;
  }

  public Object getFieldMaxBid() {
    return mMaxBid;
  }

  public AdAccountGet setFieldMaxBid(Object value) {
    this.mMaxBid = value;
    return this;
  }

  public Object getFieldMaxBillingThreshold() {
    return mMaxBillingThreshold;
  }

  public AdAccountGet setFieldMaxBillingThreshold(Object value) {
    this.mMaxBillingThreshold = value;
    return this;
  }

  public String getFieldMaybePacInternalPostFromPrimaryPost() {
    return mMaybePacInternalPostFromPrimaryPost;
  }

  public AdAccountGet setFieldMaybePacInternalPostFromPrimaryPost(String value) {
    this.mMaybePacInternalPostFromPrimaryPost = value;
    return this;
  }

  public Long getFieldMediaAgency() {
    return mMediaAgency;
  }

  public AdAccountGet setFieldMediaAgency(Long value) {
    this.mMediaAgency = value;
    return this;
  }

  public Object getFieldMinBillingThreshold() {
    return mMinBillingThreshold;
  }

  public AdAccountGet setFieldMinBillingThreshold(Object value) {
    this.mMinBillingThreshold = value;
    return this;
  }

  public String getFieldMinCampaignGroupSpendCap() {
    return mMinCampaignGroupSpendCap;
  }

  public AdAccountGet setFieldMinCampaignGroupSpendCap(String value) {
    this.mMinCampaignGroupSpendCap = value;
    return this;
  }

  public Long getFieldMinDailyBudget() {
    return mMinDailyBudget;
  }

  public AdAccountGet setFieldMinDailyBudget(Long value) {
    this.mMinDailyBudget = value;
    return this;
  }

  public Long getFieldMinLiveBoostingBudget() {
    return mMinLiveBoostingBudget;
  }

  public AdAccountGet setFieldMinLiveBoostingBudget(Long value) {
    this.mMinLiveBoostingBudget = value;
    return this;
  }

  public Object getFieldMinPayment() {
    return mMinPayment;
  }

  public AdAccountGet setFieldMinPayment(Object value) {
    this.mMinPayment = value;
    return this;
  }

  public Object getFieldMinimumBudgets() {
    return mMinimumBudgets;
  }

  public AdAccountGet setFieldMinimumBudgets(Object value) {
    this.mMinimumBudgets = value;
    return this;
  }

  public EnumModeledReportingType getFieldModeledReportingType() {
    return mModeledReportingType;
  }

  public AdAccountGet setFieldModeledReportingType(EnumModeledReportingType value) {
    this.mModeledReportingType = value;
    return this;
  }

  public Long getFieldMooDefaultConversionBid() {
    return mMooDefaultConversionBid;
  }

  public AdAccountGet setFieldMooDefaultConversionBid(Long value) {
    this.mMooDefaultConversionBid = value;
    return this;
  }

  public String getFieldName() {
    return mName;
  }

  public AdAccountGet setFieldName(String value) {
    this.mName = value;
    return this;
  }

  public Object getFieldNamingTemplates() {
    return mNamingTemplates;
  }

  public AdAccountGet setFieldNamingTemplates(Object value) {
    this.mNamingTemplates = value;
    return this;
  }

  public Object getFieldNextBillDate() {
    return mNextBillDate;
  }

  public AdAccountGet setFieldNextBillDate(Object value) {
    this.mNextBillDate = value;
    return this;
  }

  public Object getFieldOfflineConversionDataSets() {
    return mOfflineConversionDataSets;
  }

  public AdAccountGet setFieldOfflineConversionDataSets(Object value) {
    this.mOfflineConversionDataSets = value;
    return this;
  }

  public Boolean getFieldOffsitePixelsTosAccepted() {
    return mOffsitePixelsTosAccepted;
  }

  public AdAccountGet setFieldOffsitePixelsTosAccepted(Boolean value) {
    this.mOffsitePixelsTosAccepted = value;
    return this;
  }

  public Object getFieldOnbehalfRequests() {
    return mOnbehalfRequests;
  }

  public AdAccountGet setFieldOnbehalfRequests(Object value) {
    this.mOnbehalfRequests = value;
    return this;
  }

  public Double getFieldOpportunityScore() {
    return mOpportunityScore;
  }

  public AdAccountGet setFieldOpportunityScore(Double value) {
    this.mOpportunityScore = value;
    return this;
  }

  public Long getFieldOpportunityScoreWeight() {
    return mOpportunityScoreWeight;
  }

  public AdAccountGet setFieldOpportunityScoreWeight(Long value) {
    this.mOpportunityScoreWeight = value;
    return this;
  }

  public Long getFieldOwner() {
    return mOwner;
  }

  public AdAccountGet setFieldOwner(Long value) {
    this.mOwner = value;
    return this;
  }

  public Object getFieldOwnerBusiness() {
    return mOwnerBusiness;
  }

  public AdAccountGet setFieldOwnerBusiness(Object value) {
    this.mOwnerBusiness = value;
    return this;
  }

  public List<Object> getFieldPageAuthorizedCountryForPoliticalAds() {
    return mPageAuthorizedCountryForPoliticalAds;
  }

  public AdAccountGet setFieldPageAuthorizedCountryForPoliticalAds(List<Object> value) {
    this.mPageAuthorizedCountryForPoliticalAds = value;
    return this;
  }

  public List<Object> getFieldPagesInAuthorizations() {
    return mPagesInAuthorizations;
  }

  public AdAccountGet setFieldPagesInAuthorizations(List<Object> value) {
    this.mPagesInAuthorizations = value;
    return this;
  }

  public Long getFieldPartner() {
    return mPartner;
  }

  public AdAccountGet setFieldPartner(Long value) {
    this.mPartner = value;
    return this;
  }

  public Object getFieldPaymentOptions() {
    return mPaymentOptions;
  }

  public AdAccountGet setFieldPaymentOptions(Object value) {
    this.mPaymentOptions = value;
    return this;
  }

  public Object getFieldPendingBillingDatePreference() {
    return mPendingBillingDatePreference;
  }

  public AdAccountGet setFieldPendingBillingDatePreference(Object value) {
    this.mPendingBillingDatePreference = value;
    return this;
  }

  public Object getFieldPrepayAccountBalance() {
    return mPrepayAccountBalance;
  }

  public AdAccountGet setFieldPrepayAccountBalance(Object value) {
    this.mPrepayAccountBalance = value;
    return this;
  }

  public Object getFieldPromotePages() {
    return mPromotePages;
  }

  public AdAccountGet setFieldPromotePages(Object value) {
    this.mPromotePages = value;
    return this;
  }

  public List<Object> getFieldPromotionMetadata() {
    return mPromotionMetadata;
  }

  public AdAccountGet setFieldPromotionMetadata(List<Object> value) {
    this.mPromotionMetadata = value;
    return this;
  }

  public List<Object> getFieldPromotionMetadataLiveCrawl() {
    return mPromotionMetadataLiveCrawl;
  }

  public AdAccountGet setFieldPromotionMetadataLiveCrawl(List<Object> value) {
    this.mPromotionMetadataLiveCrawl = value;
    return this;
  }

  public Object getFieldPublisherBlockLists() {
    return mPublisherBlockLists;
  }

  public AdAccountGet setFieldPublisherBlockLists(Object value) {
    this.mPublisherBlockLists = value;
    return this;
  }

  public Object getFieldReachestimate() {
    return mReachestimate;
  }

  public AdAccountGet setFieldReachestimate(Object value) {
    this.mReachestimate = value;
    return this;
  }

  public Object getFieldReachfrequencypredictions() {
    return mReachfrequencypredictions;
  }

  public AdAccountGet setFieldReachfrequencypredictions(Object value) {
    this.mReachfrequencypredictions = value;
    return this;
  }

  public Object getFieldRecommendations() {
    return mRecommendations;
  }

  public AdAccountGet setFieldRecommendations(Object value) {
    this.mRecommendations = value;
    return this;
  }

  public Object getFieldRfSpec() {
    return mRfSpec;
  }

  public AdAccountGet setFieldRfSpec(Object value) {
    this.mRfSpec = value;
    return this;
  }

  public String getFieldSalesSegmentV2() {
    return mSalesSegmentV2;
  }

  public AdAccountGet setFieldSalesSegmentV2(String value) {
    this.mSalesSegmentV2 = value;
    return this;
  }

  public Object getFieldSavedAudiences() {
    return mSavedAudiences;
  }

  public AdAccountGet setFieldSavedAudiences(Object value) {
    this.mSavedAudiences = value;
    return this;
  }

  public EnumSegment getFieldSegment() {
    return mSegment;
  }

  public AdAccountGet setFieldSegment(EnumSegment value) {
    this.mSegment = value;
    return this;
  }

  public Object getFieldSendBillToAddress() {
    return mSendBillToAddress;
  }

  public AdAccountGet setFieldSendBillToAddress(Object value) {
    this.mSendBillToAddress = value;
    return this;
  }

  public Object getFieldSendBillToAddresses() {
    return mSendBillToAddresses;
  }

  public AdAccountGet setFieldSendBillToAddresses(Object value) {
    this.mSendBillToAddresses = value;
    return this;
  }

  public Boolean getFieldShowCheckoutExperience() {
    return mShowCheckoutExperience;
  }

  public AdAccountGet setFieldShowCheckoutExperience(Boolean value) {
    this.mShowCheckoutExperience = value;
    return this;
  }

  public Boolean getFieldShowImprovedBoleto() {
    return mShowImprovedBoleto;
  }

  public AdAccountGet setFieldShowImprovedBoleto(Boolean value) {
    this.mShowImprovedBoleto = value;
    return this;
  }

  public Boolean getFieldShowSacCampaignGroupInput() {
    return mShowSacCampaignGroupInput;
  }

  public AdAccountGet setFieldShowSacCampaignGroupInput(Boolean value) {
    this.mShowSacCampaignGroupInput = value;
    return this;
  }

  public List<Object> getFieldSiteLinksLiveCrawl() {
    return mSiteLinksLiveCrawl;
  }

  public AdAccountGet setFieldSiteLinksLiveCrawl(List<Object> value) {
    this.mSiteLinksLiveCrawl = value;
    return this;
  }

  public Object getFieldSoldToAddress() {
    return mSoldToAddress;
  }

  public AdAccountGet setFieldSoldToAddress(Object value) {
    this.mSoldToAddress = value;
    return this;
  }

  public Object getFieldSoldToAddresses() {
    return mSoldToAddresses;
  }

  public AdAccountGet setFieldSoldToAddresses(Object value) {
    this.mSoldToAddresses = value;
    return this;
  }

  public Object getFieldSoldToOrg() {
    return mSoldToOrg;
  }

  public AdAccountGet setFieldSoldToOrg(Object value) {
    this.mSoldToOrg = value;
    return this;
  }

  public String getFieldSpendCap() {
    return mSpendCap;
  }

  public AdAccountGet setFieldSpendCap(String value) {
    this.mSpendCap = value;
    return this;
  }

  public List<Object> getFieldSpendCapHistory() {
    return mSpendCapHistory;
  }

  public AdAccountGet setFieldSpendCapHistory(List<Object> value) {
    this.mSpendCapHistory = value;
    return this;
  }

  public Object getFieldSpendlimits() {
    return mSpendlimits;
  }

  public AdAccountGet setFieldSpendlimits(Object value) {
    this.mSpendlimits = value;
    return this;
  }

  public EnumStoredBalanceStatus getFieldStoredBalanceStatus() {
    return mStoredBalanceStatus;
  }

  public AdAccountGet setFieldStoredBalanceStatus(EnumStoredBalanceStatus value) {
    this.mStoredBalanceStatus = value;
    return this;
  }

  public Object getFieldSubscribedApps() {
    return mSubscribedApps;
  }

  public AdAccountGet setFieldSubscribedApps(Object value) {
    this.mSubscribedApps = value;
    return this;
  }

  public Object getFieldTargetingbrowse() {
    return mTargetingbrowse;
  }

  public AdAccountGet setFieldTargetingbrowse(Object value) {
    this.mTargetingbrowse = value;
    return this;
  }

  public Object getFieldTargetingsearch() {
    return mTargetingsearch;
  }

  public AdAccountGet setFieldTargetingsearch(Object value) {
    this.mTargetingsearch = value;
    return this;
  }

  public Object getFieldTargetingsuggestions() {
    return mTargetingsuggestions;
  }

  public AdAccountGet setFieldTargetingsuggestions(Object value) {
    this.mTargetingsuggestions = value;
    return this;
  }

  public String getFieldTaxCountry() {
    return mTaxCountry;
  }

  public AdAccountGet setFieldTaxCountry(String value) {
    this.mTaxCountry = value;
    return this;
  }

  public Boolean getFieldTaxExempt() {
    return mTaxExempt;
  }

  public AdAccountGet setFieldTaxExempt(Boolean value) {
    this.mTaxExempt = value;
    return this;
  }

  public String getFieldTaxId() {
    return mTaxId;
  }

  public AdAccountGet setFieldTaxId(String value) {
    this.mTaxId = value;
    return this;
  }

  public Long getFieldTaxIdStatus() {
    return mTaxIdStatus;
  }

  public AdAccountGet setFieldTaxIdStatus(Long value) {
    this.mTaxIdStatus = value;
    return this;
  }

  public String getFieldTaxIdType() {
    return mTaxIdType;
  }

  public AdAccountGet setFieldTaxIdType(String value) {
    this.mTaxIdType = value;
    return this;
  }

  public Long getFieldTimezoneId() {
    return mTimezoneId;
  }

  public AdAccountGet setFieldTimezoneId(Long value) {
    this.mTimezoneId = value;
    return this;
  }

  public String getFieldTimezoneName() {
    return mTimezoneName;
  }

  public AdAccountGet setFieldTimezoneName(String value) {
    this.mTimezoneName = value;
    return this;
  }

  public Double getFieldTimezoneOffsetHoursUtc() {
    return mTimezoneOffsetHoursUtc;
  }

  public AdAccountGet setFieldTimezoneOffsetHoursUtc(Double value) {
    this.mTimezoneOffsetHoursUtc = value;
    return this;
  }

  public Map<Long, Long> getFieldTosAccepted() {
    return mTosAccepted;
  }

  public AdAccountGet setFieldTosAccepted(Map<Long, Long> value) {
    this.mTosAccepted = value;
    return this;
  }

  public Object getFieldTotalPrepayBalance() {
    return mTotalPrepayBalance;
  }

  public AdAccountGet setFieldTotalPrepayBalance(Object value) {
    this.mTotalPrepayBalance = value;
    return this;
  }

  public Object getFieldTracking() {
    return mTracking;
  }

  public AdAccountGet setFieldTracking(Object value) {
    this.mTracking = value;
    return this;
  }

  public Object getFieldTransactions() {
    return mTransactions;
  }

  public AdAccountGet setFieldTransactions(Object value) {
    this.mTransactions = value;
    return this;
  }

  public Long getFieldUserAccessExpireTime() {
    return mUserAccessExpireTime;
  }

  public AdAccountGet setFieldUserAccessExpireTime(Long value) {
    this.mUserAccessExpireTime = value;
    return this;
  }

  public String getFieldUserRole() {
    return mUserRole;
  }

  public AdAccountGet setFieldUserRole(String value) {
    this.mUserRole = value;
    return this;
  }

  public Object getFieldUserSettings() {
    return mUserSettings;
  }

  public AdAccountGet setFieldUserSettings(Object value) {
    this.mUserSettings = value;
    return this;
  }

  public List<String> getFieldUserTasks() {
    return mUserTasks;
  }

  public AdAccountGet setFieldUserTasks(List<String> value) {
    this.mUserTasks = value;
    return this;
  }

  public Map<Long, Long> getFieldUserTosAccepted() {
    return mUserTosAccepted;
  }

  public AdAccountGet setFieldUserTosAccepted(Map<Long, Long> value) {
    this.mUserTosAccepted = value;
    return this;
  }

  public Object getFieldUserpermissions() {
    return mUserpermissions;
  }

  public AdAccountGet setFieldUserpermissions(Object value) {
    this.mUserpermissions = value;
    return this;
  }

  public Object getFieldUsers() {
    return mUsers;
  }

  public AdAccountGet setFieldUsers(Object value) {
    this.mUsers = value;
    return this;
  }

  public Object getFieldValueRuleSet() {
    return mValueRuleSet;
  }

  public AdAccountGet setFieldValueRuleSet(Object value) {
    this.mValueRuleSet = value;
    return this;
  }

  public Object getFieldVideoAds() {
    return mVideoAds;
  }

  public AdAccountGet setFieldVideoAds(Object value) {
    this.mVideoAds = value;
    return this;
  }

  public Object getFieldViewableBusiness() {
    return mViewableBusiness;
  }

  public AdAccountGet setFieldViewableBusiness(Object value) {
    this.mViewableBusiness = value;
    return this;
  }

  public List<Object> getFieldViewableBusinesses() {
    return mViewableBusinesses;
  }

  public AdAccountGet setFieldViewableBusinesses(List<Object> value) {
    this.mViewableBusinesses = value;
    return this;
  }



  public static enum EnumAuthFlowForTrustTierState {
      @SerializedName("EXPIRED")
      VALUE_EXPIRED("EXPIRED"),
      @SerializedName("FAILED")
      VALUE_FAILED("FAILED"),
      @SerializedName("IN_REVIEW")
      VALUE_IN_REVIEW("IN_REVIEW"),
      @SerializedName("NOT_REQUIRED")
      VALUE_NOT_REQUIRED("NOT_REQUIRED"),
      @SerializedName("NOT_STARTED")
      VALUE_NOT_STARTED("NOT_STARTED"),
      @SerializedName("PENDING")
      VALUE_PENDING("PENDING"),
      @SerializedName("PENDING_IN_REVIEW")
      VALUE_PENDING_IN_REVIEW("PENDING_IN_REVIEW"),
      @SerializedName("REVOKED")
      VALUE_REVOKED("REVOKED"),
      @SerializedName("VERIFIED")
      VALUE_VERIFIED("VERIFIED"),
      ;

      private String value;

      private EnumAuthFlowForTrustTierState(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumAuthorizedCountryForPoliticalAds {
      @SerializedName("AC")
      VALUE_AC("AC"),
      @SerializedName("AD")
      VALUE_AD("AD"),
      @SerializedName("AE")
      VALUE_AE("AE"),
      @SerializedName("AF")
      VALUE_AF("AF"),
      @SerializedName("AG")
      VALUE_AG("AG"),
      @SerializedName("AI")
      VALUE_AI("AI"),
      @SerializedName("AL")
      VALUE_AL("AL"),
      @SerializedName("AM")
      VALUE_AM("AM"),
      @SerializedName("AN")
      VALUE_AN("AN"),
      @SerializedName("AO")
      VALUE_AO("AO"),
      @SerializedName("AQ")
      VALUE_AQ("AQ"),
      @SerializedName("AR")
      VALUE_AR("AR"),
      @SerializedName("AS")
      VALUE_AS("AS"),
      @SerializedName("AT")
      VALUE_AT("AT"),
      @SerializedName("AU")
      VALUE_AU("AU"),
      @SerializedName("AW")
      VALUE_AW("AW"),
      @SerializedName("AX")
      VALUE_AX("AX"),
      @SerializedName("AZ")
      VALUE_AZ("AZ"),
      @SerializedName("BA")
      VALUE_BA("BA"),
      @SerializedName("BB")
      VALUE_BB("BB"),
      @SerializedName("BD")
      VALUE_BD("BD"),
      @SerializedName("BE")
      VALUE_BE("BE"),
      @SerializedName("BF")
      VALUE_BF("BF"),
      @SerializedName("BG")
      VALUE_BG("BG"),
      @SerializedName("BH")
      VALUE_BH("BH"),
      @SerializedName("BI")
      VALUE_BI("BI"),
      @SerializedName("BJ")
      VALUE_BJ("BJ"),
      @SerializedName("BL")
      VALUE_BL("BL"),
      @SerializedName("BM")
      VALUE_BM("BM"),
      @SerializedName("BN")
      VALUE_BN("BN"),
      @SerializedName("BO")
      VALUE_BO("BO"),
      @SerializedName("BQ")
      VALUE_BQ("BQ"),
      @SerializedName("BR")
      VALUE_BR("BR"),
      @SerializedName("BS")
      VALUE_BS("BS"),
      @SerializedName("BT")
      VALUE_BT("BT"),
      @SerializedName("BV")
      VALUE_BV("BV"),
      @SerializedName("BW")
      VALUE_BW("BW"),
      @SerializedName("BY")
      VALUE_BY("BY"),
      @SerializedName("BZ")
      VALUE_BZ("BZ"),
      @SerializedName("CA")
      VALUE_CA("CA"),
      @SerializedName("CC")
      VALUE_CC("CC"),
      @SerializedName("CD")
      VALUE_CD("CD"),
      @SerializedName("CF")
      VALUE_CF("CF"),
      @SerializedName("CG")
      VALUE_CG("CG"),
      @SerializedName("CH")
      VALUE_CH("CH"),
      @SerializedName("CI")
      VALUE_CI("CI"),
      @SerializedName("CK")
      VALUE_CK("CK"),
      @SerializedName("CL")
      VALUE_CL("CL"),
      @SerializedName("CM")
      VALUE_CM("CM"),
      @SerializedName("CN")
      VALUE_CN("CN"),
      @SerializedName("CO")
      VALUE_CO("CO"),
      @SerializedName("CR")
      VALUE_CR("CR"),
      @SerializedName("CU")
      VALUE_CU("CU"),
      @SerializedName("CV")
      VALUE_CV("CV"),
      @SerializedName("CW")
      VALUE_CW("CW"),
      @SerializedName("CX")
      VALUE_CX("CX"),
      @SerializedName("CY")
      VALUE_CY("CY"),
      @SerializedName("CZ")
      VALUE_CZ("CZ"),
      @SerializedName("DE")
      VALUE_DE("DE"),
      @SerializedName("DJ")
      VALUE_DJ("DJ"),
      @SerializedName("DK")
      VALUE_DK("DK"),
      @SerializedName("DM")
      VALUE_DM("DM"),
      @SerializedName("DO")
      VALUE_DO("DO"),
      @SerializedName("DZ")
      VALUE_DZ("DZ"),
      @SerializedName("EC")
      VALUE_EC("EC"),
      @SerializedName("EE")
      VALUE_EE("EE"),
      @SerializedName("EG")
      VALUE_EG("EG"),
      @SerializedName("EH")
      VALUE_EH("EH"),
      @SerializedName("ER")
      VALUE_ER("ER"),
      @SerializedName("ES")
      VALUE_ES("ES"),
      @SerializedName("ET")
      VALUE_ET("ET"),
      @SerializedName("FI")
      VALUE_FI("FI"),
      @SerializedName("FJ")
      VALUE_FJ("FJ"),
      @SerializedName("FK")
      VALUE_FK("FK"),
      @SerializedName("FM")
      VALUE_FM("FM"),
      @SerializedName("FO")
      VALUE_FO("FO"),
      @SerializedName("FR")
      VALUE_FR("FR"),
      @SerializedName("GA")
      VALUE_GA("GA"),
      @SerializedName("GB")
      VALUE_GB("GB"),
      @SerializedName("GD")
      VALUE_GD("GD"),
      @SerializedName("GE")
      VALUE_GE("GE"),
      @SerializedName("GF")
      VALUE_GF("GF"),
      @SerializedName("GG")
      VALUE_GG("GG"),
      @SerializedName("GH")
      VALUE_GH("GH"),
      @SerializedName("GI")
      VALUE_GI("GI"),
      @SerializedName("GL")
      VALUE_GL("GL"),
      @SerializedName("GM")
      VALUE_GM("GM"),
      @SerializedName("GN")
      VALUE_GN("GN"),
      @SerializedName("GP")
      VALUE_GP("GP"),
      @SerializedName("GQ")
      VALUE_GQ("GQ"),
      @SerializedName("GR")
      VALUE_GR("GR"),
      @SerializedName("GS")
      VALUE_GS("GS"),
      @SerializedName("GT")
      VALUE_GT("GT"),
      @SerializedName("GU")
      VALUE_GU("GU"),
      @SerializedName("GW")
      VALUE_GW("GW"),
      @SerializedName("GY")
      VALUE_GY("GY"),
      @SerializedName("HK")
      VALUE_HK("HK"),
      @SerializedName("HM")
      VALUE_HM("HM"),
      @SerializedName("HN")
      VALUE_HN("HN"),
      @SerializedName("HR")
      VALUE_HR("HR"),
      @SerializedName("HT")
      VALUE_HT("HT"),
      @SerializedName("HU")
      VALUE_HU("HU"),
      @SerializedName("ID")
      VALUE_ID("ID"),
      @SerializedName("IE")
      VALUE_IE("IE"),
      @SerializedName("IL")
      VALUE_IL("IL"),
      @SerializedName("IM")
      VALUE_IM("IM"),
      @SerializedName("IN")
      VALUE_IN("IN"),
      @SerializedName("IO")
      VALUE_IO("IO"),
      @SerializedName("IQ")
      VALUE_IQ("IQ"),
      @SerializedName("IR")
      VALUE_IR("IR"),
      @SerializedName("IS")
      VALUE_IS("IS"),
      @SerializedName("IT")
      VALUE_IT("IT"),
      @SerializedName("JE")
      VALUE_JE("JE"),
      @SerializedName("JM")
      VALUE_JM("JM"),
      @SerializedName("JO")
      VALUE_JO("JO"),
      @SerializedName("JP")
      VALUE_JP("JP"),
      @SerializedName("KE")
      VALUE_KE("KE"),
      @SerializedName("KG")
      VALUE_KG("KG"),
      @SerializedName("KH")
      VALUE_KH("KH"),
      @SerializedName("KI")
      VALUE_KI("KI"),
      @SerializedName("KM")
      VALUE_KM("KM"),
      @SerializedName("KN")
      VALUE_KN("KN"),
      @SerializedName("KP")
      VALUE_KP("KP"),
      @SerializedName("KR")
      VALUE_KR("KR"),
      @SerializedName("KW")
      VALUE_KW("KW"),
      @SerializedName("KY")
      VALUE_KY("KY"),
      @SerializedName("KZ")
      VALUE_KZ("KZ"),
      @SerializedName("LA")
      VALUE_LA("LA"),
      @SerializedName("LB")
      VALUE_LB("LB"),
      @SerializedName("LC")
      VALUE_LC("LC"),
      @SerializedName("LI")
      VALUE_LI("LI"),
      @SerializedName("LK")
      VALUE_LK("LK"),
      @SerializedName("LR")
      VALUE_LR("LR"),
      @SerializedName("LS")
      VALUE_LS("LS"),
      @SerializedName("LT")
      VALUE_LT("LT"),
      @SerializedName("LU")
      VALUE_LU("LU"),
      @SerializedName("LV")
      VALUE_LV("LV"),
      @SerializedName("LY")
      VALUE_LY("LY"),
      @SerializedName("MA")
      VALUE_MA("MA"),
      @SerializedName("MC")
      VALUE_MC("MC"),
      @SerializedName("MD")
      VALUE_MD("MD"),
      @SerializedName("ME")
      VALUE_ME("ME"),
      @SerializedName("MF")
      VALUE_MF("MF"),
      @SerializedName("MG")
      VALUE_MG("MG"),
      @SerializedName("MH")
      VALUE_MH("MH"),
      @SerializedName("MK")
      VALUE_MK("MK"),
      @SerializedName("ML")
      VALUE_ML("ML"),
      @SerializedName("MM")
      VALUE_MM("MM"),
      @SerializedName("MN")
      VALUE_MN("MN"),
      @SerializedName("MO")
      VALUE_MO("MO"),
      @SerializedName("MP")
      VALUE_MP("MP"),
      @SerializedName("MQ")
      VALUE_MQ("MQ"),
      @SerializedName("MR")
      VALUE_MR("MR"),
      @SerializedName("MS")
      VALUE_MS("MS"),
      @SerializedName("MT")
      VALUE_MT("MT"),
      @SerializedName("MU")
      VALUE_MU("MU"),
      @SerializedName("MV")
      VALUE_MV("MV"),
      @SerializedName("MW")
      VALUE_MW("MW"),
      @SerializedName("MX")
      VALUE_MX("MX"),
      @SerializedName("MY")
      VALUE_MY("MY"),
      @SerializedName("MZ")
      VALUE_MZ("MZ"),
      @SerializedName("NA")
      VALUE_NA("NA"),
      @SerializedName("NC")
      VALUE_NC("NC"),
      @SerializedName("NE")
      VALUE_NE("NE"),
      @SerializedName("NF")
      VALUE_NF("NF"),
      @SerializedName("NG")
      VALUE_NG("NG"),
      @SerializedName("NI")
      VALUE_NI("NI"),
      @SerializedName("NL")
      VALUE_NL("NL"),
      @SerializedName("NO")
      VALUE_NO("NO"),
      @SerializedName("NP")
      VALUE_NP("NP"),
      @SerializedName("NR")
      VALUE_NR("NR"),
      @SerializedName("NU")
      VALUE_NU("NU"),
      @SerializedName("NZ")
      VALUE_NZ("NZ"),
      @SerializedName("OM")
      VALUE_OM("OM"),
      @SerializedName("PA")
      VALUE_PA("PA"),
      @SerializedName("PE")
      VALUE_PE("PE"),
      @SerializedName("PF")
      VALUE_PF("PF"),
      @SerializedName("PG")
      VALUE_PG("PG"),
      @SerializedName("PH")
      VALUE_PH("PH"),
      @SerializedName("PK")
      VALUE_PK("PK"),
      @SerializedName("PL")
      VALUE_PL("PL"),
      @SerializedName("PM")
      VALUE_PM("PM"),
      @SerializedName("PN")
      VALUE_PN("PN"),
      @SerializedName("PR")
      VALUE_PR("PR"),
      @SerializedName("PS")
      VALUE_PS("PS"),
      @SerializedName("PT")
      VALUE_PT("PT"),
      @SerializedName("PW")
      VALUE_PW("PW"),
      @SerializedName("PY")
      VALUE_PY("PY"),
      @SerializedName("QA")
      VALUE_QA("QA"),
      @SerializedName("RE")
      VALUE_RE("RE"),
      @SerializedName("RO")
      VALUE_RO("RO"),
      @SerializedName("RS")
      VALUE_RS("RS"),
      @SerializedName("RU")
      VALUE_RU("RU"),
      @SerializedName("RW")
      VALUE_RW("RW"),
      @SerializedName("SA")
      VALUE_SA("SA"),
      @SerializedName("SB")
      VALUE_SB("SB"),
      @SerializedName("SC")
      VALUE_SC("SC"),
      @SerializedName("SD")
      VALUE_SD("SD"),
      @SerializedName("SE")
      VALUE_SE("SE"),
      @SerializedName("SG")
      VALUE_SG("SG"),
      @SerializedName("SH")
      VALUE_SH("SH"),
      @SerializedName("SI")
      VALUE_SI("SI"),
      @SerializedName("SJ")
      VALUE_SJ("SJ"),
      @SerializedName("SK")
      VALUE_SK("SK"),
      @SerializedName("SL")
      VALUE_SL("SL"),
      @SerializedName("SM")
      VALUE_SM("SM"),
      @SerializedName("SN")
      VALUE_SN("SN"),
      @SerializedName("SO")
      VALUE_SO("SO"),
      @SerializedName("SR")
      VALUE_SR("SR"),
      @SerializedName("SS")
      VALUE_SS("SS"),
      @SerializedName("ST")
      VALUE_ST("ST"),
      @SerializedName("SV")
      VALUE_SV("SV"),
      @SerializedName("SX")
      VALUE_SX("SX"),
      @SerializedName("SY")
      VALUE_SY("SY"),
      @SerializedName("SZ")
      VALUE_SZ("SZ"),
      @SerializedName("TC")
      VALUE_TC("TC"),
      @SerializedName("TD")
      VALUE_TD("TD"),
      @SerializedName("TF")
      VALUE_TF("TF"),
      @SerializedName("TG")
      VALUE_TG("TG"),
      @SerializedName("TH")
      VALUE_TH("TH"),
      @SerializedName("TJ")
      VALUE_TJ("TJ"),
      @SerializedName("TK")
      VALUE_TK("TK"),
      @SerializedName("TL")
      VALUE_TL("TL"),
      @SerializedName("TM")
      VALUE_TM("TM"),
      @SerializedName("TN")
      VALUE_TN("TN"),
      @SerializedName("TO")
      VALUE_TO("TO"),
      @SerializedName("TR")
      VALUE_TR("TR"),
      @SerializedName("TT")
      VALUE_TT("TT"),
      @SerializedName("TV")
      VALUE_TV("TV"),
      @SerializedName("TW")
      VALUE_TW("TW"),
      @SerializedName("TZ")
      VALUE_TZ("TZ"),
      @SerializedName("UA")
      VALUE_UA("UA"),
      @SerializedName("UG")
      VALUE_UG("UG"),
      @SerializedName("UM")
      VALUE_UM("UM"),
      @SerializedName("US")
      VALUE_US("US"),
      @SerializedName("UY")
      VALUE_UY("UY"),
      @SerializedName("UZ")
      VALUE_UZ("UZ"),
      @SerializedName("VA")
      VALUE_VA("VA"),
      @SerializedName("VC")
      VALUE_VC("VC"),
      @SerializedName("VE")
      VALUE_VE("VE"),
      @SerializedName("VG")
      VALUE_VG("VG"),
      @SerializedName("VI")
      VALUE_VI("VI"),
      @SerializedName("VN")
      VALUE_VN("VN"),
      @SerializedName("VU")
      VALUE_VU("VU"),
      @SerializedName("WF")
      VALUE_WF("WF"),
      @SerializedName("WS")
      VALUE_WS("WS"),
      @SerializedName("XK")
      VALUE_XK("XK"),
      @SerializedName("YE")
      VALUE_YE("YE"),
      @SerializedName("YT")
      VALUE_YT("YT"),
      @SerializedName("ZA")
      VALUE_ZA("ZA"),
      @SerializedName("ZM")
      VALUE_ZM("ZM"),
      @SerializedName("ZW")
      VALUE_ZW("ZW"),
      ;

      private String value;

      private EnumAuthorizedCountryForPoliticalAds(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumBrandSafetyExcludedTopics {
      @SerializedName("FB_INSTREAM_REELS_NON_PARTNER_PUBLISHERS")
      VALUE_FB_INSTREAM_REELS_NON_PARTNER_PUBLISHERS("FB_INSTREAM_REELS_NON_PARTNER_PUBLISHERS"),
      @SerializedName("FB_REELS_NON_PARTNER_PUBLISHERS")
      VALUE_FB_REELS_NON_PARTNER_PUBLISHERS("FB_REELS_NON_PARTNER_PUBLISHERS"),
      @SerializedName("GAMING")
      VALUE_GAMING("GAMING"),
      @SerializedName("INSTREAM_LIVE")
      VALUE_INSTREAM_LIVE("INSTREAM_LIVE"),
      @SerializedName("INSTREAM_NON_PARTNER_PUBLISHERS")
      VALUE_INSTREAM_NON_PARTNER_PUBLISHERS("INSTREAM_NON_PARTNER_PUBLISHERS"),
      @SerializedName("NEWS")
      VALUE_NEWS("NEWS"),
      @SerializedName("POLITICS")
      VALUE_POLITICS("POLITICS"),
      @SerializedName("RELIGION_AND_SPIRITUALITY")
      VALUE_RELIGION_AND_SPIRITUALITY("RELIGION_AND_SPIRITUALITY"),
      ;

      private String value;

      private EnumBrandSafetyExcludedTopics(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumBusinessRestrictionReason {
      @SerializedName("BANHAMMER")
      VALUE_BANHAMMER("BANHAMMER"),
      @SerializedName("EMAIL_REQUIRED")
      VALUE_EMAIL_REQUIRED("EMAIL_REQUIRED"),
      @SerializedName("NONE")
      VALUE_NONE("NONE"),
      ;

      private String value;

      private EnumBusinessRestrictionReason(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumBusinessVerificationStatus {
      @SerializedName("EXPIRED")
      VALUE_EXPIRED("EXPIRED"),
      @SerializedName("FAILED")
      VALUE_FAILED("FAILED"),
      @SerializedName("INELIGIBLE")
      VALUE_INELIGIBLE("INELIGIBLE"),
      @SerializedName("NOT_VERIFIED")
      VALUE_NOT_VERIFIED("NOT_VERIFIED"),
      @SerializedName("PENDING")
      VALUE_PENDING("PENDING"),
      @SerializedName("PENDING_NEED_MORE_INFO")
      VALUE_PENDING_NEED_MORE_INFO("PENDING_NEED_MORE_INFO"),
      @SerializedName("PENDING_SUBMISSION")
      VALUE_PENDING_SUBMISSION("PENDING_SUBMISSION"),
      @SerializedName("REJECTED")
      VALUE_REJECTED("REJECTED"),
      @SerializedName("REVOKED")
      VALUE_REVOKED("REVOKED"),
      @SerializedName("VERIFIED")
      VALUE_VERIFIED("VERIFIED"),
      ;

      private String value;

      private EnumBusinessVerificationStatus(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumFlexSingleObjective {
      @SerializedName("APP_PROMOTION")
      VALUE_APP_PROMOTION("APP_PROMOTION"),
      @SerializedName("GROUP_JOINS")
      VALUE_GROUP_JOINS("GROUP_JOINS"),
      @SerializedName("INSTAGRAM_PERFORMANCE")
      VALUE_INSTAGRAM_PERFORMANCE("INSTAGRAM_PERFORMANCE"),
      @SerializedName("LEADS")
      VALUE_LEADS("LEADS"),
      @SerializedName("NONE")
      VALUE_NONE("NONE"),
      @SerializedName("SALES")
      VALUE_SALES("SALES"),
      @SerializedName("TRAFFIC")
      VALUE_TRAFFIC("TRAFFIC"),
      ;

      private String value;

      private EnumFlexSingleObjective(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumMarketingMessageEnablementStatus {
      @SerializedName("MARKETING_MESSAGE_ELIGIBLE_OPTIMIZATION_DISABLED")
      VALUE_MARKETING_MESSAGE_ELIGIBLE_OPTIMIZATION_DISABLED("MARKETING_MESSAGE_ELIGIBLE_OPTIMIZATION_DISABLED"),
      @SerializedName("MARKETING_MESSAGE_ELIGIBLE_OPTIMIZATION_ENABLED")
      VALUE_MARKETING_MESSAGE_ELIGIBLE_OPTIMIZATION_ENABLED("MARKETING_MESSAGE_ELIGIBLE_OPTIMIZATION_ENABLED"),
      @SerializedName("MARKETING_MESSAGE_INELIGIBLE")
      VALUE_MARKETING_MESSAGE_INELIGIBLE("MARKETING_MESSAGE_INELIGIBLE"),
      ;

      private String value;

      private EnumMarketingMessageEnablementStatus(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumModeledReportingType {
      @SerializedName("IOS14_ACCOUNT")
      VALUE_IOS14_ACCOUNT("IOS14_ACCOUNT"),
      @SerializedName("NONE")
      VALUE_NONE("NONE"),
      ;

      private String value;

      private EnumModeledReportingType(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumSegment {
      @SerializedName("HAIR")
      VALUE_HAIR("HAIR"),
      @SerializedName("HEAD")
      VALUE_HEAD("HEAD"),
      @SerializedName("NULL")
      VALUE_NULL("NULL"),
      @SerializedName("TAIL")
      VALUE_TAIL("TAIL"),
      @SerializedName("TORSO")
      VALUE_TORSO("TORSO"),
      ;

      private String value;

      private EnumSegment(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumStoredBalanceStatus {
      @SerializedName("NEW_USER")
      VALUE_NEW_USER("NEW_USER"),
      @SerializedName("POSTPAY")
      VALUE_POSTPAY("POSTPAY"),
      @SerializedName("PREPAY")
      VALUE_PREPAY("PREPAY"),
      @SerializedName("STANDARD")
      VALUE_STANDARD("STANDARD"),
      ;

      private String value;

      private EnumStoredBalanceStatus(String value) {
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

  public AdAccountGet copyFrom(AdAccountGet instance) {
    this.mAccountControls = instance.mAccountControls;
    this.mAccountCurrencyRatioToUsd = instance.mAccountCurrencyRatioToUsd;
    this.mAccountId = instance.mAccountId;
    this.mAccountStatus = instance.mAccountStatus;
    this.mActiveBillingDatePreference = instance.mActiveBillingDatePreference;
    this.mActivities = instance.mActivities;
    this.mAdAccountCreationRequest = instance.mAdAccountCreationRequest;
    this.mAdAccountPromotableObjects = instance.mAdAccountPromotableObjects;
    this.mAdColumnSizes = instance.mAdColumnSizes;
    this.mAdLimitsInsights = instance.mAdLimitsInsights;
    this.mAdPlacePageSets = instance.mAdPlacePageSets;
    this.mAdQuickViews = instance.mAdQuickViews;
    this.mAdReportBuilderReports = instance.mAdReportBuilderReports;
    this.mAdStudies = instance.mAdStudies;
    this.mAdcreatives = instance.mAdcreatives;
    this.mAddrafts = instance.mAddrafts;
    this.mAdimages = instance.mAdimages;
    this.mAdlabels = instance.mAdlabels;
    this.mAdrulesCountByType = instance.mAdrulesCountByType;
    this.mAdrulesHistory = instance.mAdrulesHistory;
    this.mAdrulesLibrary = instance.mAdrulesLibrary;
    this.mAds = instance.mAds;
    this.mAdsCreationSavedState = instance.mAdsCreationSavedState;
    this.mAdsPaused = instance.mAdsPaused;
    this.mAdsVolume = instance.mAdsVolume;
    this.mAdsets = instance.mAdsets;
    this.mAdspaymentcycle = instance.mAdspaymentcycle;
    this.mAdspixels = instance.mAdspixels;
    this.mAdtrustDsl = instance.mAdtrustDsl;
    this.mAdvertisableApplications = instance.mAdvertisableApplications;
    this.mAdvideos = instance.mAdvideos;
    this.mAge = instance.mAge;
    this.mAgencies = instance.mAgencies;
    this.mAgencyClientDeclaration = instance.mAgencyClientDeclaration;
    this.mAgencyFeeConfig = instance.mAgencyFeeConfig;
    this.mAiGeneratedFeaturesTestFrameworkEnrolled = instance.mAiGeneratedFeaturesTestFrameworkEnrolled;
    this.mAllCapabilities = instance.mAllCapabilities;
    this.mAllPaymentMethods = instance.mAllPaymentMethods;
    this.mAmOneshopSettings = instance.mAmOneshopSettings;
    this.mAmountSpent = instance.mAmountSpent;
    this.mAmountSpentHistory = instance.mAmountSpentHistory;
    this.mApplications = instance.mApplications;
    this.mAppliedPublisherBlockLists = instance.mAppliedPublisherBlockLists;
    this.mArchivedAdgroupCount = instance.mArchivedAdgroupCount;
    this.mArchivedCampaignCount = instance.mArchivedCampaignCount;
    this.mArchivedCampaignGroupCount = instance.mArchivedCampaignGroupCount;
    this.mAssetFeedSpecFromExistingPost = instance.mAssetFeedSpecFromExistingPost;
    this.mAssetFeedSpecFromInstagramMedia = instance.mAssetFeedSpecFromInstagramMedia;
    this.mAssetScore = instance.mAssetScore;
    this.mAssignedPartners = instance.mAssignedPartners;
    this.mAssignedUsers = instance.mAssignedUsers;
    this.mAttrWindowDeprecationGroup = instance.mAttrWindowDeprecationGroup;
    this.mAudiencesharingRecipientaccounts = instance.mAudiencesharingRecipientaccounts;
    this.mAuthFlowForTrustTierState = instance.mAuthFlowForTrustTierState;
    this.mAuthorizedCountryForPoliticalAds = instance.mAuthorizedCountryForPoliticalAds;
    this.mAutomaticCreativeOptimizationTestFrameworkEnrolled = instance.mAutomaticCreativeOptimizationTestFrameworkEnrolled;
    this.mAverageDailyCampaignBudget = instance.mAverageDailyCampaignBudget;
    this.mAverageDailyCampaignGroupBudget = instance.mAverageDailyCampaignGroupBudget;
    this.mAverageLifetimeCampaignBudget = instance.mAverageLifetimeCampaignBudget;
    this.mAverageLifetimeCampaignGroupBudget = instance.mAverageLifetimeCampaignGroupBudget;
    this.mBalance = instance.mBalance;
    this.mBrandSafetyContentFilterLevels = instance.mBrandSafetyContentFilterLevels;
    this.mBrandSafetyExcludedTopics = instance.mBrandSafetyExcludedTopics;
    this.mBusiness = instance.mBusiness;
    this.mBusinessAdAccountRequests = instance.mBusinessAdAccountRequests;
    this.mBusinessCity = instance.mBusinessCity;
    this.mBusinessCountryCode = instance.mBusinessCountryCode;
    this.mBusinessName = instance.mBusinessName;
    this.mBusinessRestrictionReason = instance.mBusinessRestrictionReason;
    this.mBusinessState = instance.mBusinessState;
    this.mBusinessStreet = instance.mBusinessStreet;
    this.mBusinessStreet2 = instance.mBusinessStreet2;
    this.mBusinessVerificationStatus = instance.mBusinessVerificationStatus;
    this.mBusinessZip = instance.mBusinessZip;
    this.mBusinessprojects = instance.mBusinessprojects;
    this.mCallAdsAdAccountSimilarAdvertiserBudgetRecommendation = instance.mCallAdsAdAccountSimilarAdvertiserBudgetRecommendation;
    this.mCallAdsSimilarAdvertiserBudgetRecommendation = instance.mCallAdsSimilarAdvertiserBudgetRecommendation;
    this.mCampaignGroupWithCbo = instance.mCampaignGroupWithCbo;
    this.mCampaigns = instance.mCampaigns;
    this.mCanBypassFsCheck = instance.mCanBypassFsCheck;
    this.mCanCreateBrandLiftStudy = instance.mCanCreateBrandLiftStudy;
    this.mCanPayNow = instance.mCanPayNow;
    this.mCanRemovePaymentMethods = instance.mCanRemovePaymentMethods;
    this.mCanRepayNow = instance.mCanRepayNow;
    this.mCanSeeCollaborativeAdsReporting = instance.mCanSeeCollaborativeAdsReporting;
    this.mCapabilities = instance.mCapabilities;
    this.mConnectedInstagramAccounts = instance.mConnectedInstagramAccounts;
    this.mCpasCampaignDefaultBudget = instance.mCpasCampaignDefaultBudget;
    this.mCpasCampaignGroupDefaultBudget = instance.mCpasCampaignGroupDefaultBudget;
    this.mCreatedTime = instance.mCreatedTime;
    this.mCreationPackages = instance.mCreationPackages;
    this.mCreativeTextSuggestions = instance.mCreativeTextSuggestions;
    this.mCtwaSmbEnforcingDaysLeft = instance.mCtwaSmbEnforcingDaysLeft;
    this.mCtxAdvertiserSabrLifetimeDurationRecommendation = instance.mCtxAdvertiserSabrLifetimeDurationRecommendation;
    this.mCtxDfoObjectiveDefaults = instance.mCtxDfoObjectiveDefaults;
    this.mCtxFlexibleFormatTargeting = instance.mCtxFlexibleFormatTargeting;
    this.mCurrency = instance.mCurrency;
    this.mCurrentAddrafts = instance.mCurrentAddrafts;
    this.mCurrentUnbilledSpend = instance.mCurrentUnbilledSpend;
    this.mCurrentUnpaidUnrepaidInvoice = instance.mCurrentUnpaidUnrepaidInvoice;
    this.mCustomAudienceInfo = instance.mCustomAudienceInfo;
    this.mCustomaudiences = instance.mCustomaudiences;
    this.mCustomaudiencestos = instance.mCustomaudiencestos;
    this.mCustomconversions = instance.mCustomconversions;
    this.mCustomerPoNumber = instance.mCustomerPoNumber;
    this.mDailySpendLimit = instance.mDailySpendLimit;
    this.mDcaf = instance.mDcaf;
    this.mDefaultDsaBeneficiary = instance.mDefaultDsaBeneficiary;
    this.mDefaultDsaPayor = instance.mDefaultDsaPayor;
    this.mDefaultUnifiedAttributionSpec = instance.mDefaultUnifiedAttributionSpec;
    this.mDefaultValues = instance.mDefaultValues;
    this.mDisableReason = instance.mDisableReason;
    this.mDomainAndSiteLinks = instance.mDomainAndSiteLinks;
    this.mDsaRecommendations = instance.mDsaRecommendations;
    this.mDynamicProbationDsl = instance.mDynamicProbationDsl;
    this.mEndAdvertiser = instance.mEndAdvertiser;
    this.mEndAdvertiserName = instance.mEndAdvertiserName;
    this.mExistingCustomers = instance.mExistingCustomers;
    this.mExpiredFundingSourceDetails = instance.mExpiredFundingSourceDetails;
    this.mExtendedCredit = instance.mExtendedCredit;
    this.mExtendedCreditInfo = instance.mExtendedCreditInfo;
    this.mExtendedCreditInvoiceGroup = instance.mExtendedCreditInvoiceGroup;
    this.mFailedDeliveryChecks = instance.mFailedDeliveryChecks;
    this.mFbEntity = instance.mFbEntity;
    this.mFlexSingleObjective = instance.mFlexSingleObjective;
    this.mFundingSource = instance.mFundingSource;
    this.mFundingSourceDetails = instance.mFundingSourceDetails;
    this.mGeneratepreviews = instance.mGeneratepreviews;
    this.mHasActiveSkanCampaignGroups = instance.mHasActiveSkanCampaignGroups;
    this.mHasComboCardsOnFile = instance.mHasComboCardsOnFile;
    this.mHasExtendedCredit = instance.mHasExtendedCredit;
    this.mHasMigratedPermissions = instance.mHasMigratedPermissions;
    this.mHasPageAuthorizedAdaccount = instance.mHasPageAuthorizedAdaccount;
    this.mHasPersonalAccess = instance.mHasPersonalAccess;
    this.mHasPurchaseOptimizationEligiblePage = instance.mHasPurchaseOptimizationEligiblePage;
    this.mHasRepayProcessingInvoices = instance.mHasRepayProcessingInvoices;
    this.mHasStartedPurchaseOptimizedCtmAdWithin1d = instance.mHasStartedPurchaseOptimizedCtmAdWithin1d;
    this.mHasValueRuleSet = instance.mHasValueRuleSet;
    this.mId = instance.mId;
    this.mIfViewerHasPermissionToAdvertise = instance.mIfViewerHasPermissionToAdvertise;
    this.mImpactingAdStudies = instance.mImpactingAdStudies;
    this.mIncrementalConversionOptimizationAdStudies = instance.mIncrementalConversionOptimizationAdStudies;
    this.mInsights = instance.mInsights;
    this.mInstagramAccounts = instance.mInstagramAccounts;
    this.mInvoicingEmails = instance.mInvoicingEmails;
    this.mIosFourteenCampaignLimits = instance.mIosFourteenCampaignLimits;
    this.mIsAttributionSpecSystemDefault = instance.mIsAttributionSpecSystemDefault;
    this.mIsBaSkipDelayedEligible = instance.mIsBaSkipDelayedEligible;
    this.mIsBizMigrationEligible = instance.mIsBizMigrationEligible;
    this.mIsBrEntityAccount = instance.mIsBrEntityAccount;
    this.mIsBusinessAllowedToAdvertise = instance.mIsBusinessAllowedToAdvertise;
    this.mIsBusinessVerificationEligible = instance.mIsBusinessVerificationEligible;
    this.mIsClosedByAdvertiserCompromiseBot = instance.mIsClosedByAdvertiserCompromiseBot;
    this.mIsCollaborativeAdsAdAccount = instance.mIsCollaborativeAdsAdAccount;
    this.mIsCtxAdvertiser = instance.mIsCtxAdvertiser;
    this.mIsDirectDealsEnabled = instance.mIsDirectDealsEnabled;
    this.mIsDisabledUmbrella = instance.mIsDisabledUmbrella;
    this.mIsEligibleForAdvantagePlusCreativeRegulatedCategory = instance.mIsEligibleForAdvantagePlusCreativeRegulatedCategory;
    this.mIsExpandedShoplessAwptEligible = instance.mIsExpandedShoplessAwptEligible;
    this.mIsIn3dsAuthorizationEnabledMarket = instance.mIsIn3dsAuthorizationEnabledMarket;
    this.mIsMiBillingInfoUpdated = instance.mIsMiBillingInfoUpdated;
    this.mIsMmLiteApiEnabled = instance.mIsMmLiteApiEnabled;
    this.mIsNewAdvertiser = instance.mIsNewAdvertiser;
    this.mIsNotificationsEnabled = instance.mIsNotificationsEnabled;
    this.mIsObaOptOut = instance.mIsObaOptOut;
    this.mIsOmnichannelCampaignEligible = instance.mIsOmnichannelCampaignEligible;
    this.mIsPagelessCtwaEligible = instance.mIsPagelessCtwaEligible;
    this.mIsPendingNumbersExposureFlagEnabled = instance.mIsPendingNumbersExposureFlagEnabled;
    this.mIsPersonal = instance.mIsPersonal;
    this.mIsPinlessDebitEligible = instance.mIsPinlessDebitEligible;
    this.mIsPlacementSoftOptOutEnabled = instance.mIsPlacementSoftOptOutEnabled;
    this.mIsPrepayAccount = instance.mIsPrepayAccount;
    this.mIsRetailMediaNetwork = instance.mIsRetailMediaNetwork;
    this.mIsShoplessAwptEligible = instance.mIsShoplessAwptEligible;
    this.mIsSimplifiedCreationOnly111Eligible = instance.mIsSimplifiedCreationOnly111Eligible;
    this.mIsSimplifiedCreationSegmentEligible = instance.mIsSimplifiedCreationSegmentEligible;
    this.mIsTaxIdRequired = instance.mIsTaxIdRequired;
    this.mIsTier0 = instance.mIsTier0;
    this.mIsTier0Full = instance.mIsTier0Full;
    this.mIsTier1 = instance.mIsTier1;
    this.mIsTierRestricted = instance.mIsTierRestricted;
    this.mIsUpdateTimezoneCurrencyTooRecently = instance.mIsUpdateTimezoneCurrencyTooRecently;
    this.mIsUserAllowedToAdvertise = instance.mIsUserAllowedToAdvertise;
    this.mIsUsingHigherDailyFlexRate = instance.mIsUsingHigherDailyFlexRate;
    this.mIsValueRulesSmartDefaultOn = instance.mIsValueRulesSmartDefaultOn;
    this.mIsWaCloudApiUser = instance.mIsWaCloudApiUser;
    this.mIsYouthAdsPaoBasicAdvertiser = instance.mIsYouthAdsPaoBasicAdvertiser;
    this.mIsYouthAdsPaoBasicAdvertiserAnnouncementEligible = instance.mIsYouthAdsPaoBasicAdvertiserAnnouncementEligible;
    this.mLastSpendTime = instance.mLastSpendTime;
    this.mLastUsedTime = instance.mLastUsedTime;
    this.mLiableAddress = instance.mLiableAddress;
    this.mLiableAddresses = instance.mLiableAddresses;
    this.mLiableToOrg = instance.mLiableToOrg;
    this.mLightAdsets = instance.mLightAdsets;
    this.mLightCampaigns = instance.mLightCampaigns;
    this.mLightads = instance.mLightads;
    this.mLiveVideoAdvertiserDetails = instance.mLiveVideoAdvertiserDetails;
    this.mMarketingMessageEnablementStatus = instance.mMarketingMessageEnablementStatus;
    this.mMarketingMessagesSettings = instance.mMarketingMessagesSettings;
    this.mMaxBid = instance.mMaxBid;
    this.mMaxBillingThreshold = instance.mMaxBillingThreshold;
    this.mMaybePacInternalPostFromPrimaryPost = instance.mMaybePacInternalPostFromPrimaryPost;
    this.mMediaAgency = instance.mMediaAgency;
    this.mMinBillingThreshold = instance.mMinBillingThreshold;
    this.mMinCampaignGroupSpendCap = instance.mMinCampaignGroupSpendCap;
    this.mMinDailyBudget = instance.mMinDailyBudget;
    this.mMinLiveBoostingBudget = instance.mMinLiveBoostingBudget;
    this.mMinPayment = instance.mMinPayment;
    this.mMinimumBudgets = instance.mMinimumBudgets;
    this.mModeledReportingType = instance.mModeledReportingType;
    this.mMooDefaultConversionBid = instance.mMooDefaultConversionBid;
    this.mName = instance.mName;
    this.mNamingTemplates = instance.mNamingTemplates;
    this.mNextBillDate = instance.mNextBillDate;
    this.mOfflineConversionDataSets = instance.mOfflineConversionDataSets;
    this.mOffsitePixelsTosAccepted = instance.mOffsitePixelsTosAccepted;
    this.mOnbehalfRequests = instance.mOnbehalfRequests;
    this.mOpportunityScore = instance.mOpportunityScore;
    this.mOpportunityScoreWeight = instance.mOpportunityScoreWeight;
    this.mOwner = instance.mOwner;
    this.mOwnerBusiness = instance.mOwnerBusiness;
    this.mPageAuthorizedCountryForPoliticalAds = instance.mPageAuthorizedCountryForPoliticalAds;
    this.mPagesInAuthorizations = instance.mPagesInAuthorizations;
    this.mPartner = instance.mPartner;
    this.mPaymentOptions = instance.mPaymentOptions;
    this.mPendingBillingDatePreference = instance.mPendingBillingDatePreference;
    this.mPrepayAccountBalance = instance.mPrepayAccountBalance;
    this.mPromotePages = instance.mPromotePages;
    this.mPromotionMetadata = instance.mPromotionMetadata;
    this.mPromotionMetadataLiveCrawl = instance.mPromotionMetadataLiveCrawl;
    this.mPublisherBlockLists = instance.mPublisherBlockLists;
    this.mReachestimate = instance.mReachestimate;
    this.mReachfrequencypredictions = instance.mReachfrequencypredictions;
    this.mRecommendations = instance.mRecommendations;
    this.mRfSpec = instance.mRfSpec;
    this.mSalesSegmentV2 = instance.mSalesSegmentV2;
    this.mSavedAudiences = instance.mSavedAudiences;
    this.mSegment = instance.mSegment;
    this.mSendBillToAddress = instance.mSendBillToAddress;
    this.mSendBillToAddresses = instance.mSendBillToAddresses;
    this.mShowCheckoutExperience = instance.mShowCheckoutExperience;
    this.mShowImprovedBoleto = instance.mShowImprovedBoleto;
    this.mShowSacCampaignGroupInput = instance.mShowSacCampaignGroupInput;
    this.mSiteLinksLiveCrawl = instance.mSiteLinksLiveCrawl;
    this.mSoldToAddress = instance.mSoldToAddress;
    this.mSoldToAddresses = instance.mSoldToAddresses;
    this.mSoldToOrg = instance.mSoldToOrg;
    this.mSpendCap = instance.mSpendCap;
    this.mSpendCapHistory = instance.mSpendCapHistory;
    this.mSpendlimits = instance.mSpendlimits;
    this.mStoredBalanceStatus = instance.mStoredBalanceStatus;
    this.mSubscribedApps = instance.mSubscribedApps;
    this.mTargetingbrowse = instance.mTargetingbrowse;
    this.mTargetingsearch = instance.mTargetingsearch;
    this.mTargetingsuggestions = instance.mTargetingsuggestions;
    this.mTaxCountry = instance.mTaxCountry;
    this.mTaxExempt = instance.mTaxExempt;
    this.mTaxId = instance.mTaxId;
    this.mTaxIdStatus = instance.mTaxIdStatus;
    this.mTaxIdType = instance.mTaxIdType;
    this.mTimezoneId = instance.mTimezoneId;
    this.mTimezoneName = instance.mTimezoneName;
    this.mTimezoneOffsetHoursUtc = instance.mTimezoneOffsetHoursUtc;
    this.mTosAccepted = instance.mTosAccepted;
    this.mTotalPrepayBalance = instance.mTotalPrepayBalance;
    this.mTracking = instance.mTracking;
    this.mTransactions = instance.mTransactions;
    this.mUserAccessExpireTime = instance.mUserAccessExpireTime;
    this.mUserRole = instance.mUserRole;
    this.mUserSettings = instance.mUserSettings;
    this.mUserTasks = instance.mUserTasks;
    this.mUserTosAccepted = instance.mUserTosAccepted;
    this.mUserpermissions = instance.mUserpermissions;
    this.mUsers = instance.mUsers;
    this.mValueRuleSet = instance.mValueRuleSet;
    this.mVideoAds = instance.mVideoAds;
    this.mViewableBusiness = instance.mViewableBusiness;
    this.mViewableBusinesses = instance.mViewableBusinesses;
    this.context = instance.context;
    this.rawValue = instance.rawValue;
    return this;
  }

  public static APIRequest.ResponseParser<AdAccountGet> getParser() {
    return new APIRequest.ResponseParser<AdAccountGet>() {
      public APINodeList<AdAccountGet> parseResponse(String response, APIContext context, APIRequest<AdAccountGet> request, String header) throws MalformedResponseException {
        return AdAccountGet.parseResponse(response, context, request, header);
      }
    };
  }
}
