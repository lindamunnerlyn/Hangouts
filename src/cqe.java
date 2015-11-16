// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.phoneverification.impl.PhoneVerificationActivity;

public final class cqe
    implements cpx
{

    public cqe()
    {
    }

    public Intent a(Context context, int i)
    {
        context = new Intent(context, com/google/android/apps/hangouts/phoneverification/impl/PhoneVerificationActivity);
        context.setAction("android.intent.action.VIEW");
        context.putExtra("account_id", i);
        context.putExtra("from_settings", true);
        return context;
    }
}
