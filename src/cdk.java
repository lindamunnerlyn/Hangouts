// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public abstract class cdk extends ced
{

    static final boolean a = false;
    static cdo g = new cdo();
    public String b;
    public CharSequence c;
    public final long d;
    public int e;
    public String f;

    cdk(Context context, int i, int j, dzx dzx1, long l)
    {
        super(context, i, dzx1);
        c = null;
        e = j;
        if (l <= 0L)
        {
            l = System.currentTimeMillis();
        }
        d = l;
    }

    static void a(Context context, int i)
    {
        cei.a(context, i, null);
        cdz.b(context, i);
    }

    protected Intent b()
    {
        return (new cdl()).a(o, p, q.b());
    }

    static 
    {
        hik hik = ebw.n;
    }
}
