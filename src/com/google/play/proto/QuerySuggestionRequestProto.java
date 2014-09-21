// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Query.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;

public final class QuerySuggestionRequestProto extends Message {

  public static final String DEFAULT_QUERY = "";
  public static final Integer DEFAULT_REQUESTTYPE = 0;

  @ProtoField(tag = 1, type = STRING)
  public final String query;

  @ProtoField(tag = 2, type = INT32)
  public final Integer requestType;

  public QuerySuggestionRequestProto(String query, Integer requestType) {
    this.query = query;
    this.requestType = requestType;
  }

  private QuerySuggestionRequestProto(Builder builder) {
    this(builder.query, builder.requestType);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof QuerySuggestionRequestProto)) return false;
    QuerySuggestionRequestProto o = (QuerySuggestionRequestProto) other;
    return equals(query, o.query)
        && equals(requestType, o.requestType);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = query != null ? query.hashCode() : 0;
      result = result * 37 + (requestType != null ? requestType.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<QuerySuggestionRequestProto> {

    public String query;
    public Integer requestType;

    public Builder() {
    }

    public Builder(QuerySuggestionRequestProto message) {
      super(message);
      if (message == null) return;
      this.query = message.query;
      this.requestType = message.requestType;
    }

    public Builder query(String query) {
      this.query = query;
      return this;
    }

    public Builder requestType(Integer requestType) {
      this.requestType = requestType;
      return this;
    }

    @Override
    public QuerySuggestionRequestProto build() {
      return new QuerySuggestionRequestProto(this);
    }
  }
}