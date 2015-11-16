// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class bzn extends hhu
    implements bzg, gxh
{

    private gwy a;
    private gms b;
    private int c;

    public bzn()
    {
        c = -1;
    }

    public void a()
    {
        ank.d(getContext(), dbf.e(c));
        gmu gmu1 = b.a(c);
        a.a(gmu1.b("account_name"), gmu1.b("effective_gaia_id"));
    }

    public void a(int i)
    {
        gmu gmu1;
        c = i;
        gmu1 = b.a(i);
        if (!bzl.a(gmu1))
        {
            break MISSING_BLOCK_LABEL_99;
        }
        if (bzl.c(gmu1) || !bzl.d(gmu1)) goto _L2; else goto _L1
_L1:
        bzf.a(context, getChildFragmentManager());
_L4:
        return;
_L2:
        if (!bzl.d(gmu1))
        {
            bze.a(context, getChildFragmentManager(), l.hR, l.hQ);
            return;
        }
        if (!bzl.e(gmu1)) goto _L4; else goto _L3
_L3:
        bze.a(context, getChildFragmentManager(), l.hT, l.hS);
        return;
        a.a(getString(l.sR));
        return;
    }

    public void b()
    {
        a.c();
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        b = (gms)binder.a(gms);
        a = (gwy)binder.a(gwy);
        binder.a(bzg, this);
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
