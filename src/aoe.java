// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class aoe
    implements grg
{

    final aoc a;

    aoe(aoc aoc)
    {
        a = aoc;
        super();
    }

    public String a()
    {
        return "name_to_account_name";
    }

    public void a(Context context, grd grd1)
    {
        grd1.f("phone_verification");
        if (grd1.a("name"))
        {
            grd1.b("account_name", grd1.b("name"));
            grd1.f("name");
        }
    }
}
