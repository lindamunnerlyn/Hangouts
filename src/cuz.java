// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public class cuz extends ctu
{

    private static final long serialVersionUID = 1L;
    public final boolean a;
    public final int b;
    public final String j = null;
    public final boolean k = false;

    public cuz(String s, boolean flag, int i)
    {
        super(s);
        a = flag;
        if (i <= 0)
        {
            i = 300;
        }
        b = i;
    }

    public String a()
    {
        return "background_queue";
    }

    public kop a(String s, int i, int l)
    {
        if (ctr.e)
        {
            String s1 = c;
            boolean flag = a;
            ebw.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 41)).append("setFocus build protobuf ").append(s1).append(" isFocused: ").append(flag).toString());
        }
        iyc iyc1 = new iyc();
        iyc1.requestHeader = ctq.a(s, i, l, h);
        iyc1.a = ctq.a(c);
        if (a)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        iyc1.b = Integer.valueOf(i);
        iyc1.d = Boolean.valueOf(true);
        iyc1.c = Integer.valueOf(b);
        return iyc1;
    }

    public boolean a(ccg ccg)
    {
        gbh.a(getClass(), ccg.getClass());
        return true;
    }

    public boolean a(cci cci1, dbo dbo)
    {
        if (dbq.b(cci1.c))
        {
            return false;
        } else
        {
            return super.a(cci1, dbo);
        }
    }

    public long b()
    {
        return TimeUnit.SECONDS.toMillis(30L);
    }

    public String g()
    {
        return "conversations/setfocus";
    }
}
