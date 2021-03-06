// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Tv.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;

public final class TvShowDetails extends Message {

  public static final Integer DEFAULT_SEASONCOUNT = 0;
  public static final Integer DEFAULT_STARTYEAR = 0;
  public static final Integer DEFAULT_ENDYEAR = 0;
  public static final String DEFAULT_BROADCASTER = "";

  @ProtoField(tag = 1, type = INT32)
  public final Integer seasonCount;

  @ProtoField(tag = 2, type = INT32)
  public final Integer startYear;

  @ProtoField(tag = 3, type = INT32)
  public final Integer endYear;

  @ProtoField(tag = 4, type = STRING)
  public final String broadcaster;

  public TvShowDetails(Integer seasonCount, Integer startYear, Integer endYear, String broadcaster) {
    this.seasonCount = seasonCount;
    this.startYear = startYear;
    this.endYear = endYear;
    this.broadcaster = broadcaster;
  }

  private TvShowDetails(Builder builder) {
    this(builder.seasonCount, builder.startYear, builder.endYear, builder.broadcaster);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof TvShowDetails)) return false;
    TvShowDetails o = (TvShowDetails) other;
    return equals(seasonCount, o.seasonCount)
        && equals(startYear, o.startYear)
        && equals(endYear, o.endYear)
        && equals(broadcaster, o.broadcaster);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = seasonCount != null ? seasonCount.hashCode() : 0;
      result = result * 37 + (startYear != null ? startYear.hashCode() : 0);
      result = result * 37 + (endYear != null ? endYear.hashCode() : 0);
      result = result * 37 + (broadcaster != null ? broadcaster.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<TvShowDetails> {

    public Integer seasonCount;
    public Integer startYear;
    public Integer endYear;
    public String broadcaster;

    public Builder() {
    }

    public Builder(TvShowDetails message) {
      super(message);
      if (message == null) return;
      this.seasonCount = message.seasonCount;
      this.startYear = message.startYear;
      this.endYear = message.endYear;
      this.broadcaster = message.broadcaster;
    }

    public Builder seasonCount(Integer seasonCount) {
      this.seasonCount = seasonCount;
      return this;
    }

    public Builder startYear(Integer startYear) {
      this.startYear = startYear;
      return this;
    }

    public Builder endYear(Integer endYear) {
      this.endYear = endYear;
      return this;
    }

    public Builder broadcaster(String broadcaster) {
      this.broadcaster = broadcaster;
      return this;
    }

    @Override
    public TvShowDetails build() {
      return new TvShowDetails(this);
    }
  }
}
