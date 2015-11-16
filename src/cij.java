// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class cij
    implements android.view.View.OnClickListener
{

    final cic a;

    cij(cic cic1)
    {
        a = cic1;
        super();
    }

    public void onClick(View view)
    {
        boolean flag = cic.e(a).e();
        view = cic.e(a);
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.d(flag);
    }
}
