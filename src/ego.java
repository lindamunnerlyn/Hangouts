// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.views.ConversationListItemView;

public final class ego
    implements android.view.View.OnClickListener
{

    final ConversationListItemView a;

    public ego(ConversationListItemView conversationlistitemview)
    {
        a = conversationlistitemview;
        super();
    }

    public void onClick(View view)
    {
        int i;
        byte byte0;
        boolean flag;
        if (a.d == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a.o())
        {
            i = 1;
        } else
        {
            i = 2;
        }
        if (flag)
        {
            byte0 = 57;
        } else
        {
            byte0 = 58;
        }
        if (a.e != null && a.a != null)
        {
            view = a.e;
            String s = a.a;
            int j = a.b;
            view.a(s, flag, i, byte0);
        }
    }
}
