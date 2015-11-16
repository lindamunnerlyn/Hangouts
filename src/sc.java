// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;

final class sc
    implements mg
{

    final rz a;

    sc(rz rz1)
    {
        a = rz1;
        super();
    }

    public void a()
    {
        ((View)rz.c(a).getParent()).invalidate();
    }
}
