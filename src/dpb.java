// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dpb
    implements hfe
{

    final dpa a;

    dpb(dpa dpa1)
    {
        a = dpa1;
        super();
    }

    public boolean a(hfa hfa, Object obj)
    {
        boolean flag = false;
        boolean flag1 = g.a((Boolean)obj, false);
        dpa.a(a, new bga(a.getActivity()));
        byte byte0;
        if (hfa == dpa.a(a))
        {
            byte0 = 2;
        } else
        {
            if (hfa == dpa.b(a))
            {
                flag = true;
            }
            g.b(flag);
            byte0 = 6;
        }
        bfy.a(new dpc(a, byte0, flag1), dpa.c(a)).a();
        return true;
    }
}
