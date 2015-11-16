// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bbn
    implements bax
{

    final bbm a;

    bbn(bbm bbm)
    {
        a = bbm;
        super();
    }

    public int a()
    {
        return g.li;
    }

    public boolean a(ani ani)
    {
        return true;
    }

    public azm b()
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new azm(2659, new String[] {
                "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"
            });
        } else
        {
            return new azm(2659, new String[] {
                "android.permission.WRITE_EXTERNAL_STORAGE"
            });
        }
    }

    public Class c()
    {
        return bbh;
    }
}
