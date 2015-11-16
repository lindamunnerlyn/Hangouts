// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public abstract class ctu extends cui
{

    private static final long serialVersionUID = 1L;
    public final String c;
    public transient boolean d;

    public ctu(String s)
    {
        d = false;
        c = s;
        if (s != null && aoe.a(s))
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "cannot use client generated conversation id:".concat(s);
            } else
            {
                s = new String("cannot use client generated conversation id:");
            }
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public void a(ani ani, dbo dbo1)
    {
        if (!TextUtils.isEmpty(c) && dbo1.c() == 113)
        {
            dbo1 = String.valueOf(c);
            if (dbo1.length() != 0)
            {
                dbo1 = "ERROR_RESPONSE_NOT_FOUND for ".concat(dbo1);
            } else
            {
                dbo1 = new String("ERROR_RESPONSE_NOT_FOUND for ");
            }
            ebw.f("Babel", dbo1);
            RealTimeChatService.g(ani, c);
            d = true;
        }
    }
}
