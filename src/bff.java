// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.view.KeyEvent;

final class bff
    implements android.content.DialogInterface.OnKeyListener
{

    final bfd a;

    bff(bfd bfd1)
    {
        a = bfd1;
        super();
    }

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (keyevent.getKeyCode() == 4 && keyevent.getAction() == 1)
        {
            a.j();
            return true;
        } else
        {
            return false;
        }
    }
}
