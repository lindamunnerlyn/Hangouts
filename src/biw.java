// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;

public final class biw
    implements android.view.View.OnClickListener
{

    final View a;
    final ConversationListFragment b;

    public biw(ConversationListFragment conversationlistfragment, View view)
    {
        b = conversationlistfragment;
        a = view;
        super();
    }

    public void onClick(View view)
    {
        a.setVisibility(8);
    }
}
