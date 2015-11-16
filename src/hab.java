// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class hab
{

    public hab()
    {
    }

    private static int a(hba hba1)
    {
        switch (hac.a[hba1.ordinal()])
        {
        default:
            hba1 = String.valueOf(hba1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(hba1).length() + 24)).append("unknown storage policy: ").append(hba1).toString());

        case 1: // '\001'
            return 1;

        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 3;
        }
    }

    public static huh a(Context context, String s, String s1, String s2, String s3, hbe hbe1, int i, hba hba1)
    {
        huh huh1;
        huh1 = new huh();
        String s4 = hbe1.h().a();
        huh1.a = s;
        huh1.b = s1;
        huh1.l = s3;
        huh1.w = s4;
        boolean flag;
        if (hba1 != hba.d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            huh1.F = a(hba1);
            boolean flag1;
            if (hba1 == hba.a)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            huh1.g = Boolean.valueOf(flag1);
        } else
        {
            huh1.g = Boolean.valueOf(hbe1.b());
        }
        s = s2;
        if (TextUtils.isEmpty(s2))
        {
            s = gzw.a(s4);
        }
        huh1.k = s;
        huh1.z = (new String[] {
            s
        });
        s = hbe1.j();
        if (!TextUtils.isEmpty(s))
        {
            huh1.B = s;
        }
        huh1.y = new hus();
        huh1.y.a = Integer.valueOf(i);
        huh1.q = Long.valueOf(hbe1.f() / 1000L);
        if (hbe1.l() == null) goto _L2; else goto _L1
_L1:
        huh1.u = new huc();
        huh1.u.b = new hur();
        huh1.u.b.a = hbe1.l();
_L4:
        if (hbe1.m() != null)
        {
            huh1.v = new hud();
            huh1.v.a = hbe1.m();
        }
        huh1.h = hbe1.d();
        context = hbe1.n();
        if (context != null)
        {
            huh1.E = context;
            huh1.w = null;
            huh1.z = null;
            huh1.F = a(hba.c);
            huh1.C = 3;
            huh1.g = null;
            huh1.k = null;
            huh1.r = null;
            huh1.h = null;
            huh1.v = null;
            huh1.s = null;
            huh1.q = null;
            huh1.y = null;
            huh1.D = new khl();
        }
        return huh1;
_L2:
        if (g.d(context, hbe1.g()))
        {
            huh1.u = new huc();
            huh1.u.b = new hur();
            huh1.u.b.a = new jvz();
            huh1.u.b.a.b = 8;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
