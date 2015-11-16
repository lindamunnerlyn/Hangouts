// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;

public final class cxu extends cvn
{

    private static final long serialVersionUID = 1L;
    private final String g;
    private final long h;
    private final long i;
    private final long j;

    public cxu(Uri uri, long l, long l1, long l2)
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
        i = l1;
        j = l2;
    }

    public void a(aoe aoe1, dfb dfb)
    {
        super.a(aoe1, dfb);
        dhv dhv1 = (dhv)b;
        String s = dhv1.c();
        String s1 = dhv1.b();
        long l;
        long l1;
        boolean flag;
        if (g != null)
        {
            dfb = Uri.parse(g);
        } else
        {
            dfb = null;
        }
        l = h;
        l1 = i;
        if (((dhv)b).m() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        any.a(aoe1, s, s1, dfb, l, l1, flag, ((dhv)b).o(), j);
        ank.a(g.nS, aoe1.f().h(), "sent_mms_count_since_last_upload");
        dfb = dhv1.d();
        if (dfb.length == 1 && !TextUtils.isEmpty(dfb[0]))
        {
            bzu bzu1 = (bzu)hgx.a(g.nS, bzu);
            aoe1.f().h();
            bzu1.a(dfb[0]);
        }
    }
}
