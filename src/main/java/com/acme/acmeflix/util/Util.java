package com.acme.acmeflix.util;

import com.acme.acmeflix.model.BaseModel;

import java.util.Collection;

public class Util {

    public static  <T extends BaseModel> T addModelToCollection(T t, Collection<T> collection) {
        if (t == null) {
            return null;
        }
        if (collection.add(t)) {
            return t;
        }
        return null;
//        return t != null ? (collection.add(t) ? t : null) : null;
    }
}
