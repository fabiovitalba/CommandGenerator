package org.sattelite.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Required for reflection
@Target(ElementType.TYPE)   // Use in a class
public @interface CommandType {
    String value();
}
