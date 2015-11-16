// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Iterator;

class bnb extends dgp
{

    private static final boolean h = false;
    public final ani a;
    public final String b;
    public final String c;
    public String d;
    public boolean e;
    public boolean f;
    public int g;
    private final ArrayList i = new ArrayList();

    bnb(ani ani, String s, String s1)
    {
        a = ani;
        b = s;
        c = s1;
        g = -1;
        RealTimeChatService.a(this);
    }

    protected void a(int i1)
    {
        String s = d;
        ebw.e("Babel", (new StringBuilder(String.valueOf(s).length() + 32)).append("Broadcast removed: ").append(i1).append(", ").append(s).toString());
        f = true;
        l();
    }

    public void a(int i1, ani ani, dgu dgu1)
    {
label0:
        {
            ani = dgu1.c();
            if (h)
            {
                dgu1 = String.valueOf(ani);
                ebw.b("Babel", (new StringBuilder(String.valueOf(dgu1).length() + 23)).append("Received: ").append(i1).append(", ").append(dgu1).toString());
            }
            if (i1 == g)
            {
                g = -1;
                if (!(ani instanceof cvo))
                {
                    break label0;
                }
                a(i1, (cvo)ani);
            }
            return;
        }
        if (ani instanceof cwd)
        {
            a(i1, (cwd)ani);
            return;
        }
        if (ani instanceof cxb)
        {
            a(i1, (cxb)ani);
            return;
        }
        if (ani instanceof cxj)
        {
            a(i1);
            return;
        } else
        {
            gbh.a("Request id matched but not to an expected type of response.");
            return;
        }
    }

    protected void a(int i1, cvo cvo1)
    {
        d = cvo1.k();
        j();
        cvo1 = d;
        ebw.e("Babel", (new StringBuilder(String.valueOf(cvo1).length() + 32)).append("Broadcast created: ").append(i1).append(", ").append(cvo1).toString());
    }

    protected void a(int i1, cwd cwd1)
    {
        gbh.a(cwd1.k(), d);
        cwd1 = d;
        ebw.e("Babel", (new StringBuilder(String.valueOf(cwd1).length() + 34)).append("Broadcast retrieved: ").append(i1).append(", ").append(cwd1).toString());
    }

    protected void a(int i1, cxb cxb1)
    {
    }

    void a(bnc bnc1)
    {
        if (!i.contains(bnc1))
        {
            i.add(bnc1);
        }
    }

    void h()
    {
        i.clear();
        RealTimeChatService.b(this);
    }

    void i()
    {
        gbh.a(Integer.valueOf(g), Integer.valueOf(-1));
        gbh.b(d);
        gbh.a(e);
        gbh.b(f);
        g = RealTimeChatService.b(a, d, b);
        int i1 = g;
        ebw.e("Babel", (new StringBuilder(43)).append("Stopping broadcast. Request ID: ").append(i1).toString());
    }

    protected void j()
    {
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((bnc)iterator.next()).a()) { }
    }

    protected void k()
    {
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((bnc)iterator.next()).a(this)) { }
    }

    protected void l()
    {
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((bnc)iterator.next()).b(this)) { }
    }

    protected void m()
    {
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((bnc)iterator.next()).c(this)) { }
    }

    static 
    {
        hik hik = ebw.f;
    }
}
