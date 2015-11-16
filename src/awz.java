// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class awz
    implements android.content.DialogInterface.OnCancelListener
{

    final avv a;

    awz(avv avv1)
    {
        a = avv1;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        dialoginterface = avv.m(a).a();
        if (dialoginterface != null)
        {
            dialoginterface = ((asa) (dialoginterface)).a;
        } else
        {
            dialoginterface = null;
        }
        avv.B(a).a();
        if (dialoginterface != null && a.isEmpty())
        {
            RealTimeChatService.a(avv.h(a), dialoginterface, avv.aK(a));
        }
    }
}
