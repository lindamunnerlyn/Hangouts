// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import java.util.Map;

class fyt
{

    private Map a;
    private Map b;

    public fyt()
    {
        a = new gz();
        b = new gz();
    }

    public ejs a(fyb fyb)
    {
        if (fyb instanceof fyr)
        {
            return fad.a;
        } else
        {
            return null;
        }
    }

    public ejx a(fyc fyc)
    {
        if (fyc instanceof fza)
        {
            return ((fza)fyc).d();
        } else
        {
            return null;
        }
    }

    public eka a(fyf fyf)
    {
        if (a.containsKey(fyf))
        {
            return (eka)a.get(fyf);
        } else
        {
            fyu fyu1 = new fyu(this, fyf);
            a.put(fyf, fyu1);
            return fyu1;
        }
    }

    public ekc a(fyg fyg)
    {
        if (b.containsKey(fyg))
        {
            return (ekc)b.get(fyg);
        } else
        {
            fyv fyv1 = new fyv(this, fyg);
            b.put(fyg, fyv1);
            return fyv1;
        }
    }

    public fyb a(ConnectionResult connectionresult)
    {
        return new fys(connectionresult);
    }

    public fyh a(ekd ekd)
    {
        return new fyh(ekd, fyy.a);
    }
}
