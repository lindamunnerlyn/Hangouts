// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class bxl extends bgs
{

    private final Context d;
    private final aoa e;
    private final String f;

    bxl(Context context, aoa aoa, String s)
    {
        d = context;
        e = aoa;
        f = s;
    }

    private void a(dvg dvg)
    {
        ((dvi)hlp.a(d, dvi)).a(dvg);
    }

    public String a()
    {
        return null;
    }

    public int b()
    {
        return RealTimeChatService.s(e, f);
    }

    public void c()
    {
        a((new dvh(d)).a(d.getString(h.ih)).a());
    }

    public void d()
    {
        a((new dvh(d)).a(d.getString(h.ij)).a());
    }

    public Class e()
    {
        return cwy;
    }

    public Class f()
    {
        return czz;
    }
}
