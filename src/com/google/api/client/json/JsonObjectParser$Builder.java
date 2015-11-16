// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json;

import h;
import java.util.Collection;
import java.util.HashSet;

// Referenced classes of package com.google.api.client.json:
//            JsonFactory, JsonObjectParser

public class jsonFactory
{

    final JsonFactory jsonFactory;
    Collection wrapperKeys;

    public JsonObjectParser build()
    {
        return new JsonObjectParser(this);
    }

    public final JsonFactory getJsonFactory()
    {
        return jsonFactory;
    }

    public final Collection getWrapperKeys()
    {
        return wrapperKeys;
    }

    public wrapperKeys setWrapperKeys(Collection collection)
    {
        wrapperKeys = collection;
        return this;
    }

    public _cls9(JsonFactory jsonfactory)
    {
        wrapperKeys = new HashSet();
        jsonFactory = (JsonFactory)h.a(jsonfactory);
    }
}
