// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class dfl
    implements dmf
{

    private static final long serialVersionUID = 1L;
    private final jsh a;
    private int b;
    private final String c = eev.a(new Throwable());
    private String d;

    public dfl(List list)
    {
        b = 0;
        a = jsh.a(list);
    }

    public jsh a()
    {
        return a;
    }

    public void a(int i)
    {
        b = i;
    }

    public void b(String s)
    {
        d = s;
    }

    public int k()
    {
        return b;
    }

    public cdl m()
    {
        return new dfk(this);
    }

    public String toString()
    {
        String s = String.valueOf("mark event observed request: len(observed events): ");
        int i = a.size();
        String s1 = c;
        String s2 = d;
        return (new StringBuilder(String.valueOf(s).length() + 43 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(i).append("\nCreation stack:\n").append(s1).append("\nOrigin stack:\n").append(s2).toString();
    }
}
