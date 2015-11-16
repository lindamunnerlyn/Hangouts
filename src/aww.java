// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;

final class aww
    implements android.content.DialogInterface.OnClickListener
{

    final long a;
    final Long b[];
    final String c;
    final Activity d;
    final ave e;

    aww(ave ave1, long l, Long along[], String s, Activity activity)
    {
        e = ave1;
        a = l;
        b = along;
        c = s;
        d = activity;
        super();
    }

    static void a(aww aww1)
    {
        RealTimeChatService.a(ave.h(aww1.e), aww1.b, aww1.c);
        Intent intent = RequestWriter.k();
        intent.putExtra("wake_all", true);
        aww1.d.startService(intent);
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == 0)
        {
            ave.b(e).a(new awx(this));
        } else
        if (i == 1)
        {
            ave.a(e, a);
            return;
        }
    }
}
