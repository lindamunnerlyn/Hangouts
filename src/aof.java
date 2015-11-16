// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class aof
    implements grg
{

    final aoc a;

    aof(aoc aoc)
    {
        a = aoc;
        super();
    }

    public String a()
    {
        return "is_gplus_user_to_is_google_plus";
    }

    public void a(Context context, grd grd1)
    {
        if (grd1.a("is_gplus_user"))
        {
            grd1.b("is_google_plus", grd1.d("is_gplus_user"));
            grd1.f("is_gplus_user");
        }
    }
}
