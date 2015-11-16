// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Set;

public final class dix extends dfa
{

    private final String a;
    private String d;
    private Integer e;
    private boolean f;
    private String g;
    private boolean h;
    private String i;

    public dix(ani ani1, String s)
    {
        super(ani1);
        d = null;
        e = null;
        f = false;
        h = false;
        a = s;
    }

    private String a(aoe aoe1, String s)
    {
        if (ebw.a("Babel", 3))
        {
            String s1 = String.valueOf(a);
            long l;
            long l1;
            if (s1.length() != 0)
            {
                s1 = "updateConversationNameLocally conversationId: ".concat(s1);
            } else
            {
                s1 = new String("updateConversationNameLocally conversationId: ");
            }
            ebw.c("Babel", s1);
        }
        aoe1.a();
        s1 = aoe1.o(a);
        l1 = aoe1.P(a);
        l = 0L;
        if (aoe1.A(a) == 1)
        {
            l = 0x7fffffffffffffffL;
        }
        (new djd(a, b.b(), l1, l, s, d, dqb.b)).a(aoe1, c);
        aoe1.b();
        aoe1.c();
        return s1;
        s;
        aoe1.c();
        throw s;
    }

    public void a()
    {
        aoe aoe1;
        aoe1 = new aoe(g.nS, b.h());
        if (d != null && !aoe.a(a))
        {
            String s = aoe.g();
            String s1 = a(aoe1, s);
            c.a(new cup(s, a, d, s1));
        }
        if (e != null)
        {
            (new diy(a, g.a(e, 0))).a(aoe1, c);
        }
        if (!h && !f)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        aoe1.a();
        Iterator iterator = aoe1.ag(a).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s2 = (String)iterator.next();
            if (f)
            {
                aoe1.c(s2, g);
            }
            if (h)
            {
                aoe1.d(s2, i);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_197;
        Exception exception;
        exception;
        aoe1.c();
        throw exception;
        aoe1.b();
        aoe1.c();
    }

    public void a(int j)
    {
        e = Integer.valueOf(j);
    }

    public void b(String s)
    {
        d = s;
    }

    public void c(String s)
    {
        g = s;
        f = true;
    }

    public void d(String s)
    {
        i = s;
        h = true;
    }
}
