// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.views.MessageListItemView;

public final class eih
    implements Runnable
{

    final MessageListItemView a;

    public eih(MessageListItemView messagelistitemview)
    {
        a = messagelistitemview;
        super();
    }

    public void run()
    {
        MessageListItemView.b(a);
    }
}
