// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;

final class byk
    implements byf
{

    private final SharedPreferences a;

    public byk(Context context)
    {
        a = context.getSharedPreferences("latency_preferences", 0);
    }

    public bye a(int i)
    {
        return new byj(a, i);
    }
}
