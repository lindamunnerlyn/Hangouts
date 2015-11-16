// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cvx extends cvy
{

    private static final long serialVersionUID = 1L;
    public final boolean a;
    public final long b;

    public cvx(String s, long l, boolean flag)
    {
        super(s);
        b = l;
        a = flag;
    }

    public String a()
    {
        return "event_queue";
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            String s1 = c;
            boolean flag = a;
            eev.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 27)).append("Archive conversation ").append(s1).append(" ").append(flag).toString());
        }
        jbs jbs1 = new jbs();
        jbs1.requestHeader = cvu.a(s, i, j, h);
        jbs1.a = cvu.a(c);
        jbs1.c = Long.valueOf(b);
        if (a)
        {
            i = 2;
        } else
        {
            i = 1;
        }
        jbs1.b = Integer.valueOf(i);
        return jbs1;
    }

    public String f()
    {
        return "conversations/modifyconversationview";
    }
}
