// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.List;

final class hcz extends guy
{

    private final String a;
    private final String b;
    private final hda c;
    private final hbo d;

    hcz(String s, String s1, String s2, hda hda1, hbo hbo)
    {
        super(s);
        a = s1;
        b = s2;
        c = hda1;
        d = hbo;
    }

    protected gvv a(Context context)
    {
        context = c.a(a, b, d, false);
        gvv gvv1 = hct.a(context);
        if (((hcf) (context)).a)
        {
            gvv1.d().putInt("account_id", ((Integer)((hcf) (context)).f.get(0)).intValue());
        }
        return gvv1;
    }
}
