// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ListView;

final class hfj
    implements Runnable
{

    final hfh a;

    hfj(hfh hfh1)
    {
        a = hfh1;
        super();
    }

    public void run()
    {
        hfh.b(a).focusableViewAvailable(hfh.b(a));
    }
}
