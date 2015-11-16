// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import java.util.Collections;

final class chk
{

    chk()
    {
    }

    static ani a(Context context)
    {
        return dbf.e(((gmo)hgx.a(context, gmo)).a());
    }

    static void a(Context context, cnd cnd, atd atd)
    {
        cnd = g.a(a(context), null, Collections.emptyList(), cnd, atd);
        cnd.putExtra("opened_from_impression", 2148);
        context.startActivity(cnd);
    }

    public cff a()
    {
        return new chl(this);
    }

    public cfe b()
    {
        return new chm(this);
    }

    public cfc c()
    {
        return new chn(this);
    }

    public cfd d()
    {
        return new cho(this);
    }

    public blh e()
    {
        return new chp(this);
    }
}
