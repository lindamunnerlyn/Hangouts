// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hfo
    implements Runnable
{

    final hfn a;

    hfo(hfn hfn1)
    {
        a = hfn1;
        super();
    }

    public void run()
    {
        hfn.a(a);
    }
}
