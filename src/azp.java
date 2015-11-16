// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import com.google.android.apps.hangouts.conversation.v2.FloatingButtonWithCounter;

public final class azp
    implements android.view.View.OnClickListener
{

    final Context a;
    final FloatingButtonWithCounter b;

    public azp(FloatingButtonWithCounter floatingbuttonwithcounter, Context context)
    {
        b = floatingbuttonwithcounter;
        a = context;
        super();
    }

    public void onClick(View view)
    {
        ((baa)hlp.a(a, baa)).a();
    }
}
