// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;

public final class cxw extends cvn
{

    private static final long serialVersionUID = 1L;
    private final String g;
    private final long h;

    public cxw(Uri uri, long l)
    {
        if (uri != null)
        {
            uri = uri.toString();
        } else
        {
            uri = null;
        }
        g = uri;
        h = l;
    }

    public void a(aoe aoe1, dfb dfb)
    {
        super.a(aoe1, dfb);
        dia dia1 = (dia)b;
        String s = dia1.c();
        String s1 = dia1.b();
        if (g != null)
        {
            dfb = Uri.parse(g);
        } else
        {
            dfb = null;
        }
        any.a(aoe1, s, s1, dfb, 0L, h, false, -1L, dia1.f());
        ank.a(g.nS, aoe1.f().h(), "sent_sms_count_since_last_upload");
        dfb = dia1.d();
        if (!TextUtils.isEmpty(dfb))
        {
            bzu bzu1 = (bzu)hgx.a(g.nS, bzu);
            aoe1.f().h();
            bzu1.a(dfb);
        }
    }
}
