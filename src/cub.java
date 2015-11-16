// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class cub extends cui
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final String b;
    public final boolean c;

    public cub(String s, String s1, boolean flag)
    {
        a = s;
        b = s1;
        c = flag;
    }

    public kop a(String s, int i, int j)
    {
        if (ctr.e)
        {
            ebw.b("Babel_RequestWriter", "FinishPhoneVerificationRequest build protobuf ");
        }
        s = new itn();
        s.c = Boolean.valueOf(c);
        if (!TextUtils.isEmpty(b))
        {
            jtj jtj1 = new jtj();
            jtj1.a = a;
            s.a = jtj1;
            s.b = b;
        }
        return s;
    }

    public void a(ani ani, dbo dbo)
    {
        g.a(ani, 2050);
        ani = (cpt)hgx.b(g.nS, cpt);
        if (ani != null)
        {
            ani.a(105, false);
        }
    }

    public boolean a(cci cci, dbo dbo)
    {
        return false;
    }

    public String g()
    {
        return "devices/finishphonenumberverification";
    }
}
