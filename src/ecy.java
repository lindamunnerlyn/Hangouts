// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class ecy
{

    boolean a;
    private final Context b;
    private final String c;
    private final String d;

    public ecy(Context context, String s, String s1)
    {
        b = context;
        c = s;
        d = s1;
    }

    public boolean a()
    {
        ecz ecz1 = new ecz(this);
        eq eq1 = eq.a(b);
        eq1.a(ecz1, new IntentFilter(d));
        eq1.b(new Intent(c));
        eq1.a(ecz1);
        return a;
    }
}
