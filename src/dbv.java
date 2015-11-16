// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dbv extends dfa
{

    private final String a;
    private final String d;
    private final String e;
    private final boolean f;
    private final boolean g;
    private int h;

    public dbv(ani ani1, String s, String s1, String s2, boolean flag, boolean flag1)
    {
        super(ani1);
        a = s;
        d = s1;
        e = s2;
        f = flag;
        g = flag1;
        h = -1;
    }

    public void a()
    {
        Object obj = new aoe(g.nS, b.h());
        if (!TextUtils.isEmpty(a))
        {
            c.a(new css(a, d, e, f, g));
        } else
        if (!TextUtils.isEmpty(d))
        {
            ((aoe) (obj)).a(null, d, f);
            if (f)
            {
                ((aoe) (obj)).c(null, d, e, null);
            } else
            {
                ((aoe) (obj)).h(null, d);
            }
            if (h >= 0)
            {
                obj = new cxe(new hsx());
                obj = new dgu(h, 1, ((cvn) (obj)));
                RealTimeChatService.a(h, b, ((dgu) (obj)));
                return;
            }
        }
    }

    public void a(int i)
    {
        h = i;
    }
}
