// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class goa extends gno
{

    private final gon a;
    private final gnp b;
    private final gnx c;
    private final String d;

    goa(gnx gnx1, gon gon1, gnp gnp1, gny gny, String s)
    {
        a = gon1;
        b = gnp1;
        c = gnx1;
        d = s;
        a(gny);
    }

    protected void a(String s, gnq gnq)
    {
        gnq = c.a(gnq);
        gnq = b.a(gnq);
        gnq.e = new lgg();
        ((lgm) (gnq)).e.a = d;
        a.a(gnq, s);
    }
}
