// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

final class fch
{

    final boolean a = false;
    private final String b;
    private final int c;

    protected fch(String s, int i, boolean flag)
    {
        b = s;
        c = i;
    }

    protected void a(String s)
    {
        Log.println(c, b, s);
    }

    protected boolean a()
    {
        return Log.isLoggable(b, c);
    }
}
