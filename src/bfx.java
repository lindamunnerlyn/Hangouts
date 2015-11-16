// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class bfx
    implements enb
{

    final bfw a;

    bfx(bfw bfw1)
    {
        a = bfw1;
        super();
    }

    public void a(int i)
    {
        if (bfw.a)
        {
            eev.b("Babel", "People client disconnected.");
        }
        if (a.c != null)
        {
            eev.a("Babel", "Resetting gmsPeopleLoader after people client disconnect");
            a.c = null;
        }
    }

    public void a_(Bundle bundle)
    {
        if (bfw.a)
        {
            eev.b("Babel", "Google API client connected.");
        }
        if (a.getActivity() == null)
        {
            eev.c("Babel", "Google API client connected but MakePhoneCallFragment is detached.");
        } else
        {
            bundle = a.b;
            long l = g.a(g.nU, "babel_gms_sync_allowance", 28800L);
            int ai[] = dcn.c(true);
            int j = ai.length;
            for (int i = 0; i < j; i++)
            {
                aoa aoa1 = dcn.e(ai[i]);
                if (!aoa1.o())
                {
                    fph.h.a(bundle, aoa1.a(), aoa1.ab(), l);
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
