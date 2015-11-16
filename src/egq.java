// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class egq
    implements aqs
{

    final egp a;

    egq(egp egp1)
    {
        a = egp1;
        super();
    }

    public void a(eef eef1, edf edf, boolean flag, aqn aqn, boolean flag1)
    {
        if (egp.a(a) != aqn)
        {
            if (eef1 != null)
            {
                eef1.b();
            }
        } else
        {
            egp.b(a);
            if (flag)
            {
                if (edf != null)
                {
                    a.b(new ehk(edf));
                    return;
                } else
                {
                    gdv.b("Expected non-null", eef1);
                    gdv.b("Expected non-null", eef1.e());
                    gdv.a("Expected null", egp.c(a));
                    egp.a(a, eef1);
                    a.a(egp.c(a).e());
                    a.d(0);
                    return;
                }
            }
        }
    }
}
