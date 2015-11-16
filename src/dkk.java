// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Set;

public final class dkk extends dgj
{

    private final String a;
    private String e;
    private Integer f;
    private boolean g;
    private String h;
    private boolean i;
    private String j;

    public dkk(aoa aoa1, String s)
    {
        super(aoa1);
        e = null;
        f = null;
        g = false;
        i = false;
        a = s;
    }

    private String a(aow aow1, String s)
    {
        if (eev.a("Babel", 3))
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
            eev.c("Babel", s1);
        }
        aow1.a();
        s1 = aow1.o(a);
        l1 = aow1.O(a);
        l = 0L;
        if (aow1.A(a) == 1)
        {
            l = 0x7fffffffffffffffL;
        }
        (new dkq(a, super.b.b.b(), l1, l, s, e, dsu.b)).a(aow1, super.c);
        aow1.b();
        aow1.c();
        return s1;
        s;
        aow1.c();
        throw s;
    }

    public void a()
    {
        aow aow1;
        aow1 = new aow(g.nU, super.b.a);
        if (e != null && !aow.a(a))
        {
            String s = aow.g();
            String s1 = a(aow1, s);
            a(((dmf) (new cwt(s, a, e, s1))));
        }
        if (f != null)
        {
            (new dkl(a, g.a(f, 0))).a(aow1, super.c);
        }
        if (!i && !g)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        aow1.a();
        Iterator iterator = aow1.af(a).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s2 = (String)iterator.next();
            if (g)
            {
                aow1.c(s2, h);
            }
            if (i)
            {
                aow1.d(s2, j);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_194;
        Exception exception;
        exception;
        aow1.c();
        throw exception;
        aow1.b();
        aow1.c();
    }

    public void a(int k)
    {
        f = Integer.valueOf(k);
    }

    public void a(String s)
    {
        e = s;
    }

    public void b(String s)
    {
        h = s;
        g = true;
    }

    public void c(String s)
    {
        j = s;
        i = true;
    }
}
