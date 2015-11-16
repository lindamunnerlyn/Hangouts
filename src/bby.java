// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bby
    implements bbu
{

    final bbx a;

    bby(bbx bbx)
    {
        a = bbx;
        super();
    }

    public int a()
    {
        return g.lo;
    }

    public boolean a(ani ani)
    {
        if (ani != null)
        {
            return g.a(ani, apk.a);
        } else
        {
            return true;
        }
    }

    public azm b()
    {
        return new azm(2661, new String[] {
            "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"
        });
    }

    public Class c()
    {
        return bbv;
    }
}
