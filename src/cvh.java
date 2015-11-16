// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cvh extends cvf
{

    private static final long serialVersionUID = 1L;
    private final int a;
    private final String b;
    private final int c;

    public cvh(int i, String s, int j)
    {
        a = i;
        c = j;
        b = s;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kws a(String s, int i, int j)
    {
        jhd jhd1 = new jhd();
        jhd1.requestHeader = cvu.a(s, i, j, h);
        s = new jhc();
        s.b = Integer.valueOf(a);
        s.o = Integer.valueOf(c);
        if (b != null)
        {
            s.i = b;
        }
        jhd1.a = s;
        return jhd1;
    }

    public long b()
    {
        return bpm.F();
    }

    public String f()
    {
        return "hangouts/add";
    }
}
