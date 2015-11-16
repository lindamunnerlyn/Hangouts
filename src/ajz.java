// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.TextView;

final class ajz
    implements hop, hoy
{

    final ai a;
    final ajo b;
    final ajy c;
    private final TextView d;
    private final int e;

    ajz(ajy ajy, hof hof1, ai ai1, TextView textview)
    {
        c = ajy;
        super();
        hof1.a(this);
        a = ai1;
        d = textview;
        e = ((gqu)hlp.a(ai1, gqu)).a();
        b = new aka(this, ajy);
        a.f().b(1, null, new akc(this)).u();
    }

    static void a(ajz ajz1, ajl ajl1)
    {
        if (ajl1 != null)
        {
            ajz1.d.setText(ajz1.a.getString(g.iH, new Object[] {
                eey.p(ajl1.c())
            }));
            ajz1.d.setVisibility(0);
            return;
        } else
        {
            ajz1.d.setText("");
            ajz1.d.setVisibility(8);
            return;
        }
    }

    public void f_()
    {
        ajn.a(e, b);
    }
}
