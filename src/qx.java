// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ActionMode;

class qx extends qu
{

    final qw b;

    qx(qw qw1, android.view.Window.Callback callback)
    {
        b = qw1;
        super(qw1, callback);
    }

    final ActionMode a(android.view.ActionMode.Callback callback)
    {
        callback = new sj(b.a, callback);
        vr vr = b.b(callback);
        if (vr != null)
        {
            return callback.b(vr);
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
