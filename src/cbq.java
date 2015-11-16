// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.mergedcontacts.impl.MergeContactsService;

final class cbq
    implements caw
{

    final Context a;
    final cbp b;

    cbq(cbp cbp, Context context)
    {
        b = cbp;
        a = context;
        super();
    }

    public void a(int i)
    {
        Intent intent = new Intent(a, com/google/android/apps/hangouts/mergedcontacts/impl/MergeContactsService);
        intent.putExtra("account_id", i);
        intent.putExtra("force_merge", true);
        a.startService(intent);
    }
}
