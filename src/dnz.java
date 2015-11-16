// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

final class dnz
    implements fsn, hfs
{

    final dnu a;

    dnz(dnu dnu1)
    {
        a = dnu1;
        super();
    }

    public boolean a(int i, int j, Intent intent)
    {
        if (i == 1)
        {
            if (j == -1)
            {
                intent = intent.getStringExtra("com.google.android.gms.people.profile.EXTRA_AVATAR_URL");
                ank.a(dnu.c(a), dnu.a(a), intent);
                dnu.d(a).a(dnu.a(a).x(), dnu.a(a));
            }
            return true;
        } else
        {
            return false;
        }
    }
}
