// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class hdn extends hmm
    implements grf, hjp
{

    private final gtd a = new hdo(this);
    private final hjo b;
    private hjx c;
    private hdr d;
    private gqu e;
    private gqz f;
    private PreferenceCategory g;
    private gte h;

    public hdn()
    {
        b = new hjo(this, lifecycle);
        h = (new gte(lifecycle)).a(binder).a(g.tz, a);
    }

    static hdr a(hdn hdn1)
    {
        return hdn1.d;
    }

    private void a(PreferenceCategory preferencecategory)
    {
        gqz gqz1 = (gqz)hlp.a(context, gqz);
        Object obj = gqz1.a();
        hav hav1 = c();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Integer integer = (Integer)((Iterator) (obj)).next();
            grb grb1 = gqz1.a(integer.intValue());
            if (hav1.a(integer.intValue(), grb1))
            {
                Intent intent = (Intent)getArguments().getParcelable("account_intent");
                if (intent != null)
                {
                    intent = (Intent)intent.clone();
                    intent.putExtra("account_id", integer);
                    preferencecategory.c(c.a(grb1.b("display_name"), grb1.b("account_name"), intent));
                } else
                {
                    throw new IllegalStateException("Must set intent for accounts to be visible");
                }
            }
        } while (true);
    }

    private hjr b()
    {
        hjr hjr1 = c.a(getString(g.tB), null);
        hjr1.a(new hdp(this));
        return hjr1;
    }

    static hlt b(hdn hdn1)
    {
        return hdn1.context;
    }

    static gte c(hdn hdn1)
    {
        return hdn1.h;
    }

    private hav c()
    {
        hav hav1 = (hav)getArguments().getParcelable("account_filter");
        Object obj = hav1;
        if (hav1 == null)
        {
            obj = (new hax()).a("logged_in");
        }
        return ((hav) (obj));
    }

    public void H_()
    {
        boolean flag = false;
        if (!getArguments().getBoolean("allow_no_accounts"))
        {
            ArrayList arraylist = new ArrayList();
            Object obj = f.a();
            hav hav1 = c();
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                int i = ((Integer)((Iterator) (obj)).next()).intValue();
                if (hav1.a(i, f.a(i)))
                {
                    arraylist.add(Integer.valueOf(i));
                }
            } while (true);
            Collections.sort(arraylist, new gqt(f));
            if (arraylist.isEmpty())
            {
                getActivity().finish();
                return;
            }
        }
        ArrayList arraylist1 = new ArrayList();
        int j = 0;
        int k;
        do
        {
            k = ((flag) ? 1 : 0);
            if (j >= g.c())
            {
                break;
            }
            arraylist1.add(g.a(j));
            j++;
        } while (true);
        for (; k < arraylist1.size(); k++)
        {
            g.d((hjr)arraylist1.get(k));
        }

        a(g);
        g.c(b());
    }

    public void a()
    {
        c = new hjx(context);
        g = c.a(getString(g.tA));
        b.a(g);
        a(g);
        g.c(b());
    }

    public void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        d = (hdr)binder.b(hdr);
        e = (gqu)binder.a(gqu);
        f = (gqz)binder.a(gqz);
    }

    public void onResume()
    {
        super.onResume();
        if (!getActivity().isFinishing() && e.b() && !e.c().a() && d != null)
        {
            d.j();
        }
    }

    public void onStart()
    {
        super.onStart();
        f.a(this);
        H_();
    }

    public void onStop()
    {
        super.onStop();
        f.b(this);
    }
}
