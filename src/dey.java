// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class dey
    implements dko
{

    private static final long serialVersionUID = 2L;
    private final jlk a;
    private final int b;
    private int c;
    private final String d = ebw.a(new Throwable());
    private String e;

    public dey(List list, int i)
    {
        c = 0;
        a = jlk.a(list);
        b = i;
    }

    public int a()
    {
        return b;
    }

    public void a(int i)
    {
        c = i;
    }

    public jlk b()
    {
        return a;
    }

    public void b(String s)
    {
        e = s;
    }

    public int l()
    {
        return c;
    }

    public ccg n()
    {
        return new dex(this);
    }

    public String toString()
    {
        int i = b;
        int j = a.size();
        String s = d;
        String s1 = e;
        return (new StringBuilder(String.valueOf(s).length() + 102 + String.valueOf(s1).length())).append("query presence request: field mask=").append(i).append(" len(gaiaIds)").append(j).append("\nCreation stack:\n").append(s).append("\nOrigin stack:\n").append(s1).toString();
    }
}
