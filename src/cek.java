// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class cek extends cfh
{

    public cek()
    {
    }

    Intent a(Context context, int i)
    {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        return b(context, intent);
    }

    public void a(Context context, Intent intent)
    {
        int i = intent.getIntExtra("account_id", -1);
        intent = ceh.b;
        cel.a(context, i);
    }
}
