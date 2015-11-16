// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.hangout.RemoteParticipantPopupMenu;
import java.util.Iterator;
import java.util.List;

public final class bsa extends bnk
{

    final RemoteParticipantPopupMenu a;

    public bsa(RemoteParticipantPopupMenu remoteparticipantpopupmenu)
    {
        a = remoteparticipantpopupmenu;
        super();
    }

    public void c(gjr gjr)
    {
        for (Iterator iterator = RemoteParticipantPopupMenu.a(a).iterator(); iterator.hasNext(); ((bov)iterator.next()).a(gjr)) { }
    }
}
