// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.util.Base64;
import com.google.android.apps.hangouts.realtimechat.GcmIntentService;

final class bog
    implements Runnable
{

    final Intent a;
    final bof b;

    bog(bof bof, Intent intent)
    {
        b = bof;
        a = intent;
        super();
    }

    public void run()
    {
        byte abyte0[] = Base64.decode(GcmIntentService.a(a), 0);
        gfd.a().a(abyte0);
    }
}
