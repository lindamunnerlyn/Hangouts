// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class cjk
    implements cjg, hma, hnt, hon, hov, hoy
{

    final SparseArray a;
    private Activity b;
    private Context c;
    private final SparseArray d;
    private gte e;
    private cjf f;
    private hgn g;
    private gqu h;
    private gtd i;

    cjk(Activity activity, hof hof1)
    {
        this(hof1);
        b = activity;
    }

    cjk(hof hof1)
    {
        d = new SparseArray();
        a = new SparseArray();
        i = new cjl(this);
        hof1.a(this);
    }

    private void a(int j)
    {
        g.a(j, new cjm(this, j));
    }

    static void a(cjk cjk1, int j, List list)
    {
        Object obj = list.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            if (((cji)((Iterator) (obj)).next()).b)
            {
                continue;
            }
            Toast.makeText(cjk1.c, g.nS, 0).show();
            break;
        } while (true);
        obj = (cjh)cjk1.d.get(j);
        cjq cjq1 = (cjq)cjk1.a.get(j);
        cjk1.a.remove(j);
        ((cjh) (obj)).a(list, cjq1.b);
    }

    static void a(cjk cjk1, int j, List list, boolean flag, boolean flag1)
    {
        if (j != 0)
        {
            int k = cjk1.h.a();
            cjk1 = ((gdd)hlp.a(cjk1.c, gdd)).a(k);
            jlq jlq1;
            for (list = list.iterator(); list.hasNext(); cjk1.a(j).a(jlq1).d())
            {
                cji cji1 = (cji)list.next();
                jlq1 = new jlq();
                jlq1.a = cji1.a;
                jlq1.b = Boolean.valueOf(flag);
                jlq1.c = Boolean.valueOf(flag1);
                jlq1.d = Boolean.valueOf(cji1.b);
            }

        }
    }

    public void a(int j, cjh cjh1)
    {
        boolean flag;
        if (d.get(j) == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "Listener should be set only once");
        d.put(j, cjh1);
        if (g != null)
        {
            a(j);
        }
    }

    public void a(int j, List list, int k, Bundle bundle)
    {
        Iterator iterator = list.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s = (String)iterator.next();
        if (f.a(s)) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L6:
        a.put(j, new cjq(j, k, bundle));
        if (flag)
        {
            g.a(new cjn(this, list, j));
            return;
        } else
        {
            bundle = new cjo(this);
            g.a(bundle, j, list);
            return;
        }
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(Activity activity)
    {
        b = activity;
    }

    public void a(Context context, hlp hlp1, Bundle bundle)
    {
        c = context;
        f = (cjf)hlp1.a(cjf);
        g = (hgn)hlp1.a(hgn);
        for (int j = 0; j < d.size(); j++)
        {
            a(d.keyAt(j));
        }

        e = (gte)hlp1.a(gte);
        e.a(g.nO, i);
        h = (gqu)hlp1.a(gqu);
    }

    public void a(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle = bundle.getParcelableArrayList("permission_manager_pending_requests");
            if (bundle != null)
            {
                cjq cjq1;
                for (bundle = bundle.iterator(); bundle.hasNext(); a.put(cjq1.c, cjq1))
                {
                    cjq1 = (cjq)bundle.next();
                }

            }
        }
    }

    public void b(Bundle bundle)
    {
        if (a.size() > 0)
        {
            ArrayList arraylist = new ArrayList();
            for (int j = 0; j < a.size(); j++)
            {
                arraylist.add(a.get(a.keyAt(j)));
            }

            bundle.putParcelableArrayList("permission_manager_pending_requests", arraylist);
        }
    }
}
