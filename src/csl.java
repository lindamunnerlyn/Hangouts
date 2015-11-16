// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
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

final class csl
{

    final Set a = new HashSet();
    final css b;
    final SparseArray c = new SparseArray();
    final Map d = new gz();
    private final Context e;
    private final gqz f;
    private final int g;
    private final dhy h = new csm(this);

    public csl(Context context, gqz gqz1, int i, css css1)
    {
        e = context;
        f = gqz1;
        g = i;
        b = css1;
    }

    ctu a(String s, boolean flag)
    {
        csp csp1 = (csp)d.get(s);
        Object obj;
        if (csp1 == null)
        {
            obj = b.a(g, s, flag);
        } else
        {
            obj = csp1;
            if (csp1.b == null)
            {
                if (!flag)
                {
                    return null;
                } else
                {
                    csp1.b = b.a(g, s);
                    return csp1;
                }
            }
        }
        return ((ctu) (obj));
    }

    void a()
    {
        RealTimeChatService.b(h);
    }

    void a(long l)
    {
        if (f.d(g) && !dcn.e(g).o())
        {
            SparseArray sparsearray = new SparseArray();
            Iterator iterator = d.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                csp csp1 = (csp)iterator.next();
                int i = csp1.a(l);
                if (i != 0)
                {
                    List list = (List)sparsearray.get(i);
                    Object obj = list;
                    if (list == null)
                    {
                        obj = new ArrayList();
                        sparsearray.put(i, obj);
                    }
                    ((List) (obj)).add(csp1.a);
                }
            } while (true);
            int k = sparsearray.size();
            int j = 0;
            while (j < k) 
            {
                int i1 = sparsearray.keyAt(j);
                Object obj1 = (ArrayList)sparsearray.valueAt(j);
                int j1 = dir.b().a();
                if (eev.a("Babel", 3))
                {
                    int k1 = g;
                    int l1 = ((ArrayList) (obj1)).size();
                    String s = String.valueOf(TextUtils.join(",", ((Iterable) (obj1))));
                    eev.d("Babel", (new StringBuilder(String.valueOf(s).length() + 117)).append("Presence request: requestId=").append(j1).append(", account=").append(k1).append(", fieldMask=").append(i1).append(", gaiaCount=").append(l1).append(", gaiaList=").append(s).toString());
                }
                c.put(j1, obj1);
                RealTimeChatService.a(j1, g, ((ArrayList) (obj1)), i1);
                String s1;
                for (obj1 = ((ArrayList) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((csp)d.get(s1)).a(j1, true))
                {
                    s1 = (String)((Iterator) (obj1)).next();
                }

                j++;
            }
        }
    }

    void a(ctu ctu1, String s, int i)
    {
        if (!f.d(g))
        {
            return;
        } else
        {
            ContentValues contentvalues = new ContentValues();
            ctu1.a(i, contentvalues);
            RealTimeChatService.a(g, s, contentvalues);
            return;
        }
    }

    void a(ctu ctu1, String s, cvc cvc1, Object obj)
    {
        if (ctu1.a(cvc1, obj, System.currentTimeMillis()))
        {
            a(ctu1, s, cvc1.j);
        }
    }

    void a(String s, cvc cvc1, Object obj)
    {
        ctu ctu1 = a(s, false);
        if (ctu1 != null)
        {
            a(ctu1, s, cvc1, obj);
            return;
        } else
        {
            (new csn(this, e, f, g, s, cvc1, obj)).execute(new Void[0]);
            return;
        }
    }

    boolean a(csv csv)
    {
        Iterator iterator = d.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!((csp)iterator.next()).a(csv))
            {
                iterator.remove();
            }
        } while (true);
        boolean flag = d.isEmpty();
        if (flag)
        {
            a();
        }
        return !flag;
    }

    boolean a(String s, csv csv, int i)
    {
        if (d.isEmpty())
        {
            RealTimeChatService.a(h);
        }
        csp csp2 = (csp)d.get(s);
        csp csp1 = csp2;
        if (csp2 == null)
        {
            csp1 = new csp(s);
            csp1.b = b.a(g, s, false);
            d.put(s, csp1);
            if (csp1.b == null)
            {
                (new cso(this, e, f, g, s)).execute(new Void[0]);
            }
        }
        return csp1.a(csv, i);
    }
}
