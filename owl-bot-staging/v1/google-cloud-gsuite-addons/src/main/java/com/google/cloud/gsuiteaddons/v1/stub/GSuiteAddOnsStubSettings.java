/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.gsuiteaddons.v1.stub;

import static com.google.cloud.gsuiteaddons.v1.GSuiteAddOnsClient.ListDeploymentsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.gsuiteaddons.v1.Authorization;
import com.google.cloud.gsuiteaddons.v1.CreateDeploymentRequest;
import com.google.cloud.gsuiteaddons.v1.DeleteDeploymentRequest;
import com.google.cloud.gsuiteaddons.v1.Deployment;
import com.google.cloud.gsuiteaddons.v1.GetAuthorizationRequest;
import com.google.cloud.gsuiteaddons.v1.GetDeploymentRequest;
import com.google.cloud.gsuiteaddons.v1.GetInstallStatusRequest;
import com.google.cloud.gsuiteaddons.v1.InstallDeploymentRequest;
import com.google.cloud.gsuiteaddons.v1.InstallStatus;
import com.google.cloud.gsuiteaddons.v1.ListDeploymentsRequest;
import com.google.cloud.gsuiteaddons.v1.ListDeploymentsResponse;
import com.google.cloud.gsuiteaddons.v1.ReplaceDeploymentRequest;
import com.google.cloud.gsuiteaddons.v1.UninstallDeploymentRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link GSuiteAddOnsStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li> The default service address (gsuiteaddons.googleapis.com) and default port (443) are used.
 *   <li> Credentials are acquired automatically through Application Default Credentials.
 *   <li> Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getAuthorization to 30 seconds:
 *
 * <pre>{@code
 * GSuiteAddOnsStubSettings.Builder gSuiteAddOnsSettingsBuilder =
 *     GSuiteAddOnsStubSettings.newBuilder();
 * gSuiteAddOnsSettingsBuilder
 *     .getAuthorizationSettings()
 *     .setRetrySettings(
 *         gSuiteAddOnsSettingsBuilder
 *             .getAuthorizationSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * GSuiteAddOnsStubSettings gSuiteAddOnsSettings = gSuiteAddOnsSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class GSuiteAddOnsStubSettings extends StubSettings<GSuiteAddOnsStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<GetAuthorizationRequest, Authorization> getAuthorizationSettings;
  private final UnaryCallSettings<CreateDeploymentRequest, Deployment> createDeploymentSettings;
  private final UnaryCallSettings<ReplaceDeploymentRequest, Deployment> replaceDeploymentSettings;
  private final UnaryCallSettings<GetDeploymentRequest, Deployment> getDeploymentSettings;
  private final PagedCallSettings<
          ListDeploymentsRequest, ListDeploymentsResponse, ListDeploymentsPagedResponse>
      listDeploymentsSettings;
  private final UnaryCallSettings<DeleteDeploymentRequest, Empty> deleteDeploymentSettings;
  private final UnaryCallSettings<InstallDeploymentRequest, Empty> installDeploymentSettings;
  private final UnaryCallSettings<UninstallDeploymentRequest, Empty> uninstallDeploymentSettings;
  private final UnaryCallSettings<GetInstallStatusRequest, InstallStatus> getInstallStatusSettings;

  private static final PagedListDescriptor<
          ListDeploymentsRequest, ListDeploymentsResponse, Deployment>
      LIST_DEPLOYMENTS_PAGE_STR_DESC =
          new PagedListDescriptor<ListDeploymentsRequest, ListDeploymentsResponse, Deployment>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListDeploymentsRequest injectToken(
                ListDeploymentsRequest payload, String token) {
              return ListDeploymentsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListDeploymentsRequest injectPageSize(
                ListDeploymentsRequest payload, int pageSize) {
              return ListDeploymentsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListDeploymentsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListDeploymentsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Deployment> extractResources(ListDeploymentsResponse payload) {
              return payload.getDeploymentsList() == null
                  ? ImmutableList.<Deployment>of()
                  : payload.getDeploymentsList();
            }
          };

  private static final PagedListResponseFactory<
          ListDeploymentsRequest, ListDeploymentsResponse, ListDeploymentsPagedResponse>
      LIST_DEPLOYMENTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListDeploymentsRequest, ListDeploymentsResponse, ListDeploymentsPagedResponse>() {
            @Override
            public ApiFuture<ListDeploymentsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListDeploymentsRequest, ListDeploymentsResponse> callable,
                ListDeploymentsRequest request,
                ApiCallContext context,
                ApiFuture<ListDeploymentsResponse> futureResponse) {
              PageContext<ListDeploymentsRequest, ListDeploymentsResponse, Deployment> pageContext =
                  PageContext.create(callable, LIST_DEPLOYMENTS_PAGE_STR_DESC, request, context);
              return ListDeploymentsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to getAuthorization. */
  public UnaryCallSettings<GetAuthorizationRequest, Authorization> getAuthorizationSettings() {
    return getAuthorizationSettings;
  }

  /** Returns the object with the settings used for calls to createDeployment. */
  public UnaryCallSettings<CreateDeploymentRequest, Deployment> createDeploymentSettings() {
    return createDeploymentSettings;
  }

  /** Returns the object with the settings used for calls to replaceDeployment. */
  public UnaryCallSettings<ReplaceDeploymentRequest, Deployment> replaceDeploymentSettings() {
    return replaceDeploymentSettings;
  }

  /** Returns the object with the settings used for calls to getDeployment. */
  public UnaryCallSettings<GetDeploymentRequest, Deployment> getDeploymentSettings() {
    return getDeploymentSettings;
  }

  /** Returns the object with the settings used for calls to listDeployments. */
  public PagedCallSettings<
          ListDeploymentsRequest, ListDeploymentsResponse, ListDeploymentsPagedResponse>
      listDeploymentsSettings() {
    return listDeploymentsSettings;
  }

  /** Returns the object with the settings used for calls to deleteDeployment. */
  public UnaryCallSettings<DeleteDeploymentRequest, Empty> deleteDeploymentSettings() {
    return deleteDeploymentSettings;
  }

  /** Returns the object with the settings used for calls to installDeployment. */
  public UnaryCallSettings<InstallDeploymentRequest, Empty> installDeploymentSettings() {
    return installDeploymentSettings;
  }

  /** Returns the object with the settings used for calls to uninstallDeployment. */
  public UnaryCallSettings<UninstallDeploymentRequest, Empty> uninstallDeploymentSettings() {
    return uninstallDeploymentSettings;
  }

  /** Returns the object with the settings used for calls to getInstallStatus. */
  public UnaryCallSettings<GetInstallStatusRequest, InstallStatus> getInstallStatusSettings() {
    return getInstallStatusSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public GSuiteAddOnsStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcGSuiteAddOnsStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "gsuiteaddons.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(GSuiteAddOnsStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected GSuiteAddOnsStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    getAuthorizationSettings = settingsBuilder.getAuthorizationSettings().build();
    createDeploymentSettings = settingsBuilder.createDeploymentSettings().build();
    replaceDeploymentSettings = settingsBuilder.replaceDeploymentSettings().build();
    getDeploymentSettings = settingsBuilder.getDeploymentSettings().build();
    listDeploymentsSettings = settingsBuilder.listDeploymentsSettings().build();
    deleteDeploymentSettings = settingsBuilder.deleteDeploymentSettings().build();
    installDeploymentSettings = settingsBuilder.installDeploymentSettings().build();
    uninstallDeploymentSettings = settingsBuilder.uninstallDeploymentSettings().build();
    getInstallStatusSettings = settingsBuilder.getInstallStatusSettings().build();
  }

  /** Builder for GSuiteAddOnsStubSettings. */
  public static class Builder extends StubSettings.Builder<GSuiteAddOnsStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<GetAuthorizationRequest, Authorization>
        getAuthorizationSettings;
    private final UnaryCallSettings.Builder<CreateDeploymentRequest, Deployment>
        createDeploymentSettings;
    private final UnaryCallSettings.Builder<ReplaceDeploymentRequest, Deployment>
        replaceDeploymentSettings;
    private final UnaryCallSettings.Builder<GetDeploymentRequest, Deployment> getDeploymentSettings;
    private final PagedCallSettings.Builder<
            ListDeploymentsRequest, ListDeploymentsResponse, ListDeploymentsPagedResponse>
        listDeploymentsSettings;
    private final UnaryCallSettings.Builder<DeleteDeploymentRequest, Empty>
        deleteDeploymentSettings;
    private final UnaryCallSettings.Builder<InstallDeploymentRequest, Empty>
        installDeploymentSettings;
    private final UnaryCallSettings.Builder<UninstallDeploymentRequest, Empty>
        uninstallDeploymentSettings;
    private final UnaryCallSettings.Builder<GetInstallStatusRequest, InstallStatus>
        getInstallStatusSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_2_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "no_retry_1_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.UNAVAILABLE, StatusCode.Code.UNKNOWN)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(120000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(120000L))
              .setTotalTimeout(Duration.ofMillis(120000L))
              .build();
      definitions.put("no_retry_2_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(10000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(10000L))
              .setTotalTimeout(Duration.ofMillis(10000L))
              .build();
      definitions.put("no_retry_1_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(1000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(10000L))
              .setInitialRpcTimeout(Duration.ofMillis(10000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(10000L))
              .setTotalTimeout(Duration.ofMillis(10000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      getAuthorizationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createDeploymentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      replaceDeploymentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getDeploymentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listDeploymentsSettings = PagedCallSettings.newBuilder(LIST_DEPLOYMENTS_PAGE_STR_FACT);
      deleteDeploymentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      installDeploymentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      uninstallDeploymentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getInstallStatusSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getAuthorizationSettings,
              createDeploymentSettings,
              replaceDeploymentSettings,
              getDeploymentSettings,
              listDeploymentsSettings,
              deleteDeploymentSettings,
              installDeploymentSettings,
              uninstallDeploymentSettings,
              getInstallStatusSettings);
      initDefaults(this);
    }

    protected Builder(GSuiteAddOnsStubSettings settings) {
      super(settings);

      getAuthorizationSettings = settings.getAuthorizationSettings.toBuilder();
      createDeploymentSettings = settings.createDeploymentSettings.toBuilder();
      replaceDeploymentSettings = settings.replaceDeploymentSettings.toBuilder();
      getDeploymentSettings = settings.getDeploymentSettings.toBuilder();
      listDeploymentsSettings = settings.listDeploymentsSettings.toBuilder();
      deleteDeploymentSettings = settings.deleteDeploymentSettings.toBuilder();
      installDeploymentSettings = settings.installDeploymentSettings.toBuilder();
      uninstallDeploymentSettings = settings.uninstallDeploymentSettings.toBuilder();
      getInstallStatusSettings = settings.getInstallStatusSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getAuthorizationSettings,
              createDeploymentSettings,
              replaceDeploymentSettings,
              getDeploymentSettings,
              listDeploymentsSettings,
              deleteDeploymentSettings,
              installDeploymentSettings,
              uninstallDeploymentSettings,
              getInstallStatusSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .getAuthorizationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_2_params"));

      builder
          .createDeploymentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .replaceDeploymentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getDeploymentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listDeploymentsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteDeploymentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .installDeploymentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .uninstallDeploymentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getInstallStatusSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      return builder;
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to getAuthorization. */
    public UnaryCallSettings.Builder<GetAuthorizationRequest, Authorization>
        getAuthorizationSettings() {
      return getAuthorizationSettings;
    }

    /** Returns the builder for the settings used for calls to createDeployment. */
    public UnaryCallSettings.Builder<CreateDeploymentRequest, Deployment>
        createDeploymentSettings() {
      return createDeploymentSettings;
    }

    /** Returns the builder for the settings used for calls to replaceDeployment. */
    public UnaryCallSettings.Builder<ReplaceDeploymentRequest, Deployment>
        replaceDeploymentSettings() {
      return replaceDeploymentSettings;
    }

    /** Returns the builder for the settings used for calls to getDeployment. */
    public UnaryCallSettings.Builder<GetDeploymentRequest, Deployment> getDeploymentSettings() {
      return getDeploymentSettings;
    }

    /** Returns the builder for the settings used for calls to listDeployments. */
    public PagedCallSettings.Builder<
            ListDeploymentsRequest, ListDeploymentsResponse, ListDeploymentsPagedResponse>
        listDeploymentsSettings() {
      return listDeploymentsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteDeployment. */
    public UnaryCallSettings.Builder<DeleteDeploymentRequest, Empty> deleteDeploymentSettings() {
      return deleteDeploymentSettings;
    }

    /** Returns the builder for the settings used for calls to installDeployment. */
    public UnaryCallSettings.Builder<InstallDeploymentRequest, Empty> installDeploymentSettings() {
      return installDeploymentSettings;
    }

    /** Returns the builder for the settings used for calls to uninstallDeployment. */
    public UnaryCallSettings.Builder<UninstallDeploymentRequest, Empty>
        uninstallDeploymentSettings() {
      return uninstallDeploymentSettings;
    }

    /** Returns the builder for the settings used for calls to getInstallStatus. */
    public UnaryCallSettings.Builder<GetInstallStatusRequest, InstallStatus>
        getInstallStatusSettings() {
      return getInstallStatusSettings;
    }

    @Override
    public GSuiteAddOnsStubSettings build() throws IOException {
      return new GSuiteAddOnsStubSettings(this);
    }
  }
}
