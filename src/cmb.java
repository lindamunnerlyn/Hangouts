// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class cmb
    implements android.view.View.OnClickListener
{

    final String a;
    final DebugActivity b;

    public cmb(DebugActivity debugactivity, String s)
    {
        b = debugactivity;
        a = s;
        super();
    }

    public void onClick(View view)
    {
        DebugActivity.a(b, a, "conversations_view");
    }
}
