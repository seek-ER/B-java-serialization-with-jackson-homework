package com.thoughtworks.capability.gtb.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.util.Date;

public class Date2LongSerializer extends StdSerializer<Date> {

    protected Date2LongSerializer() {
        super(Date.class);
    }

    @Override
    public void serialize(Date time, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeNumber(time.getTime());
    }
}
