// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;

final class cqm extends BroadcastReceiver
{

    final cql a;

    cqm(cql cql1)
    {
        a = cql1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        cql.a(a, intent.getStringExtra("phone_verification_result"));
        cql.a(a);
        cql.b(a).requestFocus();
    }
}
