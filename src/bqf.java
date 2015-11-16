// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Vibrator;
import com.google.android.apps.hangouts.hangout.IncomingRing;

public final class bqf extends gdy
{

    final boolean a;
    final IncomingRing b;

    public bqf(IncomingRing incomingring, boolean flag)
    {
        b = incomingring;
        a = flag;
        super();
    }

    protected Object a()
    {
        bqi bqi1 = new bqi();
        bqi1.b = ((drj)hlp.a(g.nU, drj)).c(IncomingRing.b(b).h());
        if (IncomingRing.p())
        {
            boolean flag = bqi1.b;
            boolean flag1 = a;
            eev.b("Babel_calls", (new StringBuilder(32)).append("shouldVibrate=").append(flag).append(" silent=").append(flag1).toString());
        }
        bqi1.a = IncomingRing.c(b);
        return bqi1;
    }

    protected void onPostExecute(Object obj)
    {
        obj = (bqi)obj;
        if (!IncomingRing.d(b))
        {
            if (((bqi) (obj)).a != null)
            {
                IncomingRing.e(b).a(((bqi) (obj)).a);
            }
            if (((bqi) (obj)).b && !a)
            {
                IncomingRing.a(b, (Vibrator)g.nU.getSystemService("vibrator"));
                IncomingRing.f(b).vibrate(IncomingRing.q(), 0);
            }
        }
    }
}
