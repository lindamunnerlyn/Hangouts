// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class eij
    implements android.view.View.OnLongClickListener
{

    final MessageListItemView a;

    public eij(MessageListItemView messagelistitemview)
    {
        a = messagelistitemview;
        super();
    }

    public boolean onLongClick(View view)
    {
        MessageListItemView.g(a);
        return false;
    }
}
