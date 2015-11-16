// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;

final class dlp extends coj
{

    final Context a;
    final dlo b;

    dlp(dlo dlo, String s, Context context)
    {
        b = dlo;
        a = context;
        super(s);
    }

    public void a()
    {
        a.startActivity((new Intent(a, com/google/android/apps/hangouts/realtimechat/wakelock/impl/DebugWakelocksActivity)).addFlags(0x10000000));
    }
}
