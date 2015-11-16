// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;

public final class bij
    implements android.view.View.OnClickListener
{

    final View a;
    final Uri b;
    final Context c;
    final ConversationListFragment d;

    public bij(ConversationListFragment conversationlistfragment, View view, Uri uri, Context context)
    {
        d = conversationlistfragment;
        a = view;
        b = uri;
        c = context;
        super();
    }

    public void onClick(View view)
    {
        a.setVisibility(8);
        view = new Intent("android.intent.action.VIEW");
        view.setData(b);
        c.startActivity(view);
    }
}
