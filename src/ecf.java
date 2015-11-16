// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ecf
    implements aqd
{

    private static final jth a;
    private final ahd b;

    ecf(ahd ahd1)
    {
        b = ahd1;
    }

    public boolean a(int i, aqc aqc1)
    {
        boolean flag;
        if (b.g(i) && a.contains(aqc1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            aqc1 = String.valueOf(aqc1);
            eev.e("Babel", (new StringBuilder(String.valueOf(aqc1).length() + 25)).append("Unicorn blocked feature: ").append(aqc1).toString());
        }
        return flag;
    }

    static 
    {
        a = jth.a(5, new Object[] {
            aqc.a, aqc.b, aqc.c, aqc.d, aqc.e
        });
    }
}
