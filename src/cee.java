// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import java.util.List;

final class cee extends cez
{

    cee(Context context, int i1, ced ced1)
    {
        super(context, i1, ced1);
        ced1 = (cef)ced1.b.get(0);
        ceu ceu1 = (ceu)((cef) (ced1)).h.get(0);
        if (((cef) (ced1)).i == 1)
        {
            if (b)
            {
                eev.b("Babel", "[Notifications] SINGLE INVITE, NO MESSAGES.");
            }
            b(((cef) (ced1)).a);
            c(((cef) (ced1)).a);
            g = g.a(i1, ((cef) (ced1)).a, ceu1.a, ((cef) (ced1)).e, ((cef) (ced1)).g);
            e = ceu1.r;
            if (((cef) (ced1)).c)
            {
                f = context.getResources().getQuantityString(g.hG, ((cef) (ced1)).d, new Object[] {
                    Integer.valueOf(((cef) (ced1)).d)
                });
                return;
            } else
            {
                f = context.getString(l.im);
                return;
            }
        }
        if (b)
        {
            eev.b("Babel", "[Notifications] MULTIPLE INVITES, NO MESSAGES");
        }
        g = g.f(dcn.e(i1));
        g.putExtra("reset_chat_notifications", true);
        e = context.getString(l.il, new Object[] {
            Integer.valueOf(((cef) (ced1)).i)
        });
        if (((cef) (ced1)).h.size() == 2)
        {
            ced1 = (ceu)((cef) (ced1)).h.get(1);
            f = context.getString(l.in, new Object[] {
                ceu1.r, ((ceu) (ced1)).r
            });
            return;
        }
        context = new StringBuilder(ceu1.q);
        for (i1 = 1; i1 < ((cef) (ced1)).h.size(); i1++)
        {
            context.append(", ");
            context.append(((cfg)((cef) (ced1)).h.get(i1)).q);
        }

        f = context.toString();
    }

    protected void a(boolean flag)
    {
        t.a(e).b(f);
        cef cef1 = (cef)k.b.get(0);
        if (cef1.i == 1)
        {
            this.s = (new ce(t)).b(f);
            t.c(e);
        } else
        {
            t.c(m());
            ci ci1 = new ci(t);
            int i1 = 0;
            while (i1 < cef1.h.size()) 
            {
                ceu ceu1 = (ceu)cef1.h.get(i1);
                String s;
                if (ceu1.c)
                {
                    int j1 = ceu1.a(p);
                    s = o.getResources().getQuantityString(g.hG, j1, new Object[] {
                        Integer.valueOf(j1)
                    });
                } else
                {
                    s = o.getString(l.gL);
                }
                ci1.b(a(o, ceu1.r, ((CharSequence) (s)), null, 0));
                i1++;
            }
            this.s = ci1;
        }
        t.a(cef1.g / 1000L);
        super.a(flag);
    }

    protected void i()
    {
        super.i();
        cef cef1 = (cef)k.b.get(0);
        aoa aoa = dcn.e(p);
        char c;
        if (cef1.h.size() == 1)
        {
            c = '\u08BA';
        } else
        {
            c = '\u08BB';
        }
        g.a(aoa, c);
    }

    protected String j()
    {
        return a(o, p, q.a());
    }

    protected void k()
    {
        super.k();
        cef cef1 = (cef)k.b.get(0);
        aoa aoa = dcn.e(p);
        char c;
        if (cef1.h.size() == 1)
        {
            c = '\u08BC';
        } else
        {
            c = '\u08BD';
        }
        g.a(aoa, c);
    }
}
