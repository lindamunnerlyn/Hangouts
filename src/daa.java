// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;

public final class daa extends cxr
{

    private static final long serialVersionUID = 1L;
    private final String g;
    private final long h;

    public daa(Uri uri, long l)
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

    public void a(aow aow1, dgk dgk)
    {
        super.a(aow1, dgk);
        djm djm1 = (djm)b;
        String s = djm1.c();
        String s1 = djm1.b();
        if (g != null)
        {
            dgk = Uri.parse(g);
        } else
        {
            dgk = null;
        }
        aoq.a(aow1, s, s1, dgk, 0L, h, false, -1L, djm1.f());
        aoc.a(g.nU, aow1.f().h(), "sent_sms_count_since_last_upload");
        dgk = djm1.d();
        if (!TextUtils.isEmpty(dgk))
        {
            cax cax1 = (cax)hlp.a(g.nU, cax);
            aow1.f().h();
            cax1.a(dgk);
        }
    }
}
