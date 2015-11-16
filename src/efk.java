// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class efk
    implements Runnable
{

    final MessageListItemView a;

    public efk(MessageListItemView messagelistitemview)
    {
        a = messagelistitemview;
        super();
    }

    public void run()
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(MessageListItemView.h(a), "showPercentage", new float[] {
            1.0F, 0.0F
        });
        objectanimator.setDuration(a.getResources().getInteger(g.eZ));
        objectanimator.setInterpolator(new aic(aig.a));
        objectanimator.addListener(new efl(this));
        objectanimator.start();
    }
}
