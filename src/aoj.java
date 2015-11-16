// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class aoj
    implements grg
{

    final aoc a;

    aoj(aoc aoc)
    {
        a = aoc;
        super();
    }

    public String a()
    {
        return "legacy_known_minor";
    }

    public void a(Context context, grd grd1)
    {
        int i = grd1.a("account_age_group", 0);
        if (grd1.a("is_child") && i == 0 && grd1.d("is_child"))
        {
            grd1.b("account_age_group", 2);
        }
    }
}
