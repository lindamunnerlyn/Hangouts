// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class eim
    implements Runnable
{

    final MessageListItemView a;

    public eim(MessageListItemView messagelistitemview)
    {
        a = messagelistitemview;
        super();
    }

    public void run()
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(MessageListItemView.h(a), "showPercentage", new float[] {
            1.0F, 0.0F
        });
        objectanimator.setDuration(a.getResources().getInteger(g.eX));
        objectanimator.setInterpolator(new ahv(ahz.a));
        objectanimator.addListener(new ein(this));
        objectanimator.start();
    }
}
