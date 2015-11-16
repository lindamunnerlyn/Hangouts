// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.text.TextUtils;

final class dml
    implements fmm
{

    final dme a;

    dml(dme dme1)
    {
        a = dme1;
        super();
    }

    public void a(String s, String s1, int i)
    {
        if (ebw.a("Babel", 3))
        {
            long l;
            if (TextUtils.isEmpty(s))
            {
                s = "";
            } else
            {
                s = ebw.b(s);
            }
            ebw.d("Babel", (new StringBuilder(String.valueOf(s).length() + 68 + String.valueOf(s1).length())).append("GmsPeopleCache.onDataChanged. Account: ").append(s).append(" gaiaId: ").append(s1).append(" scopes: ").append(i).toString());
        }
        l = dme.k();
        if (l != 0L)
        {
            dme.i(a).removeCallbacks(dme.h(a));
            dme.i(a).postDelayed(dme.h(a), l);
        }
    }
}
