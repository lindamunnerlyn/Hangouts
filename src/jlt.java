// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.Iterator;

class jlt
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final Object a[];
    private final Object b[];

    jlt(jlr jlr1)
    {
        a = new Object[jlr1.size()];
        b = new Object[jlr1.size()];
        jlr1 = jlr1.b().iterator();
        for (int i = 0; jlr1.hasNext(); i++)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)jlr1.next();
            a[i] = entry.getKey();
            b[i] = entry.getValue();
        }

    }

    Object a(jls jls1)
    {
        for (int i = 0; i < a.length; i++)
        {
            jls1.a(a[i], b[i]);
        }

        return jls1.a();
    }

    Object readResolve()
    {
        return a(new jls());
    }
}
