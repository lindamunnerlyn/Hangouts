// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class aok
    implements grg
{

    final aoc a;

    aok(aoc aoc)
    {
        a = aoc;
        super();
    }

    public String a()
    {
        return "legacy_avatar_url";
    }

    public void a(Context context, grd grd1)
    {
        if (grd1.a("avatar_url"))
        {
            grd1.b("profile_photo_url", grd1.b("avatar_url"));
            grd1.f("avatar_url");
        }
    }
}
