// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class cli
    implements Runnable
{

    cli()
    {
    }

    public void run()
    {
        if (clh.b() != null)
        {
            for (Iterator iterator = clh.b().iterator(); iterator.hasNext(); edr.a((edq)iterator.next())) { }
            clh.c();
        }
        clh.d();
    }
}
