// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ActionMode;

class qz extends qw
{

    final qy b;

    qz(qy qy1, android.view.Window.Callback callback)
    {
        b = qy1;
        super(qy1, callback);
    }

    final ActionMode a(android.view.ActionMode.Callback callback)
    {
        callback = new sl(b.a, callback);
        vt vt = b.b(callback);
        if (vt != null)
        {
            return callback.b(vt);
        } else
        {
            return null;
        }
    }

    public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
    {
        if (b.l())
        {
            return a(callback);
        } else
        {
            return super.onWindowStartingActionMode(callback);
        }
    }
}
