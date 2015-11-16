// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.os.Handler;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class ckx extends AsyncTask
{

    final int a;
    final ckw b;

    ckx(ckw ckw1, int i)
    {
        b = ckw1;
        a = i;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        RealTimeChatService.a(a, false, true, 0, false);
        BabelHomeActivity.h(b.a).postDelayed(BabelHomeActivity.e(b.a), BabelHomeActivity.g(b.a).a("babel_poll_conversation_data_frequency_ms", 60000L));
        return null;
    }
}
