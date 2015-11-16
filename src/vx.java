// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.MenuItem;
import android.view.View;

final class vx extends tn
{

    final vw f;
    private tu g;

    public vx(vw vw1, Context context, tu tu1)
    {
        boolean flag1 = false;
        f = vw1;
        super(context, tu1, null, false, g.q);
        g = tu1;
        int i;
        if (!((te)tu1.getItem()).i())
        {
            int j;
            boolean flag;
            if (vw1.g == null)
            {
                context = (View)vw1.f;
            } else
            {
                context = vw1.g;
            }
            a(context);
        }
        a(vw1.k);
        j = tu1.size();
        i = 0;
        do
        {
label0:
            {
                flag = flag1;
                if (i < j)
                {
                    vw1 = tu1.getItem(i);
                    if (!vw1.isVisible() || vw1.getIcon() == null)
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
        f.i = null;
        f.l = 0;
    }
}
