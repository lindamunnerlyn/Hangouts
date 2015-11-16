// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class glv
    implements Runnable
{

    final glt a;

    glv(glt glt1)
    {
        a = glt1;
        super();
    }

    public void run()
    {
        if (a.j != null)
        {
            a.j.a(a.h, a.i);
        }
    }
}
