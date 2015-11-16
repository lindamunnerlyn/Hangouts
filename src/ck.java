// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import java.util.ArrayList;

class ck extends cq
{

    ck()
    {
    }

    public Notification a(cf cf1)
    {
        ct ct1 = new ct(cf1.a, cf1.B, cf1.b, cf1.c, cf1.h, cf1.f, cf1.i, cf1.d, cf1.e, cf1.g, cf1.o, cf1.p, cf1.q, cf1.k, cf1.l, cf1.j, cf1.n, cf1.v, cf1.C, cf1.x, cf1.r, cf1.s, cf1.t);
        ca.a(ct1, cf1.u);
        ca.a(ct1, cf1.m);
        return ct1.b();
    }

    public ArrayList a(cb acb[])
    {
        if (acb != null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = null;
_L4:
        return arraylist;
_L2:
        ArrayList arraylist1 = new ArrayList(acb.length);
        int j = acb.length;
        int i = 0;
        do
        {
            arraylist = arraylist1;
            if (i >= j)
            {
                continue;
            }
            arraylist1.add(g.a(acb[i]));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
