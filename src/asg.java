// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Map;
import java.util.Set;

public final class asg
    implements hnu, hoy
{

    final ase a;
    private final Activity b;
    private final int c;
    private final String d;

    public asg(ase ase1, Activity activity, int i, String s)
    {
        a = ase1;
        super();
        b = activity;
        c = i;
        d = s;
    }

    public void a()
    {
        Set set;
        if (b.isFinishing())
        {
            if ((set = (Set)a.a.get(Integer.valueOf(c))) != null && set.contains(d))
            {
                RealTimeChatService.a(dcn.e(c), d, -1L);
                set.remove(d);
                return;
            }
        }
    }
}
