// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cta
    implements Runnable
{

    final csy a;

    cta(csy csy1)
    {
        a = csy1;
        super();
    }

    public void run()
    {
        csy.a(a).a(a);
        a.H_();
    }
}
