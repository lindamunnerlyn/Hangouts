// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.hangout.ParticipantTrayView;
import com.google.android.apps.hangouts.hangout.RemoteParticipantPopupMenu;

final class brv
    implements android.view.View.OnLongClickListener
{

    final brt a;

    brv(brt brt1)
    {
        a = brt1;
        super();
    }

    public boolean onLongClick(View view)
    {
        a.f.a(a);
        view = a;
        if (!((brt) (view)).a.g())
        {
            ((brt) (view)).f.f();
            ((brt) (view)).j.setVisibility(0);
            RemoteParticipantPopupMenu remoteparticipantpopupmenu = ((brt) (view)).j;
            view.getContext();
            remoteparticipantpopupmenu.a(((brt) (view)).d, ((brt) (view)).a, ((brt) (view)).c.s());
        }
        return true;
    }
}
