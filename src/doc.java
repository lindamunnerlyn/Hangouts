// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class doc extends hhu
    implements aqp, hey
{

    private gmo a;
    private het b;
    private het c;
    private het d;
    private PreferenceCategory e;

    public doc()
    {
        new hex(this, lifecycle);
    }

    private het a(int i, boolean flag, csv csv1)
    {
        csv1 = a(flag, csv1, ((String) (null)), ((String) (null)));
        csv1.g(i);
        csv1.a(i);
        return csv1;
    }

    private het a(boolean flag, csv csv1, String s, String s1)
    {
        het het1 = new het(context);
        if (flag)
        {
            het1.b(g.cE);
            het1.c(g.cG);
        } else
        {
            het1.b(g.cD);
            het1.c(g.cF);
        }
        het1.a(new doe(this, s, s1, het1, csv1));
        return het1;
    }

    static void a(doc doc1)
    {
        doc1.b();
    }

    static void a(doc doc1, het het1, csv csv1, aqo aqo1)
    {
        het1.b(het1.f()[het1.b(aqo1.d)]);
        bfy.a(new dog(doc1.context, doc1.a.a(), het1, aqo1, csv1, het1.h()), new bga(doc1.context)).a();
    }

    private void b()
    {
        int i = a.a();
        b.a(aqm.c(i));
        b.b(b.i());
        if (c != null)
        {
            c.a(aqm.e(i));
            c.b(c.i());
        }
        if (d != null)
        {
            d.a(aqm.d(i));
            d.b(d.i());
        }
        Object obj = ((hfy)binder.a(hfy)).a();
        List list = aqm.b(i);
        if (list.size() > 0)
        {
            ((PreferenceScreen) (obj)).c(e);
            e.d();
            Collections.sort(list, new dod(this));
            het het1;
            for (obj = list.iterator(); ((Iterator) (obj)).hasNext(); e.c(het1))
            {
                aqo aqo1 = (aqo)((Iterator) (obj)).next();
                het1 = a(true, csv.d, aqo1.b, aqo1.c);
                het1.c(aqo1.c);
                het1.a(aqo1.c);
                het1.a(aqo1.d);
                het1.b(het1.i());
            }

        } else
        {
            ((PreferenceScreen) (obj)).d(e);
        }
    }

    public void A_()
    {
        g.a(new dof(this));
    }

    public void a()
    {
        int i = a.a();
        aqm.a(this);
        aqm.a(i);
        hfg hfg1 = new hfg(context);
        PreferenceScreen preferencescreen = ((hfy)binder.a(hfy)).a();
        c = a(l.ad, false, csv.b);
        preferencescreen.c(c);
        d = a(l.ae, false, csv.a);
        preferencescreen.c(d);
        b = a(l.af, true, csv.c);
        preferencescreen.c(b);
        e = hfg1.a(getString(l.tX));
        b();
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gmo)binder.a(gmo);
    }

    public void onDestroy()
    {
        super.onDestroy();
        aqm.b(this);
    }
}
