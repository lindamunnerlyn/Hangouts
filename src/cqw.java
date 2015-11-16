// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.hangouts.phone.ShowDialerActivity;

public final class cqw
    implements gqw
{

    final ShowDialerActivity a;

    public cqw(ShowDialerActivity showdialeractivity)
    {
        a = showdialeractivity;
        super();
    }

    public void a(boolean flag, gqv gqv1, gqv gqv2, int i, int j)
    {
        if (gqv2 == gqv.c)
        {
            gqv1 = a.j.a();
            gqv2 = a.getIntent().getStringExtra("number_to_call");
            if (!TextUtils.isEmpty(gqv2))
            {
                gqv1.putExtra("number_to_call", gqv2);
            }
            a.startActivity(gqv1);
        }
        a.finish();
    }
}
