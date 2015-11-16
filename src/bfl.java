// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class bfl
    implements eka
{

    final bfk a;

    bfl(bfk bfk1)
    {
        a = bfk1;
        super();
    }

    public void a(int i)
    {
        if (bfk.a)
        {
            ebw.b("Babel", "People client disconnected.");
        }
        if (a.c != null)
        {
            ebw.a("Babel", "Resetting gmsPeopleLoader after people client disconnect");
            a.c = null;
        }
    }

    public void a_(Bundle bundle)
    {
        if (bfk.a)
        {
            ebw.b("Babel", "Google API client connected.");
        }
        if (a.getActivity() == null)
        {
            ebw.c("Babel", "Google API client connected but MakePhoneCallFragment is detached.");
        } else
        {
            bundle = a.b;
            long l = g.a(g.nS, "babel_gms_sync_allowance", 28800L);
            int ai[] = dbf.c(true);
            int j = ai.length;
            for (int i = 0; i < j; i++)
            {
                ani ani1 = dbf.e(ai[i]);
                if (!ani1.q())
                {
                    fmn.h.a(bundle, ani1.a(), ani1.ae(), l);
                }
            }

            if (a.h && a.c == null && a.e())
            {
                a.c();
                return;
            }
        }
    }
}
