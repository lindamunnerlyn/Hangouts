// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class gwd
    implements gwb
{

    Context a;
    gzl b;
    private int c;
    private gwe d;
    private gwg e;
    private gwh f;
    private hhm g;

    public gwd(Context context)
    {
        c = -1;
        d = null;
        e = new gwg(this);
        f = new gwh(this);
        g = new gwf();
        a = context;
        context = hlp.b(context);
        b = (gzl)context.a(gzl);
        context = (gwc)context.b(gwc);
        if (context != null)
        {
            c = context.a();
        }
    }

    private hea a(gwe gwe1, hhp hhp)
    {
        hea hea1 = (hea)b.a(gwe1);
        if (hea1 != null) goto _L2; else goto _L1
_L1:
        hea1 = new hea(b, gwe1);
        gwe1.b();
        JVM INSTR tableswitch 1 2: default 56
    //                   1 76
    //                   2 89;
           goto _L3 _L4 _L5
_L3:
        hea1.a(null);
        gwe1 = hea1;
_L7:
        b.a(gwe1, hhp);
        return gwe1;
_L4:
        hea1.a(e);
        gwe1 = hea1;
        continue; /* Loop/switch isn't completed */
_L5:
        hea1.a(f);
        gwe1 = hea1;
        continue; /* Loop/switch isn't completed */
_L2:
        gwe1.a(d);
        d = gwe1;
        gwe1 = hea1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public hhm a(Context context, String s, int i, int j, hhp hhp)
    {
        Context context1;
        if (TextUtils.isEmpty(s))
        {
            return g;
        }
        s = hdy.a(context, s, hee.a);
        int k = c;
        if (d != null)
        {
            context = d;
            d = (gwe)d.h();
            context.a(null);
        } else
        {
            context = new gwe(this);
        }
        context1 = a;
        i;
        JVM INSTR tableswitch 0 3: default 96
    //                   0 129
    //                   1 138
    //                   2 147
    //                   3 156;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        i = 0;
_L7:
        context.a(0, s, i, k, j);
        return a(((gwe) (context)), hhp);
_L2:
        i = g.x(context1);
        continue; /* Loop/switch isn't completed */
_L3:
        i = g.z(context1);
        continue; /* Loop/switch isn't completed */
_L4:
        i = g.B(context1);
        continue; /* Loop/switch isn't completed */
_L5:
        i = g.D(context1);
        if (true) goto _L7; else goto _L6
_L6:
    }
}
