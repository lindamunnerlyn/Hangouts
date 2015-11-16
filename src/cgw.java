// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Editable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.google.android.apps.hangouts.peoplelistv2.impl.DeleteOnEmptyEditText;

public final class cgw extends InputConnectionWrapper
{

    final DeleteOnEmptyEditText a;

    public cgw(DeleteOnEmptyEditText deleteonemptyedittext, InputConnection inputconnection)
    {
        a = deleteonemptyedittext;
        super(inputconnection, true);
    }

    public boolean deleteSurroundingText(int i, int j)
    {
        if (a.getText().length() == 0 && a.a != null)
        {
            a.a.a();
        }
        return super.deleteSurroundingText(i, j);
    }
}
