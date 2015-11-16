// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class dqv extends hmm
    implements arg, hjp
{

    private gqu a;
    private hjk b;
    private hjk c;
    private hjk d;
    private PreferenceCategory e;

    public dqv()
    {
        new hjo(this, lifecycle);
    }

    private hjk a(int i, boolean flag, cuy cuy1)
    {
        cuy1 = a(flag, cuy1, ((String) (null)), ((String) (null)));
        cuy1.g(i);
        cuy1.a(i);
        return cuy1;
    }

    private hjk a(boolean flag, cuy cuy1, String s, String s1)
    {
        hjk hjk1 = new hjk(context);
        if (flag)
        {
            hjk1.b(g.cD);
            hjk1.c(g.cF);
        } else
        {
            hjk1.b(g.cC);
            hjk1.c(g.cE);
        }
        hjk1.a(new dqx(this, s, s1, hjk1, cuy1));
        return hjk1;
    }

    static void a(dqv dqv1)
    {
        dqv1.b();
    }

    static void a(dqv dqv1, hjk hjk1, cuy cuy1, arf arf1)
    {
        hjk1.b(hjk1.f()[hjk1.b(arf1.d)]);
        bgk.a(new dqz(dqv1.context, dqv1.a.a(), hjk1, arf1, cuy1, hjk1.h()), new bgm(dqv1.context)).a();
    }

    private void b()
    {
        int i = a.a();
        b.a(ard.c(i));
        b.b(b.i());
        if (c != null)
        {
            c.a(ard.e(i));
            c.b(c.i());
        }
        if (d != null)
        {
            d.a(ard.d(i));
            d.b(d.i());
        }
        Object obj = ((hkp)binder.a(hkp)).b();
        List list = ard.b(i);
        if (list.size() > 0)
        {
            ((PreferenceScreen) (obj)).c(e);
            e.d();
            Collections.sort(list, new dqw(this));
            hjk hjk1;
            for (obj = list.iterator(); ((Iterator) (obj)).hasNext(); e.c(hjk1))
            {
                arf arf1 = (arf)((Iterator) (obj)).next();
                hjk1 = a(true, cuy.d, arf1.b, arf1.c);
                hjk1.c(arf1.c);
                hjk1.a(arf1.c);
                hjk1.a(arf1.d);
                hjk1.b(hjk1.i());
            }

        } else
        {
            ((PreferenceScreen) (obj)).d(e);
        }
    }

    public void A_()
    {
        g.a(new dqy(this));
    }

    public void a()
    {
        int i = a.a();
        ard.a(this);
        ard.a(i);
        hjx hjx1 = new hjx(context);
        PreferenceScreen preferencescreen = ((hkp)binder.a(hkp)).b();
        c = a(l.aa, false, cuy.b);
        preferencescreen.c(c);
        d = a(l.ab, false, cuy.a);
        preferencescreen.c(d);
        b = a(l.ac, true, cuy.c);
        preferencescreen.c(b);
        e = hjx1.a(getString(l.to));
        b();
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gqu)binder.a(gqu);
    }

    public void onDestroy()
    {
        super.onDestroy();
        ard.b(this);
    }
}
