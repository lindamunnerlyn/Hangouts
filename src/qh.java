// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import android.view.View;

final class qh
    implements android.view.View.OnClickListener
{

    final qg a;

    qh(qg qg1)
    {
        a = qg1;
        super();
    }

    public void onClick(View view)
    {
        if (view == a.c && a.d != null)
        {
            view = Message.obtain(a.d);
        } else
        if (view == a.e && a.f != null)
        {
            view = Message.obtain(a.f);
        } else
        if (view == a.g && a.h != null)
        {
            view = Message.obtain(a.h);
        } else
        {
            view = null;
        }
        if (view != null)
        {
            view.sendToTarget();
        }
        a.o.obtainMessage(1, a.a).sendToTarget();
    }
}
