// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class dug
    implements Runnable
{

    final gmw a;
    final cxi b;
    final duf c;

    dug(duf duf1, gmw gmw, cxi cxi)
    {
        c = duf1;
        a = gmw;
        b = cxi;
        super();
    }

    public void run()
    {
        for (Iterator iterator = duf.a(c).iterator(); iterator.hasNext(); ((dha)iterator.next()).a(a, b)) { }
    }
}
