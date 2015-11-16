// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

final class dqs
    implements hkj, hoy
{

    final dqn a;

    dqs(dqn dqn1)
    {
        a = dqn1;
        super();
    }

    public boolean a(int i, int j, Intent intent)
    {
        if (i == 1)
        {
            if (j == -1)
            {
                intent = intent.getStringExtra("com.google.android.gms.people.profile.EXTRA_AVATAR_URL");
                aoc.a(dqn.c(a), dqn.a(a), intent);
                dqn.d(a).a(dqn.a(a).v(), dqn.a(a));
            }
            return true;
        } else
        {
            return false;
        }
    }
}
