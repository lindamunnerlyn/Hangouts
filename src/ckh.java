// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.os.Handler;
import android.os.Message;
import com.google.android.apps.hangouts.phone.ClassZeroActivity;

public final class ckh extends Handler
{

    private ClassZeroActivity a;

    public ckh(ClassZeroActivity classzeroactivity)
    {
        a = classzeroactivity;
    }

    public void handleMessage(Message message)
    {
        if (message.what == 1)
        {
            ClassZeroActivity.a(a, false);
            ClassZeroActivity.a(a).dismiss();
            ClassZeroActivity.b(a);
            ClassZeroActivity.c(a);
        }
    }
}
