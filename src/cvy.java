// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public abstract class cvy extends cwm
{

    private static final long serialVersionUID = 1L;
    public final String c;
    public transient boolean d;

    public cvy(String s)
    {
        d = false;
        c = s;
        if (s != null && aow.a(s))
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

    public void a(aoa aoa, dcx dcx1)
    {
        if (!TextUtils.isEmpty(c) && dcx1.c() == 113)
        {
            dcx1 = String.valueOf(c);
            if (dcx1.length() != 0)
            {
                dcx1 = "ERROR_RESPONSE_NOT_FOUND for ".concat(dcx1);
            } else
            {
                dcx1 = new String("ERROR_RESPONSE_NOT_FOUND for ");
            }
            eev.f("Babel", dcx1);
            RealTimeChatService.g(aoa, c);
            d = true;
        }
    }
}
