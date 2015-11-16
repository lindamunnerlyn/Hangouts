// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bcd
    implements bbn
{

    final bcc a;

    bcd(bcc bcc)
    {
        a = bcc;
        super();
    }

    public int a()
    {
        return g.la;
    }

    public boolean a(aoa aoa)
    {
        return true;
    }

    public bab b()
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new bab(2659, new String[] {
                "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"
            });
        } else
        {
            return new bab(2659, new String[] {
                "android.permission.WRITE_EXTERNAL_STORAGE"
            });
        }
    }

    public Class c()
    {
        return bbx;
    }
}
