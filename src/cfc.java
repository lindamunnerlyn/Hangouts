// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class cfc extends cfh
{

    public cfc()
    {
    }

    void a(Context context, int i, boolean flag, boolean flag1, boolean flag2, jnv jnv)
    {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        intent.putExtra("silent", flag);
        intent.putExtra("live_message", flag1);
        intent.putExtra("deferred_notif", flag2);
        ((dld)hlp.a(context, dld)).a(context, b(context, intent), jnv);
    }

    public void a(Context context, Intent intent)
    {
        int i = intent.getIntExtra("account_id", -1);
        boolean flag = intent.getBooleanExtra("silent", false);
        boolean flag1 = intent.getBooleanExtra("live_message", false);
        boolean flag2 = intent.getBooleanExtra("deferred_notif", false);
        intent = cez.l;
        cfd.a(context, i, flag, flag1, flag2);
    }
}
