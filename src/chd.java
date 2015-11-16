// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class chd
    implements android.view.View.OnClickListener
{

    final cgw a;

    chd(cgw cgw1)
    {
        a = cgw1;
        super();
    }

    public void onClick(View view)
    {
        boolean flag = cgw.e(a).e();
        view = cgw.e(a);
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
