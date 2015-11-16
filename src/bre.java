// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.hangout.ParticipantOverlays;
import java.util.Iterator;
import java.util.List;

public final class bre extends bnk
{

    final ParticipantOverlays a;

    public bre(ParticipantOverlays participantoverlays)
    {
        a = participantoverlays;
        super();
    }

    public void c(gjr gjr1)
    {
        if (ParticipantOverlays.a(a) != null && ParticipantOverlays.a(a).equals(gjr1))
        {
            for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((brd)iterator.next()).a(gjr1)) { }
        }
    }
}
