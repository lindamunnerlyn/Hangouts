// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;

public final class hhn extends hhq
{

    private final Activity b;

    public hhn(Activity activity, hjm hjm)
    {
        super(hjm, hhm);
        b = activity;
    }

    protected hhp a(Context context)
    {
        return new hhm(context);
    }

    protected void a(hho hho, hjm hjm, hgx hgx)
    {
        ((hhl)hho).a(b, hjm, hgx);
    }
}
