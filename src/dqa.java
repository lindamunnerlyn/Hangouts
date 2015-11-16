// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.service.NoConfirmationSmsSendService;

public final class dqa extends dhy
{

    final Context a;
    final int b;
    final String c;
    final String d;
    final NoConfirmationSmsSendService e;

    public dqa(NoConfirmationSmsSendService noconfirmationsmssendservice, Context context, int i, String s, String s1)
    {
        e = noconfirmationsmssendservice;
        super();
        a = context;
        b = i;
        c = s;
        d = s1;
    }

    public void a(int i, aoa aoa, ddo ddo1, did did1)
    {
        if (i == b)
        {
            if (did1.b() == 1)
            {
                ((dml)hlp.a(a, dml)).a(aoa, ddo1.a, d, null, 0, null, 0, 0, null, c, false, null, 0);
            } else
            {
                i = did1.b();
                did1 = String.valueOf(ddo1);
                if (ddo1 != null)
                {
                    aoa = ddo1.a;
                } else
                {
                    aoa = "NULL";
                }
                eev.g("Babel", (new StringBuilder(String.valueOf(did1).length() + 55 + String.valueOf(aoa).length())).append("couldn't create conversation; error code: ").append(i).append(" ").append(did1).append(" ").append(aoa).toString());
            }
            RealTimeChatService.b(this);
        }
    }
}
