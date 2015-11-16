// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class afv
    implements Runnable
{

    final String a;
    final long b;
    final afu c;

    afv(afu afu1, String s, long l)
    {
        c = afu1;
        a = s;
        b = l;
        super();
    }

    public void run()
    {
        afu.b(c).a(a, b);
        afu.b(c).a(toString());
    }
}
