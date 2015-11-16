// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;

public final class bgv
    implements android.view.View.OnClickListener
{

    final CallContactPickerFragment a;

    public bgv(CallContactPickerFragment callcontactpickerfragment)
    {
        a = callcontactpickerfragment;
        super();
    }

    public void onClick(View view)
    {
        if (a.getActivity() == null)
        {
            return;
        } else
        {
            CallContactPickerFragment.b(a, 1);
            return;
        }
    }
}
