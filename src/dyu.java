// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dyu
    implements apl
{

    private static final jmi a;

    public dyu()
    {
    }

    public boolean a(ani ani1, apk apk1)
    {
        boolean flag;
        if (ani1.i() && a.contains(apk1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            ani1 = String.valueOf(apk1);
            ebw.e("Babel", (new StringBuilder(String.valueOf(ani1).length() + 25)).append("Unicorn blocked feature: ").append(ani1).toString());
        }
        return flag;
    }

    static 
    {
        a = jmi.a(apk.a, apk.b, apk.c, apk.d, apk.e);
    }
}
