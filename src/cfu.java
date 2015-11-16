// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cfu
    implements eep
{

    final cfs a;

    cfu(cfs cfs1)
    {
        a = cfs1;
        super();
    }

    public void a(eej eej1)
    {
        amf amf;
        amf = eej1.a();
        if (cfs.b(a).c(amf))
        {
            if (!cfs.b(a).b(amf))
            {
                cfs.f(a).b(amf);
            }
            return;
        }
        cfv.a[eej1.b() - 1];
        JVM INSTR tableswitch 1 3: default 84
    //                   1 147
    //                   2 154
    //                   3 161;
           goto _L1 _L2 _L3 _L4
_L1:
        int i = 0;
_L6:
        if (i != 0)
        {
            ((gap)cfs.h(a).a(gap)).a(cfs.g(a).a()).a(i).d();
        }
        cfs.f(a).a(amf);
        return;
_L2:
        i = 2538;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 2540;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 2539;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
