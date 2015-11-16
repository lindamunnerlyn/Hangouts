// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

final class hdo
    implements gtd
{

    final hdn a;

    hdo(hdn hdn1)
    {
        a = hdn1;
        super();
    }

    public void a(int i, Intent intent)
    {
        if (intent != null)
        {
            i = intent.getIntExtra("account_id", -1);
        } else
        {
            i = -1;
        }
        if (i != -1 && hdn.a(a) != null)
        {
            hdn.a(a).k();
        }
    }
}
