// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public abstract class dhh extends dgp
{

    private int a;
    private final Context b;

    public dhh(Context context)
    {
        a = -1;
        b = context;
    }

    public final void a(int i)
    {
        if (a >= 0)
        {
            a = i;
            if (i < 0)
            {
                ((dgt)hgx.a(b, dgt)).b(this);
            }
        } else
        {
            a = i;
            if (i >= 0)
            {
                ((dgt)hgx.a(b, dgt)).a(this);
                return;
            }
        }
    }

    public final void a(int i, ani ani, dgu dgu)
    {
        if (a == i)
        {
            a(-1);
            a(dgu);
        }
    }

    public final void a(int i, ani ani, dko dko, dbo dbo)
    {
        if (a == i)
        {
            a(-1);
            a(((Exception) (dbo)));
        }
    }

    public abstract void a(dgu dgu);

    public void a(Exception exception)
    {
    }
}
