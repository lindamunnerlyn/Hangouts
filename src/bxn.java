// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;

final class bxn
    implements bxj
{

    private final SharedPreferences a;

    public bxn(Context context)
    {
        a = context.getSharedPreferences("latency_preferences", 0);
    }

    public bxi a(int i)
    {
        return new bxm(a, i);
    }
}
