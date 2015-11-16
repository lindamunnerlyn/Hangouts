// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cha
    implements ehr
{

    final cgy a;

    cha(cgy cgy1)
    {
        a = cgy1;
        super();
    }

    public void a(ehl ehl1)
    {
        amx amx;
        amx = ehl1.a();
        if (cgy.b(a).c(amx))
        {
            if (!cgy.b(a).b(amx))
            {
                cgy.f(a).b(amx);
            }
            return;
        }
        chb.a[ehl1.b() - 1];
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
            ((gdd)cgy.h(a).a(gdd)).a(cgy.g(a).a()).a(i).d();
        }
        cgy.f(a).a(amx);
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
