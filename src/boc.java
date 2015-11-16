// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.hangout.FocusedParticipantView;

public final class boc
    implements android.view.View.OnClickListener
{

    final bqf a;
    final FocusedParticipantView b;

    public boc(FocusedParticipantView focusedparticipantview, bqf bqf1)
    {
        b = focusedparticipantview;
        a = bqf1;
        super();
    }

    public void onClick(View view)
    {
        a.i();
        ebr.a(b, null, a.b(b.getContext()));
    }
}
