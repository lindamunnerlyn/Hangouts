// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dil extends dgj
{

    String a;
    private final String e;

    public dil(aoa aoa, String s, String s1)
    {
        super(aoa);
        a = s;
        e = s1;
    }

    public void a()
    {
        aow aow1;
        aow1 = new aow(g.nU, super.b.a);
        aow1.a();
        Long long1 = aow1.g(a, e);
        if (long1 == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        aoq.a(aow1, g.a(long1, 0L));
        aow1.b();
        aow1.c();
        return;
        Exception exception;
        exception;
        aow1.c();
        throw exception;
    }
}
