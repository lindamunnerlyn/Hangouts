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

public final class gyu extends hhu
    implements gmy, hey
{

    private final gov a = new gyv(this);
    private final hex b;
    private hfg c;
    private gyy d;
    private gmo e;
    private gms f;
    private PreferenceCategory g;
    private gow h;

    public gyu()
    {
        b = new hex(this, lifecycle);
        h = (new gow(lifecycle)).a(binder).a(g.sY, a);
    }

    static gyy a(gyu gyu1)
    {
        return gyu1.d;
    }

    private void a(PreferenceCategory preferencecategory)
    {
        gms gms1 = (gms)hgx.a(context, gms);
        Object obj = gms1.a();
        gwl gwl1 = c();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Integer integer = (Integer)((Iterator) (obj)).next();
            gmu gmu1 = gms1.a(integer.intValue());
            if (gwl1.a(integer.intValue(), gmu1))
            {
                Intent intent = (Intent)getArguments().getParcelable("account_intent");
                if (intent != null)
                {
                    intent = (Intent)intent.clone();
                    intent.putExtra("account_id", integer);
                    preferencecategory.c(c.a(gmu1.b("display_name"), gmu1.b("account_name"), intent));
                } else
                {
                    throw new IllegalStateException("Must set intent for accounts to be visible");
                }
            }
        } while (true);
    }

    private hfa b()
    {
        hfa hfa1 = c.a(getString(g.ta), null);
        hfa1.a(new gyw(this));
        return hfa1;
    }

    static hhb b(gyu gyu1)
    {
        return gyu1.context;
    }

    static gow c(gyu gyu1)
    {
        return gyu1.h;
    }

    private gwl c()
    {
        gwl gwl1 = (gwl)getArguments().getParcelable("account_filter");
        Object obj = gwl1;
        if (gwl1 == null)
        {
            obj = (new gwn()).a("logged_in");
        }
        return ((gwl) (obj));
    }

    public void F_()
    {
        boolean flag = false;
        if (!getArguments().getBoolean("allow_no_accounts"))
        {
            ArrayList arraylist = new ArrayList();
            Object obj = f.a();
            gwl gwl1 = c();
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                int i = ((Integer)((Iterator) (obj)).next()).intValue();
                if (gwl1.a(i, f.a(i)))
                {
                    arraylist.add(Integer.valueOf(i));
                }
            } while (true);
            Collections.sort(arraylist, new gmn(f));
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
            g.d((hfa)arraylist1.get(k));
        }

        a(g);
        g.c(b());
    }

    public void a()
    {
        c = new hfg(context);
        g = c.a(getString(g.sZ));
        b.a(g);
        a(g);
        g.c(b());
    }

    public void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        d = (gyy)binder.b(gyy);
        e = (gmo)binder.a(gmo);
        f = (gms)binder.a(gms);
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
        F_();
    }

    public void onStop()
    {
        super.onStop();
        f.b(this);
    }
}
