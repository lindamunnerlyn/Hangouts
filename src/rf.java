// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;

final class rf
    implements ux
{

    final rc a;

    rf(rc rc1)
    {
        a = rc1;
        super();
    }

    public void a(Rect rect)
    {
        rect.top = rc.b(a, rect.top);
    }
}
