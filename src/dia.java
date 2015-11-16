// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;

final class dia
    implements dic
{

    final dhz a;

    dia(dhz dhz)
    {
        a = dhz;
        super();
    }

    public int a(aoa aoa, ArrayList arraylist)
    {
        return RealTimeChatService.a(aoa, arraylist, null, true);
    }

    public void a(int i)
    {
        RealTimeChatService.a(i, false, false, 0, false);
    }

    public void a(dhy dhy)
    {
        RealTimeChatService.a(dhy);
    }

    public void b(dhy dhy)
    {
        RealTimeChatService.b(dhy);
    }
}
