// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.views.MessageListItemView;

final class aqv
    implements android.widget.AbsListView.RecyclerListener
{

    final aqu a;

    aqv(aqu aqu)
    {
        a = aqu;
        super();
    }

    public void onMovedToScrapHeap(View view)
    {
        if (view instanceof MessageListItemView)
        {
            ((MessageListItemView)view).j();
        }
    }
}
