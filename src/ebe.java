// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ebe
{

    public static final ebe a = new ebe();
    private static final boolean b = false;
    private final SparseArray c = new SparseArray();
    private final ebb d = new ebb();
    private final ebg e = new ebg(this);
    private final gms f;
    private final dpl g;

    private ebe()
    {
        RealTimeChatService.a(new ebf(this));
        android.content.Context context = g.nS;
        f = (gms)hgx.a(context, gms);
        g = (dpl)hgx.a(context, dpl);
    }

    static ebb a(ebe ebe1)
    {
        return ebe1.d;
    }

    static SparseArray b(ebe ebe1)
    {
        return ebe1.c;
    }

    public void a(int i, String s, csz csz1, Object obj)
    {
        boolean flag1 = true;
        dza dza1;
        dza dza2;
        ebb ebb1;
        boolean flag;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.a(flag);
        if (!TextUtils.isEmpty(s))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        g.a(flag);
        g.d(csz1);
        ebb1 = d;
        ebb1;
        JVM INSTR monitorenter ;
        dza2 = (dza)c.get(i);
        dza1 = dza2;
        if (dza2 != null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        dza1 = new dza(f, i, d);
        c.put(i, dza1);
        dza1.a(s, csz1, obj);
        ebb1;
        JVM INSTR monitorexit ;
        return;
        s;
        ebb1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(int i, String s, ebc ebc, int j)
    {
        boolean flag1 = false;
        dza dza1;
        dza dza2;
        ebb ebb1;
        int k;
        boolean flag;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.a(flag);
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.a(flag);
        g.d(ebc);
        flag = flag1;
        if (j != 0)
        {
            flag = true;
        }
        g.a(flag);
        if (b)
        {
            String s1 = String.valueOf(ebw.b(s));
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 76)).append("Registration for presence: fieldMask=").append(j).append(", gaia=").append(s1).append(", account=").append(i).toString());
        }
        k = j;
        if (!g.a(i))
        {
            k = j & ~csz.b.j;
        }
        j = k;
        if (!g.a(g.nS, "babel_enable_last_seen_r2", true))
        {
            j = k & ~csz.f.j;
        }
        ebb1 = d;
        ebb1;
        JVM INSTR monitorenter ;
        dza2 = (dza)c.get(i);
        dza1 = dza2;
        if (dza2 != null)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        dza1 = new dza(f, i, d);
        c.put(i, dza1);
        e.b();
        if (dza1.a(s, ebc, j))
        {
            e.a();
        }
        ebb1;
        JVM INSTR monitorexit ;
        return;
        s;
        ebb1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(ebc ebc)
    {
        ebb ebb1 = d;
        ebb1;
        JVM INSTR monitorenter ;
        int i = c.size() - 1;
_L2:
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (!((dza)c.valueAt(i)).a(ebc))
        {
            c.removeAt(i);
        }
        break MISSING_BLOCK_LABEL_58;
        ebb1;
        JVM INSTR monitorexit ;
        return;
        ebc;
        ebb1;
        JVM INSTR monitorexit ;
        throw ebc;
        i--;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        hik hik = ebw.u;
    }
}
