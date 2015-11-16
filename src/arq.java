// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Map;
import java.util.Set;

public final class arq
    implements fsn, hjc
{

    final aro a;
    private final Activity b;
    private final int c;
    private final String d;

    public arq(aro aro1, Activity activity, int i, String s)
    {
        a = aro1;
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
            if ((set = (Set)aro.a(a).get(Integer.valueOf(c))) != null && set.contains(d))
            {
                RealTimeChatService.a(dbf.e(c), d, -1L);
                set.remove(d);
                return;
            }
        }
    }
}
