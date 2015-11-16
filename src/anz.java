// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;

final class anz
    implements Runnable
{

    final String a;

    anz(String s)
    {
        a = s;
        super();
    }

    public void run()
    {
        Context context = g.nS;
        ebr.b(context, context.getResources().getString(l.gs, new Object[] {
            a
        }));
    }
}
