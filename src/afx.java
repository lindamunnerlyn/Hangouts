// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class afx
    implements Runnable
{

    final String a;
    final long b;
    final afw c;

    afx(afw afw1, String s, long l)
    {
        c = afw1;
        a = s;
        b = l;
        super();
    }

    public void run()
    {
        c.a.a(a, b);
        c.a.a(toString());
    }
}
