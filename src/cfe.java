// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;
import java.util.Iterator;
import java.util.List;

final class cfe extends cep
{

    final List h;

    cfe(Context context, int i, edb edb1, int j, List list, long l1)
    {
        super(context, i, j, edb1, l1);
        String s = context.getString(l.bQ);
        boolean flag;
        if (list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", flag);
        h = list;
        i = list.size();
        if (i == 1)
        {
            b = (String)list.get(0);
            f = edb1.a();
            c = context.getString(l.eg);
            b(f);
            c(f);
            return;
        }
        b = context.getString(l.ei, new Object[] {
            Integer.valueOf(i)
        });
        context = new StringBuilder();
        edb1 = h.iterator();
        i = 0;
        do
        {
label0:
            {
                if (edb1.hasNext())
                {
                    list = (String)edb1.next();
                    i++;
                    if (i != 8 || h.size() <= 8)
                    {
                        break label0;
                    }
                    context.append("...");
                }
                c = context;
                return;
            }
            if (i > 1)
            {
                context.append(s);
            }
            context.append(list);
        } while (true);
    }

    static void b(Context context, int i)
    {
        if (a)
        {
            eev.b("Babel", "MissedHangoutNotifier.cancelMissedNotification");
        }
        String s = c(context, i);
        context = db.a(context);
        cfi.a(s, 2);
        context.a(s, 2);
    }

    protected void a(boolean flag)
    {
        ci ci1;
        int j;
        t.a(b).c(c).b(c).a(d);
        if (h.size() > 1)
        {
            v.a(b);
        } else
        {
            v.a(c);
        }
        ci1 = new ci(t);
        j = h.size();
        if (j != 1) goto _L2; else goto _L1
_L1:
        ci1.b(c);
_L4:
        this.s = ci1;
        super.a(flag);
        return;
_L2:
        Iterator iterator = h.iterator();
        int i = 0;
        do
        {
            String s;
            if (iterator.hasNext())
            {
label0:
                {
                    s = (String)iterator.next();
                    i++;
                    if (i != 8 || j <= 8)
                    {
                        break label0;
                    }
                    ci1.b("...");
                }
            }
            if (true)
            {
                continue;
            }
            ci1.b(s);
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean a()
    {
        return false;
    }

    protected boolean c()
    {
        return true;
    }

    protected int d()
    {
        return com.google.android.apps.hangouts.R.drawable.cr;
    }

    protected int e()
    {
        return 2;
    }

    protected int f()
    {
        return 1;
    }

    protected Intent g()
    {
        if (h.size() == 1)
        {
            Intent intent = g.a(p, f, e);
            intent.putExtra("opened_from_impression", 1638);
            return intent;
        } else
        {
            return g.e(dcn.e(p)).putExtra("reset_hangout_notifications", true);
        }
    }

    protected void h()
    {
        if (cec.a(o) && q.size() == 1)
        {
            dl dl = a(o);
            Object obj = BabelGatewayActivity.a(o, p, q.a());
            ((Intent) (obj)).setFlags(0x10008000);
            ((Intent) (obj)).putExtra("opened_from_impression", 2259);
            int i = u();
            obj = PendingIntent.getActivity(o, i, ((Intent) (obj)), 0x8000000);
            obj = new cc(com.google.android.apps.hangouts.R.drawable.bk, o.getString(l.gO), ((PendingIntent) (obj)));
            ((cc) (obj)).a(dl);
            u.a(((cc) (obj)).b());
        }
        super.h();
    }
}
