// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class beb
{

    private final gcz a;

    public beb(gcz gcz1)
    {
        a = gcz1;
    }

    public void a(int i)
    {
        a.a(i).d();
    }

    public void a(int i, int j, int k, Integer integer)
    {
        jlf jlf1 = new jlf();
        jlf1.c = Integer.valueOf(j);
        jlf1.d = Integer.valueOf(k);
        if (integer != null)
        {
            jlf1.a = integer;
        }
        a.a(i).a(jlf1).d();
    }

    public void a(int i, int j, Integer integer)
    {
        jlf jlf1 = new jlf();
        jlf1.b = Integer.valueOf(j);
        if (integer != null)
        {
            jlf1.a = integer;
        }
        a.a(i).a(jlf1).d();
    }

    public void b(int i)
    {
        a(2321, i, null);
    }
}
