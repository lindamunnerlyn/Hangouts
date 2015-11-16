// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.util.GenericData;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class hnq extends AbstractSet
{

    final GenericData a;
    private final hnk b;

    public hnq(GenericData genericdata)
    {
        a = genericdata;
        super();
        b = (new hnh(genericdata, genericdata.classInfo.a)).a();
    }

    public void clear()
    {
        a.unknownFields.clear();
        b.clear();
    }

    public Iterator iterator()
    {
        return new hnp(a, b);
    }

    public int size()
    {
        return a.unknownFields.size() + b.size();
    }
}
