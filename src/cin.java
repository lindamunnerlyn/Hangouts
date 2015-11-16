// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

final class cin
    implements br
{

    final cic a;

    cin(cic cic1)
    {
        a = cic1;
        super();
    }

    public em onCreateLoader(int i, Bundle bundle)
    {
        switch (i)
        {
        default:
            throw new AssertionError((new StringBuilder(27)).append("Unknown loader: ").append(i).toString());

        case 0: // '\0'
            cic.a(a, SystemClock.elapsedRealtime());
            bundle = cba.c.buildUpon();
            bundle.appendQueryParameter("account_id", Integer.toString(cic.k(a).a()));
            bundle.appendQueryParameter("conversation_type", Integer.toString(cic.l(a).ordinal()));
            bundle.appendQueryParameter("is_frequent", "true");
            if (!TextUtils.isEmpty(cic.m(a).g()))
            {
                bundle.appendQueryParameter("query", cic.m(a).g());
            }
            return new eg(a.getActivity(), bundle.build(), cba.f, null, null, "UPPER(display_name)");

        case 1: // '\001'
            cic.b(a, SystemClock.elapsedRealtime());
            bundle = cba.c.buildUpon();
            bundle.appendQueryParameter("account_id", Integer.toString(cic.k(a).a()));
            bundle.appendQueryParameter("conversation_type", Integer.toString(cic.l(a).ordinal()));
            break;
        }
        if (!TextUtils.isEmpty(cic.m(a).g()))
        {
            bundle.appendQueryParameter("query", cic.m(a).g());
        }
        return new eg(a.getActivity(), bundle.build(), cba.f, null, null, "UPPER(display_name)");
    }

    public void onLoadFinished(em em1, Object obj)
    {
        obj = (Cursor)obj;
        cic cic1 = a;
        int i;
        boolean flag;
        if (cic.b(a) == null || obj == null && cic.b(a).t())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cic.a(cic1, flag);
        em1.o();
        JVM INSTR tableswitch 0 1: default 72
    //                   0 114
    //                   1 216;
           goto _L1 _L2 _L3
_L1:
        i = em1.o();
        throw new AssertionError((new StringBuilder(27)).append("unknown loader: ").append(i).toString());
_L2:
        long l = SystemClock.elapsedRealtime() - cic.n(a);
        if (l > 2000L)
        {
            eev.e("Babel", (new StringBuilder(53)).append("Frequent contacts loader took ").append(l).append(" ms").toString());
        }
        em1 = new cbb(cic.o(a).getString(h.iD), ((Cursor) (obj)));
        cic.e(a).a(em1);
_L5:
        cic.a(a, a.getView());
        return;
_L3:
        long l1 = SystemClock.elapsedRealtime() - cic.p(a);
        if (l1 > 2000L)
        {
            eev.e("Babel", (new StringBuilder(51)).append("Merged contacts loader took ").append(l1).append(" ms").toString());
        }
        em1 = new cbb(cic.q(a).getString(h.iI), ((Cursor) (obj)));
        cic.e(a).b(em1);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onLoaderReset(em em1)
    {
        em1.o();
        JVM INSTR tableswitch 0 1: default 28
    //                   0 62
    //                   1 88;
           goto _L1 _L2 _L3
_L1:
        int i = em1.o();
        throw new AssertionError((new StringBuilder(27)).append("unknown loader: ").append(i).toString());
_L2:
        cic.e(a).a(null);
_L5:
        cic.a(a, a.getView());
        return;
_L3:
        cic.e(a).b(null);
        if (true) goto _L5; else goto _L4
_L4:
    }
}
