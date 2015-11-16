// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class gbm extends gbl
{

    private final int a[];
    private final SparseArray b;
    private final SparseArray c;
    private final SparseArray d;
    private final SparseArray e;
    private final ahg f;
    private boolean g;
    private String h;
    private gal i;

    public gbm(Context context, int ai[], SparseArray sparsearray, SparseArray sparsearray1)
    {
        this(context, ai, sparsearray, sparsearray1, gan.a);
    }

    private gbm(Context context, int ai[], SparseArray sparsearray, SparseArray sparsearray1, SparseArray sparsearray2)
    {
        a = ai;
        c = sparsearray;
        b = sparsearray1;
        e = sparsearray2;
        f = c();
        d = new SparseArray();
        g = false;
        context = (gap)hgx.b(context, gap);
        if (context != null)
        {
            i = context.a(-1);
        }
    }

    private boolean e()
    {
        boolean flag = false;
        if (i != null)
        {
            jfr jfr1 = new jfr();
            HashSet hashset = new HashSet();
            ArrayList arraylist = new ArrayList();
            for (int j = 0; j < d.size(); j++)
            {
                int i1 = d.keyAt(j);
                long l1 = ((Long)d.valueAt(j)).longValue();
                if (hashset.add(Integer.valueOf(i1)))
                {
                    jft jft1 = new jft();
                    jft1.a = Integer.valueOf(i1);
                    jft1.b = Long.valueOf(l1);
                    arraylist.add(jft1);
                }
            }

            if (!arraylist.isEmpty())
            {
                jfr1.b = (jft[])arraylist.toArray(new jft[arraylist.size()]);
                Object obj = new ArrayList();
                for (int k = ((flag) ? 1 : 0); k < e.size(); k++)
                {
                    int l = e.keyAt(k);
                    int j1 = ((gao)e.valueAt(k)).a;
                    int k1 = ((gao)e.valueAt(k)).b;
                    Object obj1 = (Long)d.get(j1);
                    Long long1 = (Long)d.get(k1);
                    if (obj1 != null && long1 != null)
                    {
                        jfs jfs1 = new jfs();
                        jfs1.d = Long.valueOf(long1.longValue() - ((Long) (obj1)).longValue());
                        jfs1.a = Integer.valueOf(l);
                        ((ArrayList) (obj)).add(jfs1);
                        obj1 = String.valueOf(jfs1.d);
                        (new StringBuilder(String.valueOf(obj1).length() + 36)).append(" Clearcut[").append(j1).append("-").append(k1).append("]: ").append(((String) (obj1)));
                    }
                }

                jfr1.a = (jfs[])((ArrayList) (obj)).toArray(new jfs[((ArrayList) (obj)).size()]);
                jfr1.c = a;
                obj = new jfe();
                obj.a = new jew();
                a(((jfe) (obj)).a);
                ((jfe) (obj)).a.n = jfr1;
                i.b(((jfe) (obj)));
                return true;
            }
        }
        return false;
    }

    public abstract ArrayList a();

    public void a(int j, long l)
    {
        this;
        JVM INSTR monitorenter ;
        (new StringBuilder(42)).append("Marking [").append(j).append("]=").append(l);
        if (l <= 0L) goto _L2; else goto _L1
_L1:
        if (d.get(j) != null) goto _L4; else goto _L3
_L3:
        d.put(j, Long.valueOf(l));
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        Log.wtf("MarkReporterDefault", (new StringBuilder(40)).append("Mark [").append(j).append("] is set more than once").toString());
        if (true) goto _L2; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public void a(ahf ahf1)
    {
        ArrayList arraylist = a();
        if (arraylist != null && !arraylist.isEmpty())
        {
            ahf1.a("e", TextUtils.join(",", arraylist));
        }
    }

    public void a(jew jew1)
    {
    }

    public transient void a(int ai[])
    {
        int j = 0;
        this;
        JVM INSTR monitorenter ;
        if (g) goto _L2; else goto _L1
_L1:
        long l = SystemClock.elapsedRealtime();
_L3:
        if (j > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        a(ai[0], l);
        j++;
        if (true) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        ai;
        throw ai;
    }

    ahf b(String s)
    {
        return new ahf(s);
    }

    public void b()
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        if (g) goto _L2; else goto _L1
_L1:
        int ai[];
        String as[];
        ai = a;
        as = new String[ai.length];
        int j = 0;
_L13:
        Object obj1;
        if (j >= ai.length)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        obj1 = (String)b.get(ai[j]);
        int k;
        ahf ahf1;
        Exception exception;
        Object obj;
        int l;
        int i1;
        int j1;
        long l1;
        boolean flag2;
        if (obj1 != null)
        {
            as[j] = ((String) (obj1));
        }
        j++;
        continue; /* Loop/switch isn't completed */
        ahf1 = b(TextUtils.join(",", as));
        k = 0;
        j = 0;
        for (; k >= e.size(); k++)
        {
            break MISSING_BLOCK_LABEL_262;
        }

        l = e.keyAt(k);
        i1 = ((gao)e.valueAt(k)).a;
        j1 = ((gao)e.valueAt(k)).b;
        obj = (Long)d.get(i1);
        obj1 = (Long)d.get(j1);
        if (obj == null || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_431;
        }
        l1 = ((Long) (obj1)).longValue() - ((Long) (obj)).longValue();
        ahf1.a(l1, new String[] {
            (String)c.get(l)
        });
        obj = (String)c.get(l);
        (new StringBuilder(String.valueOf(obj).length() + 28)).append(" CSI[").append(((String) (obj))).append("]: ").append(l1);
        j = 1;
        break MISSING_BLOCK_LABEL_431;
        a(ahf1);
        if (j != 0) goto _L4; else goto _L3
_L3:
        j = 0;
_L10:
        flag2 = e();
        boolean flag = flag1;
        if (j == 0)
        {
            if (flag2)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        g = flag;
        if (i == null) goto _L2; else goto _L5
_L5:
        if (j == 0) goto _L7; else goto _L6
_L6:
        i.a(2614).d();
_L11:
        if (!flag2) goto _L9; else goto _L8
_L8:
        i.a(2616).d();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        d().a(ahf1);
        j = 1;
          goto _L10
_L7:
        i.a(2615).d();
          goto _L11
        exception;
        throw exception;
_L9:
        i.a(2617).d();
          goto _L2
        if (true) goto _L13; else goto _L12
_L12:
    }

    ahg c()
    {
        return new ahg();
    }

    public void c(String s)
    {
        h = s;
    }

    aha d()
    {
        agz agz1 = new agz();
        agz1.a("amc_video");
        if (h != null)
        {
            agz1.b(h);
        }
        g.a(agz1);
        return g.b();
    }
}
