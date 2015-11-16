// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class bxr
    implements bxo
{

    bxr()
    {
    }

    public can a(Context context, int i, boolean flag, String s)
    {
        if (bxp.b(s))
        {
            context = new bxp(context);
            context.a(i, flag, s);
            return context;
        } else
        {
            return null;
        }
    }
}
