// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public class dpl
{

    private final gms a;
    private final alw b;

    dpl(Context context)
    {
        a = (gms)hgx.a(context, gms);
        b = (alw)hgx.a(context, alw);
    }

    public void a(int i, boolean flag)
    {
        a.b(i).c("last_seen_bool_key", flag).d();
    }

    public boolean a(int i)
    {
        if (!b.a("babel_device_presence", false))
        {
            return false;
        } else
        {
            return a.a(i).a("share_device_presence_preferences_key", false);
        }
    }

    public void b(int i, boolean flag)
    {
        a.b(i).c("rich_status_device_reporting_key", flag).d();
    }

    public boolean b(int i)
    {
        return a.a(i).a("last_seen_bool_key", false);
    }

    public boolean c(int i)
    {
        return a.a(i).a("rich_status_device_reporting_key", false);
    }
}
