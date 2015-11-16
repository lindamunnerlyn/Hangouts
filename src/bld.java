// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.hangouts.fragments.InvitationFragment;

public final class bld extends ClickableSpan
{

    final InvitationFragment a;

    public bld(InvitationFragment invitationfragment)
    {
        a = invitationfragment;
        super();
    }

    public void onClick(View view)
    {
        view = g.o(InvitationFragment.a(a).a);
        a.startActivity(view);
    }
}
