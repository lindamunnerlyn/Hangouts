// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.hangouts.phone.ShowDialerActivity;

public final class cpg
    implements gmq
{

    final ShowDialerActivity a;

    public cpg(ShowDialerActivity showdialeractivity)
    {
        a = showdialeractivity;
        super();
    }

    public void a(boolean flag, gmp gmp1, gmp gmp2, int i, int j)
    {
        if (gmp2 == gmp.c)
        {
            gmp1 = ShowDialerActivity.a(a).a();
            gmp2 = a.getIntent().getStringExtra("number_to_call");
            if (!TextUtils.isEmpty(gmp2))
            {
                gmp1.putExtra("number_to_call", gmp2);
            }
            a.startActivity(gmp1);
        }
        a.finish();
    }
}
