// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class drx
    implements Runnable
{

    final drw a;

    drx(drw drw1)
    {
        a = drw1;
        super();
    }

    public void run()
    {
        drw.a(a);
    }
}
