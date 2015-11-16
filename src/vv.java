// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.MenuItem;
import android.view.View;

final class vv extends tl
{

    final vu c;
    private ts d;

    public vv(vu vu1, Context context, ts ts1)
    {
        boolean flag1 = false;
        c = vu1;
        super(context, ts1, null, false, g.q);
        d = ts1;
        int i;
        if (!((tc)ts1.getItem()).i())
        {
            int j;
            boolean flag;
            if (vu1.g == null)
            {
                context = (View)vu1.f;
            } else
            {
                context = vu1.g;
            }
            a(context);
        }
        a(vu1.k);
        j = ts1.size();
        i = 0;
        do
        {
label0:
            {
                flag = flag1;
                if (i < j)
                {
                    vu1 = ts1.getItem(i);
                    if (!vu1.isVisible() || vu1.getIcon() == null)
                    {
                        break label0;
                    }
                    flag = true;
                }
                a(flag);
                return;
            }
            i++;
        } while (true);
    }

    public void onDismiss()
    {
        super.onDismiss();
        c.i = null;
        c.l = 0;
    }
}
