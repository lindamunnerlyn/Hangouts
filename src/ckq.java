// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;

public final class ckq
    implements TextWatcher
{

    final AlertDialog a;
    final BabelHomeActivity b;

    public ckq(BabelHomeActivity babelhomeactivity, AlertDialog alertdialog)
    {
        b = babelhomeactivity;
        a = alertdialog;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        Button button = a.getButton(-1);
        boolean flag;
        if (charsequence.toString().trim().length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        button.setEnabled(flag);
    }
}
