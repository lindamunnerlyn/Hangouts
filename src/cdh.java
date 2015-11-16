// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;

public final class cdh extends cdc
{

    private final int c;

    protected cdh(Context context, int i, dzx dzx1, int j, long l1)
    {
        super(context, i, dzx1, l1);
        c = j;
    }

    protected void a(boolean flag)
    {
        Object obj = o.getResources();
        String s = ((Resources) (obj)).getString(l.hj);
        t.a(s);
        v.a(s);
        obj = ((Resources) (obj)).getQuantityString(g.hP, q.size(), new Object[] {
            Integer.valueOf(c), Integer.valueOf(q.size())
        });
        t.b(((CharSequence) (obj)));
        v.b(((CharSequence) (obj)));
        super.a(flag);
    }

    protected Intent g()
    {
        return g.f(dbf.e(p)).putExtra("reset_failed_notifications", true);
    }
}
