// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class axw
    implements Runnable
{

    final axv a;

    axw(axv axv1)
    {
        a = axv1;
        super();
    }

    public void run()
    {
        if (a.a == axx.a)
        {
            a.a = axx.b;
            axv.a(a);
        }
    }
}
