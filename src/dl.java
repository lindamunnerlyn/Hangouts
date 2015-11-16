// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;

public final class dl extends dr
{

    public static final ds a = new ds();
    private static final dn g;
    private final String b;
    private final CharSequence c;
    private final CharSequence d[];
    private final boolean e;
    private final Bundle f;

    dl(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle)
    {
        b = s;
        c = charsequence;
        d = acharsequence;
        e = flag;
        f = bundle;
    }

    public static Bundle a(Intent intent)
    {
        return g.a(intent);
    }

    public String a()
    {
        return b;
    }

    public CharSequence b()
    {
        return c;
    }

    public CharSequence[] c()
    {
        return d;
    }

    public boolean d()
    {
        return e;
    }

    public Bundle e()
    {
        return f;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            g = new do();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            g = new dq();
        } else
        {
            g = new dp();
        }
    }
}
