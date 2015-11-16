// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class bzs
    implements android.view.View.OnClickListener
{

    final bzq a;

    bzs(bzq bzq1)
    {
        a = bzq1;
        super();
    }

    public void onClick(View view)
    {
        if (a.a != null)
        {
            a.a.a();
        }
    }
}
