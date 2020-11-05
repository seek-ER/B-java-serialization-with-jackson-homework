package com.thoughtworks.capability.gtb.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class AgeSerialier extends StdSerializer<Integer> {
    protected AgeSerialier() {
        super(Integer.class);
    }

    @Override
    public void serialize(Integer age, JsonGenerator gen, SerializerProvider provider) throws IOException {
        if (null == age) {
            gen.writeNumber(0);
        } else {
            gen.writeNumber(age);
        }
    }
}
