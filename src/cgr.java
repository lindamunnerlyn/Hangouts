// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;

final class cgr extends zq
{

    final cgh l;
    private final ImageView m;

    public cgr(cgh cgh1, View view)
    {
        l = cgh1;
        super(view);
        m = (ImageView)view.findViewById(l.un);
    }

    public void v()
    {
        int i;
        if (cgh.c(l))
        {
            i = n.f;
        } else
        {
            i = n.g;
        }
        m.setImageResource(i);
    }
}
