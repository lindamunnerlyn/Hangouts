// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ProgressBar;

public final class abv
{

    private final ProgressBar a;
    private final ProgressBar b;
    private boolean c;

    public abv(ProgressBar progressbar, ProgressBar progressbar1)
    {
        a = progressbar;
        b = progressbar1;
        c = true;
        a(c);
    }

    private void a(boolean flag)
    {
        byte byte0 = 8;
        ProgressBar progressbar = b;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        progressbar.setVisibility(i);
        progressbar = a;
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        progressbar.setVisibility(i);
    }

    public void a(int i)
    {
        if (i == 4 || i == 8)
        {
            b.setVisibility(i);
            a.setVisibility(i);
            return;
        } else
        {
            a(c);
            return;
        }
    }
}
