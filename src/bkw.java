// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public final class bkw extends aux
{

    public bkw(View view, bkx bkx1, dvi dvi)
    {
        super(view, bkx1, dvi);
    }

    protected boolean a()
    {
        return ((bkx)c).c() && ((bkx)c).b() != ((bkx)c).a();
    }

    protected dvg b()
    {
        dvh dvh1 = e();
        int i;
        if (((bkx)c).b())
        {
            i = l.kg;
        } else
        {
            i = l.kh;
        }
        dvh1.a(b.getResources().getString(i));
        return dvh1.a();
    }
}
