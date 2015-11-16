// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.Iterator;

class jsr
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final Object a[];
    private final Object b[];

    jsr(jso jso1)
    {
        a = new Object[jso1.size()];
        b = new Object[jso1.size()];
        jso1 = jso1.d().a();
        for (int i = 0; jso1.hasNext(); i++)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)jso1.next();
            a[i] = entry.getKey();
            b[i] = entry.getValue();
        }

    }

    Object a(jsq jsq1)
    {
        for (int i = 0; i < a.length; i++)
        {
            jsq1.a(a[i], b[i]);
        }

        return jsq1.a();
    }

    Object readResolve()
    {
        return a(new jsq(a.length));
    }
}
