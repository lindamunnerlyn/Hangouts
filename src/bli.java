// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public final class bli extends aux
{

    public bli(View view, blk blk1, dvi dvi)
    {
        super(view, blk1, dvi);
    }

    protected boolean a()
    {
        return ((blk)c).B();
    }

    protected dvg b()
    {
        dvh dvh1 = e();
        Resources resources = b.getResources();
        dvh1.a(resources.getString(l.au));
        dvh1.c(resources.getString(l.R));
        dvh1.a(new blj(this));
        return dvh1.a();
    }
}
