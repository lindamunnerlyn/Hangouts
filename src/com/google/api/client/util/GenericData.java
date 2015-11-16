// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import hmq;
import hnc;
import hng;
import hno;
import hnq;
import hnr;
import java.util.AbstractMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericData extends AbstractMap
    implements Cloneable
{

    public final hnc classInfo;
    public Map unknownFields;

    public GenericData()
    {
        this(EnumSet.noneOf(hnr));
    }

    public GenericData(EnumSet enumset)
    {
        unknownFields = hmq.a();
        classInfo = hnc.a(getClass(), enumset.contains(hnr.a));
    }

    public GenericData clone()
    {
        GenericData genericdata;
        try
        {
            genericdata = (GenericData)super.clone();
            hng.a(this, genericdata);
            genericdata.unknownFields = (Map)hng.c(unknownFields);
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new IllegalStateException(clonenotsupportedexception);
        }
        return genericdata;
    }

    public volatile Object clone()
    {
        return clone();
    }

    public Set entrySet()
    {
        return new hnq(this);
    }

    public final Object get(Object obj)
    {
        if (!(obj instanceof String))
        {
            return null;
        }
        String s = (String)obj;
        obj = classInfo.a(s);
        if (obj != null)
        {
            return ((hno) (obj)).a(this);
        }
        obj = s;
        if (classInfo.a)
        {
            obj = s.toLowerCase();
        }
        return unknownFields.get(obj);
    }

    public final hnc getClassInfo()
    {
        return classInfo;
    }

    public final Map getUnknownKeys()
    {
        return unknownFields;
    }

    public volatile Object put(Object obj, Object obj1)
    {
        return put((String)obj, obj1);
    }

    public final Object put(String s, Object obj)
    {
        Object obj1 = classInfo.a(s);
        if (obj1 != null)
        {
            s = ((String) (((hno) (obj1)).a(this)));
            ((hno) (obj1)).a(this, obj);
            return s;
        }
        obj1 = s;
        if (classInfo.a)
        {
            obj1 = s.toLowerCase();
        }
        return unknownFields.put(obj1, obj);
    }

    public final void putAll(Map map)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); set((String)entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public final Object remove(Object obj)
    {
        if (!(obj instanceof String))
        {
            return null;
        }
        String s = (String)obj;
        if (classInfo.a(s) != null)
        {
            throw new UnsupportedOperationException();
        }
        obj = s;
        if (classInfo.a)
        {
            obj = s.toLowerCase();
        }
        return unknownFields.remove(obj);
    }

    public GenericData set(String s, Object obj)
    {
        Object obj1 = classInfo.a(s);
        if (obj1 != null)
        {
            ((hno) (obj1)).a(this, obj);
            return this;
        }
        obj1 = s;
        if (classInfo.a)
        {
            obj1 = s.toLowerCase();
        }
        unknownFields.put(obj1, obj);
        return this;
    }

    public final void setUnknownKeys(Map map)
    {
        unknownFields = map;
    }
}
