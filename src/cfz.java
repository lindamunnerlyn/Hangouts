// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

public final class cfz
    implements android.view.View.OnFocusChangeListener
{

    final EditParticipantsView a;

    public cfz(EditParticipantsView editparticipantsview)
    {
        a = editparticipantsview;
        super();
    }

    public void onFocusChange(View view, boolean flag)
    {
        if (!flag)
        {
            ((InputMethodManager)a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(a.getWindowToken(), 0);
        }
    }
}
