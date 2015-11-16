// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class bji
    implements Runnable
{

    final bje a;

    bji(bje bje1)
    {
        a = bje1;
        super();
    }

    public void run()
    {
        if (bje.a(a) != null)
        {
            bje.a(a).a();
        }
        bje.h(a).postDelayed(bje.g(a), 50L);
    }
}
