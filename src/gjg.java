// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class gjg
{

    String a;
    boolean b;
    private final gjk c;
    private gjh d;
    private gju e;
    private String f;
    private boolean g;

    public gjg(gjk gjk1)
    {
        g = false;
        c = gjk1;
    }

    public void a()
    {
        c(false);
        if (d != null)
        {
            c.b(d);
            d = null;
        }
    }

    public void a(gju gju)
    {
        if (e != null)
        {
            c.a(e);
        }
        e = gju;
        b();
    }

    public void a(String s)
    {
        if (!s.equals(f))
        {
            if ("focusedParticipant".equals(s))
            {
                d = new gjh(this);
                c.a(d);
                f = "focusedParticipant";
                if (a == null)
                {
                    s = "localParticipant";
                } else
                {
                    s = a;
                }
                a = s;
            } else
            {
                if (d != null)
                {
                    c.b(d);
                    d = null;
                }
                f = s;
                a = s;
            }
        }
        b();
    }

    protected void a(boolean flag)
    {
    }

    void b()
    {
        if (e == null)
        {
            return;
        }
        if (g && a != null)
        {
            c.a(a, e);
            return;
        } else
        {
            c.a(e);
            return;
        }
    }

    protected void b(boolean flag)
    {
    }

    public void c(boolean flag)
    {
        if (flag != g)
        {
            g = flag;
            b();
        }
    }
}
