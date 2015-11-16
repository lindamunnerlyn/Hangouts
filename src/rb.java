// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ActionMode;

final class rb extends qz
{

    final ra c;

    rb(ra ra1, android.view.Window.Callback callback)
    {
        c = ra1;
        super(ra1, callback);
    }

    public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
    {
        return null;
    }

    public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i)
    {
        if (!c.l()) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 0 0: default 28
    //                   0 35;
           goto _L2 _L3
_L2:
        return super.onWindowStartingActionMode(callback, i);
_L3:
        return a(callback);
    }
}
