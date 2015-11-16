// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class cdl extends cec
{

    public cdl()
    {
    }

    Intent a(Context context, int i, String s)
    {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        intent.putExtra("conversationIdSetString", s);
        return b(context, intent);
    }

    public void a(Context context, Intent intent)
    {
        int i = intent.getIntExtra("account_id", -1);
        intent = intent.getStringExtra("conversationIdSetString");
        cdo cdo1 = cdk.g;
        intent = dzx.a(intent);
        if (any.b(new aoe(context, i), intent) > 0 && cej.f(context, i))
        {
            cdo.a(context, i, true);
        }
    }
}
