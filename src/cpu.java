// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cpu
    implements Runnable
{

    final cpt a;

    cpu(cpt cpt1)
    {
        a = cpt1;
        super();
    }

    public void run()
    {
        cpt.a(a);
    }
}
