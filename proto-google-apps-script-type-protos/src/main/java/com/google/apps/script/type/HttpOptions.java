/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/script/type/script_manifest.proto

package com.google.apps.script.type;

/**
 *
 *
 * <pre>
 * Options for sending requests to add-on HTTP endpoints
 * </pre>
 *
 * Protobuf type {@code google.apps.script.type.HttpOptions}
 */
public final class HttpOptions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.apps.script.type.HttpOptions)
    HttpOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use HttpOptions.newBuilder() to construct.
  private HttpOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private HttpOptions() {
    authorizationHeader_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new HttpOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private HttpOptions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8:
            {
              int rawValue = input.readEnum();

              authorizationHeader_ = rawValue;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.apps.script.type.ScriptManifest
        .internal_static_google_apps_script_type_HttpOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.script.type.ScriptManifest
        .internal_static_google_apps_script_type_HttpOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.script.type.HttpOptions.class,
            com.google.apps.script.type.HttpOptions.Builder.class);
  }

  public static final int AUTHORIZATION_HEADER_FIELD_NUMBER = 1;
  private int authorizationHeader_;
  /**
   *
   *
   * <pre>
   * Configuration for the token sent in the HTTP Authorization header
   * </pre>
   *
   * <code>.google.apps.script.type.HttpAuthorizationHeader authorization_header = 1;</code>
   *
   * @return The enum numeric value on the wire for authorizationHeader.
   */
  @java.lang.Override
  public int getAuthorizationHeaderValue() {
    return authorizationHeader_;
  }
  /**
   *
   *
   * <pre>
   * Configuration for the token sent in the HTTP Authorization header
   * </pre>
   *
   * <code>.google.apps.script.type.HttpAuthorizationHeader authorization_header = 1;</code>
   *
   * @return The authorizationHeader.
   */
  @java.lang.Override
  public com.google.apps.script.type.HttpAuthorizationHeader getAuthorizationHeader() {
    @SuppressWarnings("deprecation")
    com.google.apps.script.type.HttpAuthorizationHeader result =
        com.google.apps.script.type.HttpAuthorizationHeader.valueOf(authorizationHeader_);
    return result == null
        ? com.google.apps.script.type.HttpAuthorizationHeader.UNRECOGNIZED
        : result;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (authorizationHeader_
        != com.google.apps.script.type.HttpAuthorizationHeader.HTTP_AUTHORIZATION_HEADER_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, authorizationHeader_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (authorizationHeader_
        != com.google.apps.script.type.HttpAuthorizationHeader.HTTP_AUTHORIZATION_HEADER_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, authorizationHeader_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.apps.script.type.HttpOptions)) {
      return super.equals(obj);
    }
    com.google.apps.script.type.HttpOptions other = (com.google.apps.script.type.HttpOptions) obj;

    if (authorizationHeader_ != other.authorizationHeader_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AUTHORIZATION_HEADER_FIELD_NUMBER;
    hash = (53 * hash) + authorizationHeader_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.script.type.HttpOptions parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.script.type.HttpOptions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.script.type.HttpOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.script.type.HttpOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.script.type.HttpOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.script.type.HttpOptions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.script.type.HttpOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.script.type.HttpOptions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.script.type.HttpOptions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.apps.script.type.HttpOptions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.script.type.HttpOptions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.script.type.HttpOptions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.apps.script.type.HttpOptions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Options for sending requests to add-on HTTP endpoints
   * </pre>
   *
   * Protobuf type {@code google.apps.script.type.HttpOptions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.apps.script.type.HttpOptions)
      com.google.apps.script.type.HttpOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.apps.script.type.ScriptManifest
          .internal_static_google_apps_script_type_HttpOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.script.type.ScriptManifest
          .internal_static_google_apps_script_type_HttpOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.script.type.HttpOptions.class,
              com.google.apps.script.type.HttpOptions.Builder.class);
    }

    // Construct using com.google.apps.script.type.HttpOptions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      authorizationHeader_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.apps.script.type.ScriptManifest
          .internal_static_google_apps_script_type_HttpOptions_descriptor;
    }

    @java.lang.Override
    public com.google.apps.script.type.HttpOptions getDefaultInstanceForType() {
      return com.google.apps.script.type.HttpOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.script.type.HttpOptions build() {
      com.google.apps.script.type.HttpOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.script.type.HttpOptions buildPartial() {
      com.google.apps.script.type.HttpOptions result =
          new com.google.apps.script.type.HttpOptions(this);
      result.authorizationHeader_ = authorizationHeader_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.apps.script.type.HttpOptions) {
        return mergeFrom((com.google.apps.script.type.HttpOptions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.script.type.HttpOptions other) {
      if (other == com.google.apps.script.type.HttpOptions.getDefaultInstance()) return this;
      if (other.authorizationHeader_ != 0) {
        setAuthorizationHeaderValue(other.getAuthorizationHeaderValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.apps.script.type.HttpOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.apps.script.type.HttpOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int authorizationHeader_ = 0;
    /**
     *
     *
     * <pre>
     * Configuration for the token sent in the HTTP Authorization header
     * </pre>
     *
     * <code>.google.apps.script.type.HttpAuthorizationHeader authorization_header = 1;</code>
     *
     * @return The enum numeric value on the wire for authorizationHeader.
     */
    @java.lang.Override
    public int getAuthorizationHeaderValue() {
      return authorizationHeader_;
    }
    /**
     *
     *
     * <pre>
     * Configuration for the token sent in the HTTP Authorization header
     * </pre>
     *
     * <code>.google.apps.script.type.HttpAuthorizationHeader authorization_header = 1;</code>
     *
     * @param value The enum numeric value on the wire for authorizationHeader to set.
     * @return This builder for chaining.
     */
    public Builder setAuthorizationHeaderValue(int value) {

      authorizationHeader_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Configuration for the token sent in the HTTP Authorization header
     * </pre>
     *
     * <code>.google.apps.script.type.HttpAuthorizationHeader authorization_header = 1;</code>
     *
     * @return The authorizationHeader.
     */
    @java.lang.Override
    public com.google.apps.script.type.HttpAuthorizationHeader getAuthorizationHeader() {
      @SuppressWarnings("deprecation")
      com.google.apps.script.type.HttpAuthorizationHeader result =
          com.google.apps.script.type.HttpAuthorizationHeader.valueOf(authorizationHeader_);
      return result == null
          ? com.google.apps.script.type.HttpAuthorizationHeader.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Configuration for the token sent in the HTTP Authorization header
     * </pre>
     *
     * <code>.google.apps.script.type.HttpAuthorizationHeader authorization_header = 1;</code>
     *
     * @param value The authorizationHeader to set.
     * @return This builder for chaining.
     */
    public Builder setAuthorizationHeader(
        com.google.apps.script.type.HttpAuthorizationHeader value) {
      if (value == null) {
        throw new NullPointerException();
      }

      authorizationHeader_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Configuration for the token sent in the HTTP Authorization header
     * </pre>
     *
     * <code>.google.apps.script.type.HttpAuthorizationHeader authorization_header = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAuthorizationHeader() {

      authorizationHeader_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.apps.script.type.HttpOptions)
  }

  // @@protoc_insertion_point(class_scope:google.apps.script.type.HttpOptions)
  private static final com.google.apps.script.type.HttpOptions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.apps.script.type.HttpOptions();
  }

  public static com.google.apps.script.type.HttpOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HttpOptions> PARSER =
      new com.google.protobuf.AbstractParser<HttpOptions>() {
        @java.lang.Override
        public HttpOptions parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new HttpOptions(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<HttpOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HttpOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.script.type.HttpOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
