// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class eip
    implements br
{

    final MessageListItemView a;
    private final StringBuilder b;
    private final Context c;

    public eip(MessageListItemView messagelistitemview, Context context, StringBuilder stringbuilder)
    {
        a = messagelistitemview;
        super();
        b = stringbuilder;
        c = context;
    }

    public em onCreateLoader(int i, Bundle bundle)
    {
        return new eir(c, MessageListItemView.f(a).h(), MessageListItemView.j(a));
    }

    public void onLoadFinished(em em, Object obj)
    {
        em = (String)obj;
        MessageListItemView.a(a, em);
        g.a(c, b, MessageListItemView.k(a), null, MessageListItemView.l(a));
    }

    public void onLoaderReset(em em)
    {
    }
}
