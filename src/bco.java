// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bco
    implements bck
{

    final bcn a;

    bco(bcn bcn)
    {
        a = bcn;
        super();
    }

    public int a()
    {
        return g.lg;
    }

    public boolean a(aoa aoa)
    {
        if (aoa != null)
        {
            return g.a(aoa, aqc.a);
        } else
        {
            return true;
        }
    }

    public bab b()
    {
        return new bab(2661, new String[] {
            "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"
        });
    }

    public Class c()
    {
        return bcl;
    }
}
