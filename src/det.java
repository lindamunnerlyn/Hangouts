// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class det
    implements dmf
{

    private static final long serialVersionUID = 2L;
    private int a;
    private final String b = eev.a(new Throwable());
    private final boolean c;
    private String d;

    public det(boolean flag)
    {
        a = 0;
        c = flag;
    }

    public void a(int i)
    {
        a = i;
    }

    public boolean a()
    {
        return c;
    }

    public void b(String s)
    {
        d = s;
    }

    public int k()
    {
        return a;
    }

    public cdl m()
    {
        return new des(this);
    }

    public String toString()
    {
        return g.g(this).a("shouldRetry", c).a("creationStack", b).a("originStack", d).toString();
    }
}
