// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class bmp
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final bmo b;

    bmp(bmo bmo1, int i)
    {
        b = bmo1;
        a = i;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        b.a();
        RealTimeChatService.b(a, dul.b(bmk.b()));
        b.getActivity().finish();
        g.m();
    }
}
