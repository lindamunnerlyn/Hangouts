// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.hangout.FocusedParticipantView;

public final class bob extends bnk
{

    final FocusedParticipantView a;

    public bob(FocusedParticipantView focusedparticipantview)
    {
        a = focusedparticipantview;
        super();
    }

    public void c(gjr gjr1)
    {
        if (FocusedParticipantView.b(a) != null && FocusedParticipantView.b(a).a().equals(gjr1.a()))
        {
            FocusedParticipantView.a(a, gjr1);
            FocusedParticipantView.c(a);
        }
    }

    public void d(gjr gjr1)
    {
        FocusedParticipantView.a(a, gjr1);
        a.b();
    }
}
