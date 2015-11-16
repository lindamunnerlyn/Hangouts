// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hje
{

    private final int a;
    private final String b;
    private final gqz c;

    public hje(Context context, int i, String s)
    {
        c = (gqz)hlp.a(context, gqz);
        a = i;
        b = s;
    }

    public void a(boolean flag)
    {
        c.b(a).c(b, flag).d();
    }

    public Boolean b(boolean flag)
    {
        return Boolean.valueOf(c.a(a).a(b, flag));
    }
}
