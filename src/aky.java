// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class aky
    implements ddl
{

    private final Context a;

    public aky(Context context)
    {
        a = context;
    }

    public void a(int i, iwv aiwv[])
    {
        if (g.a(a, i))
        {
            g.d(aiwv, "ClientCallerIdSettings cannot be null!");
            ajn.a(a, i, System.currentTimeMillis(), aiwv);
        }
    }
}
