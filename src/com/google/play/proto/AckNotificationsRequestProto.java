// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Notifications.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REPEATED;

public final class AckNotificationsRequestProto extends Message {

  public static final List<String> DEFAULT_NOTIFICATIONID = Collections.emptyList();
  public static final List<String> DEFAULT_NACKNOTIFICATIONID = Collections.emptyList();

  @ProtoField(tag = 1, type = STRING, label = REPEATED)
  public final List<String> notificationId;

  @ProtoField(tag = 2)
  public final SignatureHashProto signatureHash;

  @ProtoField(tag = 3, type = STRING, label = REPEATED)
  public final List<String> nackNotificationId;

  public AckNotificationsRequestProto(List<String> notificationId, SignatureHashProto signatureHash, List<String> nackNotificationId) {
    this.notificationId = immutableCopyOf(notificationId);
    this.signatureHash = signatureHash;
    this.nackNotificationId = immutableCopyOf(nackNotificationId);
  }

  private AckNotificationsRequestProto(Builder builder) {
    this(builder.notificationId, builder.signatureHash, builder.nackNotificationId);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AckNotificationsRequestProto)) return false;
    AckNotificationsRequestProto o = (AckNotificationsRequestProto) other;
    return equals(notificationId, o.notificationId)
        && equals(signatureHash, o.signatureHash)
        && equals(nackNotificationId, o.nackNotificationId);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = notificationId != null ? notificationId.hashCode() : 1;
      result = result * 37 + (signatureHash != null ? signatureHash.hashCode() : 0);
      result = result * 37 + (nackNotificationId != null ? nackNotificationId.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<AckNotificationsRequestProto> {

    public List<String> notificationId;
    public SignatureHashProto signatureHash;
    public List<String> nackNotificationId;

    public Builder() {
    }

    public Builder(AckNotificationsRequestProto message) {
      super(message);
      if (message == null) return;
      this.notificationId = copyOf(message.notificationId);
      this.signatureHash = message.signatureHash;
      this.nackNotificationId = copyOf(message.nackNotificationId);
    }

    public Builder notificationId(List<String> notificationId) {
      this.notificationId = checkForNulls(notificationId);
      return this;
    }

    public Builder signatureHash(SignatureHashProto signatureHash) {
      this.signatureHash = signatureHash;
      return this;
    }

    public Builder nackNotificationId(List<String> nackNotificationId) {
      this.nackNotificationId = checkForNulls(nackNotificationId);
      return this;
    }

    @Override
    public AckNotificationsRequestProto build() {
      return new AckNotificationsRequestProto(this);
    }
  }
}