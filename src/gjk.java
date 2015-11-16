// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.IOException;

final class gjk
    implements Runnable
{

    final Context a;
    final String b;
    final gji c;

    gjk(gji gji, Context context, String s)
    {
        c = gji;
        a = context;
        b = s;
        super();
    }

    public void run()
    {
        eld.b(a, b);
        return;
        Object obj;
        obj;
_L2:
        gne.a(5, "vclib", "Failed to invalidate access token", ((Throwable) (obj)));
        return;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
