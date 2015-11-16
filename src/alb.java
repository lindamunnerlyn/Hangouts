// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class alb
    implements dcd
{

    private final Context a;

    public alb(Context context)
    {
        a = context;
    }

    public void a(int i, iqq aiqq[])
    {
        if (g.a(a, i))
        {
            g.c(aiqq, "ClientCallerIdSettings cannot be null!");
            ajq.a(a, i, System.currentTimeMillis(), aiqq);
        }
    }
}
