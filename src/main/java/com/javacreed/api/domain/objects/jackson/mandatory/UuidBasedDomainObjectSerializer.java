package com.javacreed.api.domain.objects.jackson.mandatory;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.javacreed.api.domain.objects.mandatory.UuidBasedDomainObject;

public class UuidBasedDomainObjectSerializer extends StdSerializer<UuidBasedDomainObject> {

  private static final long serialVersionUID = -4177941765070689788L;

  public UuidBasedDomainObjectSerializer() {
    super(UuidBasedDomainObject.class);
  }

  @Override
  public void serialize(final UuidBasedDomainObject object, final JsonGenerator generator,
      final SerializerProvider provider) throws IOException {
    generator.writeString(object.toFormattedString());
  }
}
