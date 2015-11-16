// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class gmi
{

    private final gmm a;
    private gmj b;
    private gmw c;
    String d;
    boolean e;
    private String f;
    private boolean g;

    public gmi(gmm gmm1)
    {
        g = false;
        a = gmm1;
    }

    public void a()
    {
        c(false);
        if (b != null)
        {
            a.b(b);
            b = null;
        }
    }

    public void a(gmw gmw)
    {
        if (c != null)
        {
            a.a(c);
        }
        c = gmw;
        b();
    }

    public void a(String s)
    {
        if (!s.equals(f))
        {
            if ("focusedParticipant".equals(s))
            {
                b = new gmj(this);
                a.a(b);
                f = "focusedParticipant";
                if (d == null)
                {
                    s = "localParticipant";
                } else
                {
                    s = d;
                }
                d = s;
            } else
            {
                if (b != null)
                {
                    a.b(b);
                    b = null;
                }
                f = s;
                d = s;
            }
        }
        b();
    }

    protected void a(boolean flag)
    {
    }

    void b()
    {
        if (c == null)
        {
            return;
        }
        if (g && d != null)
        {
            a.a(d, c);
            return;
        } else
        {
            a.a(c);
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
