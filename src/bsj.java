// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.hangout.RemoteParticipantPopupMenu;
import java.util.Iterator;
import java.util.List;

public final class bsj extends bns
{

    final RemoteParticipantPopupMenu a;

    public bsj(RemoteParticipantPopupMenu remoteparticipantpopupmenu)
    {
        a = remoteparticipantpopupmenu;
        super();
    }

    public void c(gmt gmt)
    {
        for (Iterator iterator = a.b.iterator(); iterator.hasNext(); ((bpe)iterator.next()).a(gmt)) { }
    }
}
