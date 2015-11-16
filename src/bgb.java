// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class bgb extends bgs
{

    private final ai d;
    private final aoa e;
    private final String f;
    private final String g;
    private final String h;
    private final boolean i;

    public bgb(ai ai1, aoa aoa, String s, String s1, String s2, boolean flag)
    {
        d = ai1;
        e = aoa;
        f = s;
        g = s1;
        h = s2;
        i = flag;
    }

    public String a()
    {
        return d.getResources().getString(l.D, new Object[] {
            eep.d(f)
        });
    }

    public int b()
    {
        return RealTimeChatService.a(e, g, h, f, true, true);
    }

    public void c()
    {
        int j;
        if (bgs.j())
        {
            j = l.B;
        } else
        {
            j = l.C;
        }
        Toast.makeText(d, d.getString(j, new Object[] {
            f
        }), 0).show();
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
        return cuv;
    }

    public Class f()
    {
        return czi;
    }
}
