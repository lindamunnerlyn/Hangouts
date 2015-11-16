// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class div extends dfa
{

    public div(ani ani)
    {
        super(ani);
    }

    public void a()
    {
        long l = dzk.a();
        Object obj = dcx.c().f();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            ebw.f("Babel", "Unregister account with invalid gcm registration id");
            return;
        } else
        {
            obj = cun.a(((String) (obj)), l, g.nS.getPackageName());
            c.a(((dko) (obj)));
            return;
        }
    }
}
