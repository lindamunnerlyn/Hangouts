// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

final class hgh
    implements hge
{

    private final List a;
    private final Context b;

    hgh(Context context)
    {
        a = hlp.c(context, hgf);
        b = context;
    }

    public void a()
    {
        int i = 0;
        for (int j = a.size(); i < j; i++)
        {
            a.get(i);
        }

    }
}
