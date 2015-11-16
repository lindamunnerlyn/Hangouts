// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.hangout.ParticipantOverlays;
import java.util.Iterator;
import java.util.List;

public final class brn extends bns
{

    final ParticipantOverlays a;

    public brn(ParticipantOverlays participantoverlays)
    {
        a = participantoverlays;
        super();
    }

    public void c(gmt gmt1)
    {
        if (a.a != null && a.a.equals(gmt1))
        {
            for (Iterator iterator = a.b.iterator(); iterator.hasNext(); ((brm)iterator.next()).a(gmt1)) { }
        }
    }
}
