// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public abstract class gvs
{

    public final Context a;
    public final ap b;
    public boolean c;

    public gvs(Context context, ap ap)
    {
        a = context;
        b = ap;
    }

    public void a(guy guy1)
    {
        b(guy1);
    }

    public abstract void a(String s);

    public abstract void a(String s, String s1, String s2, boolean flag);

    public void a(boolean flag)
    {
        c = flag;
    }

    public boolean a()
    {
        return c;
    }

    public abstract boolean a(gvv gvv);

    public void b(guy guy1)
    {
        String s1 = guy1.b(a);
        String s = s1;
        if (s1 == null)
        {
            s = null;
        }
        a(s, null, guy1.h(), false);
    }
}
