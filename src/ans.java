// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class ans
    implements gmz
{

    final ank a;

    ans(ank ank)
    {
        a = ank;
        super();
    }

    public String a()
    {
        return "legacy_avatar_url";
    }

    public void a(Context context, gmw gmw1)
    {
        if (gmw1.a("avatar_url"))
        {
            gmw1.b("profile_photo_url", gmw1.b("avatar_url"));
            gmw1.f("avatar_url");
        }
    }
}
