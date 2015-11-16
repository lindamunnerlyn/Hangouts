// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public abstract class grh
{

    public final Context a;
    public final ap b;
    public boolean c;

    public grh(Context context, ap ap)
    {
        a = context;
        b = ap;
    }

    public void a(gqn gqn1)
    {
        b(gqn1);
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

    public abstract boolean a(grk grk);

    public void b(gqn gqn1)
    {
        String s1 = gqn1.b(a);
        String s = s1;
        if (s1 == null)
        {
            s = null;
        }
        a(s, null, gqn1.h(), false);
    }
}
