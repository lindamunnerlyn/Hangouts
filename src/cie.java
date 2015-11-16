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

final class cie
    implements cia, fsn, hhi, hjb, hjt, hkb
{

    private Activity a;
    private Context b;
    private final SparseArray c;
    private final SparseArray d;
    private gow e;
    private chz f;
    private hbw g;
    private gmo h;
    private gov i;

    cie(Activity activity, hjm hjm1)
    {
        this(hjm1);
        a = activity;
    }

    cie(hjm hjm1)
    {
        c = new SparseArray();
        d = new SparseArray();
        i = new cif(this);
        hjm1.a(this);
    }

    static SparseArray a(cie cie1)
    {
        return cie1.d;
    }

    private void a(int j)
    {
        g.a(j, new cig(this, j));
    }

    static void a(cie cie1, int j, List list)
    {
        Object obj = list.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            if (((cic)((Iterator) (obj)).next()).b)
            {
                continue;
            }
            Toast.makeText(cie1.b, g.nQ, 0).show();
            break;
        } while (true);
        obj = (cib)cie1.c.get(j);
        cik cik1 = (cik)cie1.d.get(j);
        cie1.d.remove(j);
        ((cib) (obj)).a(list, cik1.b);
    }

    static void a(cie cie1, int j, List list, boolean flag, boolean flag1)
    {
        if (j != 0)
        {
            int k = cie1.h.a();
            cie1 = ((gap)hgx.a(cie1.b, gap)).a(k);
            jfb jfb1;
            for (list = list.iterator(); list.hasNext(); cie1.a(j).a(jfb1).d())
            {
                cic cic1 = (cic)list.next();
                jfb1 = new jfb();
                jfb1.a = cic1.a;
                jfb1.b = Boolean.valueOf(flag);
                jfb1.c = Boolean.valueOf(flag1);
                jfb1.d = Boolean.valueOf(cic1.b);
            }

        }
    }

    public void a(int j, cib cib1)
    {
        boolean flag;
        if (c.get(j) == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "Listener should be set only once");
        c.put(j, cib1);
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
        d.put(j, new cik(j, k, bundle));
        if (flag)
        {
            g.a(new cih(this, list, j));
            return;
        } else
        {
            bundle = new cii(this);
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
        a = activity;
    }

    public void a(Context context, hgx hgx1, Bundle bundle)
    {
        b = context;
        f = (chz)hgx1.a(chz);
        g = (hbw)hgx1.a(hbw);
        for (int j = 0; j < c.size(); j++)
        {
            a(c.keyAt(j));
        }

        e = (gow)hgx1.a(gow);
        e.a(g.nM, i);
        h = (gmo)hgx1.a(gmo);
    }

    public void a(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle = bundle.getParcelableArrayList("permission_manager_pending_requests");
            if (bundle != null)
            {
                cik cik1;
                for (bundle = bundle.iterator(); bundle.hasNext(); d.put(cik1.c, cik1))
                {
                    cik1 = (cik)bundle.next();
                }

            }
        }
    }

    public void b(Bundle bundle)
    {
        if (d.size() > 0)
        {
            ArrayList arraylist = new ArrayList();
            for (int j = 0; j < d.size(); j++)
            {
                arraylist.add(d.get(d.keyAt(j)));
            }

            bundle.putParcelableArrayList("permission_manager_pending_requests", arraylist);
        }
    }
}
