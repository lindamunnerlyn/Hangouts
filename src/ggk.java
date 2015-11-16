// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.IOException;

final class ggk
    implements Runnable
{

    final Context a;
    final String b;
    final ggi c;

    ggk(ggi ggi, Context context, String s)
    {
        c = ggi;
        a = context;
        b = s;
        super();
    }

    public void run()
    {
        eic.b(a, b);
        return;
        Object obj;
        obj;
_L2:
        gkc.a("vclib", "Failed to invalidate access token", ((Throwable) (obj)));
        return;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
