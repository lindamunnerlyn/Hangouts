// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cgp
    implements asn
{

    final cgo a;

    cgp(cgo cgo1)
    {
        a = cgo1;
        super();
    }

    public void a()
    {
        a.a();
    }

    public void a(String s)
    {
        cgs.a[cgo.c(a).ordinal()];
        JVM INSTR tableswitch 1 4: default 44
    //                   1 92
    //                   2 92
    //                   3 124
    //                   4 128;
           goto _L1 _L2 _L2 _L3 _L4
_L1:
        s = String.valueOf(cgo.c(a));
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 27)).append("Unknown conversation type: ").append(s).toString());
_L2:
        s = g.a(cgo.d(a).h(), s, 1);
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
        aoa aoa1 = cgo.d(a);
        int i;
        if (cgo.c(a) == atu.c)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        (new cra(ai, aoa1, s, true, i, true, 117, 0, false, false, false)).a(new Void[0]);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(boolean flag)
    {
        int j = cgo.a(a).b();
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        gdv.a("Unexpected model count", Integer.valueOf(j), Integer.valueOf(i));
        if (flag)
        {
            cgo.b(a).a(aot.c, 2567);
            return;
        } else
        {
            a.a();
            return;
        }
    }
}
