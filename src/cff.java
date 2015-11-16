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

final class cff extends cez
{

    private final boolean a;
    private final boolean x;

    cff(Context context, int j, ced ced1, cez cez1, boolean flag, boolean flag1)
    {
        super(context, j, ced1);
        a = flag;
        x = flag1;
        h = null;
        i = 0;
        if (b)
        {
            eev.b("Babel", "[Notifications] Multi Conversation");
        }
        c = cez1.e;
        d = cez1.f;
        if (aoc.f(context, j))
        {
            e = context.getString(l.J, new Object[] {
                Integer.valueOf(ced1.a)
            });
        } else
        {
            e = context.getResources().getQuantityString(g.hM, ced1.a, new Object[] {
                Integer.valueOf(ced1.a)
            });
        }
        g = g.e(dcn.e(j));
        g.putExtra("reset_chat_notifications", true);
        for (int i1 = 0; i1 < ced1.b.size(); i1++)
        {
            cez1 = (cef)ced1.b.get(i1);
            if (!(((cef) (cez1)).h.get(0) instanceof cew))
            {
                continue;
            }
            c(((cef) (cez1)).a);
            if (cec.c(context) && i1 < 10)
            {
                ArrayList arraylist = new ArrayList();
                arraylist.add(cez1);
                cez1 = new ced(((cef) (cez1)).i, arraylist);
                this.j.add(new cdy(context, j, cez1, i1));
            }
        }

    }

    static void b(Context context, int j)
    {
        String s = c(context, j);
        context = db.a(context);
        cfi.a(s, 0);
        context.a(s, 0);
        if (b)
        {
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 56)).append("MultiConversationNotifier.cancel [tag=]").append(s).append(" [id=]0").toString());
        }
    }

    protected void a(boolean flag)
    {
        if (b)
        {
            eev.b("Babel", "Multiple Conversations");
        }
        ci ci1 = new ci(t);
        this.s = ci1;
        t.a(e);
        String s = o.getString(l.bQ);
        StringBuilder stringbuilder = new StringBuilder();
        long l1 = 0L;
        int j = 0;
        while (j < k.b.size()) 
        {
            Object obj = (cef)k.b.get(j);
            long l2 = l1;
            if (((cef) (obj)).g > l1)
            {
                l2 = ((cef) (obj)).g;
            }
            Object obj1 = (cfg)((cef) (obj)).h.get(0);
            if (obj1 instanceof ceu)
            {
                StringBuilder stringbuilder1 = new StringBuilder(((ceu)obj1).q);
                for (int i1 = 1; i1 < ((cef) (obj)).h.size(); i1++)
                {
                    stringbuilder1.append(", ");
                    stringbuilder1.append(((cfg)((cef) (obj)).h.get(i1)).q);
                }

                obj1 = o.getResources().getQuantityString(g.hK, ((cef) (obj)).i, new Object[] {
                    Integer.valueOf(((cef) (obj)).i)
                });
                obj = stringbuilder1.toString();
                h = null;
                i = 0;
            } else
            if (((cef) (obj)).c && !aoc.f(o, p))
            {
                obj1 = ((cef) (obj)).f;
                obj = null;
                h = null;
                i = 0;
            } else
            {
                obj1 = (cew)obj1;
                obj = ((cew) (obj1)).b;
                h = ((cew) (obj1)).c;
                i = ((cew) (obj1)).d;
                obj1 = ((cew) (obj1)).r;
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
        Object obj = DndDialogActivity.a(o, p);
        obj = PendingIntent.getActivity(o, super.t(), ((Intent) (obj)), 0x8000000);
        t.a(com.google.android.apps.hangouts.R.drawable.bB, o.getString(l.bw), ((PendingIntent) (obj)));
        if (cec.a(o))
        {
            Object obj1 = DndDialogActivity.a(o, p);
            ((Intent) (obj1)).putExtra("opened_from_impression", 2258);
            obj1 = PendingIntent.getActivity(o, super.t() + 1, ((Intent) (obj1)), 0x8000000);
            obj1 = new cc(com.google.android.apps.hangouts.R.drawable.bj, o.getString(l.bw), ((PendingIntent) (obj1)));
            List list = ((drj)hlp.a(o, drj)).a();
            ((cc) (obj1)).a((new dm("dnd_duration_choice")).a(o.getString(l.bv)).a((CharSequence[])list.toArray(new String[list.size()])).a().b());
            u.a(((cc) (obj1)).b());
        }
        super.h();
    }

    protected void i()
    {
        super.i();
        g.a(dcn.e(p), 1928);
        cew.a(p, k.b, 457, 405, 463, a, x, null);
    }

    protected void k()
    {
        cew.a(p, k.b, 458, 406, 464, a, x, null);
    }

    protected int p()
    {
        return super.p() + 2;
    }
}
