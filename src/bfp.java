// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class bfp extends bgg
{

    private final ai d;
    private final ani e;
    private final String f;
    private final String g;
    private final String h;
    private final boolean i = true;

    public bfp(ai ai1, ani ani, String s, String s1, String s2)
    {
        d = ai1;
        e = ani;
        f = s;
        g = s1;
        h = s2;
    }

    public String a()
    {
        return d.getResources().getString(l.G, new Object[] {
            ebr.d(f)
        });
    }

    public int b()
    {
        return RealTimeChatService.a(e, g, h, f, true, true);
    }

    public void c()
    {
        int j;
        if (bgg.j())
        {
            j = l.E;
        } else
        {
            j = l.F;
        }
        ebr.a(d, d.getResources().getString(j, new Object[] {
            f
        }));
    }

    public void d()
    {
        if (i)
        {
            d.setResult(1);
            d.finish();
        }
    }

    public Class e()
    {
        return css;
    }

    public Class f()
    {
        return cxe;
    }
}
