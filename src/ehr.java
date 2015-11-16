// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ehr
{

    private ftc a;

    public ehr()
    {
        this(new ftc());
    }

    private ehr(ftc ftc1)
    {
        a = ftc1;
    }

    public ftc a()
    {
        return a;
    }

    public void a(int i)
    {
        a.a("6", i);
    }

    public void a(long l)
    {
        a.a("12", l);
    }

    public void a(dqb dqb1)
    {
        a.a("24", dqb1.ordinal());
    }

    public void a(dqc dqc1)
    {
        a.a("15", dqc1.ordinal());
    }

    public void a(String s)
    {
        a.a("25", s);
    }

    public void b(int i)
    {
        a.a("22", i - 1);
    }

    public void b(long l)
    {
        a.a("26", l);
    }

    public void b(String s)
    {
        a.a("28", s);
    }

    public void c(String s)
    {
        a.a("18", s);
    }
}
