// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hdd
    implements Runnable
{

    final hcv a;
    final Object b;
    final hda c;

    hdd(hda hda, hcv hcv1, Object obj)
    {
        c = hda;
        a = hcv1;
        b = obj;
        super();
    }

    public void run()
    {
        a.a(b);
    }
}
