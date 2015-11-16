// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.TextView;

final class akc
    implements fsn, hjv
{

    final ai a;
    final ajr b;
    final akb c;
    private final TextView d;
    private final int e;

    akc(akb akb, hjm hjm1, ai ai1, TextView textview)
    {
        c = akb;
        super();
        hjm1.a(this);
        a = ai1;
        d = textview;
        e = ((gmo)hgx.a(ai1, gmo)).a();
        b = new akd(this, akb);
        a.f().b(1, null, new akf(this)).u();
    }

    static void a(akc akc1, ajo ajo1)
    {
        if (ajo1 != null)
        {
            akc1.d.setText(akc1.a.getString(g.iP, new Object[] {
                ebz.p(ajo1.c())
            }));
            akc1.d.setVisibility(0);
            return;
        } else
        {
            akc1.d.setText("");
            akc1.d.setVisibility(8);
            return;
        }
    }

    public void e_()
    {
        ajq.a(e, b);
    }
}
