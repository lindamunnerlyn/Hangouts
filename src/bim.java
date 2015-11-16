// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.view.View;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;

public final class bim
    implements android.view.View.OnClickListener
{

    final ConversationListFragment a;

    public bim(ConversationListFragment conversationlistfragment)
    {
        a = conversationlistfragment;
        super();
    }

    public void onClick(View view)
    {
        view = new Intent();
        view.putExtra("opened_from_impression", 2149);
        view.putExtra("account_id", ConversationListFragment.f(a).h());
        ConversationListFragment.g(a).a(view);
    }
}
