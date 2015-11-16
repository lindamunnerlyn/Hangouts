// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bde
    implements bcq
{

    final bdd a;

    bde(bdd bdd)
    {
        a = bdd;
        super();
    }

    public int a()
    {
        return g.ls;
    }

    public boolean a(aoa aoa)
    {
        return true;
    }

    public bab b()
    {
        return null;
    }

    public Class c()
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            return bda;
        } else
        {
            return bdb;
        }
    }
}
