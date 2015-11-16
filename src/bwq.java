// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bwq
    implements hor, hou, hoy
{

    final bwp a;

    bwq(bwp bwp1)
    {
        a = bwp1;
        super();
    }

    public void G_()
    {
        bwp bwp1 = a;
        bwp1.a = bwp1.a + 1;
    }

    public void a()
    {
        bwp bwp1 = a;
        bwp1.a = bwp1.a - 1;
    }
}
