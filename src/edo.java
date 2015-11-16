// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class edo
    implements aqb
{

    final edn a;

    edo(edn edn1)
    {
        a = edn1;
        super();
    }

    public void a(ebh ebh1, eab eab, boolean flag, apw apw, boolean flag1)
    {
        if (edn.a(a) != apw)
        {
            if (ebh1 != null)
            {
                ebh1.b();
            }
        } else
        {
            edn.b(a);
            if (flag)
            {
                if (eab != null)
                {
                    a.b(new eei(eab));
                    return;
                } else
                {
                    gbh.b(ebh1);
                    gbh.b(ebh1.e());
                    gbh.a(edn.c(a));
                    edn.a(a, ebh1);
                    a.a(edn.c(a).e());
                    a.d(0);
                    return;
                }
            }
        }
    }
}
