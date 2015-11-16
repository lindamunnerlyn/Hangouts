// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ddl
    implements dko
{

    private static final long serialVersionUID = 2L;
    private int a;
    private final String b = ebw.a(new Throwable());
    private final boolean c;
    private String d;

    public ddl(boolean flag)
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

    public int l()
    {
        return a;
    }

    public ccg n()
    {
        return new ddk(this);
    }

    public String toString()
    {
        return h.c(this).a("shouldRetry", c).a("creationStack", b).a("originStack", d).toString();
    }
}
