// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class dza
{

    final Set a = new HashSet();
    final ebb b;
    final SparseArray c = new SparseArray();
    final Map d = new gz();
    private final gms e;
    private final int f;
    private final dgp g = new dzb(this);

    public dza(gms gms1, int i, ebb ebb1)
    {
        e = gms1;
        f = i;
        b = ebb1;
    }

    crk a(String s, boolean flag)
    {
        dzg dzg1 = (dzg)d.get(s);
        Object obj;
        if (dzg1 == null)
        {
            obj = b.a(f, s, flag);
        } else
        {
            obj = dzg1;
            if (dzg1.b == null)
            {
                if (!flag)
                {
                    return null;
                } else
                {
                    dzg1.b = b.a(f, s);
                    return dzg1;
                }
            }
        }
        return ((crk) (obj));
    }

    void a(long l)
    {
        if (e.d(f) && !dbf.e(f).q())
        {
            SparseArray sparsearray = new SparseArray();
            Iterator iterator = d.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                dzg dzg1 = (dzg)iterator.next();
                int i = dzg1.a(l);
                if (i != 0)
                {
                    List list = (List)sparsearray.get(i);
                    Object obj = list;
                    if (list == null)
                    {
                        obj = new ArrayList();
                        sparsearray.put(i, obj);
                    }
                    ((List) (obj)).add(dzg1.a);
                }
            } while (true);
            int k = sparsearray.size();
            int j = 0;
            while (j < k) 
            {
                int i1 = sparsearray.keyAt(j);
                Object obj1 = (ArrayList)sparsearray.valueAt(j);
                int j1 = dhi.b().a();
                if (ebw.a("Babel", 3))
                {
                    int k1 = f;
                    int l1 = ((ArrayList) (obj1)).size();
                    String s = String.valueOf(TextUtils.join(",", ((Iterable) (obj1))));
                    ebw.d("Babel", (new StringBuilder(String.valueOf(s).length() + 117)).append("Presence request: requestId=").append(j1).append(", account=").append(k1).append(", fieldMask=").append(i1).append(", gaiaCount=").append(l1).append(", gaiaList=").append(s).toString());
                }
                c.put(j1, obj1);
                RealTimeChatService.a(j1, f, ((ArrayList) (obj1)), i1);
                String s1;
                for (obj1 = ((ArrayList) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((dzg)d.get(s1)).a(j1, true))
                {
                    s1 = (String)((Iterator) (obj1)).next();
                }

                j++;
            }
        }
    }

    void a(crk crk1, String s, int i)
    {
        if (!e.d(f))
        {
            return;
        } else
        {
            ContentValues contentvalues = new ContentValues();
            crk1.a(i, contentvalues);
            RealTimeChatService.a(f, s, contentvalues);
            return;
        }
    }

    void a(crk crk1, String s, csz csz1, Object obj)
    {
        if (crk1.a(csz1, obj, System.currentTimeMillis()))
        {
            a(crk1, s, csz1.j);
        }
    }

    void a(String s, csz csz1, Object obj)
    {
        crk crk1 = a(s, false);
        if (crk1 != null)
        {
            a(crk1, s, csz1, obj);
            return;
        } else
        {
            (new dzc(this, e, f, s, csz1, obj)).execute(new Void[0]);
            return;
        }
    }

    boolean a(ebc ebc)
    {
        Iterator iterator = d.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!((dzg)iterator.next()).a(ebc))
            {
                iterator.remove();
            }
        } while (true);
        boolean flag = d.isEmpty();
        if (flag)
        {
            RealTimeChatService.b(g);
        }
        return !flag;
    }

    boolean a(String s, ebc ebc, int i)
    {
        if (d.isEmpty())
        {
            RealTimeChatService.a(g);
        }
        dzg dzg2 = (dzg)d.get(s);
        dzg dzg1 = dzg2;
        if (dzg2 == null)
        {
            dzg dzg3 = new dzg(s);
            dzg3.b = b.a(f, s, false);
            d.put(s, dzg3);
            dzg1 = dzg3;
            if (dzg3.b == null)
            {
                (new dzd(this, e, f, s)).execute(new Void[0]);
                dzg1 = dzg3;
            }
        }
        return dzg1.a(ebc, i);
    }
}
