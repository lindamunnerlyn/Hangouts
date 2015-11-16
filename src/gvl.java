// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gvl
    implements Runnable
{

    final gvk a;

    gvl(gvk gvk1)
    {
        a = gvk1;
        super();
    }

    public void run()
    {
        if (!gvk.a(a).b())
        {
            gvk.a(a).a(gvk.b(a), null);
        }
    }
}
