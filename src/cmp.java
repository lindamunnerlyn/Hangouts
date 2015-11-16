// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.CompoundButton;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class cmp
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    final DebugActivity a;

    public cmp(DebugActivity debugactivity)
    {
        a = debugactivity;
        super();
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        compoundbutton = a.getApplicationContext();
        int i = DebugActivity.b(a).h();
        long l;
        if (flag)
        {
            l = 1L;
        } else
        {
            l = 0L;
        }
        aoc.b(compoundbutton, i, "DEBUG_RTCS", l);
        DebugActivity.a(a, flag);
    }
}
