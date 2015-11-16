// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public final class blg extends aux
{

    public blg(View view, blh blh1, dvi dvi)
    {
        super(view, blh1, dvi);
    }

    protected boolean a()
    {
        return ((blh)c).d() && ((blh)c).a() && ((blh)c).b();
    }

    protected dvg b()
    {
        String s;
        int i;
        if (((blh)c).e())
        {
            i = l.eU;
        } else
        {
            i = l.eV;
        }
        s = b.getResources().getString(i, new Object[] {
            ((blh)c).c()
        });
        return e().a(s).a();
    }
}
