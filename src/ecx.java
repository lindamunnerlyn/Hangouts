// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class ecx extends BroadcastReceiver
{

    final ecw a;

    ecx(ecw ecw1)
    {
        a = ecw1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        eq.a(context).a(new Intent(a.a));
    }
}
