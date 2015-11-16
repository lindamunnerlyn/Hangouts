// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;

public final class cem extends ceh
{

    private final int c;

    protected cem(Context context, int i, edb edb1, int j, long l1)
    {
        super(context, i, edb1, l1);
        c = j;
    }

    protected void a(boolean flag)
    {
        Object obj = o.getResources();
        String s = ((Resources) (obj)).getString(l.gS);
        t.a(s);
        v.a(s);
        obj = ((Resources) (obj)).getQuantityString(g.hH, q.size(), new Object[] {
            Integer.valueOf(c), Integer.valueOf(q.size())
        });
        t.b(((CharSequence) (obj)));
        v.b(((CharSequence) (obj)));
        super.a(flag);
    }

    protected Intent g()
    {
        return g.e(dcn.e(p)).putExtra("reset_failed_notifications", true);
    }
}
