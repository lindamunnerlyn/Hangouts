// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dde extends dgj
{

    private final String a;
    private final String e;
    private final String f;
    private final boolean g;
    private final boolean h;
    private int i;

    public dde(aoa aoa, String s, String s1, String s2, boolean flag, boolean flag1)
    {
        super(aoa);
        a = s;
        e = s1;
        f = s2;
        g = flag;
        h = flag1;
        i = -1;
    }

    public void a()
    {
        Object obj = new aow(g.nU, super.b.a);
        if (!TextUtils.isEmpty(a))
        {
            a(((dmf) (new cuv(a, e, f, g, h))));
        } else
        if (!TextUtils.isEmpty(e))
        {
            ((aow) (obj)).a(null, e, g);
            if (g)
            {
                ((aow) (obj)).c(null, e, f, null);
            } else
            {
                ((aow) (obj)).h(null, e);
            }
            if (i >= 0)
            {
                obj = new czi(new hyb());
                obj = new did(i, 1, ((cxr) (obj)));
                RealTimeChatService.a(i, super.b.b, ((did) (obj)));
                return;
            }
        }
    }

    public void a(int j)
    {
        i = j;
    }
}
