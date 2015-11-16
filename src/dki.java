// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class dki extends dgj
{

    public dki(aoa aoa)
    {
        super(aoa);
    }

    public void a()
    {
        long l = eco.a();
        String s = def.c().f();
        if (TextUtils.isEmpty(s))
        {
            eev.f("Babel", "Unregister account with invalid gcm registration id");
            return;
        } else
        {
            a(((dmf) (cwr.a(s, l, g.nU.getPackageName()))));
            return;
        }
    }
}
