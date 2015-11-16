// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;

public final class czy extends cxr
{

    private static final long serialVersionUID = 1L;
    private final String g;
    private final long h;
    private final long i;
    private final long j;

    public czy(Uri uri, long l, long l1, long l2)
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

    public void a(aow aow1, dgk dgk)
    {
        super.a(aow1, dgk);
        dje dje1 = (dje)b;
        String s = dje1.c();
        String s1 = dje1.b();
        long l;
        long l1;
        boolean flag;
        if (g != null)
        {
            dgk = Uri.parse(g);
        } else
        {
            dgk = null;
        }
        l = h;
        l1 = i;
        if (((dje)b).n() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aoq.a(aow1, s, s1, dgk, l, l1, flag, ((dje)b).o(), j);
        aoc.a(g.nU, aow1.f().h(), "sent_mms_count_since_last_upload");
        dgk = dje1.d();
        if (dgk.length == 1 && !TextUtils.isEmpty(dgk[0]))
        {
            cax cax1 = (cax)hlp.a(g.nU, cax);
            aow1.f().h();
            cax1.a(dgk[0]);
        }
    }
}
