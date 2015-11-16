// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

final class gyv
    implements gov
{

    final gyu a;

    gyv(gyu gyu1)
    {
        a = gyu1;
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
        if (i != -1 && gyu.a(a) != null)
        {
            gyu.a(a).k();
        }
    }
}
