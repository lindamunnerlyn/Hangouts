// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import java.util.Map;

class gbh
{

    private Map a;
    private Map b;

    public gbh()
    {
        a = new gz();
        b = new gz();
    }

    public emt a(gap gap)
    {
        if (gap instanceof gbf)
        {
            return fdb.a;
        } else
        {
            return null;
        }
    }

    public emy a(gaq gaq)
    {
        if (gaq instanceof gbo)
        {
            return ((gbo)gaq).d();
        } else
        {
            return null;
        }
    }

    public enb a(gat gat)
    {
        if (a.containsKey(gat))
        {
            return (enb)a.get(gat);
        } else
        {
            gbi gbi1 = new gbi(this, gat);
            a.put(gat, gbi1);
            return gbi1;
        }
    }

    public end a(gau gau)
    {
        if (b.containsKey(gau))
        {
            return (end)b.get(gau);
        } else
        {
            gbj gbj1 = new gbj(this, gau);
            b.put(gau, gbj1);
            return gbj1;
        }
    }

    public gap a(ConnectionResult connectionresult)
    {
        return new gbg(connectionresult);
    }

    public gav a(ene ene)
    {
        return new gav(ene, gbm.a);
    }
}
