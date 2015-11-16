// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class cdm extends cec
{

    public cdm()
    {
    }

    void a(Context context, int i, boolean flag, jhb jhb)
    {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        intent.putExtra("silent", flag);
        ((djm)hgx.a(context, djm)).a(context, b(context, intent), jhb);
    }

    public void a(Context context, Intent intent)
    {
        int i = intent.getIntExtra("account_id", -1);
        boolean flag = intent.getBooleanExtra("silent", false);
        intent = cdk.g;
        cdo.a(context, i, flag);
    }
}
