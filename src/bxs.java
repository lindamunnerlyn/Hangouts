// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.Toast;

final class bxs
    implements bxg
{

    final String a = getClass().getName();

    bxs()
    {
    }

    public void a(Context context, ap ap, String s, String s1, String s2, bxi bxi1)
    {
        if (s1 == null)
        {
            Toast.makeText(context, h.id, 0).show();
            return;
        }
        aoa aoa1 = dcn.e(((gqu)hlp.a(context, gqu)).a());
        if (bxi1 == bxi.a && !aoa1.o())
        {
            g.a(aoa1, 1860);
            (new bxj(context, s1, s2)).a(context, bxk.c);
            return;
        } else
        {
            bxm.a(s2, s, s1, bxi1).a(ap, a);
            return;
        }
    }
}
