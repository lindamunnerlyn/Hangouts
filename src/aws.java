// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class aws
    implements android.view.View.OnLayoutChangeListener
{

    final avv a;

    aws(avv avv1)
    {
        a = avv1;
        super();
    }

    public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        if (avv.al(a) == -1)
        {
            avv.a(a, j);
        }
        if (avv.am(a))
        {
            avv.an(a).a(avv.al(a));
        }
    }
}
