// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.callpromos.impl.DialerPromoActivity;

final class alt
    implements alo
{

    alt()
    {
    }

    public Intent a(Context context)
    {
        int i = ((gmo)hgx.a(context, gmo)).a();
        context = new Intent(context, com/google/android/apps/hangouts/callpromos/impl/DialerPromoActivity);
        context.putExtra("account_id", i);
        return context;
    }
}
