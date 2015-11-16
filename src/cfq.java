// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Editable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.google.android.apps.hangouts.peoplelistv2.impl.DeleteOnEmptyEditText;

public final class cfq extends InputConnectionWrapper
{

    final DeleteOnEmptyEditText a;

    public cfq(DeleteOnEmptyEditText deleteonemptyedittext, InputConnection inputconnection)
    {
        a = deleteonemptyedittext;
        super(inputconnection, true);
    }

    public boolean deleteSurroundingText(int i, int j)
    {
        if (a.getText().length() == 0 && DeleteOnEmptyEditText.a(a) != null)
        {
            DeleteOnEmptyEditText.a(a).a();
        }
        return super.deleteSurroundingText(i, j);
    }
}
