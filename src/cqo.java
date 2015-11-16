// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class cqo
    implements android.view.View.OnClickListener
{

    final cqn a;

    cqo(cqn cqn1)
    {
        a = cqn1;
        super();
    }

    public void onClick(View view)
    {
        g.a(dbf.e(cqn.a(a).a()), 2408);
        if (cqn.b(a) != null)
        {
            cqn.b(a).a(cqn.c(a), cqn.a(a).c().b("account_name"), cqn.d(a));
        }
    }
}
