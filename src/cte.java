// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cte extends ctc
{

    private static final long serialVersionUID = 1L;
    private final int a;
    private final String b;
    private final int c;

    public cte(int i, String s, int j)
    {
        a = i;
        c = j;
        b = s;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kop a(String s, int i, int j)
    {
        jaw jaw1 = new jaw();
        jaw1.requestHeader = ctq.a(s, i, j, h);
        s = new jav();
        s.b = Integer.valueOf(a);
        s.o = Integer.valueOf(c);
        if (b != null)
        {
            s.i = b;
        }
        jaw1.a = s;
        return jaw1;
    }

    public long b()
    {
        return bpd.G();
    }

    public String g()
    {
        return "hangouts/add";
    }
}
