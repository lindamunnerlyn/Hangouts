// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.conversation.v2;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import azm;
import azn;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import g;
import gqh;

public class FauxConversationSnackbar extends Snackbar
{

    public FauxConversationSnackbar(Context context)
    {
        this(context, null);
    }

    public FauxConversationSnackbar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, g.st);
    }

    public FauxConversationSnackbar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void a()
    {
        gqh gqh1 = a;
        ObjectAnimator objectanimator = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[] {
            PropertyValuesHolder.ofFloat("alpha", new float[] {
                0.0F, 1.0F
            })
        });
        objectanimator.addListener(new azm(this));
        gqh1.a(objectanimator);
    }

    public void b()
    {
        gqh gqh1 = a;
        ObjectAnimator objectanimator = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[] {
            PropertyValuesHolder.ofFloat("alpha", new float[] {
                1.0F, 0.0F
            })
        });
        objectanimator.setStartDelay(700L);
        objectanimator.addListener(new azn(this));
        gqh1.b(objectanimator);
    }
}
