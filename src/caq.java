// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class caq extends hmm
    implements caj, hbr
{

    private hbi a;
    private gqz b;
    private int c;

    public caq()
    {
        c = -1;
    }

    public void a()
    {
        aoc.d(getContext(), dcn.e(c));
        grb grb1 = b.a(c);
        a.a(grb1.b("account_name"), grb1.b("effective_gaia_id"));
    }

    public void a(int i)
    {
        Object obj;
        c = i;
        obj = b.a(i);
        if (!cao.d(((grb) (obj))))
        {
            break MISSING_BLOCK_LABEL_172;
        }
        if (cao.b(((grb) (obj))) || !cao.a(((grb) (obj)))) goto _L2; else goto _L1
_L1:
        Object obj1 = context;
        obj = getChildFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putString("title", ((Context) (obj1)).getString(l.hh));
        bundle.putString("message", ((Context) (obj1)).getString(l.hf));
        bundle.putString("positive", ((Context) (obj1)).getString(l.hg));
        obj1 = new cai();
        ((cai) (obj1)).setArguments(bundle);
        ((cai) (obj1)).a(((ap) (obj)), "archive_tos");
_L4:
        return;
_L2:
        if (!cao.a(((grb) (obj))))
        {
            cah.a(context, getChildFragmentManager(), l.hl, l.hk);
            return;
        }
        if (!cao.c(((grb) (obj)))) goto _L4; else goto _L3
_L3:
        cah.a(context, getChildFragmentManager(), l.hn, l.hm);
        return;
        a.b(getString(l.sk), "Account upgrade without OOBE");
        return;
    }

    public void b()
    {
        a.c();
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        b = (gqz)binder.a(gqz);
        a = (hbi)binder.a(hbi);
        binder.a(caj, this);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            c = bundle.getInt("account_id");
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("account_id", c);
    }
}
