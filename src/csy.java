// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class csy
    implements grf
{

    private static final boolean a = false;
    private final SparseArray b = new SparseArray();
    private final css c = new css();
    private final ctb d = new ctb(this);
    private final Context e;
    private final gqz f;
    private final dse g;

    public csy(Context context)
    {
        RealTimeChatService.a(new csz(this));
        e = context;
        f = (gqz)hlp.a(context, gqz);
        g = (dse)hlp.a(context, dse);
        g.a(new cta(this));
    }

    static gqz a(csy csy1)
    {
        return csy1.f;
    }

    static css b(csy csy1)
    {
        return csy1.c;
    }

    static SparseArray c(csy csy1)
    {
        return csy1.b;
    }

    public void H_()
    {
        css css1 = c;
        css1;
        JVM INSTR monitorenter ;
        int i = b.size() - 1;
_L2:
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        if (!f.c(b.keyAt(i)))
        {
            ((csl)b.valueAt(i)).a();
            b.removeAt(i);
        }
        break MISSING_BLOCK_LABEL_74;
        css1;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        css1;
        JVM INSTR monitorexit ;
        throw exception;
        i--;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void a(int i, String s, csv csv, int j)
    {
        boolean flag1 = true;
        g.c(f.c(i));
        csl csl1;
        csl csl2;
        css css1;
        int k;
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.c(flag);
        g.e(csv);
        if (j != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        g.c(flag);
        if (a)
        {
            String s1 = String.valueOf(eev.b(s));
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 76)).append("Registration for presence: fieldMask=").append(j).append(", gaia=").append(s1).append(", account=").append(i).toString());
        }
        k = j;
        if (!g.a(i))
        {
            k = j & ~cvc.b.j;
        }
        css1 = c;
        css1;
        JVM INSTR monitorenter ;
        csl2 = (csl)b.get(i);
        csl1 = csl2;
        if (csl2 != null)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        csl1 = new csl(e, f, i, c);
        b.put(i, csl1);
        d.b();
        if (csl1.a(s, csv, k))
        {
            d.a();
        }
        css1;
        JVM INSTR monitorexit ;
        return;
        s;
        css1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(int i, String s, cvc cvc1, Object obj)
    {
        if (!f.c(i))
        {
            eev.e("Babel", (new StringBuilder(56)).append("Dropping presence update for invalid account ").append(i).toString());
            return;
        }
        csl csl1;
        csl csl2;
        css css1;
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.c(flag);
        g.e(cvc1);
        css1 = c;
        css1;
        JVM INSTR monitorenter ;
        csl2 = (csl)b.get(i);
        csl1 = csl2;
        if (csl2 != null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        csl1 = new csl(e, f, i, c);
        b.put(i, csl1);
        csl1.a(s, cvc1, obj);
        css1;
        JVM INSTR monitorexit ;
        return;
        s;
        css1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(csv csv)
    {
        css css1 = c;
        css1;
        JVM INSTR monitorenter ;
        int i = b.size() - 1;
_L2:
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (!((csl)b.valueAt(i)).a(csv))
        {
            b.removeAt(i);
        }
        break MISSING_BLOCK_LABEL_58;
        css1;
        JVM INSTR monitorexit ;
        return;
        csv;
        css1;
        JVM INSTR monitorexit ;
        throw csv;
        i--;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        hnc hnc = eev.u;
    }
}
