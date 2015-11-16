// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

final class chh
    implements br
{

    final cgw a;

    chh(cgw cgw1)
    {
        a = cgw1;
        super();
    }

    public em onCreateLoader(int i, Bundle bundle)
    {
        switch (i)
        {
        default:
            throw new AssertionError((new StringBuilder(27)).append("Unknown loader: ").append(i).toString());

        case 0: // '\0'
            cgw.a(a, SystemClock.elapsedRealtime());
            bundle = bzx.c.buildUpon();
            bundle.appendQueryParameter("account_id", Integer.toString(cgw.k(a).a()));
            bundle.appendQueryParameter("conversation_type", Integer.toString(cgw.l(a).ordinal()));
            bundle.appendQueryParameter("is_frequent", "true");
            if (!TextUtils.isEmpty(cgw.m(a).g()))
            {
                bundle.appendQueryParameter("query", cgw.m(a).g());
            }
            return new eg(a.getActivity(), bundle.build(), bzx.f, null, null, "UPPER(display_name)");

        case 1: // '\001'
            cgw.b(a, SystemClock.elapsedRealtime());
            bundle = bzx.c.buildUpon();
            bundle.appendQueryParameter("account_id", Integer.toString(cgw.k(a).a()));
            bundle.appendQueryParameter("conversation_type", Integer.toString(cgw.l(a).ordinal()));
            break;
        }
        if (!TextUtils.isEmpty(cgw.m(a).g()))
        {
            bundle.appendQueryParameter("query", cgw.m(a).g());
        }
        return new eg(a.getActivity(), bundle.build(), bzx.f, null, null, "UPPER(display_name)");
    }

    public void onLoadFinished(em em1, Object obj)
    {
        obj = (Cursor)obj;
        cgw cgw1 = a;
        int i;
        boolean flag;
        if (cgw.b(a) == null || obj == null && cgw.b(a).v())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cgw.a(cgw1, flag);
        em1.o();
        JVM INSTR tableswitch 0 1: default 72
    //                   0 114
    //                   1 216;
           goto _L1 _L2 _L3
_L1:
        i = em1.o();
        throw new AssertionError((new StringBuilder(27)).append("unknown loader: ").append(i).toString());
_L2:
        long l = SystemClock.elapsedRealtime() - cgw.n(a);
        if (l > 2000L)
        {
            ebw.e("Babel", (new StringBuilder(53)).append("Frequent contacts loader took ").append(l).append(" ms").toString());
        }
        em1 = new bzy(cgw.o(a).getString(h.iH), ((Cursor) (obj)));
        cgw.e(a).a(em1);
_L5:
        cgw.a(a, a.getView());
        return;
_L3:
        long l1 = SystemClock.elapsedRealtime() - cgw.p(a);
        if (l1 > 2000L)
        {
            ebw.e("Babel", (new StringBuilder(51)).append("Merged contacts loader took ").append(l1).append(" ms").toString());
        }
        em1 = new bzy(cgw.q(a).getString(h.iK), ((Cursor) (obj)));
        cgw.e(a).b(em1);
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
        cgw.e(a).a(null);
_L5:
        cgw.a(a, a.getView());
        return;
_L3:
        cgw.e(a).b(null);
        if (true) goto _L5; else goto _L4
_L4:
    }
}
