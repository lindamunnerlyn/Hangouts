// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public class cxd extends cvy
{

    private static final long serialVersionUID = 1L;
    public final boolean a;
    public final int b;
    public final String j = null;
    public final boolean k = false;

    public cxd(String s, boolean flag, int i)
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

    public kws a(String s, int i, int l)
    {
        if (cvv.e)
        {
            String s1 = c;
            boolean flag = a;
            eev.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 41)).append("setFocus build protobuf ").append(s1).append(" isFocused: ").append(flag).toString());
        }
        jeh jeh1 = new jeh();
        jeh1.requestHeader = cvu.a(s, i, l, h);
        jeh1.a = cvu.a(c);
        if (a)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        jeh1.b = Integer.valueOf(i);
        jeh1.d = Boolean.valueOf(true);
        jeh1.c = Integer.valueOf(b);
        return jeh1;
    }

    public boolean a(cdl cdl)
    {
        gdv.a(getClass(), cdl.getClass());
        return true;
    }

    public boolean a(cdn cdn1, dcx dcx)
    {
        if (dcz.b(cdn1.c))
        {
            return false;
        } else
        {
            return super.a(cdn1, dcx);
        }
    }

    public long b()
    {
        return TimeUnit.SECONDS.toMillis(30L);
    }

    public String f()
    {
        return "conversations/setfocus";
    }
}
