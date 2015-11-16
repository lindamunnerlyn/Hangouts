// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dru
    implements hjv
{

    final drt a;

    dru(drt drt1)
    {
        a = drt1;
        super();
    }

    public boolean a(hjr hjr, Object obj)
    {
        boolean flag = false;
        boolean flag1 = g.a((Boolean)obj, false);
        drt.a(a, new bgm(a.getActivity()));
        byte byte0;
        if (hjr == drt.a(a))
        {
            byte0 = 2;
        } else
        {
            if (hjr == drt.b(a))
            {
                flag = true;
            }
            g.d(flag);
            byte0 = 6;
        }
        bgk.a(new drv(a, byte0, flag1), drt.c(a)).a();
        return true;
    }
}
