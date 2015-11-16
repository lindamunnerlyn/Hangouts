// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;

final class csd extends BroadcastReceiver
{

    final csc a;

    csd(csc csc1)
    {
        a = csc1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        csc.a(a, intent.getStringExtra("phone_verification_result"));
        csc.a(a);
        csc.b(a).requestFocus();
    }
}
