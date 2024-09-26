package com.jhonatan.ejemplo.anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) // sera en tiempo de ejecucion
public @interface Deportivo { // indicamos que es una anotaciones
    int velocidadMaxima();
}
