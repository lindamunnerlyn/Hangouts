// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class bjv
    implements android.view.View.OnClickListener
{

    final bjq a;

    bjv(bjq bjq1)
    {
        a = bjq1;
        super();
    }

    public void onClick(View view)
    {
        if (bjq.a(a) != null)
        {
            bjq.a(a).b();
        }
    }
}
