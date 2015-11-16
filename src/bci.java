// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bci
    implements bcf
{

    final bch a;

    bci(bch bch)
    {
        a = bch;
        super();
    }

    public int a()
    {
        return g.lf;
    }

    public boolean a(aoa aoa)
    {
        return true;
    }

    public bab b()
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new bab(2658, new String[] {
                "android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"
            });
        } else
        {
            return new bab(2658, new String[] {
                "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"
            });
        }
    }

    public Class c()
    {
        return bcg;
    }
}
