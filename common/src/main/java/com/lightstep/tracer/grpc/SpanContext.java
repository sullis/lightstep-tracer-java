// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: collector.proto

package com.lightstep.tracer.grpc;

/**
 * Protobuf type {@code lightstep.collector.SpanContext}
 */
public  final class SpanContext extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lightstep.collector.SpanContext)
        SpanContextOrBuilder {
  // Use SpanContext.newBuilder() to construct.
  private SpanContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpanContext() {
    traceId_ = 0L;
    spanId_ = 0L;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SpanContext(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            traceId_ = input.readUInt64();
            break;
          }
          case 16: {

            spanId_ = input.readUInt64();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              baggage_ = com.google.protobuf.MapField.newMapField(
                  BaggageDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000004;
            }
            com.google.protobuf.MapEntry<String, String>
            baggage__ = input.readMessage(
                BaggageDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            baggage_.getMutableMap().put(
                baggage__.getKey(), baggage__.getValue());
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_SpanContext_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetBaggage();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_SpanContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.lightstep.tracer.grpc.SpanContext.class, com.lightstep.tracer.grpc.SpanContext.Builder.class);
  }

  private int bitField0_;
  public static final int TRACE_ID_FIELD_NUMBER = 1;
  private long traceId_;
  /**
   * <code>optional uint64 trace_id = 1;</code>
   */
  public long getTraceId() {
    return traceId_;
  }

  public static final int SPAN_ID_FIELD_NUMBER = 2;
  private long spanId_;
  /**
   * <code>optional uint64 span_id = 2;</code>
   */
  public long getSpanId() {
    return spanId_;
  }

  public static final int BAGGAGE_FIELD_NUMBER = 3;
  private static final class BaggageDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        String, String> defaultEntry =
            com.google.protobuf.MapEntry
            .<String, String>newDefaultInstance(
                com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_SpanContext_BaggageEntry_descriptor,
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      String, String> baggage_;
  private com.google.protobuf.MapField<String, String>
  internalGetBaggage() {
    if (baggage_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          BaggageDefaultEntryHolder.defaultEntry);
    }
    return baggage_;
  }

  public int getBaggageCount() {
    return internalGetBaggage().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; baggage = 3;</code>
   */

  public boolean containsBaggage(
      String key) {
    if (key == null) { throw new NullPointerException(); }
    return internalGetBaggage().getMap().containsKey(key);
  }
  /**
   * Use {@link #getBaggageMap()} instead.
   */
  @Deprecated
  public java.util.Map<String, String> getBaggage() {
    return getBaggageMap();
  }
  /**
   * <code>map&lt;string, string&gt; baggage = 3;</code>
   */

  public java.util.Map<String, String> getBaggageMap() {
    return internalGetBaggage().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; baggage = 3;</code>
   */

  public String getBaggageOrDefault(
      String key,
      String defaultValue) {
    if (key == null) { throw new NullPointerException(); }
    java.util.Map<String, String> map =
        internalGetBaggage().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; baggage = 3;</code>
   */

  public String getBaggageOrThrow(
      String key) {
    if (key == null) { throw new NullPointerException(); }
    java.util.Map<String, String> map =
        internalGetBaggage().getMap();
    if (!map.containsKey(key)) {
      throw new IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (traceId_ != 0L) {
      output.writeUInt64(1, traceId_);
    }
    if (spanId_ != 0L) {
      output.writeUInt64(2, spanId_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetBaggage(),
        BaggageDefaultEntryHolder.defaultEntry,
        3);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (traceId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, traceId_);
    }
    if (spanId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, spanId_);
    }
    for (java.util.Map.Entry<String, String> entry
         : internalGetBaggage().getMap().entrySet()) {
      com.google.protobuf.MapEntry<String, String>
      baggage__ = BaggageDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, baggage__);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.lightstep.tracer.grpc.SpanContext)) {
      return super.equals(obj);
    }
    com.lightstep.tracer.grpc.SpanContext other = (com.lightstep.tracer.grpc.SpanContext) obj;

    boolean result = true;
    result = result && (getTraceId()
        == other.getTraceId());
    result = result && (getSpanId()
        == other.getSpanId());
    result = result && internalGetBaggage().equals(
        other.internalGetBaggage());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + TRACE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTraceId());
    hash = (37 * hash) + SPAN_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSpanId());
    if (!internalGetBaggage().getMap().isEmpty()) {
      hash = (37 * hash) + BAGGAGE_FIELD_NUMBER;
      hash = (53 * hash) + internalGetBaggage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.lightstep.tracer.grpc.SpanContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.lightstep.tracer.grpc.SpanContext prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code lightstep.collector.SpanContext}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lightstep.collector.SpanContext)
      com.lightstep.tracer.grpc.SpanContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_SpanContext_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetBaggage();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableBaggage();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_SpanContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lightstep.tracer.grpc.SpanContext.class, com.lightstep.tracer.grpc.SpanContext.Builder.class);
    }

    // Construct using com.lightstep.tracer.grpc.SpanContext.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      traceId_ = 0L;

      spanId_ = 0L;

      internalGetMutableBaggage().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_SpanContext_descriptor;
    }

    public com.lightstep.tracer.grpc.SpanContext getDefaultInstanceForType() {
      return com.lightstep.tracer.grpc.SpanContext.getDefaultInstance();
    }

    public com.lightstep.tracer.grpc.SpanContext build() {
      com.lightstep.tracer.grpc.SpanContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.lightstep.tracer.grpc.SpanContext buildPartial() {
      com.lightstep.tracer.grpc.SpanContext result = new com.lightstep.tracer.grpc.SpanContext(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.traceId_ = traceId_;
      result.spanId_ = spanId_;
      result.baggage_ = internalGetBaggage();
      result.baggage_.makeImmutable();
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.lightstep.tracer.grpc.SpanContext) {
        return mergeFrom((com.lightstep.tracer.grpc.SpanContext)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.lightstep.tracer.grpc.SpanContext other) {
      if (other == com.lightstep.tracer.grpc.SpanContext.getDefaultInstance()) return this;
      if (other.getTraceId() != 0L) {
        setTraceId(other.getTraceId());
      }
      if (other.getSpanId() != 0L) {
        setSpanId(other.getSpanId());
      }
      internalGetMutableBaggage().mergeFrom(
          other.internalGetBaggage());
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.lightstep.tracer.grpc.SpanContext parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.lightstep.tracer.grpc.SpanContext) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long traceId_ ;
    /**
     * <code>optional uint64 trace_id = 1;</code>
     */
    public long getTraceId() {
      return traceId_;
    }
    /**
     * <code>optional uint64 trace_id = 1;</code>
     */
    public Builder setTraceId(long value) {

      traceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 trace_id = 1;</code>
     */
    public Builder clearTraceId() {

      traceId_ = 0L;
      onChanged();
      return this;
    }

    private long spanId_ ;
    /**
     * <code>optional uint64 span_id = 2;</code>
     */
    public long getSpanId() {
      return spanId_;
    }
    /**
     * <code>optional uint64 span_id = 2;</code>
     */
    public Builder setSpanId(long value) {

      spanId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 span_id = 2;</code>
     */
    public Builder clearSpanId() {

      spanId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        String, String> baggage_;
    private com.google.protobuf.MapField<String, String>
    internalGetBaggage() {
      if (baggage_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            BaggageDefaultEntryHolder.defaultEntry);
      }
      return baggage_;
    }
    private com.google.protobuf.MapField<String, String>
    internalGetMutableBaggage() {
      onChanged();;
      if (baggage_ == null) {
        baggage_ = com.google.protobuf.MapField.newMapField(
            BaggageDefaultEntryHolder.defaultEntry);
      }
      if (!baggage_.isMutable()) {
        baggage_ = baggage_.copy();
      }
      return baggage_;
    }

    public int getBaggageCount() {
      return internalGetBaggage().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; baggage = 3;</code>
     */

    public boolean containsBaggage(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      return internalGetBaggage().getMap().containsKey(key);
    }
    /**
     * Use {@link #getBaggageMap()} instead.
     */
    @Deprecated
    public java.util.Map<String, String> getBaggage() {
      return getBaggageMap();
    }
    /**
     * <code>map&lt;string, string&gt; baggage = 3;</code>
     */

    public java.util.Map<String, String> getBaggageMap() {
      return internalGetBaggage().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; baggage = 3;</code>
     */

    public String getBaggageOrDefault(
        String key,
        String defaultValue) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, String> map =
          internalGetBaggage().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; baggage = 3;</code>
     */

    public String getBaggageOrThrow(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, String> map =
          internalGetBaggage().getMap();
      if (!map.containsKey(key)) {
        throw new IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearBaggage() {
      getMutableBaggage().clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; baggage = 3;</code>
     */

    public Builder removeBaggage(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      getMutableBaggage().remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @Deprecated
    public java.util.Map<String, String>
    getMutableBaggage() {
      return internalGetMutableBaggage().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; baggage = 3;</code>
     */
    public Builder putBaggage(
        String key,
        String value) {
      if (key == null) { throw new NullPointerException(); }
      if (value == null) { throw new NullPointerException(); }
      getMutableBaggage().put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; baggage = 3;</code>
     */

    public Builder putAllBaggage(
        java.util.Map<String, String> values) {
      getMutableBaggage().putAll(values);
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:lightstep.collector.SpanContext)
  }

  // @@protoc_insertion_point(class_scope:lightstep.collector.SpanContext)
  private static final com.lightstep.tracer.grpc.SpanContext DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.lightstep.tracer.grpc.SpanContext();
  }

  public static com.lightstep.tracer.grpc.SpanContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpanContext>
      PARSER = new com.google.protobuf.AbstractParser<SpanContext>() {
    public SpanContext parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SpanContext(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SpanContext> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SpanContext> getParserForType() {
    return PARSER;
  }

  public com.lightstep.tracer.grpc.SpanContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

