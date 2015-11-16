// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import java.util.List;

final class ccz extends cdu
{

    ccz(Context context, int i1, ccy ccy1)
    {
        super(context, i1, ccy1);
        ccy1 = (cda)ccy1.b.get(0);
        cdp cdp1 = (cdp)((cda) (ccy1)).h.get(0);
        if (((cda) (ccy1)).i == 1)
        {
            if (b)
            {
                ebw.b("Babel", "[Notifications] SINGLE INVITE, NO MESSAGES.");
            }
            b(((cda) (ccy1)).a);
            c(((cda) (ccy1)).a);
            g = g.a(i1, ((cda) (ccy1)).a, cdp1.a, ((cda) (ccy1)).e, ((cda) (ccy1)).g);
            e = cdp1.r;
            if (((cda) (ccy1)).c)
            {
                f = context.getResources().getQuantityString(g.hO, ((cda) (ccy1)).d, new Object[] {
                    Integer.valueOf(((cda) (ccy1)).d)
                });
                return;
            } else
            {
                f = context.getString(l.iU);
                return;
            }
        }
        if (b)
        {
            ebw.b("Babel", "[Notifications] MULTIPLE INVITES, NO MESSAGES");
        }
        g = g.g(dbf.e(i1));
        g.putExtra("reset_chat_notifications", true);
        e = context.getString(l.iT, new Object[] {
            Integer.valueOf(((cda) (ccy1)).i)
        });
        if (((cda) (ccy1)).h.size() == 2)
        {
            ccy1 = (cdp)((cda) (ccy1)).h.get(1);
            f = context.getString(l.iV, new Object[] {
                cdp1.r, ((cdp) (ccy1)).r
            });
            return;
        }
        context = new StringBuilder(cdp1.q);
        for (i1 = 1; i1 < ((cda) (ccy1)).h.size(); i1++)
        {
            context.append(", ");
            context.append(((ceb)((cda) (ccy1)).h.get(i1)).q);
        }

        f = context.toString();
    }

    protected void a(boolean flag)
    {
        t.a(e).b(f);
        cda cda1 = (cda)k.b.get(0);
        if (cda1.i == 1)
        {
            this.s = (new ce(t)).b(f);
            t.c(e);
        } else
        {
            t.c(m());
            ci ci1 = new ci(t);
            int i1 = 0;
            while (i1 < cda1.h.size()) 
            {
                cdp cdp1 = (cdp)cda1.h.get(i1);
                String s;
                if (cdp1.c)
                {
                    int j1 = cdp1.a(p);
                    s = o.getResources().getQuantityString(g.hO, j1, new Object[] {
                        Integer.valueOf(j1)
                    });
                } else
                {
                    s = o.getString(l.hc);
                }
                ci1.b(a(o, cdp1.r, ((CharSequence) (s)), null, 0));
                i1++;
            }
            this.s = ci1;
        }
        t.a(cda1.g / 1000L);
        super.a(flag);
    }

    protected void i()
    {
        super.i();
        cda cda1 = (cda)k.b.get(0);
        ani ani = dbf.e(p);
        char c;
        if (cda1.h.size() == 1)
        {
            c = '\u08BA';
        } else
        {
            c = '\u08BB';
        }
        g.a(ani, c);
    }

    protected String j()
    {
        return a(o, p, q.a());
    }

    protected void k()
    {
        super.k();
        cda cda1 = (cda)k.b.get(0);
        ani ani = dbf.e(p);
        char c;
        if (cda1.h.size() == 1)
        {
            c = '\u08BC';
        } else
        {
            c = '\u08BD';
        }
        g.a(ani, c);
    }
}
