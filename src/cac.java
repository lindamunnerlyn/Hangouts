// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;

public final class cac
    implements gcz
{

    private static final boolean a = false;
    private ell b;
    private long c;
    private int d;
    private final Context e;

    public cac(Context context, String s, int i)
    {
        this(new ell(context.getApplicationContext(), "HANGOUT_LOG_REQUEST", s), i, context);
    }

    private cac(ell ell1, int i, Context context)
    {
        b = ell1;
        d = i;
        c = SystemClock.elapsedRealtime();
        e = context;
    }

    public gda a(int i)
    {
        return new cad(this, i);
    }

    public void a()
    {
        c = SystemClock.elapsedRealtime();
    }

    public void a(jlt jlt1)
    {
        b.a(jlt.toByteArray(jlt1)).a();
        if (a)
        {
            eev.b("Clearcut", jlt1.toString());
        }
    }

    int b()
    {
        return d;
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
        hnc hnc = eev.c;
    }
}
