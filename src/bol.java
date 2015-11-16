// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.hangout.FocusedParticipantView;

public final class bol
    implements android.view.View.OnClickListener
{

    final bqo a;
    final FocusedParticipantView b;

    public bol(FocusedParticipantView focusedparticipantview, bqo bqo1)
    {
        b = focusedparticipantview;
        a = bqo1;
        super();
    }

    public void onClick(View view)
    {
        a.i();
        eep.a(b, null, a.b(b.getContext()));
    }
}
