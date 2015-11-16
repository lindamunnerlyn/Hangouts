// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.conversation.v2;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import ayy;
import ayz;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import g;
import gmb;

public class FauxConversationSnackbar extends Snackbar
{

    public FauxConversationSnackbar(Context context)
    {
        this(context, null);
    }

    public FauxConversationSnackbar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, g.rS);
    }

    public FauxConversationSnackbar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static void a(Snackbar snackbar)
    {
        b(snackbar);
    }

    public void a()
    {
        gmb gmb1 = a;
        ObjectAnimator objectanimator = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[] {
            PropertyValuesHolder.ofFloat("alpha", new float[] {
                0.0F, 1.0F
            })
        });
        objectanimator.addListener(new ayy(this));
        gmb1.a(objectanimator);
    }

    public void b()
    {
        gmb gmb1 = a;
        ObjectAnimator objectanimator = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[] {
            PropertyValuesHolder.ofFloat("alpha", new float[] {
                1.0F, 0.0F
            })
        });
        objectanimator.setStartDelay(700L);
        objectanimator.addListener(new ayz(this));
        gmb1.b(objectanimator);
    }
}
