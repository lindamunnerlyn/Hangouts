// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class bmg
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final bmf b;

    bmg(bmf bmf1, int i)
    {
        b = bmf1;
        a = i;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        b.a();
        RealTimeChatService.b(a, drs.b(bmb.b()));
        b.getActivity().finish();
        g.n();
    }
}
