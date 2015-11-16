// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public abstract class diq extends dhy
{

    private int a;
    private final Context b;

    public diq(Context context)
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
                ((dic)hlp.a(b, dic)).b(this);
            }
        } else
        {
            a = i;
            if (i >= 0)
            {
                ((dic)hlp.a(b, dic)).a(this);
                return;
            }
        }
    }

    public final void a(int i, aoa aoa, did did)
    {
        if (a == i)
        {
            a(-1);
            a(did);
        }
    }

    public final void a(int i, aoa aoa, dmf dmf, dcx dcx)
    {
        if (a == i)
        {
            a(-1);
            a(((Exception) (dcx)));
        }
    }

    public abstract void a(did did);

    public void a(Exception exception)
    {
    }
}
