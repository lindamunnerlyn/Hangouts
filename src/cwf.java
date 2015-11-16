// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class cwf extends cwm
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final String b;
    public final boolean c;

    public cwf(String s, String s1, boolean flag)
    {
        a = s;
        b = s1;
        c = flag;
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            eev.b("Babel_RequestWriter", "FinishPhoneVerificationRequest build protobuf ");
        }
        s = new izs();
        s.c = Boolean.valueOf(c);
        if (!TextUtils.isEmpty(b))
        {
            kbm kbm1 = new kbm();
            kbm1.a = a;
            s.a = kbm1;
            s.b = b;
        }
        return s;
    }

    public void a(aoa aoa, dcx dcx)
    {
        g.a(aoa, 2050);
        aoa = (crk)hlp.b(g.nU, crk);
        if (aoa != null)
        {
            aoa.a(105, false);
        }
    }

    public boolean a(cdn cdn, dcx dcx)
    {
        return false;
    }

    public String f()
    {
        return "devices/finishphonenumberverification";
    }
}
