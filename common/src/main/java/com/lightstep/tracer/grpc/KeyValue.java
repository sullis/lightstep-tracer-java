// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: collector.proto

package com.lightstep.tracer.grpc;

/**
 * Protobuf type {@code lightstep.collector.KeyValue}
 */
public  final class KeyValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lightstep.collector.KeyValue)
        KeyValueOrBuilder {
  // Use KeyValue.newBuilder() to construct.
  private KeyValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeyValue() {
    key_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private KeyValue(
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
          case 10: {
            String s = input.readStringRequireUtf8();

            key_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();
            valueCase_ = 2;
            value_ = s;
            break;
          }
          case 24: {
            valueCase_ = 3;
            value_ = input.readInt64();
            break;
          }
          case 33: {
            valueCase_ = 4;
            value_ = input.readDouble();
            break;
          }
          case 40: {
            valueCase_ = 5;
            value_ = input.readBool();
            break;
          }
          case 50: {
            String s = input.readStringRequireUtf8();
            valueCase_ = 6;
            value_ = s;
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
    return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_KeyValue_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_KeyValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.lightstep.tracer.grpc.KeyValue.class, com.lightstep.tracer.grpc.KeyValue.Builder.class);
  }

  private int valueCase_ = 0;
  private Object value_;
  public enum ValueCase
      implements com.google.protobuf.Internal.EnumLite {
    STRING_VALUE(2),
    INT_VALUE(3),
    DOUBLE_VALUE(4),
    BOOL_VALUE(5),
    JSON_VALUE(6),
    VALUE_NOT_SET(0);
    private final int value;
    private ValueCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 2: return STRING_VALUE;
        case 3: return INT_VALUE;
        case 4: return DOUBLE_VALUE;
        case 5: return BOOL_VALUE;
        case 6: return JSON_VALUE;
        case 0: return VALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValueCase
  getValueCase() {
    return ValueCase.forNumber(
        valueCase_);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private volatile Object key_;
  /**
   * <code>optional string key = 1;</code>
   */
  public String getKey() {
    Object ref = key_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <code>optional string key = 1;</code>
   */
  public com.google.protobuf.ByteString
      getKeyBytes() {
    Object ref = key_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STRING_VALUE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Holds arbitrary string data; well-formed JSON strings should go in
   * json_value.
   * </pre>
   *
   * <code>optional string string_value = 2;</code>
   */
  public String getStringValue() {
    Object ref = "";
    if (valueCase_ == 2) {
      ref = value_;
    }
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (valueCase_ == 2) {
        value_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Holds arbitrary string data; well-formed JSON strings should go in
   * json_value.
   * </pre>
   *
   * <code>optional string string_value = 2;</code>
   */
  public com.google.protobuf.ByteString
      getStringValueBytes() {
    Object ref = "";
    if (valueCase_ == 2) {
      ref = value_;
    }
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      if (valueCase_ == 2) {
        value_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INT_VALUE_FIELD_NUMBER = 3;
  /**
   * <code>optional int64 int_value = 3;</code>
   */
  public long getIntValue() {
    if (valueCase_ == 3) {
      return (Long) value_;
    }
    return 0L;
  }

  public static final int DOUBLE_VALUE_FIELD_NUMBER = 4;
  /**
   * <code>optional double double_value = 4;</code>
   */
  public double getDoubleValue() {
    if (valueCase_ == 4) {
      return (Double) value_;
    }
    return 0D;
  }

  public static final int BOOL_VALUE_FIELD_NUMBER = 5;
  /**
   * <code>optional bool bool_value = 5;</code>
   */
  public boolean getBoolValue() {
    if (valueCase_ == 5) {
      return (Boolean) value_;
    }
    return false;
  }

  public static final int JSON_VALUE_FIELD_NUMBER = 6;
  /**
   * <pre>
   * Must be a well-formed JSON value. Truncated JSON should go in
   * string_value.
   * </pre>
   *
   * <code>optional string json_value = 6;</code>
   */
  public String getJsonValue() {
    Object ref = "";
    if (valueCase_ == 6) {
      ref = value_;
    }
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (valueCase_ == 6) {
        value_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Must be a well-formed JSON value. Truncated JSON should go in
   * string_value.
   * </pre>
   *
   * <code>optional string json_value = 6;</code>
   */
  public com.google.protobuf.ByteString
      getJsonValueBytes() {
    Object ref = "";
    if (valueCase_ == 6) {
      ref = value_;
    }
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      if (valueCase_ == 6) {
        value_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
    }
    if (valueCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
    }
    if (valueCase_ == 3) {
      output.writeInt64(
          3, (long)((Long) value_));
    }
    if (valueCase_ == 4) {
      output.writeDouble(
          4, (double)((Double) value_));
    }
    if (valueCase_ == 5) {
      output.writeBool(
          5, (boolean)((Boolean) value_));
    }
    if (valueCase_ == 6) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, value_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
    }
    if (valueCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
    }
    if (valueCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            3, (long)((Long) value_));
    }
    if (valueCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(
            4, (double)((Double) value_));
    }
    if (valueCase_ == 5) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            5, (boolean)((Boolean) value_));
    }
    if (valueCase_ == 6) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, value_);
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
    if (!(obj instanceof com.lightstep.tracer.grpc.KeyValue)) {
      return super.equals(obj);
    }
    com.lightstep.tracer.grpc.KeyValue other = (com.lightstep.tracer.grpc.KeyValue) obj;

    boolean result = true;
    result = result && getKey()
        .equals(other.getKey());
    result = result && getValueCase().equals(
        other.getValueCase());
    if (!result) return false;
    switch (valueCase_) {
      case 2:
        result = result && getStringValue()
            .equals(other.getStringValue());
        break;
      case 3:
        result = result && (getIntValue()
            == other.getIntValue());
        break;
      case 4:
        result = result && (
            Double.doubleToLongBits(getDoubleValue())
            == Double.doubleToLongBits(
                other.getDoubleValue()));
        break;
      case 5:
        result = result && (getBoolValue()
            == other.getBoolValue());
        break;
      case 6:
        result = result && getJsonValue()
            .equals(other.getJsonValue());
        break;
      case 0:
      default:
    }
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    switch (valueCase_) {
      case 2:
        hash = (37 * hash) + STRING_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getStringValue().hashCode();
        break;
      case 3:
        hash = (37 * hash) + INT_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIntValue());
        break;
      case 4:
        hash = (37 * hash) + DOUBLE_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            Double.doubleToLongBits(getDoubleValue()));
        break;
      case 5:
        hash = (37 * hash) + BOOL_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getBoolValue());
        break;
      case 6:
        hash = (37 * hash) + JSON_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getJsonValue().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.lightstep.tracer.grpc.KeyValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lightstep.tracer.grpc.KeyValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lightstep.tracer.grpc.KeyValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lightstep.tracer.grpc.KeyValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lightstep.tracer.grpc.KeyValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lightstep.tracer.grpc.KeyValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lightstep.tracer.grpc.KeyValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.lightstep.tracer.grpc.KeyValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lightstep.tracer.grpc.KeyValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lightstep.tracer.grpc.KeyValue parseFrom(
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
  public static Builder newBuilder(com.lightstep.tracer.grpc.KeyValue prototype) {
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
   * Protobuf type {@code lightstep.collector.KeyValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lightstep.collector.KeyValue)
      com.lightstep.tracer.grpc.KeyValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_KeyValue_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_KeyValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lightstep.tracer.grpc.KeyValue.class, com.lightstep.tracer.grpc.KeyValue.Builder.class);
    }

    // Construct using com.lightstep.tracer.grpc.KeyValue.newBuilder()
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
      key_ = "";

      valueCase_ = 0;
      value_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_KeyValue_descriptor;
    }

    public com.lightstep.tracer.grpc.KeyValue getDefaultInstanceForType() {
      return com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
    }

    public com.lightstep.tracer.grpc.KeyValue build() {
      com.lightstep.tracer.grpc.KeyValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.lightstep.tracer.grpc.KeyValue buildPartial() {
      com.lightstep.tracer.grpc.KeyValue result = new com.lightstep.tracer.grpc.KeyValue(this);
      result.key_ = key_;
      if (valueCase_ == 2) {
        result.value_ = value_;
      }
      if (valueCase_ == 3) {
        result.value_ = value_;
      }
      if (valueCase_ == 4) {
        result.value_ = value_;
      }
      if (valueCase_ == 5) {
        result.value_ = value_;
      }
      if (valueCase_ == 6) {
        result.value_ = value_;
      }
      result.valueCase_ = valueCase_;
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
      if (other instanceof com.lightstep.tracer.grpc.KeyValue) {
        return mergeFrom((com.lightstep.tracer.grpc.KeyValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.lightstep.tracer.grpc.KeyValue other) {
      if (other == com.lightstep.tracer.grpc.KeyValue.getDefaultInstance()) return this;
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        onChanged();
      }
      switch (other.getValueCase()) {
        case STRING_VALUE: {
          valueCase_ = 2;
          value_ = other.value_;
          onChanged();
          break;
        }
        case INT_VALUE: {
          setIntValue(other.getIntValue());
          break;
        }
        case DOUBLE_VALUE: {
          setDoubleValue(other.getDoubleValue());
          break;
        }
        case BOOL_VALUE: {
          setBoolValue(other.getBoolValue());
          break;
        }
        case JSON_VALUE: {
          valueCase_ = 6;
          value_ = other.value_;
          onChanged();
          break;
        }
        case VALUE_NOT_SET: {
          break;
        }
      }
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
      com.lightstep.tracer.grpc.KeyValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.lightstep.tracer.grpc.KeyValue) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int valueCase_ = 0;
    private Object value_;
    public ValueCase
        getValueCase() {
      return ValueCase.forNumber(
          valueCase_);
    }

    public Builder clearValue() {
      valueCase_ = 0;
      value_ = null;
      onChanged();
      return this;
    }


    private Object key_ = "";
    /**
     * <code>optional string key = 1;</code>
     */
    public String getKey() {
      Object ref = key_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string key = 1;</code>
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string key = 1;</code>
     */
    public Builder setKey(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string key = 1;</code>
     */
    public Builder clearKey() {

      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }
    /**
     * <code>optional string key = 1;</code>
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      key_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * Holds arbitrary string data; well-formed JSON strings should go in
     * json_value.
     * </pre>
     *
     * <code>optional string string_value = 2;</code>
     */
    public String getStringValue() {
      Object ref = "";
      if (valueCase_ == 2) {
        ref = value_;
      }
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (valueCase_ == 2) {
          value_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Holds arbitrary string data; well-formed JSON strings should go in
     * json_value.
     * </pre>
     *
     * <code>optional string string_value = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStringValueBytes() {
      Object ref = "";
      if (valueCase_ == 2) {
        ref = value_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        if (valueCase_ == 2) {
          value_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Holds arbitrary string data; well-formed JSON strings should go in
     * json_value.
     * </pre>
     *
     * <code>optional string string_value = 2;</code>
     */
    public Builder setStringValue(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  valueCase_ = 2;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Holds arbitrary string data; well-formed JSON strings should go in
     * json_value.
     * </pre>
     *
     * <code>optional string string_value = 2;</code>
     */
    public Builder clearStringValue() {
      if (valueCase_ == 2) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Holds arbitrary string data; well-formed JSON strings should go in
     * json_value.
     * </pre>
     *
     * <code>optional string string_value = 2;</code>
     */
    public Builder setStringValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      valueCase_ = 2;
      value_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>optional int64 int_value = 3;</code>
     */
    public long getIntValue() {
      if (valueCase_ == 3) {
        return (Long) value_;
      }
      return 0L;
    }
    /**
     * <code>optional int64 int_value = 3;</code>
     */
    public Builder setIntValue(long value) {
      valueCase_ = 3;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 int_value = 3;</code>
     */
    public Builder clearIntValue() {
      if (valueCase_ == 3) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>optional double double_value = 4;</code>
     */
    public double getDoubleValue() {
      if (valueCase_ == 4) {
        return (Double) value_;
      }
      return 0D;
    }
    /**
     * <code>optional double double_value = 4;</code>
     */
    public Builder setDoubleValue(double value) {
      valueCase_ = 4;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double double_value = 4;</code>
     */
    public Builder clearDoubleValue() {
      if (valueCase_ == 4) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>optional bool bool_value = 5;</code>
     */
    public boolean getBoolValue() {
      if (valueCase_ == 5) {
        return (Boolean) value_;
      }
      return false;
    }
    /**
     * <code>optional bool bool_value = 5;</code>
     */
    public Builder setBoolValue(boolean value) {
      valueCase_ = 5;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool bool_value = 5;</code>
     */
    public Builder clearBoolValue() {
      if (valueCase_ == 5) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * Must be a well-formed JSON value. Truncated JSON should go in
     * string_value.
     * </pre>
     *
     * <code>optional string json_value = 6;</code>
     */
    public String getJsonValue() {
      Object ref = "";
      if (valueCase_ == 6) {
        ref = value_;
      }
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (valueCase_ == 6) {
          value_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Must be a well-formed JSON value. Truncated JSON should go in
     * string_value.
     * </pre>
     *
     * <code>optional string json_value = 6;</code>
     */
    public com.google.protobuf.ByteString
        getJsonValueBytes() {
      Object ref = "";
      if (valueCase_ == 6) {
        ref = value_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        if (valueCase_ == 6) {
          value_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Must be a well-formed JSON value. Truncated JSON should go in
     * string_value.
     * </pre>
     *
     * <code>optional string json_value = 6;</code>
     */
    public Builder setJsonValue(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  valueCase_ = 6;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Must be a well-formed JSON value. Truncated JSON should go in
     * string_value.
     * </pre>
     *
     * <code>optional string json_value = 6;</code>
     */
    public Builder clearJsonValue() {
      if (valueCase_ == 6) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Must be a well-formed JSON value. Truncated JSON should go in
     * string_value.
     * </pre>
     *
     * <code>optional string json_value = 6;</code>
     */
    public Builder setJsonValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      valueCase_ = 6;
      value_ = value;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:lightstep.collector.KeyValue)
  }

  // @@protoc_insertion_point(class_scope:lightstep.collector.KeyValue)
  private static final com.lightstep.tracer.grpc.KeyValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.lightstep.tracer.grpc.KeyValue();
  }

  public static com.lightstep.tracer.grpc.KeyValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeyValue>
      PARSER = new com.google.protobuf.AbstractParser<KeyValue>() {
    public KeyValue parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new KeyValue(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeyValue> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<KeyValue> getParserForType() {
    return PARSER;
  }

  public com.lightstep.tracer.grpc.KeyValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

