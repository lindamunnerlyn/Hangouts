// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gek
    implements gds
{

    final String a;
    final geg b;

    gek(geg geg1, String s)
    {
        b = geg1;
        a = s;
        super();
    }

    public void a(kws kws)
    {
        kws = geg.f(b).b(a);
        if (kws == null)
        {
            gne.b("vclib", "Got an ENDPOINT_EXITED event for %s, which doesn't exist in our endpoints", new Object[] {
                a
            });
            return;
        } else
        {
            geg.f(b).b(kws);
            gkt gkt1 = new gkt(Integer.valueOf(43));
            geg.a(b, kws, gkt1);
            return;
        }
    }

    public void b(kws kws)
    {
        geg.a("Failed to kick participant: %s", new Object[] {
            a
        });
    }
}
