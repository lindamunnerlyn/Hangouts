// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fqm
{

    private final fqn a = new fqn();

    public fqm()
    {
    }

    public int a(String s)
    {
        return a.a(s);
    }

    public void a(String s, int i)
    {
        a.a(s, Integer.valueOf(i));
    }

    public int b(String s, int i)
    {
        return ((Integer)a.a(s, i)).intValue();
    }

    public String toString()
    {
        return a.toString();
    }
}
