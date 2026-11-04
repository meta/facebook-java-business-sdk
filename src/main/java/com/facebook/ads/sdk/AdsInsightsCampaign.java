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
public class AdsInsightsCampaign extends APINode {
  @SerializedName("id")
  private String mId = null;
  protected static Gson gson = null;

  public AdsInsightsCampaign() {
  }

  public String getId() {
    return getFieldId().toString();
  }
  public static AdsInsightsCampaign loadJSON(String json, APIContext context, String header) {
    AdsInsightsCampaign adsInsightsCampaign = getGson().fromJson(json, AdsInsightsCampaign.class);
    if (context.isDebug()) {
      JsonParser parser = new JsonParser();
      JsonElement o1 = parser.parse(json);
      JsonElement o2 = parser.parse(adsInsightsCampaign.toString());
      if (o1.getAsJsonObject().get("__fb_trace_id__") != null) {
        o2.getAsJsonObject().add("__fb_trace_id__", o1.getAsJsonObject().get("__fb_trace_id__"));
      }
      if (!o1.equals(o2)) {
        context.log("[Warning] When parsing response, object is not consistent with JSON:");
        context.log("[JSON]" + o1);
        context.log("[Object]" + o2);
      }
    }
    adsInsightsCampaign.context = context;
    adsInsightsCampaign.rawValue = json;
    adsInsightsCampaign.header = header;
    return adsInsightsCampaign;
  }

  public static APINodeList<AdsInsightsCampaign> parseResponse(String json, APIContext context, APIRequest request, String header) throws MalformedResponseException {
    APINodeList<AdsInsightsCampaign> adsInsightsCampaigns = new APINodeList<AdsInsightsCampaign>(request, json, header);
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
          adsInsightsCampaigns.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
        };
        return adsInsightsCampaigns;
      } else if (result.isJsonObject()) {
        obj = result.getAsJsonObject();
        if (obj.has("data")) {
          if (obj.has("paging")) {
            JsonObject paging = obj.get("paging").getAsJsonObject();
            if (paging.has("cursors")) {
                JsonObject cursors = paging.get("cursors").getAsJsonObject();
                String before = cursors.has("before") ? cursors.get("before").getAsString() : null;
                String after = cursors.has("after") ? cursors.get("after").getAsString() : null;
                adsInsightsCampaigns.setCursors(before, after);
            }
            String previous = paging.has("previous") ? paging.get("previous").getAsString() : null;
            String next = paging.has("next") ? paging.get("next").getAsString() : null;
            adsInsightsCampaigns.setPaging(previous, next);
            if (context.hasAppSecret()) {
              adsInsightsCampaigns.setAppSecret(context.getAppSecretProof());
            }
          }
          if (obj.get("data").isJsonArray()) {
            // Second, check if it's a JSON array with "data"
            arr = obj.get("data").getAsJsonArray();
            for (int i = 0; i < arr.size(); i++) {
              adsInsightsCampaigns.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
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
                  adsInsightsCampaigns.add(loadJSON(entry.getValue().toString(), context, header));
                }
                break;
              }
            }
            if (!isRedownload) {
              adsInsightsCampaigns.add(loadJSON(obj.toString(), context, header));
            }
          }
          return adsInsightsCampaigns;
        } else if (obj.has("images")) {
          // Fourth, check if it's a map of image objects
          obj = obj.get("images").getAsJsonObject();
          for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
              adsInsightsCampaigns.add(loadJSON(entry.getValue().toString(), context, header));
          }
          return adsInsightsCampaigns;
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
              adsInsightsCampaigns.add(loadJSON(value.toString(), context, header));
            } else {
              isIdIndexedArray = false;
              break;
            }
          }
          if (isIdIndexedArray) {
            return adsInsightsCampaigns;
          }

          // Sixth, check if it's pure JsonObject
          adsInsightsCampaigns.clear();
          adsInsightsCampaigns.add(loadJSON(json, context, header));
          return adsInsightsCampaigns;
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

  public APIRequestGenpost genpost() {
    return new APIRequestGenpost(this.getId(), context);
  }


  public String getFieldId() {
    return mId;
  }

  public AdsInsightsCampaign setFieldId(String value) {
    this.mId = value;
    return this;
  }



  public static class APIRequestGenpost extends APIRequest<AdsInsightsCampaignPost> {

    AdsInsightsCampaignPost lastResponse = null;
    @Override
    public AdsInsightsCampaignPost getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "action_attribution_windows",
      "action_breakdowns",
      "action_report_time",
      "am_call_tags",
      "breakdowns",
      "comparison_fields",
      "comparison_time_ranges",
      "date_preset",
      "default_attribution_windows",
      "default_summary",
      "enable_trace",
      "export_columns",
      "export_format",
      "export_name",
      "fields",
      "filtering",
      "flog",
      "graph_cache",
      "include_zeros",
      "level",
      "limit",
      "meta_breakdowns",
      "product_id_limit",
      "round_up_level",
      "run_id",
      "saber_setsuna_perf_request_id",
      "scenario_run_id",
      "sort",
      "summary",
      "summary_action_breakdowns",
      "time_increment",
      "time_range",
      "time_ranges",
      "use_account_attribution_setting",
      "use_unified_attribution_setting",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdsInsightsCampaignPost parseResponse(String response, String header) throws APIException {
      return AdsInsightsCampaignPost.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdsInsightsCampaignPost execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdsInsightsCampaignPost execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdsInsightsCampaignPost> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdsInsightsCampaignPost> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdsInsightsCampaignPost>() {
           public AdsInsightsCampaignPost apply(ResponseWrapper result) {
             try {
               return APIRequestGenpost.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         },
         MoreExecutors.directExecutor()
      );
    };

    public APIRequestGenpost(String nodeId, APIContext context) {
      super(context, nodeId, "/insights", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGenpost setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGenpost setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGenpost setActionAttributionWindows (String actionAttributionWindows) {
      this.setParam("action_attribution_windows", actionAttributionWindows);
      return this;
    }

    public APIRequestGenpost setActionBreakdowns (String actionBreakdowns) {
      this.setParam("action_breakdowns", actionBreakdowns);
      return this;
    }

    public APIRequestGenpost setActionReportTime (String actionReportTime) {
      this.setParam("action_report_time", actionReportTime);
      return this;
    }

    public APIRequestGenpost setAmCallTags (String amCallTags) {
      this.setParam("am_call_tags", amCallTags);
      return this;
    }

    public APIRequestGenpost setBreakdowns (String breakdowns) {
      this.setParam("breakdowns", breakdowns);
      return this;
    }

    public APIRequestGenpost setComparisonFields (String comparisonFields) {
      this.setParam("comparison_fields", comparisonFields);
      return this;
    }

    public APIRequestGenpost setComparisonTimeRanges (String comparisonTimeRanges) {
      this.setParam("comparison_time_ranges", comparisonTimeRanges);
      return this;
    }

    public APIRequestGenpost setDatePreset (String datePreset) {
      this.setParam("date_preset", datePreset);
      return this;
    }

    public APIRequestGenpost setDefaultAttributionWindows (String defaultAttributionWindows) {
      this.setParam("default_attribution_windows", defaultAttributionWindows);
      return this;
    }

    public APIRequestGenpost setDefaultSummary (String defaultSummary) {
      this.setParam("default_summary", defaultSummary);
      return this;
    }

    public APIRequestGenpost setEnableTrace (String enableTrace) {
      this.setParam("enable_trace", enableTrace);
      return this;
    }

    public APIRequestGenpost setExportColumns (String exportColumns) {
      this.setParam("export_columns", exportColumns);
      return this;
    }

    public APIRequestGenpost setExportFormat (String exportFormat) {
      this.setParam("export_format", exportFormat);
      return this;
    }

    public APIRequestGenpost setExportName (String exportName) {
      this.setParam("export_name", exportName);
      return this;
    }

    public APIRequestGenpost setFields (String fields) {
      this.setParam("fields", fields);
      return this;
    }

    public APIRequestGenpost setFiltering (String filtering) {
      this.setParam("filtering", filtering);
      return this;
    }

    public APIRequestGenpost setFlog (String flog) {
      this.setParam("flog", flog);
      return this;
    }

    public APIRequestGenpost setGraphCache (String graphCache) {
      this.setParam("graph_cache", graphCache);
      return this;
    }

    public APIRequestGenpost setIncludeZeros (String includeZeros) {
      this.setParam("include_zeros", includeZeros);
      return this;
    }

    public APIRequestGenpost setLevel (String level) {
      this.setParam("level", level);
      return this;
    }

    public APIRequestGenpost setLimit (String limit) {
      this.setParam("limit", limit);
      return this;
    }

    public APIRequestGenpost setMetaBreakdowns (String metaBreakdowns) {
      this.setParam("meta_breakdowns", metaBreakdowns);
      return this;
    }

    public APIRequestGenpost setProductIdLimit (String productIdLimit) {
      this.setParam("product_id_limit", productIdLimit);
      return this;
    }

    public APIRequestGenpost setRoundUpLevel (String roundUpLevel) {
      this.setParam("round_up_level", roundUpLevel);
      return this;
    }

    public APIRequestGenpost setRunId (String runId) {
      this.setParam("run_id", runId);
      return this;
    }

    public APIRequestGenpost setSaberSetsunaPerfRequestId (String saberSetsunaPerfRequestId) {
      this.setParam("saber_setsuna_perf_request_id", saberSetsunaPerfRequestId);
      return this;
    }

    public APIRequestGenpost setScenarioRunId (String scenarioRunId) {
      this.setParam("scenario_run_id", scenarioRunId);
      return this;
    }

    public APIRequestGenpost setSort (String sort) {
      this.setParam("sort", sort);
      return this;
    }

    public APIRequestGenpost setSummary (String summary) {
      this.setParam("summary", summary);
      return this;
    }

    public APIRequestGenpost setSummaryActionBreakdowns (String summaryActionBreakdowns) {
      this.setParam("summary_action_breakdowns", summaryActionBreakdowns);
      return this;
    }

    public APIRequestGenpost setTimeIncrement (String timeIncrement) {
      this.setParam("time_increment", timeIncrement);
      return this;
    }

    public APIRequestGenpost setTimeRange (String timeRange) {
      this.setParam("time_range", timeRange);
      return this;
    }

    public APIRequestGenpost setTimeRanges (String timeRanges) {
      this.setParam("time_ranges", timeRanges);
      return this;
    }

    public APIRequestGenpost setUseAccountAttributionSetting (String useAccountAttributionSetting) {
      this.setParam("use_account_attribution_setting", useAccountAttributionSetting);
      return this;
    }

    public APIRequestGenpost setUseUnifiedAttributionSetting (String useUnifiedAttributionSetting) {
      this.setParam("use_unified_attribution_setting", useUnifiedAttributionSetting);
      return this;
    }

    public APIRequestGenpost requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGenpost requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGenpost requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGenpost requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGenpost requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGenpost requestField (String field, boolean value) {
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

  public AdsInsightsCampaign copyFrom(AdsInsightsCampaign instance) {
    this.mId = instance.mId;
    this.context = instance.context;
    this.rawValue = instance.rawValue;
    return this;
  }

  public static APIRequest.ResponseParser<AdsInsightsCampaign> getParser() {
    return new APIRequest.ResponseParser<AdsInsightsCampaign>() {
      public APINodeList<AdsInsightsCampaign> parseResponse(String response, APIContext context, APIRequest<AdsInsightsCampaign> request, String header) throws MalformedResponseException {
        return AdsInsightsCampaign.parseResponse(response, context, request, header);
      }
    };
  }
}
