// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class blo extends bff
    implements bfg
{

    public blo()
    {
    }

    public static blo a(Resources resources)
    {
        blo blo1 = new blo();
        Bundle bundle = new Bundle();
        bundle.putString("title", resources.getString(l.jE));
        bundle.putString("message", resources.getString(l.jD));
        bundle.putString("positive", resources.getString(l.al));
        bundle.putString("negative", resources.getString(l.T));
        blo1.setArguments(bundle);
        blo1.setTargetFragment(blo1, 0);
        return blo1;
    }

    public void a(Bundle bundle, String s)
    {
        if (s.equals("clear_recent_calls"))
        {
            RealTimeChatService.c(((gmo)al.a(gmo)).a());
        }
    }

    public void a(ap ap)
    {
        a(ap, "clear_recent_calls");
    }

    public void a(String s)
    {
    }

    public void b(String s)
    {
    }
}
