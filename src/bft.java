// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public final class bft extends aux
{

    private int d;

    public bft(View view, bfu bfu1, dvi dvi)
    {
        super(view, bfu1, dvi);
    }

    protected boolean a()
    {
        return ((bfu)c).u() && !g.a(cqo.b);
    }

    protected dvg b()
    {
        if (g.e(((bfu)c).d()))
        {
            d = l.A;
        } else
        {
            d = l.z;
        }
        g.b(cqo.b);
        return e().a(b.getResources().getString(d)).a();
    }
}
