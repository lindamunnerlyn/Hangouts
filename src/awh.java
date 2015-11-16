// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ListView;

final class awh
    implements Runnable
{

    final awg a;

    awh(awg awg1)
    {
        a = awg1;
        super();
    }

    public void run()
    {
        if (!a.a && a.c.getActivity() != null && !a.c.getActivity().isFinishing())
        {
            ((ListView)ave.aq(a.c)).setSelection(((aqd)ave.ap(a.c)).getCount() - 1);
        }
    }
}
