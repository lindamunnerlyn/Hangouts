// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

public final class cgc
    implements TextWatcher
{

    final EditParticipantsView a;

    public cgc(EditParticipantsView editparticipantsview)
    {
        a = editparticipantsview;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        EditParticipantsView.b(a).a(editable.toString());
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
