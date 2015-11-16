// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class blx extends bfr
    implements bfs
{

    public blx()
    {
    }

    public static blx a(Resources resources)
    {
        blx blx1 = new blx();
        Bundle bundle = new Bundle();
        bundle.putString("title", resources.getString(l.iX));
        bundle.putString("message", resources.getString(l.iW));
        bundle.putString("positive", resources.getString(l.ah));
        bundle.putString("negative", resources.getString(l.Q));
        blx1.setArguments(bundle);
        blx1.setTargetFragment(blx1, 0);
        return blx1;
    }

    public void a(Bundle bundle, String s)
    {
        if (s.equals("clear_recent_calls"))
        {
            RealTimeChatService.c(((gqu)al.a(gqu)).a());
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
