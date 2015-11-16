// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.service.NoConfirmationSmsSendService;

public final class dnh extends dgp
{

    final Context a;
    final int b;
    final String c;
    final String d;
    final NoConfirmationSmsSendService e;

    public dnh(NoConfirmationSmsSendService noconfirmationsmssendservice, Context context, int i, String s, String s1)
    {
        e = noconfirmationsmssendservice;
        super();
        a = context;
        b = i;
        c = s;
        d = s1;
    }

    public void a(int i, ani ani, dcg dcg1, dgu dgu1)
    {
        if (i == b)
        {
            if (dgu1.b() == 1)
            {
                ((dkt)hgx.a(a, dkt)).a(ani, dcg1.a, d, null, 0, null, 0, 0, null, c, false, null, 0);
            } else
            {
                i = dgu1.b();
                dgu1 = String.valueOf(dcg1);
                if (dcg1 != null)
                {
                    ani = dcg1.a;
                } else
                {
                    ani = "NULL";
                }
                ebw.g("Babel", (new StringBuilder(String.valueOf(dgu1).length() + 55 + String.valueOf(ani).length())).append("couldn't create conversation; error code: ").append(i).append(" ").append(dgu1).append(" ").append(ani).toString());
            }
            RealTimeChatService.b(this);
        }
    }
}
