// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.hangout.FocusedParticipantView;

public final class bom
    implements android.view.View.OnLongClickListener
{

    final FocusedParticipantView a;

    public bom(FocusedParticipantView focusedparticipantview)
    {
        a = focusedparticipantview;
        super();
    }

    public boolean onLongClick(View view)
    {
        FocusedParticipantView.d(a);
        return true;
    }
}
