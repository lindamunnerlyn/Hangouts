// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.conversation.v2.FloatingButtonWithCounter;

public final class azb
    implements android.view.View.OnClickListener
{

    final FloatingButtonWithCounter a;

    public azb(FloatingButtonWithCounter floatingbuttonwithcounter)
    {
        a = floatingbuttonwithcounter;
        super();
    }

    public void onClick(View view)
    {
        FloatingButtonWithCounter.a(a).a();
    }
}
