// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class dqj extends guy
{

    private final int a;
    private final hbk b;

    public dqj(Context context, int i)
    {
        super(context, "sign_out");
        a = i;
        b = (hbk)hlp.a(context, hbk);
    }

    protected gvv a()
    {
        b.a(a);
        gvv gvv1 = new gvv(true);
        gvv1.d().putInt("account_id", a);
        return gvv1;
    }
}
