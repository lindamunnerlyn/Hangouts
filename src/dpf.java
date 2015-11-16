// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.text.TextUtils;

final class dpf
    implements fpg
{

    final doy a;

    dpf(doy doy1)
    {
        a = doy1;
        super();
    }

    public void a(String s, String s1, int i)
    {
        if (eev.a("Babel", 3))
        {
            long l;
            if (TextUtils.isEmpty(s))
            {
                s = "";
            } else
            {
                s = eev.b(s);
            }
            eev.d("Babel", (new StringBuilder(String.valueOf(s).length() + 68 + String.valueOf(s1).length())).append("GmsPeopleCache.onDataChanged. Account: ").append(s).append(" gaiaId: ").append(s1).append(" scopes: ").append(i).toString());
        }
        l = doy.k();
        if (l != 0L)
        {
            doy.i(a).removeCallbacks(doy.h(a));
            doy.i(a).postDelayed(doy.h(a), l);
        }
    }
}
