// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;

final class se
    implements mg
{

    final sb a;

    se(sb sb1)
    {
        a = sb1;
        super();
    }

    public void a()
    {
        ((View)sb.c(a).getParent()).invalidate();
    }
}
