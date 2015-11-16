// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Bundle;

public final class cb extends cv
{

    public static final cw d = new cw();
    public int a;
    public CharSequence b;
    public PendingIntent c;
    private final Bundle e;
    private final dl f[];

    public cb(int i, CharSequence charsequence, PendingIntent pendingintent)
    {
        this(i, charsequence, pendingintent, new Bundle(), null);
    }

    cb(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, dl adl[])
    {
        a = i;
        b = cf.d(charsequence);
        c = pendingintent;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        e = bundle;
        f = adl;
    }

    public int a()
    {
        return a;
    }

    public CharSequence b()
    {
        return b;
    }

    public PendingIntent c()
    {
        return c;
    }

    public Bundle d()
    {
        return e;
    }

    public dr[] e()
    {
        return f;
    }

}
