// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Purchase.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.BOOL;
import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;

public final class PurchasePostRequestProto extends Message {

  public static final String DEFAULT_GAIAAUTHTOKEN = "";
  public static final String DEFAULT_ASSETID = "";
  public static final String DEFAULT_TRANSACTIONID = "";
  public static final Boolean DEFAULT_TOSACCEPTED = false;
  public static final String DEFAULT_CBINSTRUMENTKEY = "";
  public static final Boolean DEFAULT_PAYPALAUTHCONFIRMED = false;
  public static final Integer DEFAULT_PRODUCTTYPE = 0;

  @ProtoField(tag = 1, type = STRING)
  public final String gaiaAuthToken;

  @ProtoField(tag = 2, type = STRING)
  public final String assetId;

  @ProtoField(tag = 3, type = STRING)
  public final String transactionId;

  @ProtoField(tag = 4)
  public final BillingInstrumentInfoProto billingInstrumentInfo;

  @ProtoField(tag = 7, type = BOOL)
  public final Boolean tosAccepted;

  @ProtoField(tag = 8, type = STRING)
  public final String cbInstrumentKey;

  @ProtoField(tag = 11, type = BOOL)
  public final Boolean paypalAuthConfirmed;

  @ProtoField(tag = 12, type = INT32)
  public final Integer productType;

  @ProtoField(tag = 13)
  public final SignatureHashProto signatureHash;

  public PurchasePostRequestProto(String gaiaAuthToken, String assetId, String transactionId, BillingInstrumentInfoProto billingInstrumentInfo, Boolean tosAccepted, String cbInstrumentKey, Boolean paypalAuthConfirmed, Integer productType, SignatureHashProto signatureHash) {
    this.gaiaAuthToken = gaiaAuthToken;
    this.assetId = assetId;
    this.transactionId = transactionId;
    this.billingInstrumentInfo = billingInstrumentInfo;
    this.tosAccepted = tosAccepted;
    this.cbInstrumentKey = cbInstrumentKey;
    this.paypalAuthConfirmed = paypalAuthConfirmed;
    this.productType = productType;
    this.signatureHash = signatureHash;
  }

  private PurchasePostRequestProto(Builder builder) {
    this(builder.gaiaAuthToken, builder.assetId, builder.transactionId, builder.billingInstrumentInfo, builder.tosAccepted, builder.cbInstrumentKey, builder.paypalAuthConfirmed, builder.productType, builder.signatureHash);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof PurchasePostRequestProto)) return false;
    PurchasePostRequestProto o = (PurchasePostRequestProto) other;
    return equals(gaiaAuthToken, o.gaiaAuthToken)
        && equals(assetId, o.assetId)
        && equals(transactionId, o.transactionId)
        && equals(billingInstrumentInfo, o.billingInstrumentInfo)
        && equals(tosAccepted, o.tosAccepted)
        && equals(cbInstrumentKey, o.cbInstrumentKey)
        && equals(paypalAuthConfirmed, o.paypalAuthConfirmed)
        && equals(productType, o.productType)
        && equals(signatureHash, o.signatureHash);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = gaiaAuthToken != null ? gaiaAuthToken.hashCode() : 0;
      result = result * 37 + (assetId != null ? assetId.hashCode() : 0);
      result = result * 37 + (transactionId != null ? transactionId.hashCode() : 0);
      result = result * 37 + (billingInstrumentInfo != null ? billingInstrumentInfo.hashCode() : 0);
      result = result * 37 + (tosAccepted != null ? tosAccepted.hashCode() : 0);
      result = result * 37 + (cbInstrumentKey != null ? cbInstrumentKey.hashCode() : 0);
      result = result * 37 + (paypalAuthConfirmed != null ? paypalAuthConfirmed.hashCode() : 0);
      result = result * 37 + (productType != null ? productType.hashCode() : 0);
      result = result * 37 + (signatureHash != null ? signatureHash.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<PurchasePostRequestProto> {

    public String gaiaAuthToken;
    public String assetId;
    public String transactionId;
    public BillingInstrumentInfoProto billingInstrumentInfo;
    public Boolean tosAccepted;
    public String cbInstrumentKey;
    public Boolean paypalAuthConfirmed;
    public Integer productType;
    public SignatureHashProto signatureHash;

    public Builder() {
    }

    public Builder(PurchasePostRequestProto message) {
      super(message);
      if (message == null) return;
      this.gaiaAuthToken = message.gaiaAuthToken;
      this.assetId = message.assetId;
      this.transactionId = message.transactionId;
      this.billingInstrumentInfo = message.billingInstrumentInfo;
      this.tosAccepted = message.tosAccepted;
      this.cbInstrumentKey = message.cbInstrumentKey;
      this.paypalAuthConfirmed = message.paypalAuthConfirmed;
      this.productType = message.productType;
      this.signatureHash = message.signatureHash;
    }

    public Builder gaiaAuthToken(String gaiaAuthToken) {
      this.gaiaAuthToken = gaiaAuthToken;
      return this;
    }

    public Builder assetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    public Builder transactionId(String transactionId) {
      this.transactionId = transactionId;
      return this;
    }

    public Builder billingInstrumentInfo(BillingInstrumentInfoProto billingInstrumentInfo) {
      this.billingInstrumentInfo = billingInstrumentInfo;
      return this;
    }

    public Builder tosAccepted(Boolean tosAccepted) {
      this.tosAccepted = tosAccepted;
      return this;
    }

    public Builder cbInstrumentKey(String cbInstrumentKey) {
      this.cbInstrumentKey = cbInstrumentKey;
      return this;
    }

    public Builder paypalAuthConfirmed(Boolean paypalAuthConfirmed) {
      this.paypalAuthConfirmed = paypalAuthConfirmed;
      return this;
    }

    public Builder productType(Integer productType) {
      this.productType = productType;
      return this;
    }

    public Builder signatureHash(SignatureHashProto signatureHash) {
      this.signatureHash = signatureHash;
      return this;
    }

    @Override
    public PurchasePostRequestProto build() {
      return new PurchasePostRequestProto(this);
    }
  }
}