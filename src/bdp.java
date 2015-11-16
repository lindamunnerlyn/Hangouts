// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class bdp
{

    private final gal a;

    public bdp(gal gal1)
    {
        a = gal1;
    }

    public void a(int i)
    {
        a.a(i).d();
    }

    public void a(int i, int j, int k, Integer integer)
    {
        jer jer1 = new jer();
        jer1.c = Integer.valueOf(j);
        jer1.d = Integer.valueOf(k);
        if (integer != null)
        {
            jer1.a = integer;
        }
        a.a(i).a(jer1).d();
    }

    public void a(int i, int j, Integer integer)
    {
        jer jer1 = new jer();
        jer1.b = Integer.valueOf(j);
        if (integer != null)
        {
            jer1.a = integer;
        }
        a.a(i).a(jer1).d();
    }

    public void b(int i)
    {
        a(2321, i, null);
    }
}
