// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.apps.hangouts.phone.ViewVCardActivity;
import java.util.List;

public final class cpr extends Handler
{

    private ViewVCardActivity a;

    public cpr(ViewVCardActivity viewvcardactivity)
    {
        super(Looper.getMainLooper());
        a = viewvcardactivity;
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        case 1002: 
        default:
            return;

        case 1001: 
            ViewVCardActivity.f(a);
            if (ViewVCardActivity.g(a).isEmpty())
            {
                a.finish();
            }
            a.p_();
            return;

        case 1003: 
            message = (ads)message.obj;
            ViewVCardActivity.a(a, message, ViewVCardActivity.g(a), ViewVCardActivity.h(a));
            ViewVCardActivity.i(a);
            return;
        }
    }
}
