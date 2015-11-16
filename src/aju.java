// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class aju
    implements ajl
{

    private static final boolean a = false;
    private final Context b;

    public aju(Context context)
    {
        b = context;
    }

    public void a(int i)
    {
        eq.a(b).a((new Intent("set_callerid_outcome")).putExtra("set_callerid_result", i));
    }

    public void a(int i, boolean flag, String s)
    {
        if (a)
        {
            String s1 = String.valueOf("Starting setCallerIdConfig.  accountId: ");
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 43 + String.valueOf(s).length())).append(s1).append(i).append(" enable: ").append(flag).append(" e164PhoneNumber: ").append(s).toString());
        }
        RealTimeChatService.a(i, flag, s);
    }

    static 
    {
        hik hik = ebw.b;
    }
}
