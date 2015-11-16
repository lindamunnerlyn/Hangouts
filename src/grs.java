// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class grs
    implements grq
{

    private Context a;
    private gvb b;
    private int c;
    private grt d;
    private grv e;
    private grw f;
    private hcv g;

    public grs(Context context)
    {
        c = -1;
        d = null;
        e = new grv(this);
        f = new grw(this);
        g = new gru();
        a = context;
        context = hgx.b(context);
        b = (gvb)context.a(gvb);
        context = (grr)context.b(grr);
        if (context != null)
        {
            c = context.a();
        }
    }

    static gvb a(grs grs1)
    {
        return grs1.b;
    }

    static Context b(grs grs1)
    {
        return grs1.a;
    }

    public hcv a(Context context, String s, int i, int j, hcy hcy)
    {
        Context context1;
        if (TextUtils.isEmpty(s))
        {
            return g;
        }
        s = gzg.a(context, s, gzo.a);
        int k = c;
        if (d != null)
        {
            context = d;
            d = (grt)d.h();
            context.a(null);
        } else
        {
            context = new grt(this);
        }
        context1 = a;
        i;
        JVM INSTR tableswitch 0 3: default 96
    //                   0 201
    //                   1 210
    //                   2 219
    //                   3 228;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        i = 0;
_L9:
        context.a(0, s, i, k, j);
        s = (gzi)b.a(context);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        s = new gzi(b, context);
        context.b();
        JVM INSTR tableswitch 1 2: default 168
    //                   1 237
    //                   2 250;
           goto _L6 _L7 _L8
_L6:
        s.a(null);
        context = s;
_L10:
        b.a(context, hcy);
        return context;
_L2:
        i = g.x(context1);
          goto _L9
_L3:
        i = g.z(context1);
          goto _L9
_L4:
        i = g.B(context1);
          goto _L9
_L5:
        i = g.D(context1);
          goto _L9
_L7:
        s.a(e);
        context = s;
          goto _L10
_L8:
        s.a(f);
        context = s;
          goto _L10
        context.a(d);
        d = context;
        context = s;
          goto _L10
    }
}
