// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class ded
    implements dko
{

    private static final long serialVersionUID = 1L;
    private final jlk a;
    private int b;
    private final String c = ebw.a(new Throwable());
    private String d;

    public ded(List list)
    {
        b = 0;
        a = jlk.a(list);
    }

    public jlk a()
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

    public int l()
    {
        return b;
    }

    public ccg n()
    {
        return new dec(this);
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
