// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.apps.hangouts.notifications.DndDialogActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class cea extends cdu
{

    private final boolean a;
    private final boolean x;

    cea(Context context, int j, ccy ccy1, cdu cdu1, boolean flag, boolean flag1)
    {
        super(context, j, ccy1);
        a = flag;
        x = flag1;
        h = null;
        i = 0;
        if (b)
        {
            ebw.b("Babel", "[Notifications] Multi Conversation");
        }
        c = cdu1.e;
        d = cdu1.f;
        if (ank.f(context, j))
        {
            e = context.getString(l.M, new Object[] {
                Integer.valueOf(ccy1.a)
            });
        } else
        {
            e = context.getResources().getQuantityString(g.hU, ccy1.a, new Object[] {
                Integer.valueOf(ccy1.a)
            });
        }
        g = g.f(dbf.e(j));
        g.putExtra("reset_chat_notifications", true);
        for (int i1 = 0; i1 < ccy1.b.size(); i1++)
        {
            cdu1 = (cda)ccy1.b.get(i1);
            if (!(((cda) (cdu1)).h.get(0) instanceof cdr))
            {
                continue;
            }
            c(((cda) (cdu1)).a);
            if (ccx.c(context) && i1 < 10)
            {
                ArrayList arraylist = new ArrayList();
                arraylist.add(cdu1);
                cdu1 = new ccy(((cda) (cdu1)).i, arraylist);
                this.j.add(new cct(context, j, cdu1, i1));
            }
        }

    }

    static void b(Context context, int j)
    {
        String s = c(context, j);
        context = db.a(context);
        ced.a(s, 0);
        context.a(s, 0);
        if (b)
        {
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 56)).append("MultiConversationNotifier.cancel [tag=]").append(s).append(" [id=]0").toString());
        }
    }

    protected void a(boolean flag)
    {
        if (b)
        {
            ebw.b("Babel", "Multiple Conversations");
        }
        ci ci1 = new ci(t);
        this.s = ci1;
        t.a(e);
        String s = o.getString(l.bW);
        StringBuilder stringbuilder = new StringBuilder();
        long l1 = 0L;
        int j = 0;
        while (j < k.b.size()) 
        {
            Object obj = (cda)k.b.get(j);
            long l2 = l1;
            if (((cda) (obj)).g > l1)
            {
                l2 = ((cda) (obj)).g;
            }
            Object obj1 = (ceb)((cda) (obj)).h.get(0);
            if (obj1 instanceof cdp)
            {
                StringBuilder stringbuilder1 = new StringBuilder(((cdp)obj1).q);
                for (int i1 = 1; i1 < ((cda) (obj)).h.size(); i1++)
                {
                    stringbuilder1.append(", ");
                    stringbuilder1.append(((ceb)((cda) (obj)).h.get(i1)).q);
                }

                obj1 = o.getResources().getQuantityString(g.hS, ((cda) (obj)).i, new Object[] {
                    Integer.valueOf(((cda) (obj)).i)
                });
                obj = stringbuilder1.toString();
                h = null;
                i = 0;
            } else
            if (((cda) (obj)).c && !ank.f(o, p))
            {
                obj1 = ((cda) (obj)).f;
                obj = null;
                h = null;
                i = 0;
            } else
            {
                obj1 = (cdr)obj1;
                obj = ((cdr) (obj1)).b;
                h = ((cdr) (obj1)).c;
                i = ((cdr) (obj1)).d;
                obj1 = ((cdr) (obj1)).r;
            }
            ci1.b(a(o, ((String) (obj1)), ((CharSequence) (obj)), h, i));
            if (obj1 != null)
            {
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(s);
                }
                stringbuilder.append(((String) (obj1)));
            }
            j++;
            l1 = l2;
        }
        f = stringbuilder;
        t.b(stringbuilder).c(m()).a(l1 / 1000L);
        super.a(flag);
    }

    protected void h()
    {
        t.b(Integer.toString(p)).e();
        Object obj = DndDialogActivity.a(o, dbf.e(p));
        ((Intent) (obj)).putExtra("opened_from_impression", 2258);
        obj = PendingIntent.getActivity(o, super.t(), ((Intent) (obj)), 0x8000000);
        t.a(com.google.android.apps.hangouts.R.drawable.bF, o.getString(l.bC), ((PendingIntent) (obj)));
        if (ccx.a(o))
        {
            obj = new cc(com.google.android.apps.hangouts.R.drawable.bn, o.getString(l.bC), ((PendingIntent) (obj)));
            List list = ((doq)hgx.a(o, doq)).a();
            ((cc) (obj)).a((new dm("dnd_duration_choice")).a(o.getString(l.bB)).a((CharSequence[])list.toArray(new String[list.size()])).a().b());
            u.a(((cc) (obj)).b());
        }
        super.h();
    }

    protected void i()
    {
        super.i();
        g.a(dbf.e(p), 1928);
        cdr.a(p, k.b, 457, 405, 463, a, x, null);
    }

    protected void k()
    {
        cdr.a(p, k.b, 458, 406, 464, a, x, null);
    }

    protected int p()
    {
        return super.p() + 1;
    }
}
