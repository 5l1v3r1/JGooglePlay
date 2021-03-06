// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Library.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.BOOL;
import static com.squareup.wire.Message.Datatype.INT64;

public final class LibrarySubscriptionDetails extends Message {

  public static final Long DEFAULT_INITIATIONTIMESTAMPMSEC = 0L;
  public static final Long DEFAULT_VALIDUNTILTIMESTAMPMSEC = 0L;
  public static final Boolean DEFAULT_AUTORENEWING = false;
  public static final Long DEFAULT_TRIALUNTILTIMESTAMPMSEC = 0L;

  @ProtoField(tag = 1, type = INT64)
  public final Long initiationTimestampMsec;

  @ProtoField(tag = 2, type = INT64)
  public final Long validUntilTimestampMsec;

  @ProtoField(tag = 3, type = BOOL)
  public final Boolean autoRenewing;

  @ProtoField(tag = 4, type = INT64)
  public final Long trialUntilTimestampMsec;

  public LibrarySubscriptionDetails(Long initiationTimestampMsec, Long validUntilTimestampMsec, Boolean autoRenewing, Long trialUntilTimestampMsec) {
    this.initiationTimestampMsec = initiationTimestampMsec;
    this.validUntilTimestampMsec = validUntilTimestampMsec;
    this.autoRenewing = autoRenewing;
    this.trialUntilTimestampMsec = trialUntilTimestampMsec;
  }

  private LibrarySubscriptionDetails(Builder builder) {
    this(builder.initiationTimestampMsec, builder.validUntilTimestampMsec, builder.autoRenewing, builder.trialUntilTimestampMsec);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof LibrarySubscriptionDetails)) return false;
    LibrarySubscriptionDetails o = (LibrarySubscriptionDetails) other;
    return equals(initiationTimestampMsec, o.initiationTimestampMsec)
        && equals(validUntilTimestampMsec, o.validUntilTimestampMsec)
        && equals(autoRenewing, o.autoRenewing)
        && equals(trialUntilTimestampMsec, o.trialUntilTimestampMsec);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = initiationTimestampMsec != null ? initiationTimestampMsec.hashCode() : 0;
      result = result * 37 + (validUntilTimestampMsec != null ? validUntilTimestampMsec.hashCode() : 0);
      result = result * 37 + (autoRenewing != null ? autoRenewing.hashCode() : 0);
      result = result * 37 + (trialUntilTimestampMsec != null ? trialUntilTimestampMsec.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<LibrarySubscriptionDetails> {

    public Long initiationTimestampMsec;
    public Long validUntilTimestampMsec;
    public Boolean autoRenewing;
    public Long trialUntilTimestampMsec;

    public Builder() {
    }

    public Builder(LibrarySubscriptionDetails message) {
      super(message);
      if (message == null) return;
      this.initiationTimestampMsec = message.initiationTimestampMsec;
      this.validUntilTimestampMsec = message.validUntilTimestampMsec;
      this.autoRenewing = message.autoRenewing;
      this.trialUntilTimestampMsec = message.trialUntilTimestampMsec;
    }

    public Builder initiationTimestampMsec(Long initiationTimestampMsec) {
      this.initiationTimestampMsec = initiationTimestampMsec;
      return this;
    }

    public Builder validUntilTimestampMsec(Long validUntilTimestampMsec) {
      this.validUntilTimestampMsec = validUntilTimestampMsec;
      return this;
    }

    public Builder autoRenewing(Boolean autoRenewing) {
      this.autoRenewing = autoRenewing;
      return this;
    }

    public Builder trialUntilTimestampMsec(Long trialUntilTimestampMsec) {
      this.trialUntilTimestampMsec = trialUntilTimestampMsec;
      return this;
    }

    @Override
    public LibrarySubscriptionDetails build() {
      return new LibrarySubscriptionDetails(this);
    }
  }
}
