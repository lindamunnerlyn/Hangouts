// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.views.MessageListItemView;
import java.util.List;

final class awx
    implements android.widget.AbsListView.RecyclerListener
{

    final avv a;

    awx(avv avv1)
    {
        a = avv1;
        super();
    }

    public void onMovedToScrapHeap(View view)
    {
        if (view instanceof MessageListItemView)
        {
            ((MessageListItemView)view).z();
        }
        a.d.remove(view);
    }
}
