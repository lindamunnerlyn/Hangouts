// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class aiv
    implements fsn, hhi
{

    private final ai a;
    private final hjm b;

    public aiv(ai ai, hjm hjm1)
    {
        a = ai;
        b = hjm1;
        hjm1.a(this);
    }

    public void a(Context context, hgx hgx1, Bundle bundle)
    {
        context = (aiw)hgx1.b(aiw);
        if (context != null)
        {
            context.a(a, b);
        }
    }
}
