// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;

public final class cen extends ceh
{

    private final cew c;

    protected cen(Context context, int i, cew cew1, long l1)
    {
        super(context, i, edb.a(cew1.o.a), l1);
        c = cew1;
    }

    protected void a(boolean flag)
    {
        String s = o.getResources().getString(l.gT);
        t.a(s);
        v.a(s);
        if (!TextUtils.isEmpty(c.b) && c.g)
        {
            ci ci1 = new ci(t);
            ci1.b(c.b);
            t.a(ci1);
        } else
        {
            t.b(c.b);
        }
        super.a(flag);
    }

    protected Intent g()
    {
        Intent intent = g.a(p, q.a(), c.o.e);
        intent.putExtra("reset_failed_notifications", true);
        return intent;
    }
}
