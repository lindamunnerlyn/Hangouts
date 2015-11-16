// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.conversation.v2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;
import azj;
import dzk;

public class MessageEditText extends EditText
{

    private azj a;

    public MessageEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            setShowSoftInputOnFocus(dzk.d(context));
        }
    }

    public void a(azj azj1)
    {
        a = azj1;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyevent)
    {
        if (keyevent.getKeyCode() == 4 && keyevent.getAction() == 1 && a != null && a.a())
        {
            return true;
        } else
        {
            return super.onKeyPreIme(i, keyevent);
        }
    }

    public boolean performClick()
    {
        super.performClick();
        if (a == null)
        {
            return false;
        } else
        {
            return a.b();
        }
    }
}
