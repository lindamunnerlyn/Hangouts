// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.android.apps.hangouts.peoplelistv2.impl.DeleteOnEmptyEditText;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;
import com.google.android.apps.hangouts.peoplelistv2.impl.ScrollViewCustom;

public final class chj
    implements aik
{

    final EditParticipantsView a;

    public chj(EditParticipantsView editparticipantsview)
    {
        a = editparticipantsview;
        super();
    }

    public void a()
    {
        if (EditParticipantsView.d(a))
        {
            EditParticipantsView.a(a, null);
            EditParticipantsView.c(a);
            g.a(EditParticipantsView.e(a).d);
        }
    }

    public void a(String s)
    {
        if (!TextUtils.equals(s, EditParticipantsView.f(a).getText().toString()))
        {
            EditParticipantsView.f(a).setText(s);
        }
    }
}
