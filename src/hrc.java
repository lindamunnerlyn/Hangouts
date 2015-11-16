// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

public final class hrc extends hre
{

    private String a;
    private String b;

    public hrc()
    {
    }

    private hrc b(String s, Object obj)
    {
        return (hrc)super.a(s, obj);
    }

    public hrc a(String s)
    {
        super.d(s);
        return this;
    }

    public hre a()
    {
        return (hrc)super.a();
    }

    public hre a(String s, Object obj)
    {
        return b(s, obj);
    }

    public hrc b(String s)
    {
        a = s;
        return this;
    }

    public hrc c(String s)
    {
        b = s;
        return this;
    }

    public GenericJson clone()
    {
        return (hrc)super.a();
    }

    public GenericData clone()
    {
        return (hrc)super.a();
    }

    public Object clone()
    {
        return (hrc)super.a();
    }

    public hre d(String s)
    {
        return a(s);
    }

    public GenericJson set(String s, Object obj)
    {
        return b(s, obj);
    }

    public GenericData set(String s, Object obj)
    {
        return b(s, obj);
    }
}
