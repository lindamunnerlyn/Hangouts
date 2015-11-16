// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gll
    implements Runnable
{

    final glj a;

    gll(glj glj1)
    {
        a = glj1;
        super();
    }

    public void run()
    {
        if (a.n == null)
        {
            gne.a(6, "vclib", "A camera error occurred while no callback was registered");
        }
    }
}
