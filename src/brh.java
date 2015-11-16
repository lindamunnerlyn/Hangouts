// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.hangout.ParticipantTrayView;

public final class brh
    implements Runnable
{

    final ParticipantTrayView a;

    public brh(ParticipantTrayView participanttrayview)
    {
        a = participanttrayview;
        super();
    }

    public void run()
    {
        a.a(ParticipantTrayView.b(a));
    }
}
