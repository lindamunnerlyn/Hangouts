// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

public final class hrf extends GenericJson
{

    private Long a;
    private Long b;
    private String c;
    private Object d;
    private String e;

    public hrf()
    {
    }

    private hrf a(String s, Object obj)
    {
        return (hrf)super.set(s, obj);
    }

    public hrf a(Long long1)
    {
        a = long1;
        return this;
    }

    public hrf a(Object obj)
    {
        d = obj;
        return this;
    }

    public hrf a(String s)
    {
        c = s;
        return this;
    }

    public hrf b(Long long1)
    {
        b = long1;
        return this;
    }

    public hrf b(String s)
    {
        e = s;
        return this;
    }

    public GenericJson clone()
    {
        return (hrf)super.clone();
    }

    public GenericData clone()
    {
        return (hrf)super.clone();
    }

    public Object clone()
    {
        return (hrf)super.clone();
    }

    public GenericJson set(String s, Object obj)
    {
        return a(s, obj);
    }

    public GenericData set(String s, Object obj)
    {
        return a(s, obj);
    }
}
