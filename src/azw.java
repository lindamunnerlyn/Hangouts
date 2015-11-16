// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class azw
    implements arn
{

    final atg a;
    final azv b;

    azw(azv azv, atg atg1)
    {
        b = azv;
        a = atg1;
        super();
    }

    public void a(ark ark1)
    {
        if (g.d(ark1.b))
        {
            long l = dqv.a().e() - 4096;
            if (a.i >= l)
            {
                g.a(new azx(this));
            }
            return;
        } else
        {
            g.a(new azy(this));
            return;
        }
    }
}
