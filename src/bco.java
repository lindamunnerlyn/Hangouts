// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bco
    implements bca
{

    final bcn a;

    bco(bcn bcn)
    {
        a = bcn;
        super();
    }

    public int a()
    {
        return g.lA;
    }

    public boolean a(ani ani)
    {
        return true;
    }

    public azm b()
    {
        return null;
    }

    public Class c()
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            return bck;
        } else
        {
            return bcl;
        }
    }
}
