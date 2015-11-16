// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;
import com.google.android.apps.hangouts.peoplelistv2.impl.ScrollViewCustom;

public final class cge
    implements android.view.View.OnClickListener
{

    final EditParticipantsView a;

    public cge(EditParticipantsView editparticipantsview)
    {
        a = editparticipantsview;
        super();
    }

    public void onClick(View view)
    {
        Object obj;
        int i;
        EditParticipantsView.e(a).requestChildFocus(EditParticipantsView.a(a), view);
        i = EditParticipantsView.a(a).indexOfChild(view);
        obj = view.getTag();
        if (i != -1) goto _L2; else goto _L1
_L1:
        EditParticipantsView.a(a, null);
_L4:
        EditParticipantsView.c(a);
        ((InputMethodManager)view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        if (EditParticipantsView.g(a) != null)
        {
            EditParticipantsView.e(a).requestChildFocus(EditParticipantsView.g(a), EditParticipantsView.g(a));
        }
        return;
_L2:
        if (obj != null)
        {
            EditParticipantsView.a(a, view);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
