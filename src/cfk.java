// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cfk
    implements ary
{

    final cfj a;

    cfk(cfj cfj1)
    {
        a = cfj1;
        super();
    }

    public void a()
    {
        a.a();
    }

    public void a(String s)
    {
        cfm.a[cfj.c(a).ordinal()];
        JVM INSTR tableswitch 1 4: default 44
    //                   1 92
    //                   2 92
    //                   3 124
    //                   4 128;
           goto _L1 _L2 _L2 _L3 _L4
_L1:
        s = String.valueOf(cfj.c(a));
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 27)).append("Unknown conversation type: ").append(s).toString());
_L2:
        s = g.a(cfj.d(a).h(), s, 1);
        a.startActivity(s);
_L6:
        a.a();
        return;
_L3:
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        ai ai = a.getActivity();
        ani ani1 = cfj.d(a);
        int i;
        if (cfj.c(a) == atd.c)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        (new cpk(ai, ani1, s, true, i, true, 117, 0, false, false, false)).a(new Void[0]);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(boolean flag)
    {
        int j = cfj.a(a).b();
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        gbh.a("Unexpected model count", Integer.valueOf(j), Integer.valueOf(i));
        if (flag)
        {
            cfj.b(a).a(aob.c, 2567);
            return;
        } else
        {
            a.a();
            return;
        }
    }
}
