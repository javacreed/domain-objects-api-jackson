package com.javacreed.api.domain.primitives.jackson.optional;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.primitives.optional.UuidBasedDomainPrimitive;

public class UuidBasedDomainPrimitiveSerializer extends StdSerializer<UuidBasedDomainPrimitive> {

  private static final long serialVersionUID = -4177941765070689788L;

  public UuidBasedDomainPrimitiveSerializer() {
    super(UuidBasedDomainPrimitive.class);
  }

  @Override
  public void serialize(final UuidBasedDomainPrimitive object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    if (object.isValuePresent()) {
      generator.writeString(object.toFormattedStringOrNull());
    } else {
      generator.writeNull();
    }
  }
}
