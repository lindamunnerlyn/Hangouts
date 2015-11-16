// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

public final class hmk extends GenericJson
{

    private Long a;
    private Long b;
    private String c;
    private Object d;
    private String e;

    public hmk()
    {
    }

    private hmk a(String s, Object obj)
    {
        return (hmk)super.set(s, obj);
    }

    public hmk a(Long long1)
    {
        a = long1;
        return this;
    }

    public hmk a(Object obj)
    {
        d = obj;
        return this;
    }

    public hmk a(String s)
    {
        c = s;
        return this;
    }

    public hmk b(Long long1)
    {
        b = long1;
        return this;
    }

    public hmk b(String s)
    {
        e = s;
        return this;
    }

    public GenericJson clone()
    {
        return (hmk)super.clone();
    }

    public GenericData clone()
    {
        return (hmk)super.clone();
    }

    public Object clone()
    {
        return (hmk)super.clone();
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
