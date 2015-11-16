// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.hangout.FocusedParticipantView;

public final class bok extends bns
{

    final FocusedParticipantView a;

    public bok(FocusedParticipantView focusedparticipantview)
    {
        a = focusedparticipantview;
        super();
    }

    public void c(gmt gmt1)
    {
        if (FocusedParticipantView.b(a) != null && FocusedParticipantView.b(a).a().equals(gmt1.a()))
        {
            FocusedParticipantView.a(a, gmt1);
            FocusedParticipantView.c(a);
        }
    }

    public void d(gmt gmt1)
    {
        FocusedParticipantView.a(a, gmt1);
        a.b();
    }
}
