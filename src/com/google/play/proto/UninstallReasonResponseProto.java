// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Uninstall.proto
package com.google.play.proto;

import com.squareup.wire.Message;

public final class UninstallReasonResponseProto extends Message {

  public UninstallReasonResponseProto() {
  }

  private UninstallReasonResponseProto(Builder builder) {
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof UninstallReasonResponseProto;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public static final class Builder extends Message.Builder<UninstallReasonResponseProto> {

    public Builder() {
    }

    public Builder(UninstallReasonResponseProto message) {
      super(message);
    }

    @Override
    public UninstallReasonResponseProto build() {
      return new UninstallReasonResponseProto(this);
    }
  }
}
