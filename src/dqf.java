// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class dqf extends hmm
    implements gvb, hjp
{

    private gqu a;
    private aoa b;
    private hjx c;
    private PreferenceCategory d;
    private gvc e;
    private boolean f;

    public dqf()
    {
        new hjo(this, lifecycle);
    }

    static aoa a(dqf dqf1)
    {
        return dqf1.b;
    }

    static boolean b(dqf dqf1)
    {
        dqf1.f = true;
        return true;
    }

    static hlt c(dqf dqf1)
    {
        return dqf1.context;
    }

    static gqu d(dqf dqf1)
    {
        return dqf1.a;
    }

    static gvc e(dqf dqf1)
    {
        return dqf1.e;
    }

    static void f(dqf dqf1)
    {
        Object obj = (cro)hlp.b(dqf1.context, cro);
        if (obj != null)
        {
            obj = ((cro) (obj)).a(dqf1.context, dqf1.b.h());
            dqf1.context.startActivity(((android.content.Intent) (obj)));
        }
    }

    public void a()
    {
        b = dcn.e(a.a());
        c = new hjx(context);
        d = c.a(l.j);
    }

    public void a(String s, gvv gvv1, gvs gvs)
    {
        if ("sign_out".equals(s))
        {
            int i = gvv1.d().getInt("account_id");
            if (i == a.a())
            {
                getActivity().finish();
            }
            dcn.h(i);
        }
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gqu)binder.a(gqu);
        e = (gvc)binder.a(gvc);
        e.a(this);
    }

    public void onResume()
    {
        Object obj;
        PreferenceCategory preferencecategory;
        super.onResume();
        d.d();
        preferencecategory = d;
        obj = (crk)binder.b(crk);
        if (obj == null || binder.b(cro) == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        obj = ((crk) (obj)).a(b);
        switch (((crl) (obj)).a)
        {
        default:
            j = l.hw;
            i = l.hv;
            break;

        case 100: // 'd'
            break MISSING_BLOCK_LABEL_279;
        }
_L3:
        obj = ((crl) (obj)).b;
        hjr hjr1 = new hjr(context);
        hjr1.g(j);
        if (obj != null)
        {
            obj = getString(i, new Object[] {
                eey.p(((String) (obj)))
            });
        } else
        {
            obj = null;
        }
        hjr1.b(((CharSequence) (obj)));
        hjr1.a(new dqi(this));
        preferencecategory.c(hjr1);
_L2:
        obj = (ajk)hlp.b(context, ajk);
        if (obj != null)
        {
            ((ajk) (obj)).a(getActivity(), lifecycle, d, a.a());
        }
        obj = new hjr(context);
        ((hjr) (obj)).g(l.eG);
        ((hjr) (obj)).a(new dqg(this));
        d.c(((hjr) (obj)));
        obj = new hjr(context);
        ((hjr) (obj)).g(l.js);
        d.c(((hjr) (obj)));
        ((hjr) (obj)).a(new dqh(this));
        return;
        j = l.hx;
        i = l.hu;
          goto _L3
    }
}
