package ro.siit.session20;

import java.lang.annotation.Retention;

@MyFancyAnnotation
public class Box<T>{
    private T entity;
    public Box(T entity){
        this.entity = entity;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }
}
