// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class awl
    implements android.content.DialogInterface.OnCancelListener
{

    final ave a;

    awl(ave ave1)
    {
        a = ave1;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        dialoginterface = ave.o(a).a();
        if (dialoginterface != null)
        {
            dialoginterface = ((ark) (dialoginterface)).a;
        } else
        {
            dialoginterface = null;
        }
        ave.C(a).a();
        if (dialoginterface != null && a.isEmpty())
        {
            RealTimeChatService.a(ave.h(a), dialoginterface, ave.aM(a));
        }
    }
}
