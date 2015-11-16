// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.view.KeyEvent;

final class beq
    implements android.content.DialogInterface.OnKeyListener
{

    final ben a;

    beq(ben ben1)
    {
        a = ben1;
        super();
    }

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (keyevent.getKeyCode() == 4 && keyevent.getAction() == 1)
        {
            ben.o(a);
            return true;
        } else
        {
            return false;
        }
    }
}
