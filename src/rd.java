// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class rd
    implements Runnable
{

    final rc a;

    rd(rc rc1)
    {
        a = rc1;
        super();
    }

    public void run()
    {
        if ((a.u & 1) != 0)
        {
            rc.a(a, 0);
        }
        if ((a.u & 0x1000) != 0)
        {
            rc.a(a, 108);
        }
        a.t = false;
        a.u = 0;
    }
}
