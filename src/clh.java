// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.CompoundButton;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class clh
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    final DebugActivity a;

    public clh(DebugActivity debugactivity)
    {
        a = debugactivity;
        super();
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        compoundbutton = DebugActivity.e(a);
        long l;
        if (flag)
        {
            l = 1L;
        } else
        {
            l = 0L;
        }
        compoundbutton.g("DEBUG_RTCS", l);
        DebugActivity.a(a, flag);
    }
}
