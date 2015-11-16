// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gij
    implements Runnable
{

    final gih a;

    gij(gih gih1)
    {
        a = gih1;
        super();
    }

    public void run()
    {
        if (a.l == null)
        {
            gkc.e("vclib", "A camera error occurred while no callback was registered");
        }
    }
}
