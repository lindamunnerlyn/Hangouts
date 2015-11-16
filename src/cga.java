// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

public final class cga
    implements cfr
{

    final EditParticipantsView a;

    public cga(EditParticipantsView editparticipantsview)
    {
        a = editparticipantsview;
        super();
    }

    public void a()
    {
        if (EditParticipantsView.a(a).getChildCount() > 0)
        {
            View view = EditParticipantsView.a(a).getChildAt(EditParticipantsView.a(a).getChildCount() - 1);
            ais ais1 = (ais)view.getTag();
            if (ais1 != null)
            {
                view.setTag(null);
                EditParticipantsView.b(a).b(ais1);
                EditParticipantsView.c(a);
            }
        }
    }
}
