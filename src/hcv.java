// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class hcv extends guy
{

    private final hda a;

    public hcv(String s, hda hda1)
    {
        super(s);
        a = hda1;
    }

    protected gvv a(Context context)
    {
        boolean flag = a.a();
        context = new gvv(true);
        context.d().putBoolean("are_accounts_ready_for_login", flag);
        return context;
    }
}
