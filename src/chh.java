// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

public final class chh
    implements android.view.View.OnClickListener
{

    final ail a;
    final EditParticipantsView b;

    public chh(EditParticipantsView editparticipantsview, ail ail)
    {
        b = editparticipantsview;
        a = ail;
        super();
    }

    public void onClick(View view)
    {
        EditParticipantsView.b(b).b(a);
        EditParticipantsView.c(b);
    }
}
