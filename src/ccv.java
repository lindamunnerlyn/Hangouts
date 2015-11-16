// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class ccv extends cec
{

    public ccv()
    {
    }

    Intent a(Context context, int i, int j)
    {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        intent.putExtra("renotification_count", j);
        return b(context, intent);
    }

    void a(Context context, int i)
    {
        context.startService(b(context, a(context, i, 0)));
    }

    public void a(Context context, Intent intent)
    {
        int i = intent.getIntExtra("account_id", -1);
        int j = intent.getIntExtra("renotification_count", -1);
        ccu.a.a(context, i, j);
    }
}
