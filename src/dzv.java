// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class dzv extends BroadcastReceiver
{

    final dzu a;

    dzv(dzu dzu1)
    {
        a = dzu1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        a.a = true;
    }
}
