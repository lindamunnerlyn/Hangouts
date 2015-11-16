// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;

public final class bgr
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    int a;
    int b;
    final View c;
    final CallContactPickerFragment d;

    public bgr(CallContactPickerFragment callcontactpickerfragment, View view)
    {
        d = callcontactpickerfragment;
        c = view;
        super();
        a = 0;
        b = 0;
    }

    public void onGlobalLayout()
    {
        boolean flag1 = true;
        if (d.isResumed()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!CallContactPickerFragment.a(d).h())
        {
            CallContactPickerFragment.d(d).a(true);
            return;
        }
        if (CallContactPickerFragment.c(d) != 0) goto _L4; else goto _L3
_L3:
        int i;
        i = c.getHeight();
        int j = c.getWidth();
        if (j != b)
        {
            a = 0;
            b = j;
        }
        a = Math.max(i, a);
        if (i >= a) goto _L4; else goto _L5
_L5:
        boolean flag = true;
_L7:
        if (CallContactPickerFragment.d(d) == null)
        {
            if (flag)
            {
                CallContactPickerFragment.e(d).setVisibility(8);
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_168;
_L4:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
        if (CallContactPickerFragment.f(d).getVisibility() != 8) goto _L1; else goto _L8
_L8:
        CallContactPickerFragment.e(d).setVisibility(0);
        return;
        bef bef1 = CallContactPickerFragment.d(d);
        if (flag)
        {
            flag1 = false;
        }
        bef1.a(flag1);
        return;
    }
}
