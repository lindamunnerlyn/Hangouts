// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Vibrator;
import com.google.android.apps.hangouts.hangout.IncomingRing;

public final class bpw extends gbk
{

    final boolean a;
    final IncomingRing b;

    public bpw(IncomingRing incomingring, boolean flag)
    {
        b = incomingring;
        a = flag;
        super();
    }

    protected Object a()
    {
        bpz bpz1 = new bpz();
        bpz1.b = ((doq)hgx.a(g.nS, doq)).c(IncomingRing.b(b).h());
        if (IncomingRing.o())
        {
            boolean flag = bpz1.b;
            boolean flag1 = a;
            ebw.b("Babel_calls", (new StringBuilder(32)).append("shouldVibrate=").append(flag).append(" silent=").append(flag1).toString());
        }
        bpz1.a = IncomingRing.c(b);
        return bpz1;
    }

    protected void onPostExecute(Object obj)
    {
        obj = (bpz)obj;
        if (!IncomingRing.d(b))
        {
            if (((bpz) (obj)).a != null)
            {
                IncomingRing.e(b).a(((bpz) (obj)).a);
            }
            if (((bpz) (obj)).b && !a)
            {
                IncomingRing.a(b, (Vibrator)g.nS.getSystemService("vibrator"));
                IncomingRing.f(b).vibrate(IncomingRing.p(), 0);
            }
        }
    }
}
