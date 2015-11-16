// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;

final class axv
    implements fsn, hjc, hjf
{

    int a;
    final ave b;
    private boolean c;

    axv(ave ave1)
    {
        b = ave1;
        super();
        a = axx.a;
        c = false;
    }

    static void a(axv axv1)
    {
        if (axv1.a != axx.b || axv1.b.P() || ave.w(axv1.b) == 1)
        {
            return;
        }
        aug aaug[] = ave.x(axv1.b);
        int j = aaug.length;
        int i = 0;
        while (i < j) 
        {
            aug aug1 = aaug[i];
            boolean flag = aug1.a();
            aug1.a(flag);
            if (aug1 instanceof blc)
            {
                if (flag && !axv1.c)
                {
                    g.a(ave.h(axv1.b), 2100);
                    axv1.c = true;
                } else
                if (axv1.c && !flag)
                {
                    g.a(ave.h(axv1.b), 2101);
                    axv1.c = false;
                }
            }
            i++;
        }
        ave.g(axv1.b).a(ave.g(axv1.b).a());
    }

    public void a()
    {
        a = axx.c;
    }

    public void a(View view, Bundle bundle)
    {
        g.a(new axw(this), 500L);
    }
}
