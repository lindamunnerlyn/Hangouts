// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorSet;

public final class gmb
{

    private final gma a;
    private Animator b;

    public gmb(gma gma1)
    {
        b = new AnimatorSet();
        a = gma1;
    }

    private void a()
    {
        if (b.isStarted())
        {
            b.end();
        }
    }

    public void a(Animator animator)
    {
        a();
        if (!a.c())
        {
            return;
        } else
        {
            b = animator;
            b.start();
            return;
        }
    }

    public void b(Animator animator)
    {
        a();
        if (a.c())
        {
            return;
        } else
        {
            b = animator;
            b.start();
            return;
        }
    }
}
