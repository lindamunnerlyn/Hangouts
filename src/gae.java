// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

class gae
    implements gad
{

    boolean a;
    emy b;
    ell c;
    Handler d;
    final Runnable e = new gah(this);
    private final eni f = new gai(this);

    gae(Context context)
    {
        b = (new emz(context)).a(ell.c).a();
        b.a(new gaf(this));
        b.a(new gag(this));
        c = new ell(context);
    }

    public void a(String s, String s1, int i, byte abyte0[])
    {
        if (d == null)
        {
            d = new Handler(Looper.myLooper());
        }
        d.removeCallbacks(e);
        synchronized (b)
        {
            if (!a)
            {
                b.b();
                a = true;
            }
        }
        abyte0 = c.a(abyte0);
        abyte0.a(s);
        if (s1 != null)
        {
            abyte0.b(s1);
        }
        if (i != 0)
        {
            abyte0.a(i);
        }
        abyte0.a(b).a(f);
        return;
        s;
        emy1;
        JVM INSTR monitorexit ;
        throw s;
    }
}
