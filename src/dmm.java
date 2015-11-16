// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class dmm
    implements Runnable
{

    boolean a;
    final List b;
    final fqp c;
    final fqy d;
    final fqp e;
    final fqy f;

    public dmm(List list, fqp fqp1, fqy fqy1, fqp fqp2, fqy fqy2)
    {
        b = list;
        c = fqp1;
        d = fqy1;
        e = fqp2;
        f = fqy2;
    }

    public void run()
    {
        gbh.a();
        long l = System.currentTimeMillis();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); iterator.next()) { }
        if (dme.j())
        {
            long l1 = System.currentTimeMillis();
            ebw.b("Babel", (new StringBuilder(57)).append("GmsPeopleCache: onDataBufferReady ").append(l1 - l).append(" ms").toString());
        }
        if (e != null)
        {
            e.b();
        }
        if (f != null)
        {
            f.b();
        }
        a = true;
    }
}
