// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

class jlh extends jki
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Object a;
    final Object b;

    jlh(Object obj, Object obj1)
    {
        a = obj;
        b = obj1;
    }

    public final Object getKey()
    {
        return a;
    }

    public final Object getValue()
    {
        return b;
    }

    public final Object setValue(Object obj)
    {
        throw new UnsupportedOperationException();
    }
}
