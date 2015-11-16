// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class anr
    implements gmz
{

    final ank a;

    anr(ank ank)
    {
        a = ank;
        super();
    }

    public String a()
    {
        return "legacy_known_minor";
    }

    public void a(Context context, gmw gmw1)
    {
        int i = gmw1.a("account_age_group", 0);
        if (gmw1.a("is_child") && i == 0 && gmw1.d("is_child"))
        {
            gmw1.b("account_age_group", 2);
        }
    }
}
