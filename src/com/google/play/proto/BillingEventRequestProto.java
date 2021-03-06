// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Billing.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.BOOL;
import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;

public final class BillingEventRequestProto extends Message {

  public static final Integer DEFAULT_EVENTTYPE = 0;
  public static final String DEFAULT_BILLINGPARAMETERSID = "";
  public static final Boolean DEFAULT_RESULTSUCCESS = false;
  public static final String DEFAULT_CLIENTMESSAGE = "";

  @ProtoField(tag = 1, type = INT32)
  public final Integer eventType;

  @ProtoField(tag = 2, type = STRING)
  public final String billingParametersId;

  @ProtoField(tag = 3, type = BOOL)
  public final Boolean resultSuccess;

  @ProtoField(tag = 4, type = STRING)
  public final String clientMessage;

  @ProtoField(tag = 5)
  public final ExternalCarrierBillingInstrumentProto carrierInstrument;

  public BillingEventRequestProto(Integer eventType, String billingParametersId, Boolean resultSuccess, String clientMessage, ExternalCarrierBillingInstrumentProto carrierInstrument) {
    this.eventType = eventType;
    this.billingParametersId = billingParametersId;
    this.resultSuccess = resultSuccess;
    this.clientMessage = clientMessage;
    this.carrierInstrument = carrierInstrument;
  }

  private BillingEventRequestProto(Builder builder) {
    this(builder.eventType, builder.billingParametersId, builder.resultSuccess, builder.clientMessage, builder.carrierInstrument);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof BillingEventRequestProto)) return false;
    BillingEventRequestProto o = (BillingEventRequestProto) other;
    return equals(eventType, o.eventType)
        && equals(billingParametersId, o.billingParametersId)
        && equals(resultSuccess, o.resultSuccess)
        && equals(clientMessage, o.clientMessage)
        && equals(carrierInstrument, o.carrierInstrument);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = eventType != null ? eventType.hashCode() : 0;
      result = result * 37 + (billingParametersId != null ? billingParametersId.hashCode() : 0);
      result = result * 37 + (resultSuccess != null ? resultSuccess.hashCode() : 0);
      result = result * 37 + (clientMessage != null ? clientMessage.hashCode() : 0);
      result = result * 37 + (carrierInstrument != null ? carrierInstrument.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<BillingEventRequestProto> {

    public Integer eventType;
    public String billingParametersId;
    public Boolean resultSuccess;
    public String clientMessage;
    public ExternalCarrierBillingInstrumentProto carrierInstrument;

    public Builder() {
    }

    public Builder(BillingEventRequestProto message) {
      super(message);
      if (message == null) return;
      this.eventType = message.eventType;
      this.billingParametersId = message.billingParametersId;
      this.resultSuccess = message.resultSuccess;
      this.clientMessage = message.clientMessage;
      this.carrierInstrument = message.carrierInstrument;
    }

    public Builder eventType(Integer eventType) {
      this.eventType = eventType;
      return this;
    }

    public Builder billingParametersId(String billingParametersId) {
      this.billingParametersId = billingParametersId;
      return this;
    }

    public Builder resultSuccess(Boolean resultSuccess) {
      this.resultSuccess = resultSuccess;
      return this;
    }

    public Builder clientMessage(String clientMessage) {
      this.clientMessage = clientMessage;
      return this;
    }

    public Builder carrierInstrument(ExternalCarrierBillingInstrumentProto carrierInstrument) {
      this.carrierInstrument = carrierInstrument;
      return this;
    }

    @Override
    public BillingEventRequestProto build() {
      return new BillingEventRequestProto(this);
    }
  }
}
