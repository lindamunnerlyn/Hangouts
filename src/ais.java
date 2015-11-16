// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class ais
    implements hma, hoy
{

    private final ai a;
    private final hof b;

    public ais(ai ai, hof hof1)
    {
        a = ai;
        b = hof1;
        hof1.a(this);
    }

    public void a(Context context, hlp hlp1, Bundle bundle)
    {
        context = (ait)hlp1.b(ait);
        if (context != null)
        {
            context.a(a, b);
        }
    }
}
