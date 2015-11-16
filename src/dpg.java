// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class dpg
    implements Runnable
{

    boolean a;
    final List b;
    final fti c;
    final ftp d;
    final fti e;
    final ftp f;

    public dpg(List list, fti fti1, ftp ftp1, fti fti2, ftp ftp2)
    {
        b = list;
        c = fti1;
        d = ftp1;
        e = fti2;
        f = ftp2;
    }

    public void run()
    {
        gdv.a();
        long l = System.currentTimeMillis();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); iterator.next()) { }
        if (doy.j())
        {
            long l1 = System.currentTimeMillis();
            eev.b("Babel", (new StringBuilder(57)).append("GmsPeopleCache: onDataBufferReady ").append(l1 - l).append(" ms").toString());
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
