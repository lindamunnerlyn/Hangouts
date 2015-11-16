// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cft
    implements ary
{

    final cfs a;

    cft(cfs cfs1)
    {
        a = cfs1;
        super();
    }

    public void a()
    {
    }

    public void a(String s)
    {
        boolean flag = true;
        bjd bjd1;
        byte byte0;
        if (cfs.b(a).b() > 1)
        {
            byte0 = 2;
        } else
        {
            byte0 = 1;
        }
        bjd1 = cfs.e(a);
        if (cfs.d(a) != atd.d)
        {
            flag = false;
        }
        bjd1.a(s, byte0, flag, cfs.b(a).a());
    }

    public void a(boolean flag)
    {
        if (flag && !cfs.a(a) && cfs.b(a).b() == 1)
        {
            cfs.c(a);
        }
    }
}
