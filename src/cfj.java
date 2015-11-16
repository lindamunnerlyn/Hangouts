// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cfj
    implements Runnable
{

    final cfi a;

    cfj(cfi cfi1)
    {
        a = cfi1;
        super();
    }

    public void run()
    {
        if (cfi.m)
        {
            eev.b("Babel", "Avatar timed out. Might send notification.");
        }
        cfi.b(a);
    }
}
