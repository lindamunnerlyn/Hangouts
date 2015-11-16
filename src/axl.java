// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;

final class axl
    implements asd
{

    final axk a;

    axl(axk axk1)
    {
        a = axk1;
        super();
    }

    public void a(asa asa)
    {
        asa = a;
        RealTimeChatService.a(avv.h(((axk) (asa)).e), ((axk) (asa)).b, ((axk) (asa)).c);
        Intent intent = RequestWriter.k();
        intent.putExtra("wake_all", true);
        ((axk) (asa)).d.startService(intent);
    }
}
