package org.springframework.datastore.graph.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Michael Hunger
 * @since 27.08.2010
 * indexing true by default
 * implies automatic conversion
 * TODO support for custom converter class
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface GraphEntityProperty {
    boolean index() default true;
}
