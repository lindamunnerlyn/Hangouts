// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cee
    implements Runnable
{

    final ced a;

    cee(ced ced1)
    {
        a = ced1;
        super();
    }

    public void run()
    {
        if (ced.m)
        {
            ebw.b("Babel", "Avatar timed out. Might send notification.");
        }
        ced.b(a);
    }
}
