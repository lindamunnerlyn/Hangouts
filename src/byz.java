// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;

public final class byz
    implements gal
{

    private static final boolean a = false;
    private fra b;
    private long c;
    private int d;
    private final Context e;

    public byz(Context context, String s, int i)
    {
        this(new fra(context.getApplicationContext(), s, new frb()), i, context);
    }

    private byz(fra fra1, int i, Context context)
    {
        b = fra1;
        b.a();
        d = i;
        c = SystemClock.elapsedRealtime();
        e = context;
    }

    public gam a(int i)
    {
        return new bza(this, i);
    }

    public void a()
    {
        c = SystemClock.elapsedRealtime();
    }

    void a(jfe jfe1)
    {
        if (0L == 0L)
        {
            b.a("Shem", jfe.toByteArray(jfe1), new String[0]);
        } else
        {
            b.a(0L, "Shem", jfe.toByteArray(jfe1), new String[0]);
        }
        if (a)
        {
            ebw.b("Clearcut", jfe1.toString());
        }
    }

    int b()
    {
        return d;
    }

    public void b(jfe jfe1)
    {
        a(jfe1);
    }

    Context c()
    {
        return e;
    }

    long d()
    {
        return c;
    }

    static 
    {
        hik hik = ebw.c;
    }
}
