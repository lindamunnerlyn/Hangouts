// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

public class hli extends GenericJson
{

    String a;
    Long b;
    String c;

    public hli()
    {
    }

    public hli a()
    {
        return (hli)super.clone();
    }

    public hli a(String s, Object obj)
    {
        return (hli)super.set(s, obj);
    }

    public GenericJson clone()
    {
        return a();
    }

    public GenericData clone()
    {
        return a();
    }

    public Object clone()
    {
        return a();
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
