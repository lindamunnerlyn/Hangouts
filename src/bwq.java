// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class bwq extends bgg
{

    private final Context d;
    private final hgx e;
    private final ani f;
    private final String g;

    public bwq(Context context, hgx hgx1, ani ani, String s)
    {
        d = context;
        e = hgx1;
        f = ani;
        g = s;
    }

    private void a(dsn dsn)
    {
        ((dsp)e.a(dsp)).a(dsn);
    }

    public String a()
    {
        return null;
    }

    public int b()
    {
        return RealTimeChatService.s(f, g);
    }

    public void c()
    {
        a((new dso(d)).a(d.getString(l.hx)).a());
    }

    public void d()
    {
        a((new dso(d)).a(d.getString(l.hz)).a());
    }

    public Class e()
    {
        return cuu;
    }

    public Class f()
    {
        return cxv;
    }
}
