// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class dzb extends dgp
{

    final dza a;

    dzb(dza dza1)
    {
        a = dza1;
        super();
    }

    public void a(int i, ani ani, dgu dgu1)
    {
        dza dza1 = a;
        ani = dza1.b;
        ani;
        JVM INSTR monitorenter ;
        Object obj = (List)dza1.c.get(i);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        ani;
        JVM INSTR monitorexit ;
        return;
        dza1.a.addAll(((java.util.Collection) (obj)));
        dza1.c.remove(i);
        obj = dza1.a.iterator();
_L2:
        Object obj1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_129;
            }
            obj1 = (String)((Iterator) (obj)).next();
            obj1 = (dzg)dza1.d.get(obj1);
        } while (obj1 == null);
        ((dzg) (obj1)).a(i, false);
        if (true) goto _L2; else goto _L1
_L1:
        dgu1;
        ani;
        JVM INSTR monitorexit ;
        throw dgu1;
        int j;
        dgu1 = dgu1.c();
        if (!(dgu1 instanceof cxg))
        {
            break MISSING_BLOCK_LABEL_308;
        }
        dgu1 = (cxg)dgu1;
        List list = dgu1.k();
        j = ((dey)dgu1.c()).a();
        if (ebw.a("Babel", 3))
        {
            int k = list.size();
            ebw.d("Babel", (new StringBuilder(63)).append("Presence response: requestId=").append(i).append(", gaiaCount=").append(k).toString());
        }
        dgu1 = list.iterator();
_L3:
        crk crk1;
        int l;
        do
        {
            if (!dgu1.hasNext())
            {
                break MISSING_BLOCK_LABEL_308;
            }
            czu czu1 = (czu)dgu1.next();
            obj1 = czu1.b;
            dza1.a.remove(obj1);
            crk1 = dza1.a(((String) (obj1)), true);
            l = crk1.a(czu1, j);
        } while (l == 0);
        dza1.a(crk1, ((String) (obj1)), l);
          goto _L3
        if (!dza1.a.isEmpty())
        {
            dgu1 = String.valueOf(ebw.b(TextUtils.join(",", dza1.a)));
            ebw.f("Babel", (new StringBuilder(String.valueOf(dgu1).length() + 68)).append("Server did not return presence for: requestId=").append(i).append(", gaiaList=").append(dgu1).toString());
        }
        dza1.a.clear();
        ani;
        JVM INSTR monitorexit ;
    }
}
