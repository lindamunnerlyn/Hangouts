// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class bng
    implements Runnable
{

    final bnd a;

    bng(bnd bnd1)
    {
        a = bnd1;
        super();
    }

    public void run()
    {
        a.g = true;
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bnk)iterator.next()).a()) { }
        gfd.a().a(new bnl(a));
    }
}
