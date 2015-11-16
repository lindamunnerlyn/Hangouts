// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.phone.DebugActivity;

final class atx
    implements Runnable
{

    final atw a;

    atx(atw atw1)
    {
        a = atw1;
        super();
    }

    public void run()
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setType("text/plain");
        intent.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail");
        String s = String.valueOf(a.a.c.a);
        if (s.length() != 0)
        {
            s = "conversation ".concat(s);
        } else
        {
            s = new String("conversation ");
        }
        intent.putExtra("android.intent.extra.SUBJECT", s);
        intent.putExtra("android.intent.extra.TEXT", DebugActivity.a(a.a.b, a.a.c.a));
        a.a.a.startActivity(intent);
    }
}
