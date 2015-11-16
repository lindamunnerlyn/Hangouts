// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gbw
    implements gbe
{

    final String a;
    final gbs b;

    gbw(gbs gbs1, String s)
    {
        b = gbs1;
        a = s;
        super();
    }

    public void a(kop kop)
    {
        kop = gbs.f(b).b(a);
        if (kop == null)
        {
            kop = a;
            gkc.d("vclib", (new StringBuilder(String.valueOf(kop).length() + 71)).append("Got an ENDPOINT_EXITED event for ").append(kop).append(", which doesn't exist in our endpoints").toString());
            return;
        } else
        {
            gbs.f(b).b(kop);
            ghr ghr1 = new ghr(Integer.valueOf(43));
            gbs.a(b, kop, ghr1);
            return;
        }
    }

    public void b(kop kop)
    {
        gbs.a("Failed to kick participant: %s", new Object[] {
            a
        });
    }
}
