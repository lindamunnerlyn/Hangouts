// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public class cut extends cup
{

    private static final long serialVersionUID = 1L;
    private final String a;

    public cut(String s)
    {
        gdv.b("Expected condition to be false", TextUtils.isEmpty(s));
        a = s;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kws a(String s, int i, int j)
    {
        s = new hzs();
        s.a = a;
        s.e = Integer.valueOf(100);
        s.d = Integer.valueOf(100);
        s.c = (new int[] {
            3
        });
        s.i = Boolean.valueOf(false);
        hyq hyq1 = new hyq();
        hyq1.a = s;
        return hyq1;
    }

    public boolean a(Context context, int i)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (i == 0)
        {
            flag = flag1;
            if (g.a(context, "babel_stickers_anonymous_request", false))
            {
                flag = true;
            }
        }
        return flag;
    }

    protected boolean a(Context context, int i, dcx dcx1)
    {
        if (a(context, i) && dcx1.c() == 111)
        {
            eev.e("Babel", "Probably exceeded anonymous daily quota, retrying as authenticated.");
            return true;
        } else
        {
            return super.a(context, i, dcx1);
        }
    }

    public long b()
    {
        return TimeUnit.MINUTES.toMillis(5L);
    }

    public String f()
    {
        return "userphotoalbums";
    }
}
