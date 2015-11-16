// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ListView;

final class aww
    implements Runnable
{

    final awv a;

    aww(awv awv1)
    {
        a = awv1;
        super();
    }

    public void run()
    {
        if (!a.a && a.c.getActivity() != null && !a.c.getActivity().isFinishing())
        {
            ((ListView)avv.ar(a.c)).setSelection(((aqu)avv.aq(a.c)).getCount() - 1);
        }
    }
}
