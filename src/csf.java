// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class csf
    implements android.view.View.OnClickListener
{

    final cse a;

    csf(cse cse1)
    {
        a = cse1;
        super();
    }

    public void onClick(View view)
    {
        g.a(dcn.e(cse.a(a).a()), 2408);
        if (cse.b(a) != null)
        {
            cse.b(a).a(cse.c(a), cse.a(a).c().b("account_name"), cse.d(a));
        }
    }
}
