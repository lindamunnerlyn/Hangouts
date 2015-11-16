// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.phone.GooglePlusUpgradeActivity;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class dnm extends hhu
    implements gqq, hey
{

    private gmo a;
    private ani b;
    private hfg c;
    private PreferenceCategory d;
    private gqr e;
    private boolean f;

    public dnm()
    {
        new hex(this, lifecycle);
    }

    static ani a(dnm dnm1)
    {
        return dnm1.b;
    }

    static boolean b(dnm dnm1)
    {
        dnm1.f = true;
        return true;
    }

    static hhb c(dnm dnm1)
    {
        return dnm1.context;
    }

    static gmo d(dnm dnm1)
    {
        return dnm1.a;
    }

    static gqr e(dnm dnm1)
    {
        return dnm1.e;
    }

    static void f(dnm dnm1)
    {
        Object obj = (cpx)hgx.b(dnm1.context, cpx);
        if (obj != null)
        {
            obj = ((cpx) (obj)).a(dnm1.context, dnm1.b.h());
            dnm1.context.startActivity(((Intent) (obj)));
        }
    }

    public void a()
    {
        b = dbf.e(a.a());
        c = new hfg(context);
        d = c.a(l.k);
    }

    public void a(String s, grk grk1, grh grh)
    {
        if ("sign_out".equals(s))
        {
            int i = grk1.d().getInt("account_id");
            if (i == a.a())
            {
                getActivity().finish();
            }
            dbf.h(i);
        }
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gmo)binder.a(gmo);
        e = (gqr)binder.a(gqr);
        e.a(this);
    }

    public void onResume()
    {
        int i;
        int j;
        super.onResume();
        d.d();
        Object obj;
        PreferenceCategory preferencecategory;
        hfa hfa1;
        if (b.k())
        {
            c.a(d, l.cr, g.o(b.b().a));
        } else
        if (g.a(b, apk.e))
        {
            obj1 = c;
            PreferenceCategory preferencecategory1 = d;
            i = l.cs;
            ani ani1 = b;
            Intent intent = new Intent(g.nS, com/google/android/apps/hangouts/phone/GooglePlusUpgradeActivity);
            intent.putExtra("g_plus_upgrade_now", true);
            if (ani1 != null)
            {
                intent.putExtra("account_id", ani1.h());
            }
            ((hfg) (obj1)).a(preferencecategory1, i, intent);
        }
        preferencecategory = d;
        obj = (cpt)binder.b(cpt);
        if (obj == null || binder.b(cpx) == null) goto _L2; else goto _L1
_L1:
        obj = ((cpt) (obj)).a(b);
        switch (((cpu) (obj)).a)
        {
        default:
            j = l.ic;
            i = l.ib;
            break;

        case 100: // 'd'
            break MISSING_BLOCK_LABEL_401;
        }
_L3:
        obj = ((cpu) (obj)).b;
        hfa1 = new hfa(context);
        hfa1.g(j);
        Object obj1;
        if (obj != null)
        {
            obj1 = getString(i, new Object[] {
                ebz.p(((String) (obj)))
            });
        } else
        {
            obj1 = null;
        }
        hfa1.b(((CharSequence) (obj1)));
        hfa1.a(new dnp(this));
        preferencecategory.c(hfa1);
_L2:
        obj1 = (ajn)hgx.b(context, ajn);
        if (obj1 != null)
        {
            ((ajn) (obj1)).a(getActivity(), lifecycle, d, a.a());
        }
        obj1 = new hfa(context);
        ((hfa) (obj1)).g(l.eX);
        ((hfa) (obj1)).a(new dnn(this));
        d.c(((hfa) (obj1)));
        obj1 = new hfa(context);
        ((hfa) (obj1)).g(l.jZ);
        d.c(((hfa) (obj1)));
        ((hfa) (obj1)).a(new dno(this));
        return;
        j = l.id;
        i = l.ia;
          goto _L3
    }
}
