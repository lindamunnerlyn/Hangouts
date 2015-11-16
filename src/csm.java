// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class csm extends dhy
{

    final csl a;

    csm(csl csl1)
    {
        a = csl1;
        super();
    }

    public void a(int i, aoa aoa, did did1)
    {
        csl csl1 = a;
        aoa = csl1.b;
        aoa;
        JVM INSTR monitorenter ;
        Object obj = (List)csl1.c.get(i);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        aoa;
        JVM INSTR monitorexit ;
        return;
        csl1.a.addAll(((java.util.Collection) (obj)));
        csl1.c.remove(i);
        obj = csl1.a.iterator();
_L2:
        Object obj1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_129;
            }
            obj1 = (String)((Iterator) (obj)).next();
            obj1 = (csp)csl1.d.get(obj1);
        } while (obj1 == null);
        ((csp) (obj1)).a(i, false);
        if (true) goto _L2; else goto _L1
_L1:
        did1;
        aoa;
        JVM INSTR monitorexit ;
        throw did1;
        int j;
        did1 = did1.c();
        if (!(did1 instanceof czk))
        {
            break MISSING_BLOCK_LABEL_308;
        }
        did1 = (czk)did1;
        List list = did1.k();
        j = ((dgh)did1.c()).a();
        if (eev.a("Babel", 3))
        {
            int k = list.size();
            eev.d("Babel", (new StringBuilder(63)).append("Presence response: requestId=").append(i).append(", gaiaCount=").append(k).toString());
        }
        did1 = list.iterator();
_L3:
        ctu ctu1;
        int l;
        do
        {
            if (!did1.hasNext())
            {
                break MISSING_BLOCK_LABEL_308;
            }
            dba dba1 = (dba)did1.next();
            obj1 = dba1.b;
            csl1.a.remove(obj1);
            ctu1 = csl1.a(((String) (obj1)), true);
            l = ctu1.a(dba1, j);
        } while (l == 0);
        csl1.a(ctu1, ((String) (obj1)), l);
          goto _L3
        if (!csl1.a.isEmpty())
        {
            did1 = String.valueOf(eev.b(TextUtils.join(",", csl1.a)));
            eev.f("Babel", (new StringBuilder(String.valueOf(did1).length() + 68)).append("Server did not return presence for: requestId=").append(i).append(", gaiaList=").append(did1).toString());
        }
        csl1.a.clear();
        aoa;
        JVM INSTR monitorexit ;
    }
}
